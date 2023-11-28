package com.example.practice.ServiceImplementation;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.practice.Entity.User;
import com.example.practice.Repository.UserRepository;
import com.example.practice.Service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        List<User> allUser = userRepository.findAll();
        return allUser;
    }

    @Override
    public User getUserById(long id){
        Optional<User> user=userRepository.findById(id);
        if(user.isPresent()){
            return user.get();
        }
        return null;
    }

    @Override
    public User updateUserById(long id, User user) {
        Optional<User> user1 = userRepository.findById(id);
        if (user1.isPresent()) {
            User originalUser = user1.get();
            if (Objects.nonNull(user.getUsername()) && !"".equalsIgnoreCase(user.getUsername())) {
                originalUser.setUsername(user.getUsername());
            }
            if (Objects.nonNull(user.getPassword()) && !"".equalsIgnoreCase(user.getPassword())) {
                originalUser.setPassword(user.getPassword());
            }
            return userRepository.save(originalUser);
        }
        return null;
    }

    @Override
    public String deleteUserById(long id) {
        if (userRepository.findById(id).isPresent()) {
            UserRepository.deleteUserById(id);
            return "User deleted successfully";
        }
        return "No such user is found in the database";
    }

    @Override
    public User updateUserById(Long id, User user) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateUserById'");
    }

    @Override
    public String deleteUserById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteUserById'");
    }

}
