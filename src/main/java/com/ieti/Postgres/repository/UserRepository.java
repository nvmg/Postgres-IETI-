package com.ieti.Postgres.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ieti.Postgres.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}


