package Test;

public class Student implements Comparable<Student>{
 
	int id;
	String name; 
	public Student(int idUsed, String nameUsed) {
		id = idUsed;
		name = nameUsed; 
		
	}
	public void setId(int idUsed) {
		id = idUsed; 
	}
	
	public int getKey() {
		return id; 
	}
	
	public String getElement() {
		return name;
	}
	public void setName(String nameUsed) {
		name = nameUsed; 
	}
	@Override
	public int compareTo(Student o) {
		// compare the int keys
		// if the student o key is smaller than this key
			// return -1
		return Integer.compare(id, o.getKey());
	}
	
	public String toString() {
		return "" + this.id + this.name;
	}
}
