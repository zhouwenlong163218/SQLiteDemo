package com.example.sqlitedemo;

public class Student {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassmate() {
        return classmate;
    }

    public void setClassmate(String classmate) {
        this.classmate = classmate;
    }

    public String getAgg() {
        return agg;
    }

    public void setAgg(String agg) {
        this.agg = agg;
    }

    private String name;
    private String classmate;

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", classmate='" + classmate + '\'' + ", agg='" + agg + '\'' + '}';
    }

    private String agg;

    public Student(String name, String classmate, String agg) {
        this.name = name;
        this.classmate = classmate;
        this.agg = agg;
    }
}
