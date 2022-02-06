package miniRPG;

public class Beginner extends Status{
  public Beginner() {
  }

  public Beginner(int hp, int mp, int speed) {
    this.setStatus(hp, mp, speed);
  }

  @Override
  public void setStatus(int hp, int mp, int speed) {
    super.hp = hp;
    super.mp = mp;
    super.speed = speed;
  }

  @Override
  public void getStatus() {
    System.out.println(String.format("Current State is hp:%s mp:%s speed:%s", super.hp, super.mp, super.speed));
  }
  
  @Override
  public void beingAttacked(int damage) {
    super.hp -= damage;
    if(super.hp <= 0) {
      super.hp = 0;
      super.canFight = false;
    }
  }
}
