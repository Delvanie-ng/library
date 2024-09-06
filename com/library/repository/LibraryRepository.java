package com.library.repository;

import com.library.annotations.FileDesc;
import com.library.entity.Library;

import java.io.*;
import java.util.List;

public class LibraryRepository implements Repository<Library, Integer> {

    private String filename;

    public LibraryRepository() {
        Class<Library> libraryClass = Library.class;
        if (libraryClass.isAnnotationPresent(FileDesc.class)) {
            FileDesc annotation = libraryClass.getAnnotation(FileDesc.class);
            this.filename = annotation.filename();
        }
    }

    @Override
    public List<Library> findAll() throws IOException {

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }

        return List.of();
    }

    @Override
    public void save(Library library) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename, true))) {
            bw.write(library.toString());
        }
    }



//    public static void main(String[] args) throws IOException {
//        LibraryRepository repository = new LibraryRepository();
//
////        Library library = new Library(3,"Lire c'est l'avenir");
//
////        repository.save(library);
//        try {
//            repository.findAll();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }
}
