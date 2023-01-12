package lab3t2;
import java.io.File;
import java.util.Random;
import java.util.Scanner;
public class lab3t2 {

	public static void main(String[] args) {
		try {
		Scanner in = new Scanner(new File("input.txt"));
		
		int n,m;
		n = in.nextInt();
		m=  in.nextInt();
		int[][] arr = new int[n][m];	
		int [] sum = new int [m];
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
		System.out.println("Столбцы, все элементы которых чётны: ");
		for(int i = 0;i<n;i++) {
			boolean flag = true;
			for(int j = 0;j<m;j++) {
				if(arr[j][i] %2 !=0 ) {
					 flag = false;
				} 
				sum[i] = sum[i] + arr[j][i];
			}
			if(flag == true ) {
				System.out.print((i+1)+ " ");
			}
		}
		System.out.println();
		System.out.println("Столбцы элементы главной диагонали отрицательны: ");
		for(int i = 0;i<n;i++) {
			if (arr[i][i] <0) {
				System.out.println("Номер столбца "+ (i+1) +", сумма = "+sum[i]+" ");
			}
		}
		} catch(Exception e) {
			System.out.println("Error");
		}
		}

}
