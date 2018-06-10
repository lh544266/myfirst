package cn.idea.test;

import cn.idea.pojo.User;
import cn.idea.service.UserService;
import cn.idea.service.impl.UserServiceImpl;

public class UserTest {
    public static void main(String[] args) {
        UserService us=new UserServiceImpl();
        User user=new User(1,"lh","123");
        us.getUser(user);
    }
}
