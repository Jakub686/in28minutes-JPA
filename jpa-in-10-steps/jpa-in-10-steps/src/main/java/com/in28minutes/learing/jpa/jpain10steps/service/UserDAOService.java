package com.in28minutes.learing.jpa.jpain10steps.service;

import com.in28minutes.learing.jpa.jpain10steps.entity.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
public class UserDAOService {

    private EntityManager entityManager;

    public long insert(User user){
        entityManager.persist(user);
        return user.getId();




    }

}
