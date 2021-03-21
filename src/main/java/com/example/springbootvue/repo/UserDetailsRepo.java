package com.example.springbootvue.repo;

import com.example.springbootvue.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDetailsRepo extends JpaRepository<User, String> {
}
