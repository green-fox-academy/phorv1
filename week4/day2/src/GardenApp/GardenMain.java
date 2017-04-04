package GardenApp;

public class GardenMain {
  public static void main(String[] args) {
    Garden garden = new Garden();

    Flower flower1 = new Flower("yellow");
    Flower flower2 = new Flower("blue");

    garden.addFlower(flower1);
    garden.addFlower(flower2);

    Tree tree1 = new Tree("purple");
    Tree tree2 = new Tree("orange");

    garden.addTree(tree1);
    garden.addTree(tree2);
    garden.stateOfGarden();

    garden.waterGarden(40);
    garden.waterGarden(70);
  }
}
