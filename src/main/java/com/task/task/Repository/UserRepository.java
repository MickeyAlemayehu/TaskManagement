package com.task.task.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.task.task.Entity.User;

@Repository
public interface UserRepository extends JpaRepository <User , Integer>{
    User findByUsername (String username);
}
