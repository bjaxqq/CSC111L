import java.lang.Math;

public class Monster {
    
    // Instance variables
    private double health;
    private double strength;
    
    // Default constructor
    public Monster() {
        this.health = 0.0;
        this.strength = 0.0;
    }
    
    // Constructor with parameters
    public Monster(double health, double strength) {
        this.health = health;
        this.strength = strength;
    }
    
    // Getter method for health
    public double getHealth() {
        return this.health;
    }
    
    // Setter method for health
    public void setHealth(double health) {
        this.health = health;
    }
    
    // Getter method for strength
    public double getStrength() {
        return this.strength;
    }
    
    // Setter method for strength
    public void setStrength(double strength) {
        this.strength = strength;
    }
    
    // Method to generate a random attack value
    public double attack() {
        return this.strength * Math.random();
    }
    
    // Method to reduce health by a specified amount
    public void damage(double amount) {
        this.health -= amount;
    }
    
    // Method to check if the monster is still alive
    public boolean isAlive() {
        return this.health > 0;
    }
}