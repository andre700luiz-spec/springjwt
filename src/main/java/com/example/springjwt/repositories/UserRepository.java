package com.example.springjwt.repositories;

import com.example.springjwt.model.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {

    // Usuário fixo, só para fins didáticos (senha: 123456, em texto puro)
    public User findUserByEmail(String email) {
        User user = new User(email, "123456");
        user.setFirstName("FirstName");
        user.setLastName("LastName");
        return user;
    }
}
