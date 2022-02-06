package miniRPG;

public abstract class Status {
  public int hp = 100;
  public int mp = 50;
  public int speed = 10;
  public boolean canFight = true;

  public abstract void setStatus(int hp, int mp, int speed);
  public abstract void getStatus();

  public abstract void beingAttacked(int damage);
}
