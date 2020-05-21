package virtual_pet;

import java.util.Scanner;

public class VirtualPetApplication {

    public static void main(String[] args) {
// this is the beggining rate all at 10
        VirtualPet myPet = new VirtualPet(10, 10 ,10, 10);
        System.out.println("Hello, this is Princess Leia");

        System.out.println(" Leia's hunger level is" + getHunger());
        System.out.println(" Leia's thirst level is" + getThirst());
        System.out.println(" Leia's boredom level is" + getBoredom());
        System.out.println(" Leia's energy level is" + getPlay());

        System.out.println("What would you like to do?");
        System.out.println("1. Feed Leia");
        System.out.println("2. Give Leia water");
        System.out.println("3. Play with Leia");
        System.out.println("4. Send Leia to bed");
        System.out.println("5. Do nothing");
        Scanner input = new Scanner(System.in);

//   implement a game loop (ex. if Leia is hungry , you feed it or else do nothing)
//       if (hunger)
        if (userEntry = "1");
        System.out.println("You gave Leia dog food.");





    }
}