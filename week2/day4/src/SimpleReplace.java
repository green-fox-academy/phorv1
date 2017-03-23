public class SimpleReplace {
    public static void main(String[] args) {
        String example = "In a dishwasher far far away";
        example =  example.replace("dishwasher", "galaxy");
        System.out.println(example);

        /*
        Or you can do this instead of line 4 & 5:
        System.out.println(example.replace("dishwasher", "galaxy"));
        */
    }
}
