package com.example.demo.serialization;

import java.io.*;

public class Main {
    public static void main(String[] args){
        User user = new User();
        user.name = "Bro";
        user.password = "I<pizza";
        FileOutputStream fileOutputStream = new FileOutputStream("UserInfo.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOutputStream);
        out.writeObject(user);
        out.close();
        fileOutputStream.close();
    }
}
