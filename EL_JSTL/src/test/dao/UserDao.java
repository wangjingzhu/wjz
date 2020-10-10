package test.dao;

import test.domian.User;

import java.util.List;

public interface UserDao {
    public List<User> findAll();
}
