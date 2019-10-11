package Week1.Classes;

public class Rectangle {

  private int width = 0;
  private int height = 0;
  private String color = "Blue";

  public Rectangle(int width, int height) {
    setWidth(width);
    setHeight(height);
  }

  public Rectangle(int width, int height, String color) {
    setWidth(width);
    setHeight(height);
    setColor(color);
  }

  public void setWidth(int width) {

    if (width > 0) {
      this.width = width;
    } else {
      this.width = 1;
    }
  }

  public void setHeight(int height) {
    if (height > 0) {
      this.height = height;
    } else {
      this.height = 1;
    }
  }

  public void setColor(String color) {
    String c = color.substring(0, 1).toUpperCase();
    String cc = c + color.substring(1, color.length());
    if ((color.length() > 2 && color.length() < 20)) this.color = cc;
  }

  public int getWidth() {
    return width;
  }

  public int getHeight() {
    return height;
  }

  public String getColor() {
    return color;
  }

  public void draw() {
    String color = getColor();
    String c = color.substring(0, 1);

    int w = getWidth();
    String s = "";

    for (int i = 0; i < w; i++) {
      s += c;
    }

    int h = getWidth();

    for (int i = 0; i < h; i++) {
      System.out.println(s);
    }
  }
}
