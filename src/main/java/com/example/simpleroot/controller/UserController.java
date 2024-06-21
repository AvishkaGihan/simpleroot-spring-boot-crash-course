package com.example.simpleroot.controller;

import com.example.simpleroot.dto.UserDTO;
import com.example.simpleroot.entity.User;
import com.example.simpleroot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/user")
@CrossOrigin
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping(value = "/getUsers")
    public List<User> getUser() {
        return userService.getAllUsers();
    }

    @PostMapping(value = "/saveUser")
    public UserDTO saveUser(@RequestBody UserDTO userDTO) {
        return userService.saveUser(userDTO);

    }

    @PutMapping(value = "/updateUser")
    public UserDTO updateUser(@RequestBody UserDTO userDTO) {
        return userService.updateUser(userDTO);
    }

    @DeleteMapping(value = "/deleteUser")
    public boolean deleteUser(@RequestBody UserDTO userDTO) {
        return userService.deleteUser(userDTO);
    }

    @GetMapping(value = "/getUserByUserID/{userID}")
    public UserDTO getUserByUserID(@PathVariable String userID) {
        return userService.getUserByUserID(userID);
    }

    @GetMapping(value = "/getUserByIdAndAddress/{userID}/{address}")
    public UserDTO getUserByIdAndAddress(@PathVariable String userID, @PathVariable String address) {
        return userService.getUserByIdAndAddress(userID, address);
    }
}
