package lv1_5;

public class Triangle {
  int side1, side2, side3;

  public Triangle(int side1, int side2, int side3) {
    this.side1 = side1;
    this.side2 = side2;
    this.side3 = side3;
  }

  public int getPerimeter() {
    return this.side1 + this.side2 + this.side3;
  }

  public double getArea() {
    final int s = (this.getPerimeter() / 2);
    return Math.sqrt(s * (s - this.side1) * (s - this.side2) * (s - this.side3));
  }
}
