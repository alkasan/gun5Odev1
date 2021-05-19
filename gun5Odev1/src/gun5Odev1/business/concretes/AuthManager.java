package gun5Odev1.business.concretes;

import gun5Odev1.business.abstracts.AuthService;
import gun5Odev1.business.abstracts.UserService;
import gun5Odev1.entities.concretes.User;

public class AuthManager implements AuthService {

	UserService userService;
	
	public AuthManager(UserService userService){
		super();
		this.userService=userService;
		
	}
	
	
	@Override
	public void Login(String eMail, String password) {
		User user = new User(0, password, password, eMail, password);
		if(user.geteMail() ==null || user.getPassword()==null) {
		System.out.println("Lutfen gerekli alanlarý bos birakmayin!");
			return;
		} 
		System.out.println("Giris Basarili!");			
}

	@Override
	public void Register(int id, String firstName, String lastName, String eMail, String password) {
		User user = new User(id, firstName, lastName, eMail, password);
		userService.add(user);
	}

}
