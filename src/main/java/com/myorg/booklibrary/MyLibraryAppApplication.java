package com.myorg.booklibrary;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.myorg.booklibrary.repository.BookRepository;
import com.myorg.booklibrary.repository.ReaderRepository;
import com.myorg.booklibrary.repository.UserRepository;

import lombok.AllArgsConstructor;

@SpringBootApplication
@AllArgsConstructor
public class MyLibraryAppApplication implements CommandLineRunner {
	ReaderRepository readerRepository;
	BookRepository bookRepository;
	UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(MyLibraryAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// Seed seed = new Seed(readerRepository, bookRepository, userRepository);
		// seed.seedData();
	}

	@Bean
	public BCryptPasswordEncoder bCryptPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}

}
