package com.example.test_mvc_project.repos;

import com.example.test_mvc_project.domain.Message;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MessageRepo extends CrudRepository <Message, Long> {
    List<Message> findByTag (String tag);
}
