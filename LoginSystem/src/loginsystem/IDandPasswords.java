package loginsystem;

import java.util.HashMap;

public class IDandPasswords {
	
	HashMap<String, String> logininfo = new HashMap<String, String>();
	
	IDandPasswords() {
		logininfo.put("Gustavo", "password1");
		logininfo.put("Sorele", "password2");
		logininfo.put("Camila", "password3");
	}
	
	protected HashMap getLoginInfo() {
		return logininfo;
	}
	
}
