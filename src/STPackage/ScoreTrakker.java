package STPackage;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ScoreTrakker {
	private ArrayList<Student> studentList;

	public void loadDataFromFile(String fileName) {
		try {
			FileReader reader = new FileReader(fileName);
			Scanner in = new Scanner(reader);
			while(in.next() != null) {
			Student student = new Student(in.nextLine(), in.nextInt());
			}
		} 
		catch (Exception FileNotFoundException) {
			System.out.println("File not found");
		}
		
		
	}

	public void printInOrder() {
		Collections.sort(studentList);
		for (Student s: studentList) {
			System.out.println(s.toString());
		}
	}

	public void processFiles(String fileName) {
		loadDataFromFile(fileName);
		printInOrder();
	}

	public static void main(String[] args) {
		ScoreTrakker trakker = new ScoreTrakker();
		trakker.processFiles("scores.txt");
	}
}
