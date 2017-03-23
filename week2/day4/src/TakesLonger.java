public class TakesLonger {
    public static void main(String... args){
        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";
        String StringBuilder = " \"always takes longer than\" ";
        System.out.println(quote.substring(0,20) + StringBuilder + quote.substring(21));
    }
}