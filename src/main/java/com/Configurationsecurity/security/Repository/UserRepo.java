package com.Configurationsecurity.security.Repository;

import com.Configurationsecurity.security.Entity.UserEntity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<UserEntity,Long> {
}
