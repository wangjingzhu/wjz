package test.service;

import test.domian.User;

import java.util.List;
/*
* 用户管理的业务接口*/
public interface UserService {
    /*查询所有用户信息*/
    public List<User> findAll();
}
