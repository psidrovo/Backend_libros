package com.cobiscorp.postulacion.libros.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="books")
public class BookModel{

    @Id
    @Column(unique = true, nullable = false,length = 150)
    private String name_book;
    @Column(nullable = false,length = 300)
    private String description;
    @Column(nullable = false,length = 150)
    private String athor;
    private Date publication_date;
    private int number_copies;
    private double value;

    public BookModel(){

    }
    public BookModel(String name_book, String description, String athor, Date publication_date, int number_copies, double value) {
        this.name_book = name_book;
        this.description = description;
        this.athor = athor;
        this.publication_date = publication_date;
        this.number_copies = number_copies;
        this.value = value;
    }

    public String getName_book() {
        return name_book;
    }

    public void setName_book(String name_book) {
        this.name_book = name_book;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAthor() {
        return athor;
    }

    public void setAthor(String athor) {
        this.athor = athor;
    }

    public Date getPublication_date() {
        return publication_date;
    }

    public void setPublication_date(Date publication_date) {
        this.publication_date = publication_date;
    }

    public int getNumber_copies() {
        return number_copies;
    }

    public void setNumber_copies(int number_copies) {
        this.number_copies = number_copies;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}