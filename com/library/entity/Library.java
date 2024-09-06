package com.library.entity;

import com.library.annotations.FileDesc;

@FileDesc(filename="libraries.txt")
public class Library {

    private int id;
    private String name;

    public Library() {
    }

    public Library(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return  id + "," + name +"\n";
    }
}
