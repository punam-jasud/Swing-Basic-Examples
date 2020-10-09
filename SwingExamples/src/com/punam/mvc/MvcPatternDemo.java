package com.punam.mvc;

public class MvcPatternDemo {

	public static void main(String[] args) {
		
		Course model = retriveCourseFromDatabase();
		
		CourseView view = new CourseView();
		
		CourseController controller = new CourseController(model, view);
		
		controller.updateView();
		
		//update model data
		controller.setCourseName("Python");
		System.out.println("\n\nAfter updating..\n");
		
		controller.updateView();

	}

	private static Course retriveCourseFromDatabase() {
		Course course = new Course();
		course.setCourseName("Java");
		course.setCourseId("101");
		course.setCourseCategory("Programming");
		
		return course;
	}

}
