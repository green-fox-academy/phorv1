package GardenApp;

import java.util.ArrayList;
import java.util.List;

public class Garden {

  ArrayList<Tree> trees;
  ArrayList<Flower> flowers;
  List<Plants> myGarden = new ArrayList<>();
  int howManyToWater;


  public void addFlower(Flower flower){
    this.flowers.add(flower);
  }

  public void addTree(Tree tree){
    this.trees.add(tree);
  }

  public Garden(){
    trees = new ArrayList<>();
    flowers = new ArrayList<>();
  }

  public int howManyNeedsWater(){
    for (int i = 0; i < myGarden.size(); i++) {
      if (trees.get(i).needsWatering()) {
        howManyToWater++;
      }
    }
    for (int j = 0; j < flowers.size(); j++) {
      if (flowers.get(j).needsWatering()) {
        howManyToWater++;
      }
    }
    return howManyToWater;
  }
  public void waterGarden(int amount){
    howManyNeedsWater();
    System.out.println("Watering with " + amount);
    for (int j = 0; j < flowers.size(); j++) {
      if (flowers.get(j).needsWatering()) {
        flowers.get(j).watering(amount/howManyToWater);
      }
    }
    for (int i = 0; i < trees.size(); i++) {
      if (trees.get(i).needsWatering()) {
        trees.get(i).watering(amount/howManyToWater);
      }
    }
    this.howManyToWater = 0;
    stateOfGarden();
  }
  public void stateOfGarden(){
    for (int i = 0; i < this.flowers.size(); i++) {
      System.out.print("The " + this.flowers.get(i).color + " Flower");
      if (this.flowers.get(i).needsWatering()) {
        System.out.println(" needs water!");
      } else {
        System.out.println(" doesn't need water!");
      }
    }
    for (int i = 0; i < this.trees.size(); i++){
      System.out.print("The " + this.trees.get(i).color + " Tree");
      if (this.trees.get(i).needsWatering()){
        System.out.println(" needs water!") ;
      }
      else {
        System.out.println(" doesn't need water!");
      }
    }
    System.out.println();
  }
}
