package com.lujing.fristappdemo.controller;

import com.lujing.fristappdemo.domain.User;
import com.lujing.fristappdemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    private final UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @RequestMapping("person/save")
    public User save(@RequestParam(name = "name" ,required = false) String name){
        User user=new User();
        if(name==null)
            name="iii";
        user.setName(name);
        if(userRepository.save(user)){
            System.out.printf("用户对象:%s保存成功!!\n",user);
        }
        return user;
    }
}
