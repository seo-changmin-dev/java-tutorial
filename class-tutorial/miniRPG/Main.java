package miniRPG;

public class Main {
  public static void main(String[] args) {
    Beginner User1 = new Warrior(new Beginner());
    Beginner User2 = new Magician(new Beginner(100, 70, 10));
    Beginner User3 = new Bowman(new Beginner(120, 50, 10));
    Beginner User4 = new Thief(new Beginner(110, 60, 10));

    Monster slime1 = new Slime();
    Monster slime2 = new Slime(70, 20, 8);
    Monster slime3 = new Slime(70, 20, 10);


    while(slime1.hp > 0) {
      slime1.getStatus();
      System.out.println("Slime1 has being Attacked with damage 30!");
      slime1.beingAttacked(30);
    }
    System.out.println("Slime1 blacked out!");
  }
}
