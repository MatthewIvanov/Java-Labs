import java.io.File;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String [] args){
    try {
        Scanner in = new Scanner (new File("input.txt"));
        int n,m;
        n = in.nextInt();
        m= in.nextInt();

        int [][] arr= new int [n][m];
        int [] sum=  new int[m];

        for(int i = 0;i<n;i++) {
            for(int j = 0;j<m;j++) {
                arr[i][j] = in.nextInt();
            }
        }
        for(int i = 0;i<n;i++) {
            for(int j = 0;j<m;j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        for(int i = 0;i<n;i++) {
            for(int j = 0 ;j<m;j++) {
                sum[i] += arr[i][j];
            }
        }
        for(int l = 0;l<n;l++)
            if(sum[0]>sum[1]) {
                for(int j = 0 ;j<m;j++) {
                    int tmp = arr[0][j];
                    arr[0][j] = arr[1][j];
                    arr[0][j] = tmp;
                }
                System.out.println("Сумма эл-тов 0 строки "+ sum[0]);
                System.out.println("Сумма э-тов 1 строки "+sum[1]);
                System.out.println("Переупорядочим:");
                for(int j = 0;j<m;j++) {
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            } else {
                System.out.println("Массив уже упорядочен");
            }

    }catch(Exception e) {
        System.out.print("Error");
    }

}
}

