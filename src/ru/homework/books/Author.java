package ru.homework.books;

public class Author {

    String name;
    String email;
    char gender;

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                '}';
    }
}
