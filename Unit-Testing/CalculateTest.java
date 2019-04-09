package testing;

import static org.junit.Assert.*;

import junit.framework.TestCase;
public class CalculateTest  extends TestCase{


public void testSum() {
	Calculate calculation = new Calculate();
	int sum = calculation.sum(2, 5);
	int testSum = 5;
System.out.println("@Test sum(): " + sum + " = " + testSum);
assertEquals(sum, testSum);
}                                                                                                                                                                                                                                                                       
