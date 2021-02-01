package Animals;

public class Doge extends Animal{
    static int dogCounter;
    public Doge(){
        dogCounter++;
        animalCounter++;
    }

     public void run(int distanceLength){
        if(distanceLength>500){
            System.out.println("Doge cant into 500+ meters");
        }else{
            System.out.println("Doge has reached " + distanceLength);
        }
    }

     public void swim(int distanceLength){
         if(distanceLength>10){
             System.out.println("Doge tried and ... sank");
         }else{
             System.out.println("Doge has reached " + distanceLength);
         }
     }
}
