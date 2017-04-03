
public class PostIt {
  String backgroundColor;
  String text;
  String textColor;

  @Override
  public String toString() {
    return "PostIt{" +
            "backgroundColor='" + backgroundColor + '\'' +
            ", text='" + text + '\'' +
            ", textColor='" + textColor + '\'' +
            '}';
  }

  public PostIt(String backgroundColor, String text, String textColor) {
    this.backgroundColor = backgroundColor;
    this.text = text;
    this.textColor = textColor;
  }

  public static void main(String[] args) {
    PostIt obj1 = new PostIt("orange", "Idea 1", "blue");
    PostIt obj2 = new PostIt("pink ", "Awesome ", "black");
    PostIt obj3 = new PostIt("yellow ", "Superb! ", "green");
    System.out.println(obj1.toString());
    System.out.println(obj2.toString());
    System.out.println(obj3.toString());
  }
}
