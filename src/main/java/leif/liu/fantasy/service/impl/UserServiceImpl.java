package leif.liu.fantasy.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;
import org.springframework.util.StringUtils;

import leif.liu.fantasy.dao.UserDao;
import leif.liu.fantasy.entity.User;
import leif.liu.fantasy.exception.ParameterException;
import leif.liu.fantasy.exception.ServiceException;
import leif.liu.fantasy.service.UserService;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public User login(String username, String password) throws ParameterException, ServiceException {
        ParameterException parameterException = new ParameterException();

        if (StringUtils.isEmpty(username)) {
            parameterException.addToParameterExceptionMap("usernameIsEmpty", "用户名不能为空！");
        }

        if (StringUtils.isEmpty(password)) {
            parameterException.addToParameterExceptionMap("passwordIsEmpty", "密码不能为空！");
        }

        if (parameterException.hasParameterException()) {
            throw parameterException;
        }

        User user = userDao.selectByUsername(username);

        if (user == null || (!password.equals(user.getPassword()) && !DigestUtils.md5DigestAsHex(password.getBytes()).equals(user.getPassword()))) {
            throw new ServiceException("用户名或密码错误！");
        }

        return user;
    }
}
