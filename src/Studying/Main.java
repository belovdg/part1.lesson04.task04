package Studying;

public class Main {

    public static void main(String[] args) {
        int max=6;
        int progr=3;
        System.out.println("Максимальное число в прогрессии = " + max);
        System.out.println("Изначальное кол-во переменных в прогрессии = " + progr);
        System.out.print("Вывод арифметической прогрессии:" + "\n");
        for(int i=1;i<=max;i++)
        {
            for(int j=0;j<progr;j++)

                System.out.print(i + " ");
            progr+=1;
        }
        System.out.println();
    }
}
