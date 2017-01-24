package main;

/**
 * Created by Zhenichka on 21.11.2016.
 */
public class Hello {

    public static class Person {
        String name;

        public Person(String personName) {
            name = personName;
        }

        public String greet(String yourName) {
            return String.format("Hi %s, my name is %s", yourName,name);
        }
    }

    public static void main(String[] args) {
Person jk=new Person("personName");
        System.out.println(jk.greet("Alex"));
        System.out.println(123);
    }
}
