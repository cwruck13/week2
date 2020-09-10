package model;
//Cassandra Wruck

public class Student {
	
	//initializing variables
	private String name;
	private double semesterCost;
	private int year;
	
	//no args
	public Student() {
		super();
	}
	
	//arg just name
	public Student(String name) {
		super();
		this.name = name;
	}

	//all args
	public Student(String name, double semesterCost, int year) {
		super();
		this.name = name;
		this.semesterCost = semesterCost;
		this.year = year;
	}

	//getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSemesterCost() {
		return semesterCost;
	}

	public void setSemesterCost(double semesterCost) {
		this.semesterCost = semesterCost;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
		
}
