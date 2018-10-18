package leif.liu.fantasy.filter;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import leif.liu.fantasy.entity.User;

@WebFilter(urlPatterns = "/*")
public class MyFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {}

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest)servletRequest;
        HttpServletResponse response = (HttpServletResponse)servletResponse;
        request.setCharacterEncoding("UTF-8");
        String requestedUri = request.getRequestURI().substring(request.getContextPath().length());
        Set<String> noNeedLoginUriSet = new HashSet<String>();
        noNeedLoginUriSet.add("/index/index");
        noNeedLoginUriSet.add("/user/login");

        if (requestedUri.endsWith(".js") || requestedUri.endsWith(".css") || requestedUri.endsWith(".map") || requestedUri.endsWith(".png") || noNeedLoginUriSet.contains(requestedUri)) {
            filterChain.doFilter(request, response);
        } else {
            User user = (User)request.getSession().getAttribute("user");

            if (user == null) {
                PrintWriter printWriter = response.getWriter();
                printWriter.println("<html>");
                printWriter.println("<script>");
                printWriter.println("window.location.href='" + request.getContextPath() + "/index/index'");
                printWriter.println("</script>");
                printWriter.println("</html>");
            } else {
                filterChain.doFilter(request, response);
            }
        }
    }

    @Override
    public void destroy() {}
}
