package com.stackroute.javaclass;
import org.springframework.stereotype.Component;

public class User {
    private String name;


    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }

    public User(String name) {
        this.name = name;
    }
//    public void setName(String name) {
//        this.name = name;
//    }
//    public void display(){
//        System.out.println("Welcome "+ this.name +" to Stackroute");
//    }
}
