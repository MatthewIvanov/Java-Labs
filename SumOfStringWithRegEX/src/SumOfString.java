
import java.util.StringTokenizer;

public class SumOfString {
    public static double GetSumOfNumbers(String line) {
        StringTokenizer st = new StringTokenizer(line, " \t\n\r,");
        double sum = 0;
        while(st.hasMoreTokens()){
            double num = 0;
            try {
                num = Double.parseDouble(st.nextToken());
                sum += num;
            } catch (NumberFormatException exception) {}
        }
        return sum;
    }
    public static double GetSumOfNumbersRegEx(String line) {
        StringTokenizer st = new StringTokenizer(line, " \t\n\r,");
        double sum = 0;
        while(st.hasMoreTokens()){
            String temp = st.nextToken();
            if (temp.matches("(^-|^\\+)?[0-9]")) {
                double num = Double.parseDouble(temp);
                sum += num;
            }
        }
        return sum;
    }
}