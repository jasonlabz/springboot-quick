package cn.edu.swust.springboot.controller;

import cn.edu.swust.springboot.entity.User;
import cn.edu.swust.springboot.service.UserService;
import cn.edu.swust.springboot.entity.User;
import cn.edu.swust.springboot.service.UserService;
import cn.edu.swust.springboot.utils.Result;
import cn.edu.swust.springboot.utils.ResultUtil;
import cn.edu.swust.springboot.utils.Result;
import cn.edu.swust.springboot.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping(value = "/user")
    public Result<Object> saveUser(String username, String password){
        User user1 = userService.saveUser(username,password);
        return ResultUtil.success(user1);
    }

    @GetMapping(value = "/test")
    public Result<Object> findOne(@RequestParam String username, String password){
        User user = userService.findUserByName(username, password);
        return ResultUtil.success(user);
    }
}
