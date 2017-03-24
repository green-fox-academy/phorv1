import java.util.Scanner;

public class anagram {
    public static void main(String[] input) {
        String firstEntry, secondEntry, noAnagram = "false", yesAnagram = "true";
        int len, len1, len2, i, j, found, not_found=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 2 words (divide them with an enter):");
        firstEntry = scanner.nextLine();
        secondEntry = scanner.nextLine();
        String copyOfFirstEntry = firstEntry.replaceAll("\\s", "").toLowerCase();
        String copyOfSecondEntry = secondEntry.replaceAll("\\s", "").toLowerCase();
        len1 = copyOfFirstEntry.length();
        len2 = copyOfSecondEntry.length();
                if(len1 == len2) {
            len = len1;
            for(i=0; i<len; i++) {
                found = 0;
                for(j=0; j<len; j++) {
                    if(copyOfFirstEntry.charAt(i) == copyOfSecondEntry.charAt(j)) {
                        found = 1;
                        break;
                    }
                }
                if(found == 0) {
                    not_found = 1;
                    break;
                }
            }
            if(not_found == 1) {
                System.out.print(noAnagram);
            } else {
                System.out.print(yesAnagram);
            }
        } else {
            System.out.print(noAnagram);
        }
    }
}