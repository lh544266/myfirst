package cn.idea.service.impl;

import cn.idea.pojo.User;
import cn.idea.service.UserService;

public class UserServiceImpl implements UserService {

    @Override
    public void getUser(User user) {
        System.out.println("user:"+user);
    }2
}
