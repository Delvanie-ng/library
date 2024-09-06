package com.library.repository;

import com.library.annotations.FileDesc;
import com.library.entity.Book;
import com.library.entity.Library;

import java.io.*;
import java.util.List;

public class BookRepository implements Repository<Book, Integer> {
    private String filename;

    public BookRepository() {
        Class<Book> bookClass = Book.class;
        if (bookClass.isAnnotationPresent (FileDesc.class)) ;
        FileDesc annotation = bookClass.getDeclaredAnnotation (FileDesc.class);
        this.filename = annotation.filename ( );
    }

    @Override
    public List<Book> findAll() throws IOException {
        try (BufferedReader br = new BufferedReader (new FileReader (filename))) {
            String line;
            while ((line = br.readLine ( )) != null) {
                System.out.println (line);
            }
        }
        return List.of ( );
    }

    @Override
    public void save(Book book) throws IOException {
        try (BufferedWriter bw = new BufferedWriter (new FileWriter (filename))) {
            bw.write (book.toString ( ));
        }
    }

    public static void main(String[] args) throws IOException {
        BookRepository repository = new BookRepository ( );
        Book book = new Book (1, "formation-backend junior", 2);
       // repository.save(book);
        repository.findAll ( );
    }
}
