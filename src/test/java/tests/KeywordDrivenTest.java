package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import ExecutionRunner.TestExecutor;

public class KeywordDrivenTest {


	

	@AfterMethod
	public void tearDown() {
		// Quit TestExecutor
		if(TestExecutor.getDriver()!=null) {
			TestExecutor.getDriver().close();
		}
	}

	@Test
	public void executeLoginTest() {
		TestExecutor testExecutor = new TestExecutor();
		testExecutor.executeTestCasesFromCSV("login_test.csv");
	}

	@Test
	public void executeSearchTest() {
		TestExecutor testExecutor = new TestExecutor();
		testExecutor.executeTestCasesFromCSV("search_test.csv");
	}

	// Add more test methods as needed for other test cases or functionalities

}
