package com.library.entity;

import com.library.annotations.FileDesc;

@FileDesc(filename = "userbook.txt")
public class UserBook {

    private int id;
    private int userId;
    private int bookId;

    public UserBook() {
    }

    public UserBook(int id, int userId, int bookId) {
        this.id = id;
        this.userId = userId;
        this.bookId = bookId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    @Override
    public String toString() {
        return id + "," + userId + "," + bookId;
    }
}
