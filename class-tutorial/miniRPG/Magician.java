package miniRPG;

public class Magician extends Beginner {
  public Magician(Beginner beginner) {
    this.hp = beginner.hp;
    this.mp = (int) ((double) beginner.mp * 1.5);
    this.speed = beginner.speed - 1;

    System.out.println("Magician Class Character is being created");
    super.getStatus();;
  }
}