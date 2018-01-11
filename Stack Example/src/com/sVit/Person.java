package com.sVit;
// PERSON OBJECT
public class Person
{
    private String name;
    private String rollnum;

    public Person (String name, String rollnum)
    {
        this.name = name;
        this.rollnum = rollnum;
    }

    public String toString()
    {
        return "Name: " + this.name + " RollNumber: " + this.rollnum;
    }
}

