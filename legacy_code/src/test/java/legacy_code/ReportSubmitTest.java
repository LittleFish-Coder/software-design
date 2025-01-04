package legacy_code;

import org.junit.jupiter.api.Test;

public class ReportSubmitTest {
	@Test
	void testIsValidLogFileName() {
		ReportSystem reportsm = new ReportSystem(new StubLoginManager());
		boolean result = reportsm.submit("my report");
//		System.out.println(result);
		assert(result);
		
	}
}
