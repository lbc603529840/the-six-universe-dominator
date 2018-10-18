package leif.liu.fantasy.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import leif.liu.fantasy.entity.User;
import leif.liu.fantasy.exception.ParameterException;
import leif.liu.fantasy.exception.ServiceException;
import leif.liu.fantasy.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/login")
    @ResponseBody
    public Object login(@RequestParam(name = "username") String username,
                        @RequestParam(name = "password") String password,
                        @RequestParam(name = "remember") String remember,
                        HttpServletRequest request,
                        HttpServletResponse response) {
        try {
            User user = userService.login(username, password);

            if ("true".equals(remember)) {
                Cookie cookieUsername = new Cookie("cookieUsername", user.getUsername());
                cookieUsername.setMaxAge(86400);
                cookieUsername.setPath("/");
                response.addCookie(cookieUsername);
                Cookie cookiePassword = new Cookie("cookiePassword", user.getPassword());
                cookiePassword.setMaxAge(86400);
                cookiePassword.setPath("/");
                response.addCookie(cookiePassword);
            } else {
                Cookie cookieUsername = new Cookie("cookieUsername", user.getUsername());
                cookieUsername.setMaxAge(0);
                cookieUsername.setPath("/");
                response.addCookie(cookieUsername);
                Cookie cookiePassword = new Cookie("cookiePassword", user.getPassword());
                cookiePassword.setMaxAge(0);
                cookiePassword.setPath("/");
                response.addCookie(cookiePassword);
            }

            user.setPassword(null);
            HttpSession session = request.getSession();
            session.setAttribute("user", user);
        } catch (ParameterException parameterException) {
            return parameterException.getParameterExceptionMap();
        } catch (ServiceException serviceException) {
            return serviceException.getServiceExceptionMessage();
        }

        return "success";
    }

    @GetMapping("/logout")
    public String logout(HttpServletRequest request) {
        request.getSession().removeAttribute("user");
        return "redirect:/logout";
    }
}
