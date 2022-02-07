package com.codingdojo.objectmaster;

public class Ninja extends Human {
  public Ninja() {
    this.stealth = 10;
  }

  public void steal(Human target) {
    target.health -= this.stealth;
    this.health += this.stealth;
    System.out.println("The ninja has taken health from his target. Ninja's health is now " + this.health);
  }

  public void runaway() {
    this.health -= 10;
    System.out.println("The ninja ran from the fight. But it cost him some HP. He now has " + this.health + " HP.");
  }
}
