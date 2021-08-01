package com.dthService.dthService.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dthService.dthService.model.User;

public interface UserRepositiory extends JpaRepository<User, Long> {
}
