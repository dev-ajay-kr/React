package com.learn.springReact.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learn.springReact.model.User;

public interface UserRepository extends JpaRepository<User,Long>{

}
