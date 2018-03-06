package com.jnit.oca2017.jdbc;

public class Course {
	private String courseId;

	private String CourseName;

	public Course(String courseId, String courseName) {
		super();
		this.courseId = courseId;
		CourseName = courseName;
	}

	public String getCourseId() {
		return courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return CourseName;
	}

	public void setCourseName(String courseName) {
		CourseName = courseName;
	}

	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", CourseName=" + CourseName
				+ "]";
	}

}
