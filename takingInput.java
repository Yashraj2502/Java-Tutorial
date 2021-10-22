//Lecture #1

import java.util.Scanner; 

public class takingInput {

    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        
        System.out.println("What is your name?");
        Scanner name = new Scanner(System.in);
        System.out.println(name.nextLine());
    }
}
