
public class Sharpie {
  String color;
  float width;
  float ink_amount;

  public Sharpie(String color, float width){
    this.ink_amount = 100;
  }
  
  public void use() {
    ink_amount--;
  }
}
