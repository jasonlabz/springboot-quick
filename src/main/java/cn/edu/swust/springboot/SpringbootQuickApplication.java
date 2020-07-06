package cn.edu.swust.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootQuickApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootQuickApplication.class, args);
    }

    @GetMapping(value = "/")
    public String mainPage(){
        return "hello world!";
    }
}
