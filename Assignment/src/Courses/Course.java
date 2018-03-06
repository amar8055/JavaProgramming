package Courses;

import java.util.ArrayList;
import java.util.List;

public class Course {
	
	private int Course_id;
	private String Course_name;
	private int Course_duration;
	private List<Topic> topicList = new ArrayList<Topic>();
	
	public void addList(Topic topic){
		topicList.add(topic);
	}
	
	
	@Override
	public String toString() {
		return "Course [Course_id=" + Course_id + ", Course_name=" + Course_name + ", Course_duration="
				+ Course_duration + ", topicList=" + topicList + "]";
	}


	public int getCourse_id() {
		return Course_id;
	}
	public void setCourse_id(int course_id) {
		Course_id =course_id;
	}
	public String getCourse_name() {
		return Course_name;
	}
	public void setCourse_name(String course_name) {
		Course_name = course_name;
	}
	public int getCourse_duration() {
		return Course_duration;
	}
	public void setCourse_duration(int course_duration) {
		Course_duration = course_duration;
	}
	
	
}
