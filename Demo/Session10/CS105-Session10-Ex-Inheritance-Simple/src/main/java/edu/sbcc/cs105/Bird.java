package edu.sbcc.cs105;

/**
 * Bird
 */
public class Bird extends Animal {

    public Bird(String name) {
        super(name);
        
    }

    @Override
    public String speak() {
        return "Tweet!";
    }

    
}