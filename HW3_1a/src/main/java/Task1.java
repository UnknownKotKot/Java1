import java.util.Random;
import java.util.Scanner;

public class Task1 {

    //1. Написать программу, которая загадывает случайное число от 0 до 9 и пользователю дается 3 попытки угадать это число.
    // При каждой попытке компьютер должен сообщить, больше ли указанное пользователем число, чем загаданное, или меньше.
    // После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).

    public static void main(String[] args) {
        int maxValue = 10;
        int attempts = 3;
        int rndNmb;
        int number;
        int count = 0;
        boolean exit = false;
        Scanner sc = new Scanner(System.in);
        rndNmb = randomGenerator(maxValue);
        do {
            //System.out.println(rndNmb);
            System.out.println("Введите цифру, либо введите exit для завершения. ");
            one:    if (sc.hasNextInt()) {
                do {
                    number = sc.nextInt();
                    System.out.println("Вы ввели - " + number);
                    for (int i = count; i < attempts;i++ ) {
                        if((attempts - i - 1)==0){
                            System.out.println("Вы проиграли!");
                            System.out.println("Хотите сыграть еще? Введите 1 - да, 0 - нет");
                            sc.nextLine();
                            do{
                                switch (sc.nextInt()){
                                    case 0:
                                        System.out.println("Good bye!");
                                        exit = true;
                                        break one;
                                    case 1:
                                        break one;
                                    default:
                                        System.out.println("Please enter 1 or 0!");
                                        break;
                                }
                            }while (true);
                        }
                        if(number==rndNmb){
                            System.out.println("Вы выиграли!");
                            System.out.println("Хотите сыграть еще? Введите 1 - да, 0 - нет");
                            sc.nextLine();
                            do{
                                switch (sc.nextInt()){
                                    case 0:
                                        System.out.println("Good bye!");
                                        exit = true;
                                        break one;
                                    case 1:
                                        break one;
                                    default:
                                        System.out.println("Please enter 1 or 0!");
                                        break;
                                }
                            }while (true);
                        }else{
                            if(number>rndNmb){
                                System.out.println("Введённое значение больше загаданного. Попыток осталось - " + (attempts - i - 1));
                                sc.nextLine();
                                count++;
                                break one;
                            }else{
                                if(number<rndNmb){
                                    System.out.println("Введённое значение меньше загаданного. Попыток осталось - " + (attempts - i - 1));
                                    sc.nextLine();
                                    count++;
                                    break one;
                                }
                            }
                        }
                    }
                } while (!exit);
            }else{
                if (sc.hasNext("exit")) {
                    break;
                }else{
                    sc.nextLine();
                }
            }
        }while (!exit);
        sc.close();
    }//end of main
    public static int randomGenerator (int maxValue){
        Random random = new Random();
        return random.nextInt(maxValue);
    }
}