public class Main {

    public static void main(String args []) {
       /* int a=3;
        switch (a){
            case 1:
                //логика

                System.out.println("a=1");
                break;
            case 2:
                //логика
                System.out.println("a=2");
                break;
            case 3:
                //логика
                System.out.println("a=3");
                break;


            default:
                System.out.println("a=4");
        }*/

       /* qqw:
        for (int i=10; i>0; i--) {
            for (int j=10; j>0; j--){
                System.out.println(i);
                continue qqw;
            }
            if (i == 4) {
                continue;
            }
            System.out.println(i);
            if (i == 3) {
                break;
            }

        }
        int a=5;
        while(a==5){//сначала смотрит услвоие потмо делает
           break;
        }

        do{//делает одн раз, смотрит условие, есл итру то делат дальше, закеанчивается точка с запятой!
            System.out.println("hi");
        }while(a==4);*/

        //блоки кода обозначаются фигурными скобками
       /* if (false)//если false то до точки запятой не рабоатет код, если тру то все рабоатет, тоже самое для for
            //; прекращает выполнение цикла
            System.out.println("1");
            System.out.println("2");*/
        int a =5;
        for(int i=5; i<0; i--){
            a=i;
            i=a;
            //j сдесь не виден
            for(int j =0; j<5; j++){
                a=j;
                i=j;
            }

        }
        //j и i сдесь не виден
    }}

