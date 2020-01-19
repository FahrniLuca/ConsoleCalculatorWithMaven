package ch.bbw.consolecalculator;

import org.junit.runner.JUnitCore;
import com.sun.java.browser.plugin2.liveconnect.v1.Result;
import com.sun.net.httpserver.Authenticator.Failure;

/**
 * @class AppTest
 * @author Luca Fahrni
 */

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

class AppTest {

	public AppTest() {

	}

	@Nested
	class Suite {

		@Test
		void testApp() 
		{
			JUnitCore junit = new JUnitCore();
			
			Result result = junit.run(CalculatorTest.class);
			
			if (result.wasSuccessful()) 
			{

			} else 
			{
				for (Failure failure : result.getFailures()) 
				{
					fail(((Object) failure).getException());
				}
			}
		}

	}

}