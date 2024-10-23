package studentgradingsystem;
import java.util.*;

public class StudentManager implements Comparator<Student> {
	private HashMap<Integer, Student> studentMap;

	public StudentManager() {
		this.studentMap = new HashMap<Integer, Student>();
	}
	
	public void addStudent(Student student) {
		if(studentMap.containsKey(student.getStudentId())){
			throw new DuplicateStudentException("Student with student Id "+student.getStudentId()+" already exists");
		}
		studentMap.put(student.getStudentId(), student);
	}
	
	public void removeStudent(int studentId) {
		Student removeStudent = findStudentById(studentId);
		if(removeStudent == null) {
			throw new StudentNotFoundException("Student with student id "+studentId+" not found in records");
		}
		studentMap.remove(removeStudent);
	}
	
	public Student findStudentById(int studentId) {
		return studentMap.getOrDefault(studentId, null);
	}
	
	public void addGradeToStudent(int studentId, double grade) {
		Student student = findStudentById(studentId);
		if(student == null)
			throw new StudentNotFoundException("Student with student id "+studentId+" not found in records");
	}
	
	public void display() {
		//sort the students in the order of name or GPA;
	}
	
	public void filterStudentsByGradeThreshold() {
		//display the students who have GPA greater than a given threshhold GPA
	}

	
	@Override
	public int compare(Student o1, Student o2) {
		String name1 = o1.getName();
		String name2 = o2.getName();
		return name1.compareTo(name2);
	}
}
