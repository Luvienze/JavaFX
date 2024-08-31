package com.luvienze.complexobjects;

import javafx.beans.NamedArg;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Person {
    private final StringProperty name;
    private final IntegerProperty age;

    public Person(@NamedArg("Name") String name, @NamedArg("Age") int age){
        this.name = new SimpleStringProperty(this,"Name",name);
        this.age = new SimpleIntegerProperty(this,"Age",age);
    }

    public String getName() {
        return name.get();
    }

    public int getAge() {
        return age.get();
    }

    @Override
    public String toString() {
        return name.get() + " " + age.get();
    }
}
