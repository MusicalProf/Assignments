package com.codingdojo.objectmaster;

public class HumanTest {
  public static void main(String[] args) {
    Human joe = new Human();
    Human john = new Human();
    Wizard merlin = new Wizard();
    Ninja ryu = new Ninja();
    Samurai last = new Samurai();
    Samurai first = new Samurai();

    joe.attack(john);
    merlin.heal(john);
    merlin.fireball(joe);
    ryu.steal(merlin);
    last.deathBlow(joe);
    ryu.runaway();
    last.meditate();

    System.out.println(Samurai.howMany());
  }

}