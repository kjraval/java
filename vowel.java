import java.util.Scanner;


public class vowel {

    public static boolean validate(char c, char[] vowels) {

        for (char element : vowels) {
            if (element == c) {
                return true;
            }
        }
        return false;

    }

    public static void main(String args[]) {

        char[] vowels = { 'a', 'e', 'i', 'o', 'u' };

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter charcter :");
        char c = scan.next().toLowerCase().charAt(0);

        if (validate(c, vowels)) {

            System.out.println("Vowel character");

        } else {
            System.out.println("Consonant character");
        }

        scan.close();
    }

}
