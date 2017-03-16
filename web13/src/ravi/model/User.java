package ravi.model;

/**
 * Created by raviagrawal on 29/01/17.
 */
public class User {
	
	private boolean success;
	private String accountIdentifier;
	
    public User( boolean success,String accountIdentifier) {
		
		this.success = success;
		this.accountIdentifier = accountIdentifier;
	}
	
    
	
    public boolean getSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public String getaccountIdentifier() {
		return accountIdentifier;
	}
	public void setaccountIdentifier(String accountIdentifier) {
		this.accountIdentifier = accountIdentifier;
	}
	
	
}
