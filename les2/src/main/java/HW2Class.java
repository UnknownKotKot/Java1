public class HW2Class {

public static void main (String [] args) {

    //1.Задать целочисленный массив, состоящий из элементов 0 и 1.
    //Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    // С помощью цикла и условия заменить 0 на 1, 1 на 0;

    //задание массива
    byte[] arrByte = {0, 1, 1, 0, 1, 0, 1, 0, 0, 1, 1, 1};

    //цикл меняющий 1 на 0 и 0 на 1, соотвественно
    for (int i = 0; i < arrByte.length; i++) {

        if (arrByte[i] == 1) {
            arrByte[i] = 0;
        } else {
            arrByte[i] = 1;
        }
        System.out.print(arrByte[i] + " ");
    }

    System.out.println(" ");

    //2.Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;

    //задание массива размером 8
    int c = 8;
    int[] arrInt = new int[c];
    //цикл заполняющий значениями из задания, при условии что это прогрессия геометрическая со знаменателем 3
    for (int i = 0; i < arrInt.length; i++) {
        arrInt[i] = 3 * i;
        System.out.print(arrInt[i] + " ");
    }

    System.out.println(" ");

    //3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;,

    //вариант если нам надо 1 раз прйотись и умножить на 2
    int[] arrInt2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
    for (int i = 0; i < arrInt2.length; i++) {
        if (arrInt2[i] < 6) {
            arrInt2[i] *= 2;
        }
        System.out.print(arrInt2[i] + " ");
    }

    System.out.println(" ");

    //вариант если нам надо не оставить в массиве чисел меньше 6 с помощью умножения на 2
    int[] arrInt3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
    for (int i = 0; i < arrInt3.length; i++) {
        while (arrInt3[i] < 6) {
            arrInt3[i] *= 2;
        }
        System.out.print(arrInt3[i] + " ");
    }

    System.out.println(" ");

    //4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое)
    //и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
    int a = 11;
    int b = 11;
    int[][] squareInt = new int[a][b];
    for (int i = 0; i < squareInt.length; i++) {
        for (int j = 0; j < squareInt[i].length; j++) {
            if (i == j) {
                squareInt[i][j] = 1;
                squareInt[i][squareInt[i].length - 1 - i] = 1;
            }
        }
    }

    for (int i = 0; i < squareInt.length; i++) {
        for (int j = 0; j < squareInt[i].length; j++) {
            System.out.print(squareInt[i][j] + " ");
        }
        System.out.println(" ");
    }

    //5. Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
    int[] massInt = {-56, 312, 11, -0, +0, 1, 28, 100, 32};
    maxANDminValues(massInt);
    int[] massive = {2, 2, 2, 1, 2, 2, 10, 1};
    System.out.println(checkBalance(massive));
    int[] massForMove = {0,1,2,3,4,5,6,7,8,9,10};
    massMover(massForMove, -2);

}
    public static void maxANDminValues(int [] massive) {//сделал через сравнение соседних элементво и сдвиг большего знаечния в конец, а меньшего в начало.
        for (int i=0; i<massive.length-1;i++){

            if(massive[i]>=massive[i+1]){
                int var = massive[i+1];
                massive[i+1] = massive[i];
                massive[i] = var;
            }
        }
        System.out.println(" ");
        System.out.println("Max value in massive: " + massive[massive.length-1]);

        for (int i=0; i<massive.length-1;i++){

            if(massive[i]<=massive[i+1]){
                int var = massive[i+1];
                massive[i+1] = massive[i];
                massive[i] = var;
            }
        }
        System.out.println(" ");
        System.out.println("Min value in massive: " + massive[massive.length-1]);

    }

    //6. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
    //метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.\
    //Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true,\
    //граница показана символами ||, эти символы в массив не входят.

    static public boolean checkBalance(int [] massive){
    for(int i=0; i<massive.length;) {
        int sumL=0;
        int sumR=0;

        for (int a = 0; a<(massive.length-i-1);) {
            sumL = massive[a] + sumL;
            a++;
        }
        for(int b = massive.length-1; b>massive.length-2-i;){
            sumR = massive[b] + sumR;
            b--;
        }
        if(sumL==sumR){
            return true;
        }
        i++;
        }
        return false;
    }

    //7. **** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным,
    //или отрицательным), при этом метод должен сместить все элементы массива на n позиций.
    //Элементы смещаются циклично. Для усложнения задачи нельзя пользоваться вспомогательными массивами.
    //Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ];
    //[ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ].
    // При каком n в какую сторону сдвиг можете выбирать сами.

    static public void massMover(int[] massive, int n){
    if(n!=0){//проверка , если ноль то вообще ничего оделать не надо
        if(n>0) {//сдвиг вправо если коэффициент положительный
            for (int i = 0; i < n; ) {//сдвиг точно известных элементов n-раз
                int c=0;
                c=massive[0];
                massive[0]=massive[massive.length-1];
                for (int j=1; j < massive.length-1;) {//сдвиг остальных элементов начиная с 1 индекса и заканчивая предпоследним
                    massive[massive.length-j]=massive[massive.length-j-1];
                    j++;
                }
                massive[1]=c;
                i++;
            }
        }else
            if(n<0) {//сдвиг влево если коэффициент отрицательный
                for (int i = 0; i > n; ) {//сдвиг точно известных элементов n-раз
                    int c = 0;
                    c = massive[massive.length - 1];
                    massive[massive.length - 1] = massive[0];
                    for (int j = 1; j < massive.length - 1; ) {//сдвиг остальных элементов начиная с 1 индекса и заканчивая предпоследним
                        massive[j - 1] = massive[j];
                        j++;
                    }
                    massive[massive.length - 2] = c;
                    i--;
                }

            }
    }
        for(int i=0;i<massive.length;i++) {
            System.out.println(massive[i]);
        }

    }

}



