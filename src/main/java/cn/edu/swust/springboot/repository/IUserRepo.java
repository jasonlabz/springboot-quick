package cn.edu.swust.springboot.repository;

import cn.edu.swust.springboot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IUserRepo extends JpaRepository<User,String> {
    public Optional<User> findByUsernameAndPassword(String username, String password);
}
