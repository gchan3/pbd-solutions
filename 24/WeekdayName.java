import java.util.Scanner;

public class weekdayName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Select a number. ");
        int num = input.nextInt();
        
        if (num == 1) {
            System.out.println("It's Sunday.");            
        } else if (num == 2) {
            System.out.println("It's Monday. ");            
        } else if (num == 3) {
            System.out.println("It's Tuseday. ");
        } else if (num == 4) {
            System.out.println("It is Wednesday, my dudes. ");
        } else if (num == 5) {
            System.out.println("It's Thursday. ");
        } else if (num == 6) {
            System.out.println("It's Friday. ");
        } else if (num == 7) {
            System.out.println("It's Saturday. ");
        } else {
            System.out.println("error ");
        }
    }
}
