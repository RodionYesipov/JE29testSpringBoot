package com.yesipov.repo;

import com.yesipov.model.Message;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

    public interface MessageRepo extends CrudRepository<Message, Long> {

        List<Message> findByTitleAndText(String title, String text);

    }
