package com.example.demo.services;

import com.example.demo.entities.User;
import java.util.List;

public interface IUserService {
    List<User> getAll();
    User getById(Long id);
    void remove(Long id);
    void save(User user);
    User obtenerUsuarioPorCredenciales(User user);

}
