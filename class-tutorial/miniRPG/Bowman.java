package miniRPG;

public class Bowman extends Beginner {
  public Bowman(Beginner beginner) {
    this.hp = (int) ((double) beginner.hp * 1.1);
    this.mp = (int) ((double) beginner.mp * 1.3);
    this.speed = beginner.speed + 1;

    System.out.println("Bowman Class Character is being created");
    super.getStatus();;
  }
}