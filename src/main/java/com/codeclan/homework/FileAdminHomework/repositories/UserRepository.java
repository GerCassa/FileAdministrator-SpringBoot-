package com.codeclan.homework.FileAdminHomework.repositories;

import com.codeclan.homework.FileAdminHomework.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
