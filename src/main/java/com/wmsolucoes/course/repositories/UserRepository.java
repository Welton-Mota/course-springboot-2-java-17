package com.wmsolucoes.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wmsolucoes.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
