package org.example;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    public static void main(String[] args) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String user = gson.toJson(new User("Владислав", "Плєтньов"));
        System.out.println(user);
    }
}