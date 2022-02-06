package miniRPG;

public class Slime extends Monster{
  public Slime() {
    super.setStatus(45, 10, 6);

    System.out.println("Slime is being created with default status");
    super.getStatus();
  }

  public Slime(int hp, int mp, int speed) {
    super.setStatus(hp, mp, speed);

    System.out.println("Slime is being created with arbitary status");
    super.getStatus();
  }
}
