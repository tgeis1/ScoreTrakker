package STPackage;

public class Student implements Comparable<Student> {
	private String name;
	private int score;
	

	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	
	@Override
	public int compareTo(Student s) {
		// TODO Auto-generated method stub
		if (this.score > s.score) {
			return 1;
		} else if (this.score < s.score) {
			return -1;
		} else {
			return 0;
		}
	}

	public String toString() {
		return name + " " + score;
	}
	
}
