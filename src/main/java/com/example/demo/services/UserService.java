package com.example.demo.services;

import com.example.demo.entities.User;
import com.example.demo.repository.IUserRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;

import java.util.List;

@Service
public class UserService  implements IUserService{

    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    private IUserRepository repository;

    @Override
    public List<User> getAll() {
        return (List<User>) repository.findAll();
    }

    @Override
    public User getById(Long id) {
        return (User) repository.findById(id).get();
    }

    @Override
    public void remove(Long id) {
        repository.deleteById(id);
    }

    @Override
    public void save(User user) {
        repository.save(user);
    }

    @Override
    public User obtenerUsuarioPorCredenciales(User user) {
        String query = "FROM User WHERE email = :emaill";
        List<User> lista = entityManager.createQuery(query)
                .setParameter("emaill", user.getEmail())
                .getResultList();

        if (lista.isEmpty()) {
            return null;
        }

        String passwordHashed = lista.get(0).getPassword();

        Argon2 argon2 = Argon2Factory.create(Argon2Factory.Argon2Types.ARGON2id);
        if (argon2.verify(passwordHashed, user.getPassword())) {
            return lista.get(0);
        }
        return null;
    }
}
