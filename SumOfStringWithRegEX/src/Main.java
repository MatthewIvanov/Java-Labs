import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Enter the string with numbers: ");

        Scanner in = new Scanner(new File("input.txt"));
        String str = in.nextLine();
        System.out.println("Sum of numbers: " + SumOfString.GetSumOfNumbers(str));
        System.out.println("Sum of numbers using regex: " + SumOfString.GetSumOfNumbersRegEx(str));
    }
}