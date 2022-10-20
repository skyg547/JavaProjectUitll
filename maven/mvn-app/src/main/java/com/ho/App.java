package com.ho;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 * Hello world!
 *
 */
public class App {

    public EntityManagerFactory factory = Persistence.createEntityManagerFactory("my-jpa-persistance");

    public static void main(String[] args) {
        App app = new App();
        app.createEntities();
    }

    public void createEntities() {
        EntityManager manager = factory.createEntityManager();

        try {
            manager.getTransaction().begin();
            manager.persist(new Person("ho", "mail", 123));
            manager.persist(new Person("ho1", "mail3", 4));
            manager.persist(new Person("ho2", "mail4", 5));
            manager.getTransaction().commit();
        } catch (Exception e) {
            // TODO: handle exception
        } finally {
            manager.close();
        }

    }

    public void printEntities() {
        EntityManager manager = factory.createEntityManager();

        Query query = manager.createQuery("select i from Preson i");
        List<Person> list = query.getResultList();

        System.out.println("get " + list.size() + "Person");
        for (Person person : list) {
            System.out.println(person);
        }

    }

    public String getMessage(String name) {
        return "Hi " + name + ". Welcome to Maven World!";
    }

    public void printMessage(String name) {
        System.out.println("\n **** app class ****");
        System.out.println(this.getMessage(name));
        System.out.println("\n **** app class ****");

    }
}
