import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		addPeople();
		readPeople();
	}
	static void addPeople() {
		List<String> people = new ArrayList<>();
		
		Scanner scan = new Scanner(System.in);
			System.out.print("Enter number people: ");
			int count =scan.nextInt();
			
			for (int i = 1; i <= count; i++) {
				System.out.print(i + " Person: ");
				String person = scan.next();
				people.add(person);
			}
			String output = "";
			for(String person : people) {
				output += person + "\n";
			}
			try {
				Files.write(Paths.get("C:\\Users\\munym\\OneDrive\\Documents\\Deverlopments\\JavaProject\\SqliteDemo\\Database File\\output.txt"), output.getBytes());
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		scan.close();
	}// addPeople
	
	static void readPeople() {
		File file = new File("C:\\Users\\munym\\OneDrive\\Documents\\Deverlopments\\JavaProject\\SqliteDemo\\Database File\\output.txt");
		try {
			Scanner in = new Scanner(file);
			List<String> people = new ArrayList<>();
			while(in.hasNext()) {
				String line = in.nextLine();
				if (!line.equals("")) {
					people.add(line);
				}
			}
			in.close();
			
			System.out.println(people);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}// readPeople

}
