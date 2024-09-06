package com.library.repository;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public interface Repository<T, ID> {

    List<T> findAll() throws IOException;

    void save(T library) throws IOException;

}
