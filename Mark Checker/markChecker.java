import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("What is your mark? Oh hi mark. ");
        int mark = input.nextInt();
        
        if (mark >= 50 && mark <= 100) {
            System.out.println("You passed dawg. ");
        } else if (mark > 100) {
            System.out.println("You lyin' dawg. ");
        } else if (mark < 50 && mark >= 0) {
            System.out.println("Fix yo shit, boi! ");
        } else if (mark < 0) {
            System.out.println("Can't even type properly, smh. ");
        }
    }
}
