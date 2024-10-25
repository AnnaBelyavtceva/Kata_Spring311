package ru.kata.spring.KataSpringBoot311.dao;

import jakarta.persistence.*;
import org.springframework.stereotype.Repository;
import ru.kata.spring.KataSpringBoot311.model.User;

import java.util.List;

@Repository
public class UserDaoImp implements UserDao {

   @PersistenceContext
   private EntityManager em;


   @Override
   public List<User> getAllUsers() {
      TypedQuery<User> query = em.createQuery("select u from User u", User.class);
      return query.getResultList();
   }

   @Override
   public void add(User user) {
      em.persist(user);
   }

   @Override
   public void removeUserById(long id) {
      em.remove(em.getReference(User.class, id));
   }

   @Override
   public void updateUser(User user) {
      em.merge(user);
   }

   @Override
   public User getUser(long id) {
      return em.find(User.class, id);
   }

}
