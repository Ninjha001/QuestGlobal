package studentgradingsystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Student {
	private int studentId;
	private String name;
	private List<Double> grades;
	
	public Student(int studentId, String name) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.grades = new ArrayList<Double>();
	}

	public int getStudentId() {
		return studentId;
	}

	public String getName() {
		return name;
	}

	public List<Double> getGrades() {
		return grades;
	}
	
	public void addGrades(double grade) {
		grades.add(grade);
	}
	
	public double calculateGPA() {
		if(grades.isEmpty())
			throw new NoGradesFoundException("No grades available for the student "+name);
		double totalGPA = 0.0;
		for(Double grade: grades) {
			totalGPA+=grade;
		}
		return totalGPA;
	}

	@Override
	public int hashCode() {
		return Objects.hash(studentId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student student = (Student) obj;
		return studentId == student.studentId;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", grades=" + grades + "]";
	}
	
	
}
