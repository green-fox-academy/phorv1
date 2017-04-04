package GardenApp;

public class Tree extends Plants {
  public boolean needsWatering(){
    return (amountOfWater < 10);
  }
  public void watering(double water){
    this.amountOfWater += (water*0.4);
  }
  public Tree(String color){
    this.color = color;
  }
}
