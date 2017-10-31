package com.smael.SpringMySQLJPA.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Room {
    @Id
    @GeneratedValue
    @Column(name="id")
    private long id;

    @Column(name ="label", nullable = false)
    private String label;

    Room(){}

    Room(String label){ this.label = label;}

    public long getId() {
        return this.id;
    }

    public String getLabel() {
        return this.label;
    }
    public void setLabel(String label){
        this.label = label;
    }
}
