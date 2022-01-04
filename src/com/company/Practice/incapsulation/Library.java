package com.company.Practice.incapsulation;

public class Library {
    private String name;
    private int userId;
    private String booksName;
    private String address;
    private String city;

    public Library(String name, int userId, String booksName, String address, String city) {
        this.name = name;
        this.userId = userId;
        this.booksName = booksName;
        this.address = address;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public int getUserId() {
        return userId;
    }

    public String getBooksName() {
        return booksName;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setBooksName(String booksName) {
        this.booksName = booksName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
