package tests;
//Cassandra Wruck

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Student;
import model.StudentLogic;

public class TestStudentLogic {
	
	//creating new logic and new student
	StudentLogic studL = new StudentLogic();
	Student student = new Student("Jane Do");

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCalculateSemesters() {
		student.setYear(3);
		int semestersCompleted = studL.calculateSemestersCompleted(student);
		assertEquals(6, semestersCompleted, 0);
	}
	
	@Test
	public void testCalculateSemesterCost() {
		student.setSemesterCost(800);
		double cost = studL.calculateYearlyCost(student);
		assertEquals(1600, cost, 0);
	}

}
