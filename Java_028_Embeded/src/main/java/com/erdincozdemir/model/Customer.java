package com.erdincozdemir.model;


import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "CUSTOMERS")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CUSTOMER_ID")
    private int id;

    @Column(name = "FIRST_NAME", length = 60, nullable = false)
    private String firstName;
    @Column(name = "LAST_NAME", length = 75)
    private String lastName;
    @Temporal(TemporalType.DATE)
    @Column(name = "CREATE_DATE")
    private Date createDate;
    @Lob
    @Column(name = "ADRESS")
    private String adress;
    /*
    private String sehir;
    private String ilce;
    private String mahalle;
    */

    public Customer() {
    }

    public Customer(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Customer(Date createDate) {
        this.createDate = createDate;
    }

    public Customer(int id, String firstName, String lastName, Date createDate) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.createDate = createDate;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Customer(int id, String firstName, String lastName, Date createDate, String adress) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.createDate = createDate;
        this.adress = adress;
    }

    public Customer(String firstName, String lastName, Date createDate, String adress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.createDate = createDate;
        this.adress = adress;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}
