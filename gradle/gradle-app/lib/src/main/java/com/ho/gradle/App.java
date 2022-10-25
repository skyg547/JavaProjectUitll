package com.ho.gradle;

public class App {

    public static void main(String[] args) {
        App app = new App();

        System.out.println("===========App class ======");

        app.showMessage("tard");
        System.out.println("===========App class ======");
    }

    public boolean showMessage(String name) {
        try {
            System.out.println(this.getMessage(name));
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("error");

        } finally {
            return true;
        }

    }

    public String getMessage(String name) {
        return "hi" + name;

    }
}