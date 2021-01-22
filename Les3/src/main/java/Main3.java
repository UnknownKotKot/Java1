import java.util.Random;
import java.util.Scanner;
public class Main3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //сканер считывает поток. что он считал - срезает с буфера(удаляет из потока),

      /*  int a=0;
     /*   if(sc.hasNextInt()){
           a = sc.nextInt();
        }
        System.out.println(a);

     /*   String next = sc.next();//берерт строку до 1 пробела
        System.out.println(next);
        String nextLine = sc.nextLine();//берет всю строку не игнорируя пробел, (некст отрезает 1 строку, нект лайн читает все остальное + пробел)
        System.out.println(nextLine);
        */

      /*  int min =5;
        int max = 10;
        int number =0;

        do{
            System.out.print(" Please enter the number ");
            if(sc.hasNextInt()){

                number = sc.nextInt();
            }
            sc.nextLine();// если ввели не ИНТ, то чтобы не зацыклился - очиста буфера до символа + сам символ
        }while(number<=min||number>=max);

        sc.close();

        Random random = new Random();// 0-> n-1
        random.nextInt(7);
      */

     /*   int [] arr = {2, 4, 1};
        int [] correctArr = {1,2,3};
       */ Random random = new Random();/*

        int count =0;

        while(true){

            int index = random.nextInt(3);
            int index2 = random.nextInt(3);
            int tmp;
            tmp = arr[index];
            int tmp2 = arr[index2];
            arr[index] = tmp2;
            arr[index2] = tmp;

            if(arr[0]==correctArr[0]&&arr[1]==correctArr[1]&&arr[2]==correctArr[2]){
                break;
            }
            System.out.println(count++ + " ");
        }
        for (int i = 0; i <arr.length ; i++) {

            System.out.println(arr[i] + " a");
        }
*/
      /* int[] noSortedArray = new int[40];
        boolean sorted = false;
        int tmp;
        for (int i = 0; i < noSortedArray.length; i++) {
            noSortedArray[i]=random.nextInt(100);
            System.out.print(noSortedArray[i] + " ");

        }
        System.out.println(" ");
        while(!sorted){
            sorted=true;
            for (int i = 0; i < noSortedArray.length-1; i++) {
                if (noSortedArray[i] > noSortedArray[i+1]) {
                    tmp = noSortedArray[i];
                    noSortedArray[i]=noSortedArray[i+1];
                    noSortedArray[i+1]=tmp;
                    sorted=false;
                }

            }
        }
        for (int i = 0; i < noSortedArray.length; i++) {
            System.out.print(noSortedArray[i] + " ");

        }

        String s = 1 + " " + 1; //в этом случае благодаря "" преобразовывается всен в строку
        byte b = 1;
        long l = (long)b; //явное приведение типов
       // String str = (String)(new Integer(1)); нельзя приводить к ссылочнуму типу данных не ссылочный
        String str = String.valueOf('A'); //Преобразование к строке
        */

       // A a= new A();
       // B b = new B();

        String s = "D";
        String str = "D"; //хранятся в String Pool "D" - лучше хранить тут. для глобальных только так. а то много памяти жрет
        String newStr = new String();//выделяет память в хипе
        newStr = newStr.intern(); // перевод в стринг пул
        //a==b  сравнивание ссылок на объекты
        //equals  сравнение непосредственно того на что ссылается ссылка


    }


}
