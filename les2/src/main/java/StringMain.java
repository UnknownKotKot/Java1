
public class StringMain {

public static void main (String [] args){

    String [] array = new String[5];
    int [] arrayInt = new int[5];
    array[1] = "test1";//будет храниться в 1 индексе
    System.out.println(array[0] + "  " + array[1] + "  " + array[4]);

    for(int i=0; i<array.length; i++){
        //в каждый элемент массива постваить индекс
        array[i]= i + " "; //?
        System.out.println(array[i]);
    }

    char [] arrayChar = new char [5];
    for(int i=0; i<array.length; i++){
        //в каждый элемент массива постваить индекс
        arrayChar[i]= (char)(65+i); //?
        System.out.println(arrayChar[i]);
    }

    int[]arr  ={ 1, 2 ,3};
    arr[0]=6;

//двумерный массв обьявлени

    char[][] massR=new char[5][5];//равномерный массив 5х5
    char[][] massI=new char[5][];//неравномерный массив
    massI[0] = new char[5];//создали массив под индексом 0 длинной 5
    massI[1] = new char[2];//создали массив под индексом 1 длиной 2
    massI[2] = new char[4];
    massI[3] = new char[3];
    massI[4] = new char[1];


    System.out.println(massR[0]); //печатает адрес ячейки 0 где хранится массив
    System.out.println(massR[0][0]); //печатает непосредственн отог очт охранится в массивае 0 под индексом 0

   int a= 64;
    for (int i=0; i<massR.length; i++){
        for (int j=0; j<massR[i].length; j++){

            a++;
            massR[i][j] =(char)a;


        }
    }
    for (int i=0; i<massR.length; i++){
        for (int j=0; j<massR[i].length; j++){

            System.out.print(massR[i][j]);
            System.out.print(" ");


        }
        System.out.println();}

}

}


