package Service;

import DAO.UserRepository;
import Model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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
    public Users getUserById(int id){
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
    /*
    public String updateUser(Users u) {
        Users usersid=userRepository.findUserById(u.getUserId());
        Users usernameProfile=userRepository.findUsername(u.getUsername());
        if (usersid!=null){
            System.out.println("step1");
            if (userid!=null&&!=usersid.getUserId()) {
                return "User info cannot be updated because username already exists!";
            }else if(emailCheck!=null&&emailCheck.getUser_id()!=temp.getUser_id()){
                return "User info cannot be updated.";
            }else if (usersid.getUserId()==usersid.getUserId()){
                userRepository.save(usersid);
                return "User info successfully updated!";
            }
        }else{
            return "Could not update the user. Please fill out the form correctly";
        }
        return "unknown error";
    }

     */
}
