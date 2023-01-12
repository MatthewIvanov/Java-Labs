import java.util.Scanner;
public class task1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(new File("input.txt"));
		List<String> lines = new ArrayList<String>();
		while (sc.hasNextLine()) {
		  lines.add(sc.nextLine());
		}

		String[] arr = lines.toArray(new String[0]);
	}

}
	