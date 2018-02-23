import java.util.Scanner;

public class ForgetfulMachine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Give me a word! ");
        String word1 = input.next();
        
        System.out.print("Give me a second word! ");
        String word2 = input.next();
        
        System.out.print("Great, now your favourite number? ");
        int age1 = input.nextInt();
        
        System.out.print("And your second-favorite number...");
        int age2 = input.nextInt();
        
        System.out.println("Whew, wasn't that fun?");
    }
}
