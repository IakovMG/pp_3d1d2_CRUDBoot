package com.encomm.pp_3d1d2_crudboot.dao;

import com.encomm.pp_3d1d2_crudboot.models.User;

import java.util.List;


public interface UserDAO {

    void updateUser(int id, User user);

    void deleteUser(int id);

    void saveUser(User user);

    List<User> getAllUsers();

    User getUserById(int id);
}
