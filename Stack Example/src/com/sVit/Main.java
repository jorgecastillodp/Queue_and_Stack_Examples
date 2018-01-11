package com.sVit;
//MAIN
public class Main {

    public static void main(String[] args)
    {
        Person person1 = new Person("Jorge", "35");
        Person person2 = new Person("Maria","24");

        PersonStack stack = new PersonStack();

        stack.push(person1);
        stack.push(person2);

        System.out.println(stack.pop().toString());
        System.out.println(stack.pop().toString());
    }
}
