package com.springbootdev.examples.microservices.studentservice.model;


public class Student
{
    private Integer id;
    private String name;
    private String level;
    private String country;

    public Student(Integer id, String name, String level, String country)
    {
        this.country = country;
        this.id = id;
        this.level = level;
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
