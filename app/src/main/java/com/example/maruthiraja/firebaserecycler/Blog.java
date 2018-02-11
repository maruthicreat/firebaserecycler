package com.example.maruthiraja.firebaserecycler;

/**
 * Created by maruthi raja on 11-02-2018.
 */

public class Blog {

    private String title,description,image;
    public Blog() {
        System.out.println("outer constructor");
    }
    public Blog(String title, String description, String image) {
        System.out.println("inner constructor");
        this.title = title;
        this.description = description;
        this.image = image;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getImage() {
        return image;
    }
    public void setImage(String image) {
        this.image = image;
    }
}
