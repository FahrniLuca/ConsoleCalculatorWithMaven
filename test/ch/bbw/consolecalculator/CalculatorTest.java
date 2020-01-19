package ch.bbw.consolecalculator;

/**
 * @class CalculatorTest
 * @author Luca Fahrni
 */

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;



public class CalculatorTest {
	private Calculator testee;

	@Before
	public void setUp() {
		testee = new Calculator();
	}

	@Test
	public void TestSummeZweiPositiveIstOk() 
	{
		assertEquals(30, testee.summe(10, 20));
	}

	@Test
	public void TestSummeZweiNegativeIstOk() 
	{
		assertEquals(-30, testee.summe(-10, -20));
	}

	@Test
	public void TestSummeZweiNullIstOk() 
	{
		assertEquals(0, testee.summe(0, 0));
	}

	@Test
	public void TestSummeZwei_MAX_VALUE_IstOk() 
	{
		assertEquals(-2, testee.summe(Integer.MAX_VALUE, Integer.MAX_VALUE));
	}

	@Test
	public void TestSummeZwei_MIN_VALUE_IstOk() 
	{
		assertEquals(0, testee.summe(Integer.MIN_VALUE, Integer.MIN_VALUE));
	}

	@Test
	public void TestSumme_MAX_VALUEM_MitEinsItsOk() 
	{
		assertEquals(-2147483648, testee.summe(Integer.MAX_VALUE, 1));
	}

	@Test
	public void TestSumme_MIN_VALUEM_MitMinusEinsIstOk() 
	{
		assertEquals(2147483647, testee.summe(Integer.MIN_VALUE, -1));
	}

	@Test
	public void TestSumme_MIN_VALUEM_Mit_MAX_VALUE_IstOk() 
	{
		assertEquals(-1, testee.summe(Integer.MIN_VALUE, Integer.MAX_VALUE));
	}

	
	
	
	
	
	
	@Test
	public void TestSubtraktionZweiPositiveIstOk() 
	{
		assertEquals(10, testee.subtraktion(20, 10));
	}

	@Test
	public void TestSubtraktionZweiNegativeIstOk() 
	{
		assertEquals(-10, testee.subtraktion(-20, -10));
	}

	@Test
	public void TestSubtraktionZweiNullIstOk() 
	{
		assertEquals(0, testee.subtraktion(0, 0));
	}

	@Test
	public void TestSubtraktionZwei_MAX_VALUE_IstOk() 
	{
		assertEquals(0, testee.subtraktion(Integer.MAX_VALUE, Integer.MAX_VALUE));
	}

	@Test
	public void TestSubtraktionZwei_MIN_VALUE_IstOk() 
	{
		assertEquals(0, testee.subtraktion(Integer.MIN_VALUE, Integer.MIN_VALUE));
	}

	@Test
	public void TestSubtraktion_MAX_VALUE_MitEinsIstOk() 
	{
		assertEquals(2147483646, testee.subtraktion(Integer.MAX_VALUE, 1));
	}

	@Test
	public void TestSubtraktion_MIN_VALUEM_MitMinusEinsIstOk() 
	{
		assertEquals(-2147483647, testee.subtraktion(Integer.MIN_VALUE, -1));
	}

	@Test
	public void TestSubtraktion_MIN_VALUE_Mit_MAX_VALUE_IstOk() 
	{
		assertEquals(1, testee.subtraktion(Integer.MIN_VALUE, Integer.MAX_VALUE));
	}

	
	
	
	
	
	@Test
	public void TestDivisionZweiPositiveIstOk() 
	{
		assertEquals(2, testee.division(20, 10), 0);
	}

	
	@Test
	public void TestDivisonZweiNegativeIstOk() 
	{
		assertEquals(2, testee.division(-20, -10), 0);
	}

	
	//@Test
	//public void TestDivisionZweiNullArithmeticExceptionIstOk() 
	//{
		//assertEquals(ArithmeticException.class, () -> testee.division(0, 0));
	//}


	@Test
	public void TestDivisionZwei_MAX_VALUE_IstOk() 
	{
		assertEquals(1, testee.division(Integer.MAX_VALUE, Integer.MAX_VALUE), 0);
	}

	
	@Test
	public void TestDivisionZwei_MIN_VALUE_IstOk() 
	{
		assertEquals(1, testee.division(Integer.MIN_VALUE, Integer.MIN_VALUE), 0);
	}

	
	@Test
	public void TestDivision_MAX_VALUE_MitEinsIstOk() 
	{
		assertEquals(2.147483647E9, testee.division(Integer.MAX_VALUE, 1), 0);
	}

	
	@Test
	public void TestDivision_MIN_VALUE_MitMinusEinsIstOk() 
	{
		assertEquals(-2.147483648E9, testee.division(Integer.MIN_VALUE, -1), 0);
	}

	
	@Test
	public void TestDivision_MIN_VALUE_Mit_MAX_VALUE_IstOk() 
	{
		assertEquals(-1, testee.division(Integer.MIN_VALUE, Integer.MAX_VALUE), 0);
	}

}
