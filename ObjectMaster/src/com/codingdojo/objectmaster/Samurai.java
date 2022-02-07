package com.codingdojo.objectmaster;

public class Samurai extends Human {
  public static int count;

  public Samurai() {
    this.health = 200;
    count++;
  }

  public void deathBlow(Human target) {
    target.health *= 0;
    this.health *= .5;
    System.out.println("The samurai has dealt a death blow to the target. The target is now dead with an HP of "
        + target.health + ". \nThe samurai has lost half of his HP, leaving him with " + this.health + " HP.");
  }

  public void meditate() {
    this.health = 200;
    System.out.println(
        "The samurai had to meditate to restore his health. His HP has been restored to Max health. His HP is now "
            + this.health + " HP.");
  }

  public static int howMany() {
    return count;
  }
}
