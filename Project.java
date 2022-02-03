import java.util.ArrayList;

public class Project {
  private String name;
  private String description;
  private double initialCost;

  public Project() {
  }

  public Project(String name) {
    this.name = name;
  }

  public Project(String name, String description) {
    this.name = name;
    this.description = description;
  }

  // Getters
  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }

  public double getInitialCost() {
    return initialCost;
  }

  // Setters
  public void setName(String name) {
    this.name = name;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public void setInitialCost(double initialCost) {
    this.initialCost = initialCost;
  }

  // instance method
  public String elevatorPitch() {
    return "Name: " + name + " (" + "$" + initialCost + ") : " + "Description: " + description;
  }
}

class Portfolio {
  public double getPortfolioCost(ArrayList<Project> project) {
    double sum = 0;
    for (Project val : project) {
      sum += val.getInitialCost();
    }
    return sum;
  }

  public void showPortfolio(ArrayList<Project> project) {
    for (Project val : project) {
      System.out.println(val.elevatorPitch());
    }
    System.out.println("Total Cost of Portfolio: " + "$" + getPortfolioCost(project));
  }
}
