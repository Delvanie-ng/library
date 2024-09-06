package com.library.repository;

import com.library.annotations.FileDesc;
import com.library.entity.User;

import java.io.*;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.List;

public class UserRepository implements Repository<User, Integer> {
    private String filename;

    public UserRepository() {
        Class<User> userClass = User.class;
        if (userClass.isAnnotationPresent (FileDesc.class)) {
            FileDesc annotation = userClass.getDeclaredAnnotation (FileDesc.class);
            this.filename = annotation.filename ( );
        }
    }

    @Override
    public List<User> findAll() throws IOException {
        try (BufferedReader br = new BufferedReader (new FileReader (filename))) {
            String line;
            while ((line = br.readLine ( )) != null) {
                System.out.println (line);
            }
        } return List.of ( );
    }

    @Override
    public void save(User user) throws IOException {
        try (BufferedWriter bw = new BufferedWriter (new FileWriter (filename))) {
            bw.write (user.toString ( ));
        }
    }

    public static void main(String[] args) throws IOException {
        UserRepository repository = new UserRepository ( );
        User user = new User (1, "jean");
       //repository.save (user);
        repository.findAll ( );
    }
}