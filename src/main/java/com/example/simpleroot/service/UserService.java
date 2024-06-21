package com.example.simpleroot.service;

import com.example.simpleroot.dto.UserDTO;
import com.example.simpleroot.entity.User;
import com.example.simpleroot.repo.UserRepo;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class UserService {
    @Autowired
    private UserRepo userRepo;
    @Autowired
    private ModelMapper modelMapper;

    public UserDTO saveUser(UserDTO userDTO) {
        userRepo.save(modelMapper.map(userDTO, User.class));
        return userDTO;
    }
    public List<User> getAllUsers(){
        List<User> userList =  userRepo.findAll();
        return modelMapper.map(userList, new TypeToken<List<UserDTO>>(){}.getType());
    }

    public UserDTO updateUser(UserDTO userDTO) {
        userRepo.save(modelMapper.map(userDTO, User.class));
        return userDTO;
    }

    public boolean deleteUser(UserDTO userDTO) {
        userRepo.delete(modelMapper.map(userDTO, User.class));
        return true;
    }

//    user id > user details
//    select * from user where id = 1
    public UserDTO getUserByUserID(String userId) {
        User user = userRepo.getUserByUserID(userId);
        return modelMapper.map(user, UserDTO.class);
    }

//    user id, address > user details
//    select * from user where id = 1 and address = 'Kandy'
    public UserDTO getUserByIdAndAddress(String userId, String address) {
        User user = userRepo.getUserByIdAndAddress(userId, address);
        return modelMapper.map(user, UserDTO.class);
    }

}
