package main.java.music;

public class ElectricGuitar extends StringedInstrument{

  public ElectricGuitar() {
    this.name = "Electric Guitar";
    this.sound = "Twang";
    this.numberOfStrings = 6;
  }

  public ElectricGuitar(int x) {
    this.name = "Electric Guitar";
    this.sound = "Twang";
    this.numberOfStrings = x;
  }

}
