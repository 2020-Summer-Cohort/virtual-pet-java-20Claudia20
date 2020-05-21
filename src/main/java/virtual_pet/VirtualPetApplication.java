package virtual_pet;

import java.util.Scanner;

public class VirtualPetApplication {

    public static void main(String[] args) {

// this is the beginning rate all at 10
        VirtualPet myPet = new VirtualPet(10, 10, 10, 10);
        System.out.println("Hello, this is Princess Leia");

        while(true)

        System.out.println(" Leia's hunger level is" + myPet.getHunger());
        System.out.println(" Leia's thirst level is" + myPet.getThirst());
        System.out.println(" Leia's boredom level is" + myPet.getBoredom());
        System.out.println(" Leia's energy level is" + myPet.getTired());

        System.out.println("What would you like to do?");
        System.out.println("1. Feed Leia");
        System.out.println("2. Give Leia water");
        System.out.println("3. Play with Leia");
        System.out.println("4. Send Leia to bed");
        System.out.println("5. Do nothing");
        System.out.println("6. Exit the game");
        Scanner input = new Scanner(System.in);
        int userEntry = input.nextInt();

        if (userEntry == 1) {
            System.out.println("You gave Leia her favorite dog food.");
            myPet.feed();
        }
        else if (userEntry == 2) {
            System.out.println("You gave Leia some iced fresh water");
            myPet.thirst();
        }
        else if (userEntry == 3) {
            System.out.println(" You played with Leia and her favorite toy");
            myPet.boredom();
        }
        else if (userEntry == 4) {
            System.out.println("You sent Leia to bed.");
            myPet.tired();
        }
        else if (userEntry == 5) {
            System.out.println("You choose to do Nothing.");
        }
        else if (userEntry == 6) {
            System.out.println("You choose to exit the game");
        }

    }
}