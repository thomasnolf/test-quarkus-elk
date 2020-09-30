package fr.tnolf.quarkus;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import javax.persistence.Entity;

@Entity
public class Movie extends PanacheEntity {

    public String title;
    public int duration;

}
