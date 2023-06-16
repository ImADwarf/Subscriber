package com.Subscriber.Subscriber.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Subscription implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String name;
    private String description;
    private Float cost;

    public Subscription(String name, String description, Float cost) {
        this.name = name;
        this.description = description;
        this.cost = cost;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Float getCost() {
        return cost;
    }

    public void setCost(Float cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Subscription{" +
                "id =" + id +
                ", name = '" + name + '\'' +
                ", description = '" + description + '\'' +
                ", cost = '" + cost + '\'' +
                '}';
    }
}
