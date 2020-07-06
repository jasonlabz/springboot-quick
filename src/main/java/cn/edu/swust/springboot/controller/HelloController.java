package cn.edu.swust.springboot.controller;


import cn.edu.swust.springboot.entity.User;
import cn.edu.swust.springboot.service.UserService;
import cn.edu.swust.springboot.utils.Result;
import cn.edu.swust.springboot.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
//@RequestMapping("/hello")
public class HelloController {
    @Autowired
    private StringRedisTemplate template;

    @RequestMapping("/redis/get/{key}")
    private String get(@PathVariable("key") String key){
        return template.opsForValue().get(key);
    }

    @RequestMapping("/redis/set/{key}/{value}")
    private Boolean set(@PathVariable("key") String key,@PathVariable("value") String value){
        boolean flag = true;
        try {
            template.opsForValue().set(key,value);
        } catch (Exception e) {
            e.printStackTrace();
            flag = false;
        }
        return flag;
    }
}
