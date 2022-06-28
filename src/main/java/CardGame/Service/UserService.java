package CardGame.Service;

import CardGame.DAO.UserRepository;
import CardGame.Model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;


@Component
public class UserService{
    UserRepository userRepository;
    @Autowired
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    public List<Users> getAllUser(){
        return userRepository.findAll();
    }
    public Users getUserById(String id){
        return userRepository.findUserById(id);
    }
    public Users getUsername(String name){
        return userRepository.findUsername(name);
    }
    public Users getPassword(String name){
        return userRepository.findPassword(name);
    }
    public Users getTryId(int id){
        return userRepository.findTryId(id);
    }
    public void createUser(Users u){
        userRepository.save(u);
    }
    public void update(Users users) {
        userRepository.save(users);
    }


}
