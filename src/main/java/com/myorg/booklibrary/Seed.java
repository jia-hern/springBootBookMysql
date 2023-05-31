package com.myorg.booklibrary;

import java.time.LocalDate;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.myorg.booklibrary.entity.Book;
import com.myorg.booklibrary.entity.Reader;
import com.myorg.booklibrary.entity.User;
import com.myorg.booklibrary.repository.BookRepository;
import com.myorg.booklibrary.repository.ReaderRepository;
import com.myorg.booklibrary.repository.UserRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Seed {

    ReaderRepository readerRepository;
    BookRepository bookRepository;
    UserRepository userRepository;

    public void seedData() {
        Reader[] readers = new Reader[] {
                new Reader("reader_1", LocalDate.parse("2000-10-01")),
                new Reader("reader_2", LocalDate.parse("2000-10-02")),
                new Reader("reader_3", LocalDate.parse("2000-10-03")),
                new Reader("reader_4", LocalDate.parse("2000-10-04")),
                new Reader("reader_5", LocalDate.parse("2000-10-05")),
        };
        for (Reader reader : readers) {
            readerRepository.save(reader);
        }
        Book[] books = new Book[] {
                new Book("title_1", "description_1"),
                new Book("title_2", "description_2"),
                new Book("title_3", "description_3"),
                new Book("title_4", "description_4"),
                new Book("title_5", "description_5")
        };
        for (Book book : books) {
            bookRepository.save(book);
        }
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

        User admin = new User("admin", passwordEncoder.encode("password"));
        admin.setRole("admin");
        User[] users = new User[] {
                admin,
                new User("user", passwordEncoder.encode("password")),
                new User("user2", passwordEncoder.encode("password")),
                new User("user3", passwordEncoder.encode("password")),
        };
        for (User user : users) {
            userRepository.save(user);
        }
    }
}
