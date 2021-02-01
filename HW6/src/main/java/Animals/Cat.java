package Animals;

public class Cat extends Animal{
    static int catCounter;
    public Cat(){
        catCounter++;
        animalCounter++;
    }

    public void run(int distanceLength){
        if(distanceLength>200){
            System.out.println("WOW "+ distanceLength + "!!!" + "Cat cant into 200+ meters!");
        }else{
            System.out.println("Cat has reached " + distanceLength + " meters");
        }
    }

    public void swim(int distanceLength){
        System.out.println("Cat cant into swimming");
    }
}
