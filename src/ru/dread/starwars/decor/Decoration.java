package ru.dread.starwars.decor;

public class Decoration {
    private String textureName;

    public void setTexture(String name) {
        
        textureName = name;
    }

    public String getTexture() {
        return textureName;
    }
}