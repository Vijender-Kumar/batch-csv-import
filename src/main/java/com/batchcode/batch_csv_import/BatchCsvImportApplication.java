package com.batchcode.batch_csv_import;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class BatchCsvImportApplication {

	public static void main(String[] args) {
		SpringApplication.run(BatchCsvImportApplication.class, args);
		log.info("::::::::::::System is running fine::::::::");
	}
}
