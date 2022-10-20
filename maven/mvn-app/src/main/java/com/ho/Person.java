package com.ho;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Person {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;
    private String mail;
    private Integer age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getMail() {
        return mail;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    public Person() {
        super();
        this.name = "";
        this.mail = "";
        this.age = 0;
    }

    public Person(String name, String mail, Integer age) {
        this.name = name;
        this.mail = mail;
        this.age = age;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Person [" + id + " " + name + " " + mail + " " + age + "]";
    }

}
