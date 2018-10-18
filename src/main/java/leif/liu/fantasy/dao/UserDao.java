package leif.liu.fantasy.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import leif.liu.fantasy.entity.User;

@Mapper
public interface UserDao {
    @Select("SELECT * FROM user WHERE username = #{username}")
    public abstract User selectByUsername(String username);
}
