import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {

	int rollno;
	String name;
	int age;

	Student(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
}

class AgeComparator implements Comparator<Student> {

	public int compare(Student s1, Student s2) {

		if (s1.age == s2.age) {

			return 0;

		} else if (s1.age > s2.age) {

			return 1;

		} else {

			return -1;
		}
	}
}

class NameComparator implements Comparator<Student> {

	public int compare(Student s1, Student s2) {

		return s1.name.compareTo(s2.name);
	}
}

public class TestComparator {

	public static void main(String[] args) {

		List<Student> list = new ArrayList<Student>();

		list.add(new Student(101, "Sharad", 23));
		list.add(new Student(106, "Devashree", 27));
		list.add(new Student(105, "Dutta", 21));

		Collections.sort(list, new AgeComparator());

		for (Student stu : list) {

			System.out.println(stu.rollno + " " + stu.name + " " + stu.age);
		}

		Collections.sort(list, new NameComparator());

		for (Student stu : list) {

			System.out.println(stu.rollno + " " + stu.name + " " + stu.age);
		}
	}
}
