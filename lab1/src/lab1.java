import java.util.Scanner;

public class lab1 {

	public static void main(String[] args) {
		
	double sum = 0,x,x2=0,eps,k;
	int i = 1,mark = 0;
	Scanner in = new Scanner(System.in);
	System.out.print("Введите x: " );
	x = in.nextDouble();
	System.out.println();
	System.out.println("Введите k: ");
	k = in.nextDouble();
	eps = Math.pow(10,-k); 
	x2=x;
	if(x>-1 && x<1) {
	while(Math.abs(x2/i)>eps) {
		sum =sum+  Math.pow(-1,mark)* x2/i; 
		x2 = x2*x*x;
		i = i+2;
		mark++;
	}
	System.out.printf("Res =  %.5f\n ", sum);
	} 
		else System.out.println("Нарушены границы x");
	System.out.printf("Java Res =  %.5f",Math.atan(x));
	in.close();
	}
	
}
