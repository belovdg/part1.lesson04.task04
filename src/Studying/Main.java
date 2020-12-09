package Studying;

public class Main {

    public static void main(String[] args) {
        int max=2;
        int progr=1;
        for(int i=1;i<=max;i++)
        {
            for(int j=0;j<progr;j++)
                System.out.print(i+" ");
            progr+=1;
        }
        System.out.println();
    }
}
