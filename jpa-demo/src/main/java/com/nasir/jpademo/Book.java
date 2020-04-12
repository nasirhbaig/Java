package com.nasir.jpademo;

import org.hibernate.annotations.GeneratorType;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {

    @Id
    //@GeneratorType(type = Ge)
            int id;
    String name;
    int cost;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public Book(){ }

    public Book(int id, String name, int cost){

        this.id = id;
        this.name = name;
        this.cost = cost;
    }
}
