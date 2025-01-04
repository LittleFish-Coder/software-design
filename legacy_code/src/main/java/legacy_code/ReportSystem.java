package legacy_code;

public class ReportSystem {
	
	ILoginManager loginmgr;
	
	public ReportSystem(ILoginManager loginmgr) {
		this.loginmgr = loginmgr;
	}
	
	public boolean submit(String report) {
//		LoginManager loginmgr = new LoginManager();
		
		if (loginmgr.isValid()) {
			// submit the report
			return true;
		}
		
		return false;
	}
}
