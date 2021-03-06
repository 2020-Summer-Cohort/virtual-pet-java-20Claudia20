package virtual_pet;

public class VirtualPet {
    //variables
    private int hunger;
    private int thirst;
    private int boredom;
    private int tired;
    //constructors
    public VirtualPet(int hunger, int thirst, int boredom, int tired) {
        this.hunger = hunger;
        this.thirst = thirst;
        this.boredom = boredom;
        this.tired = tired;
    }
    //getters
    public int getHunger() {
        return hunger;
    }

    public int getThirst() {
        return thirst;
    }
    public int getBoredom() {
        return boredom;
    }
    public int getTired() {
        return tired;
    }

    // create 3 methods
    public void feed() {
        hunger = hunger-4;
    }
    public void thirst() {
        thirst = thirst-3;
    }
    public void boredom() {
        boredom = boredom-4;
    }
    public void tired() {
        tired = boredom -3;
    }


}
