package com.example.studyspringboot.entity;

public class User {

    private Cat cat;

    private String name = "张三";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    @Override
    public String toString() {
        return "User{" +
                "cat=" + cat +
                ", name='" + name + '\'' +
                '}';
    }
}
