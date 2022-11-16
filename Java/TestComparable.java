import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>{
	
	int n;
	String str;
	
	public Student(int n, String str) {
		
		this.n = n;
		this.str = str;
	}

	@Override
	public int compareTo(Student o) {
		
		if (str.equals(o.str)) {
			
			return 0;
			
		} else if (str.compareTo(o.str) > 0) {
			
			return 1;
			
		} else {
			
			return -1;
		}
		
//		if (n == o.n) {
//			
//			return 0;
//			
//		} else if (n > o.n) {
//			
//			return 1;
//			
//		} else {
//			
//			return -1;
//		}
	}

}

public class TestComparable {
	
	public static void main(String[] args) {
		
		List<Student> list = new ArrayList<>();
		
		list.add(new Student(3, "Dutta"));
		list.add(new Student(2, "Sharad"));
		list.add(new Student(1, "Devashree"));
		list.add(new Student(1, "Kumari"));
		
		Collections.sort(list);
		
		for (Student stu : list) {
			
			System.out.println(stu.n);
			System.out.println(stu.str);
		}
	}
}
