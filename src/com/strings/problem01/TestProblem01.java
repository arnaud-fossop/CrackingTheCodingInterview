package com.strings.problem01;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class TestProblem01 {

	@Test
	public void testJeremy() {
		assertTrue(SolutionJeremy.isUnique("abcdefghijklmnop")); 
		assertFalse(SolutionJeremy.isUnique("abcdeffghijklmop")); 
	}
	
	@Ignore
	public void testIvelina() {
		
	}
	
	@Ignore
	public void testArnaud() {
		
	}
}
