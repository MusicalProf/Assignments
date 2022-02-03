import java.util.ArrayList;

public class ProjectTest {
  public static void main(String[] args) {
    ArrayList<Project> port = new ArrayList<Project>();
    Portfolio projects = new Portfolio();
    Project P1 = new Project();
    Project P2 = new Project("Gem");
    Project P3 = new Project("Ruby", "This isn't an actual ruby.");

    P1.setInitialCost(25.00);
    P2.setInitialCost(75.00);
    P3.setInitialCost(30.00);

    port.add(P1);
    port.add(P2);
    port.add(P3);
    System.out.println(P1.getName());
    System.out.println(P2.getName());
    System.out.println(P3.elevatorPitch());

    // System.out.println(projects.getPortfolioCost(port));
    projects.showPortfolio(port);

  }
}
