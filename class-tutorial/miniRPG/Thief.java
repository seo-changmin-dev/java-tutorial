package miniRPG;

public class Thief extends Beginner {
  public Thief(Beginner beginner) {
    this.hp = (int) ((double) beginner.hp * 1.2);
    this.mp = (int) ((double) beginner.mp * 1.2);
    this.speed = beginner.speed + 2;

    System.out.println("Thief Class Character is being created");
    super.getStatus();;
  }
}