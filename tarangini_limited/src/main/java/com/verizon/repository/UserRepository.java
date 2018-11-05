package com.verizon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.verizon.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
