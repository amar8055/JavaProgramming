package Courses;

public class Main  {

	public static void main(String[] args) {
		
		Topic topic = new Topic();
		topic.setT_name("Strings");
		topic.setTopic_id(12);
		topic.setT_duration(12);
		
		Course course = new Course();
		course.setCourse_name("Java");
		course.setCourse_id(12);
		course.setCourse_duration(34);
		
		course.addList(topic);
		
		System.out.println(course.toString());
	
	}
}
	
	
	
	
		
		

	

