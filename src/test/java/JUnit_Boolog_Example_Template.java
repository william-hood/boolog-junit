import io.github.william_hood.boolog_java.Constants;
import io.github.william_hood.boolog_junit.JUnitBoolog;
import io.github.william_hood.toolbox_java.Tools;
import org.junit.jupiter.api.*;

/**
 * This is a template to use when creating a new JUnit project that logs with Boolog.
 * @author William A. Hood - william.arthur.hood@gmail.com
 *
 */

// TODO: Class level log.

class JUnit_Boolog_Example_Template {
	private static JUnitBoolog classLog;
	private JUnitBoolog log;
	private TestInfo testInfo;
	
	void concludeTestLog() {
		classLog.showJUnitBoolog(log);
		classLog.reportCondition(log.status);
	}
	
	@BeforeAll
	static void classSetup() {
		classLog = new JUnitBoolog("Example Template", Tools.stdout, null);
	}
	
	@AfterAll
	static void classCleanup() {
		TopLevel.Log.showJUnitBoolog(classLog);
	}
	
	@BeforeEach
	void setUp(TestInfo testInfoIncoming) throws Exception {
		testInfo = testInfoIncoming;
		log = new JUnitBoolog(testInfo.getDisplayName(), Tools.stdout, null);
		JUnitBoolog setupLog = new JUnitBoolog("Setup");
		setupLog.info("This is where we set everything up!");
		setupLog.info("You can also verify proper configuration here.");
		log.showBoolog(setupLog, Constants.EMOJI_SETUP, "neutral");
	}

	@AfterEach
	void tearDown() throws Exception {
		JUnitBoolog tearDownLog = new JUnitBoolog("Tear Down");
		tearDownLog.info("This is where we clean everything up!");
		tearDownLog.info("You can also double-check proper configuration here.");
		log.showBoolog(tearDownLog, Constants.EMOJI_CLEANUP, "neutral");
		concludeTestLog();
	}

	@Test
	@DisplayName("First Test")
	void test() {
		log.info("Testing something...");
		
		//log.fail("Forcing a fail");
		log.assertTrue(true, "Forcing a true assert");
	}

	@Test
	@DisplayName("Second Test")
	void testAnother() {
		log.info("Testing first criterion...");
		log.assertTrue(true);
		
		log.info("Testing next criterion...");
		log.assertEquals(1, 1, "One should equal itself");

		log.info("Testing third criterion...");
		log.assertSame(2, 3.14159, "This should fail");
	}

}
