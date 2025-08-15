package com.java.Error;

public class Exception {

    public void loadingClass(String message) throws ClassNotFoundException {
        Class.forName(message);
        throw new ClassNotFoundException();
    }
}
