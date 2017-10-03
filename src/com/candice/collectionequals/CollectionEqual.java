package com.candice.collectionequals;

import java.util.ArrayList;
import java.util.List;

public class CollectionEqual {


    public static void main(String[] msg){
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Candice",18));
        boolean sth = persons.contains(new Person("Candice", 18));
        System.out.println(sth);


    }

}

class Person{
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null)
            return false;
        if (this == obj)
            return true;
        if (obj instanceof Person){
//            Person p = (Person) obj;
            String p = (String) obj;
//            if (p.name.equals(this.name) && p.age == this.age)
//                return true;
        }
        return false;
    }
}
