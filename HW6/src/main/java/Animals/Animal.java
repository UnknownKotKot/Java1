package Animals;

public abstract class Animal {

    public static  int animalCounter = 0;
    public Animal(){
    }
    abstract public void run(int distanceLength);
    abstract public void swim(int distanceLength);
}
