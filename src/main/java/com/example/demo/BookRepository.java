package com.example.demo;
import java.util.*;

public class BookRepository {
    private Map<UUID, Book> books = new HashMap<>();

    public List<Book> findAll() {
        return new ArrayList<>(books.values());
    }

    public Optional<Book> findById(UUID id) {
        return Optional.ofNullable(books.get(id));
    }

    public void save(Book book) {
        book.setId(UUID.randomUUID());
        books.put(book.getId(), book);
    }

    public void update(UUID id, Book book) {
        books.put(id, book);
    }

    public void delete(UUID id) {
        books.remove(id);
    }
}
