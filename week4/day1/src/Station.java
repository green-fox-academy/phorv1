
public class Station {
 static int gasAmount;

  public void refill(){
    this.gasAmount = gasAmount - Car.capacity;
    Car.gasAmount += Car.capacity;
  }
}
