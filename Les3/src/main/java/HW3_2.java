import java.util.Random;
import java.util.Scanner;
/*2. * Создать массив из слов
String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic",
 "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"}.
При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя, сравнивает его с загаданным словом и сообщает,
 правильно ли ответил пользователь. Если слово не угадано, компьютер показывает буквы, которые стоят на своих местах.
apple – загаданное
apricot - ответ игрока
ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
Для сравнения двух слов посимвольно можно пользоваться:
String str = "apple";
char a = str.charAt(0); - метод вернет char, который стоит в слове str на первой позиции
Играем до тех пор, пока игрок не отгадает слово.
Используем только маленькие буквы.*/


public class HW3_2 {

    public static void main(String[] args) {

        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
                "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear",
                "pepper", "pineapple", "pumpkin", "potato"};
        int massLength = words.length;
        int rnmNmb = randomGenerator(massLength);
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        do{
            System.out.println(words[rnmNmb]);
            System.out.println("Введите слово на английском маленькими буквами - ");
 one:           if (sc.hasNext()){
                String str = sc.next();
                    do{
                        if(words[rnmNmb].equals(str)){
                            System.out.println(" Your WON!");
                            exit = true;
                        }else{
                            if(words[rnmNmb].length()<str.length()){
                                for(int i=0;i<words[rnmNmb].length();i++){
                                    char a = str.charAt(i);
                                    char b = words[rnmNmb].charAt(i);
                                    if(a==b){
                                        System.out.print(a);
                                    }else{
                                        System.out.print("#");
                                    }
                                }
                            }else{
                                for(int i=0;i<str.length();i++){
                                    char a = str.charAt(i);
                                    char b = words[rnmNmb].charAt(i);
                                        if(a==b){
                                            System.out.print(a);
                                        }else{
                                            System.out.print("#");
                                         }
                                }
                            }
                            if(words[rnmNmb].length()<str.length()){
                                for(int i=0;i<15-words[rnmNmb].length();i++){
                                    System.out.print("#");
                                }
                            }else{
                                if(words[rnmNmb].length()>str.length()){
                                    for(int i=0;i<15-str.length();i++){
                                        System.out.print("#");
                                    }
                                }
                            }
                            System.out.println();
                            System.out.println("Try again!");
                            break one;
                        }
                    }while(!exit);
                }else{
                    sc.nextLine();
                }
        }while(!exit);
    }//end of main
    public static int randomGenerator (int maxValue){
        Random random = new Random();
        return random.nextInt(maxValue);
    }
}
