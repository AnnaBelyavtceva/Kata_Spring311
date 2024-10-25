package ru.kata.spring.KataSpringBoot311.dao;

import ru.kata.spring.KataSpringBoot311.model.User;
import java.util.List;

public interface UserDao {

   List<User> getAllUsers();

   void add(User user);

   void removeUserById(long id);

   void updateUser(User user);

   User getUser(long id);


}
