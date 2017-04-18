package main.java.music;

public abstract class StringedInstrument extends Instrument{

  int numberOfStrings;
  String sound;
  String name;
  final String formatForPlay ="%s, a %d-stringed instrument that %s\n";

  @Override
  public void play() {
    System.out.printf(formatForPlay, name, numberOfStrings, sound);
  }

}

