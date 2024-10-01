import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTester {
	GradeBook grade1;
	GradeBook grade2;

	@BeforeEach
	void setUp() throws Exception {
		grade1 = new GradeBook(5);
		grade2 = new GradeBook(5);
		
		grade1.addScore(20);
		grade1.addScore(20297);
		
		grade2.addScore(34664);
		grade2.addScore(34);
		}

	@AfterEach
	void tearDown() throws Exception {
		grade1 = null;
		grade2 = null;
	}

	@Test
	void addScoreTest() {
		assertTrue(grade1.toString().equals("20.0 20297.0 "));
		assertTrue(grade2.toString().equals("34664.0 34.0 "));
	}
	
	@Test
	void scoreSizeTest() {
		assertEquals(2, grade1.getScoreSize());
		assertEquals(2, grade2.getScoreSize());
	}
	
	@Test
	void sumTest() {
		assertEquals(20317, grade1.sum());
		assertEquals(34698, grade2.sum());
	}
	
	@Test
	void minTest() {
		assertEquals(20.0, grade1.minimum());
		assertEquals(34.0, grade2.minimum());
	}
	
	@Test
	void finalTest() {
		assertEquals(20297.0, grade1.finalScore());
		assertEquals(34664.0, grade2.finalScore());
	}

}
