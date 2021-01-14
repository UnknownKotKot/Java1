public class HTClass {

    //прописал метод main
    static public void main(String[] args) {
        //вывод на консоль методов для проверки
        System.out.println(floatCalculator(1.5F, 2.65F, 3565.55F, -44.464F));
        System.out.println(floatCalculator(-1.5F, -2.65F, -3565.55F, 44.464F));

        System.out.println(sumChecker(25, 10));
        System.out.println(sumChecker(10, 10));

        negativeValueCheckerPrinter(-10);
        negativeValueCheckerPrinter(0);

        System.out.println(negativeValueCheckerBoolean(-10));
        System.out.println(negativeValueCheckerBoolean(0));

        helloMessagePrinter("Вова");

        leapYearChecker(1100);
        leapYearChecker(1200);
        leapYearChecker(2020);
    }

    // создание и инициализация переменных простых типов данных
    byte aByte = 1;
    short aShort = 200;
    int aInt = 40000;
    long aLong = 200L;

    float aFloat = 1.5F;
    double aDouble = 1000.45;

    char aChar = 'j';

    boolean aBool = true;


    //метод, вычисляющий выражение a * (b + (c / d)) и возвращающий результат
    //я беру тип возвращающего значения double т.к. результат вычислений с float может выйти за границы пределов для float
    public static double floatCalculator(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

    //метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно)
    public static boolean sumChecker(int a, int b) {

        int sum = a + b;

        if (sum >= 10 && sum <= 20) {

            return true;
        }
        return false;
    }

    //метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль, положительное ли число передали или отрицательное
    public static void negativeValueCheckerPrinter(int a) {
        if (a >= 0) {
            System.out.println("Число [" + a + "] положительное.");
        } else {
            System.out.println("Число [" + a + "] отрицательное.");

        }

    }

    //метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
    public static boolean negativeValueCheckerBoolean(int a) {
        if (a >= 0) {
            return false;
        }
        return true;
    }

    //метод, которому в качестве параметра передается строка, обозначающая имя. Метод должен вывести в консоль сообщение «Привет, указанное_имя!».
    public static void helloMessagePrinter(String a) {
        System.out.println("Привет, " + a + "!");
    }

    //метод, который определяет, является ли год високосным, и выводит сообщение в консоль.
    // Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.

    public static void leapYearChecker(int year){
        //проверка кратности 400
        if ((year%400)==0){
            System.out.println(year + " - високосный год!");
        }else{
                //проверка одновременного условия - отсутсвие кратности 100 и наличия кратности 4
                if (((year%100)!=0&&(year%4)==0)){
                    System.out.println(year + " - високосный год!");
                }else {
                    System.out.println(year + " - не високосный год.");
                }
            }

        }
    }



