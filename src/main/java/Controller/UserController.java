package Controller;


import Model.Users;
import Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {
    UserService userService;
    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }
    @GetMapping
    public List<Users> getAllUser(){
        return userService.getAllUser();
    }
    @GetMapping("name/{name}")
    public Users getUsername(@PathVariable String name){
        return userService.getUsername(name);
    }
    @GetMapping("id/{id}")
    public Users getUserById(@PathVariable int id){
        return userService.getUserById(id);
    }
    @GetMapping("password/{password}")
    public Users getPassword(@PathVariable String name){
        return userService.getPassword(name);
    }
    @GetMapping("tryId/{tryId}")
    public Users getTryId(@PathVariable int id){
        return userService.getTryId(id);
    }
    @PostMapping
    public void createUser(@RequestBody Users u){
        userService.createUser(u);
    }
    /*
    @PostMapping("updateUser")
    public String updateUser(@RequestBody Users u){
        return userService.changeUserInfo(u);
    }

     */
}
