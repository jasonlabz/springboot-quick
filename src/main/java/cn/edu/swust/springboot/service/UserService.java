package cn.edu.swust.springboot.service;

import cn.edu.swust.springboot.entity.User;
import cn.edu.swust.springboot.repository.IUserRepo;
import cn.edu.swust.springboot.utils.ExceptionEnum;
import cn.edu.swust.springboot.utils.MyException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    private IUserRepo iUserRepo;

    @Autowired
    public UserService(IUserRepo iUserRepo){
        this.iUserRepo = iUserRepo;
    }

    public User findUserByName(String username,String password){
        Optional<User> optionalUser = iUserRepo.findByUsernameAndPassword(username,password);
        optionalUser.orElseThrow(()->new MyException(ExceptionEnum.USER_NOT_FOUND));
        return optionalUser.get();
    }

    public User saveUser(String username, String password){

        Optional<User> optionalUser = iUserRepo.findByUsernameAndPassword(username,password);
        User user1 = optionalUser.orElseGet(()->new User(username,password));
        if(user1.getId()==null){
            return iUserRepo.save(user1);
        }else{
            return user1;
        }
    }

}
