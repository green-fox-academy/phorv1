package individualWorkshops;

public class Counter {
  int counter = 0;
  int number;

  public Counter(){
  }
  public Counter(int counter){
    this.counter = counter;
    number = counter;
  }
  public void add(int anothercounter){
    this.counter = counter + anothercounter;
  }
  public void add(){
    this.counter++;
  }
  public int get(){
    return counter;
  }
  public void reset(){
    this.counter = number;
  }
}
