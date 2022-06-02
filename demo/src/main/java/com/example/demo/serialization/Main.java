package com.example.demo.serialization;

import java.io.*;
public class Main {
    //This static method allows to serializate the information of a class into a byte format inside a file.
    /*public static void main(String[] args) throws IOException{
        User user = new User();
        user.name = "Bro";
        user.password = "I<pizza";
        FileOutputStream fileOutputStream = new FileOutputStream("UserInfo.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOutputStream);
        out.writeObject(user);
        out.close();
        fileOutputStream.close();
        System.out.println("object info saved! :");
    }*/
    //This static method allows to de-serializate the information from yte format inside a file into a class format.
    public static void main(String[] args) throws  IOException,ClassNotFoundException{
        User user = null;
        FileInputStream fileInputStream = new FileInputStream("/home/omar/Documents/workspace/demo/UserInfo.ser");
        ObjectInputStream in = new ObjectInputStream(fileInputStream);
        user = (User) in.readObject();
        in.close();
        fileInputStream.close();
        System.out.println(user.name+" "+user.password);
    }
}
