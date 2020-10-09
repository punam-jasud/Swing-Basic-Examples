package com.punam.mvc;

public class CourseController {
	
	private Course model;
	private CourseView view;
	
	
	
	public CourseController(Course model, CourseView view) {
		this.model = model;
		this.view = view;
	}
	
	public void setCourseName(String name) {
		model.setCourseName(name);
	}
	
	public String getCourseName() {
		return model.getCourseName();
	}
	
	public void setCourseId(String id) {
		model.setCourseId(id);
	}
	
	public String getCourseId() {
		return model.getCourseId();
	}
	
	public void setCourseCategory(String category) {
		model.setCourseCategory(category);
	}
	
	public String getCourseCategory() {
		return model.getCourseCategory();
	}
	
	public void updateView() {
		view.printCourseDetails(getCourseName(), getCourseId(), getCourseCategory());
	}

}
