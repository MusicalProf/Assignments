package com.codingdojo.objectmaster;

public class Wizard extends Human {

  public Wizard() {
    this.health = 50;
    this.intelligence = 8;
  }

  public void heal(Human target) {
    target.health += this.intelligence;
    System.out.println("The wizard is healing now. Target's health is now " + target.health + " HP.");
  }

  public void fireball(Human target) {
    target.health -= this.intelligence * 3;
    System.out.println("The wizard has attacked with his fireball!. Target's health is now " + target.health + " HP.");
  }
}
