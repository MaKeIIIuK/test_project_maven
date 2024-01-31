package com.example.models;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class HumanBase extends BaseEntity{
    @Column(name = "surname")
    private String surname;
    @Column(name = "name")
    private String name;
    @Column(name = "father_name")
    private String father_name;
    @Column(name = "phone_number")
    private String phone_number;

    public HumanBase(){}

    public String getSurname(){return surname;}
    public void setSurname(String surname){this.surname = surname;}
    public String getName(){return name;}
    public void setName(String name){this.name = name;}
    public String getFather_name(){return father_name;}
    public void setFather_name(String father_name){this.father_name = father_name;}
    public String getPhone_number(){return phone_number;}
    public void setPhone_number(String phone_number){this.phone_number = phone_number;}
}
