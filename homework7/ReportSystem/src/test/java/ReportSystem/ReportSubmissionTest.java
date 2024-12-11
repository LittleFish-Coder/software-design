package ReportSystem;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ReportSubmissionTest {
	@Test
    void testSubmitWithStubLoginManager() {
        StubLoginManager stubLoginManager = new StubLoginManager();
        ReportSystem reportSystem = new ReportSystem(stubLoginManager);

        boolean result = reportSystem.submit("Test Report");
        assertTrue(result);
    }
}
