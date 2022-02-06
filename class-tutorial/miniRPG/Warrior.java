package miniRPG;

public class Warrior extends Beginner {
  public Warrior(Beginner beginner) {
    this.hp = (int) ((double) beginner.hp * 1.5);
    this.mp = beginner.mp;
    this.speed = beginner.speed - 2;
    
    System.out.println("Warrior Class Character is being created");
    super.getStatus();;
  }
}