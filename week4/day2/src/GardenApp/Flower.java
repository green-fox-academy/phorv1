package GardenApp;

public class Flower extends Plants {
  public boolean needsWatering(){
    return (amountOfWater < 5);
  }
  public void watering(double water){
    this.amountOfWater += (water*0.75);
  }
  public Flower(String color){
    this.color = color;
  }
}