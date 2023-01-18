package webapp;

public class UserValidationService {
    public boolean isUserValid(String user, String password) {
    	if(user.equals("Harshi") && password.equals("Harshi@123"))
    		return true;
    	return false;
    }
	
	
}