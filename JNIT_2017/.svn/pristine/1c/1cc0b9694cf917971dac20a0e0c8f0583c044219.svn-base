import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileReadingDemo {

	public static void main(String[] args) throws IOException {
		try (BufferedReader bf = new BufferedReader(new FileReader(new File(
				"/Users/anushatiyyagura/Desktop/student_info.txt")))) {

			List<Student> studentList = new ArrayList<Student>();

			while (bf.ready()) {

				String line = bf.readLine();
				if (line.contains("Student")) {
					continue;
				} else {

					String[] n = line.split("-");
					Student student = new Student();
					student.id = n[0];
					System.out.println(student);

				}

			}

		}
	}
}

class Student {

	public String id;
	public String name;
	public String address;
	public String phoneNumber;

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address
				+ ", phoneNumber=" + phoneNumber + "]";
	}

}
