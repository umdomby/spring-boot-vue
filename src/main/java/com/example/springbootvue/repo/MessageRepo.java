package com.example.springbootvue.repo;

import com.example.springbootvue.domain.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepo extends JpaRepository<Message, Long> {
}
