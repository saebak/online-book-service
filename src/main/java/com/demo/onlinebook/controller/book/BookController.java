package com.demo.onlinebook.controller.book;

import com.demo.onlinebook.controller.book.request.BookRequest;
import com.demo.onlinebook.controller.common.ApiResponse;
import com.demo.onlinebook.domain.book.Book;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequestMapping("/api/books")
@RestController
public class BookController {

    @GetMapping("")
    public ApiResponse<List<Book>> getBooks() {
        return null;
    }

    @GetMapping("/{id}")
    public ApiResponse<Book> getBook(@PathVariable Long id) {
      return null;
    }

    @PostMapping("")
    public ApiResponse<Void> createBook(BookRequest request) {
        return null;
    }

    @PutMapping("/{id}")
    public ApiResponse<Void> updateBook(@PathVariable Long id, BookRequest request) {
        return null;
    }

    @DeleteMapping("/{id}")
    public ApiResponse<Void> removeBook(@PathVariable Long id) {
        return null;
    }
}
