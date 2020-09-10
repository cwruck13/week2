package model;
//Cassandra Wruck

public class StudentLogic {
	
	//calculates yearly cost for a student
	public double calculateYearlyCost(Student student) {
		
		double yearlyCost = 0;
		yearlyCost = student.getSemesterCost() * 2; 
		return yearlyCost;
	}
	
	//calculates how many semesters a student has completed
	public int calculateSemestersCompleted(Student student) {
		
		int semestersCompleted = 0;
		semestersCompleted = student.getYear() * 2;
		return semestersCompleted;
	}
	
	//determines if a student is graduating
	public boolean isGraduating(Student student) {
		
		boolean graduating = false;
		
		if (student.getYear() == 4) {
			graduating = true;
		}
		
		return graduating;
	}
}
