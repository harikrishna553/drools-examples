package com.sample.app.model;

public class Student {

	public static enum GRADE {
		SECOND_CLASS, FIRST_CLASS, DISTINCTION
	}

	private int id;
	private String name;
	private double percentage;
	private GRADE grade;
	private boolean passed;

	public Student(int id, String name, double percentage, boolean passed) {
		super();
		this.id = id;
		this.name = name;
		this.percentage = percentage;
		this.grade = grade;
		this.passed = passed;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	public boolean isPassed() {
		return passed;
	}

	public void setPassed(boolean passed) {
		this.passed = passed;
	}

	public GRADE getGrade() {
		return grade;
	}

	public void setGrade(GRADE grade) {
		this.grade = grade;
	}

}
