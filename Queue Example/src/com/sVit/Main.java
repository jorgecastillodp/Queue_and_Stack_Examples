package com.sVit;

public class Main {

    public static void main(String[] args)
    {
       Personq q = new Personq();

       q.enqueue(new Person("Jorge", "221"));
       q.enqueue(new Person("Maria", "123"));

       q.showAll();

    }
}
