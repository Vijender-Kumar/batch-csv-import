package com.batchcode.batch_csv_import.writer;

import com.batchcode.batch_csv_import.model.User;
import com.batchcode.batch_csv_import.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.item.ItemWriter;

import java.util.List;

@Slf4j
public class UserItemWriter implements ItemWriter<User> {
    private final UserRepository userRepository;

    public UserItemWriter(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public void write(List<? extends User> users){
        userRepository.saveAll(users);
        log.info("Job done successfully!!! Users saved to DB");
    }
}
