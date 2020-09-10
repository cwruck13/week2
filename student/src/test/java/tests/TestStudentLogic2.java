package tests;
//Cassandra Wruck

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Student;
import model.StudentLogic;

public class TestStudentLogic2 {
	
	//creating new logic and new student
	StudentLogic studL = new StudentLogic();
	Student student = new Student("Jane Do");

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testIsGraduating() {
		student.setYear(4);
		assertTrue(studL.isGraduating(student));
	}
	
	@Test
	public void testIsNotGraduating() {
		student.setYear(2);
		assertFalse(studL.isGraduating(student));
	}

}
