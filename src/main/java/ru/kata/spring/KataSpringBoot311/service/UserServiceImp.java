package ru.kata.spring.KataSpringBoot311.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.kata.spring.KataSpringBoot311.dao.UserDao;
import ru.kata.spring.KataSpringBoot311.model.User;


import java.util.List;

@Service
public class UserServiceImp implements UserService {


   private UserDao userDao;


   @Autowired
   public UserServiceImp(UserDao userDao) {
      this.userDao = userDao;
   }

   @Transactional(readOnly = true)
   @Override
   public List<User> getAllUsers() {
      return userDao.getAllUsers();
   }

   @Transactional
   @Override
   public void add(User user) {
      userDao.add(user);
   }

   @Transactional
   @Override
   public void removeUserById(long id) {
      userDao.removeUserById(id);
   }

   @Transactional
   @Override
   public void updateUser(User user){
      userDao.updateUser(user);
   }

   @Transactional
   @Override
   public User getUser(long id){
      return userDao.getUser(id);
   }
}
