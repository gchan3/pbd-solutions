import java.util.Scanner;

public class planetChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
              
        System.out.println("Please enter your weight. (pounds) ");
        int weight = input.nextInt();
        
        System.out.println("I have information for the follow planets. ");
        System.out.println("    1. Venus    2. Mars     3. Jupiter ");
        System.out.println("    4. Saturn   5. Uranus   6. Neptune ");
        
        System.out.println("Which planet are you visiting? ");
        int planet = input.nextInt();
        
        double Venus = weight * 0.78;
        double Mars = weight * 0.39;
        double Jupiter = weight * 2.65;
        double Saturn = weight * 1.17;
        double Uranus = weight * 1.05;
        double Neptune = weight * 1.23;
        
        if (planet == 1) {
            System.out.println("Your weight would be " + Venus + " pounds on Venus.");
        } else if (planet == 2) {
            System.out.println("Your weight would be " + Mars + " pounds on Mars.");
        } else if (planet == 3) {
            System.out.println("Your weight would be " + Jupiter + " pounds on Jupiter.");
        } else if (planet == 4) {
            System.out.println("Your weight would be " + Saturn + " pounds on Saturn.");
        } else if (planet == 5) {
            System.out.println("Your weight would be " + Uranus + " pounds on Uranus");
        } else if (planet == 6) {
            System.out.println("Your weight would be " + Neptune + " pounds on Neptune");
        } else {
            System.out.println("You put in the wrong number loser. ");
        }
    }
}   
            
