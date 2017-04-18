package main.java.music;


public class BassGuitar extends StringedInstrument{

  public BassGuitar() {
    this.name = "Bass Guitar";
    this.sound = "Duum-duum-duum";
    this.numberOfStrings = 4;
  }

  public BassGuitar(int x) {
    this.name = "Bass Guitar";
    this.sound = "Duum-duum-duum";
    this.numberOfStrings = x;
  }

}
