package virtual_pet;

import java.util.Scanner;

public class VirtualPetApplication {

    public static void main(String[] args) {
        VirtualPet myPet = new VirtualPet(10, 6, 5, 3);
        System.out.println("Hello, this is Princess Leia");

        System.out.println(" Leia's hunger level is " + myPet.getHunger());
        System.out.println(" Leia's thirst level is " + myPet.getThirst());
        System.out.println(" Leia's boredom level is " + myPet.getBoredom());
        System.out.println(" Leia's energy level is " + myPet.getTired());

        System.out.println("What would you like to do?");
        System.out.println("1. Feed Leia");
        System.out.println("2. Give Leia water");
        System.out.println("3. Play with Leia");
        System.out.println("4. Send Leia to bed");
        System.out.println("5. Do nothing");
        System.out.println("6. Exit the game");
        Scanner input = new Scanner(System.in);
        int userEntry = input.nextInt();

        while(true)
            if (userEntry == 1) {
                System.out.println("You gave Leia her favorite doggy treats.");
                myPet.feed();
                break;
            } else if  (userEntry == 2) {
                System.out.println("You gave Leia some fresh iced water.");
                myPet.thirst();
                break;
            } else if (userEntry == 3) {
                System.out.println(" You played with Leia and her favorite toy.");
                myPet.feed();
                break;
            } else if (userEntry == 4) {
                System.out.println("You sent Leia to bed.");
                myPet.tired();
                break;
            } else if (userEntry == 5) {
                System.out.println("You choose to do Nothing.");
                break;
            } else if (userEntry == 6) {
                System.out.println("You choose to exit the game.");
                break;
            }

    }
}