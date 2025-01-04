package legacy_code;

public class StubLoginManager implements ILoginManager{
	@Override
	public boolean isValid() {
		return true;	// always return true
	}
}
