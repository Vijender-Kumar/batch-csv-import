package com.batchcode.batch_csv_import.repository;

import com.batchcode.batch_csv_import.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
