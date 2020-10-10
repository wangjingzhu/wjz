package test.service.Impl;

import test.dao.UserDao;
import test.dao.impl.UserDaoImpl;
import test.domian.User;
import test.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    private UserDao dao = new UserDaoImpl();
    @Override
    public List<User> findAll() {
        //调用dao完成查询
        return dao.findAll();
    }
}
