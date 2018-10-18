package leif.liu.fantasy.service;

import leif.liu.fantasy.entity.User;
import leif.liu.fantasy.exception.ParameterException;
import leif.liu.fantasy.exception.ServiceException;

public interface UserService {
    public abstract User login(String username, String password) throws ParameterException, ServiceException;
}
