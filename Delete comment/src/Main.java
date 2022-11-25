import java.util.Scanner;
import java.io.File;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main {
        public static void main(String[] args){
            try {
                Scanner in = new Scanner(new File("input.txt"));
                StringBuilder stroka = new StringBuilder();
                while(in.hasNextLine()) {
                    String str = in.nextLine();
                    stroka.append(str).append('\n');
                }
                System.out.println(stroka);
                char[] arr = stroka.toString().toCharArray();
               boolean flag = false;
                for(int i = 0; i<arr.length;i++){
                    if(arr[i] == '"' && flag == false){
                        System.out.print(arr[i]);
                        flag = true;
                    } else if(arr[i] == '"' && flag == true){
                        System.out.println(arr[i]);
                        flag = false;
                    }else if(arr[i] != '"' && flag == true){
                        System.out.print(arr[i]);
                    }
                }
            }catch(Exception e){
                System.out.println("Error!");
            }
        }
    }
