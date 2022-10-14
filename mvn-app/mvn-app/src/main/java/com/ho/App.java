package com.ho;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
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
