package gun5Odev1.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import gun5Odev1.dataAccess.abstracts.UserDao;
import gun5Odev1.entities.concretes.User;

public class GoogleUserDao implements UserDao {
	
	List<User> users;
	
	public GoogleUserDao() {
		users = new ArrayList<User>();
	} 

	@Override
	public void add(User user) {
		users.add(user);
		System.out.println(user.getFirstName() + user.getLastName() +"isimli kullanici google hesabi ile basari bir sekilde kaydoldu.");
	}

	@Override
	public void update(User user) {
		for ( User usernew : users) {
			if (usernew.getId()== user.getId()) {
				usernew.setFirstName(user.getFirstName());
				usernew.setLastName(user.getLastName());
				usernew.seteMail(user.geteMail());
				usernew.setPassword(user.getPassword());
			}
		}
		
		System.out.println(user.getFirstName() + user.getLastName() +"isimli kullanici google hesabi ile basari bir sekilde güncellendi.");
	}

	@Override
	public void delete(User user) {
	    users.remove(user);
		System.out.println(user.getFirstName() + user.getLastName() +"isimli kullanicinin google hesabi  basari bir sekilde silindi.");
	}

	@Override
	public User getByMail(String eMail) {
		for (User usernew : users) {
			if(usernew.geteMail()== eMail)
		
		return usernew;
	}
		return null; 
		}

	@Override
	public User checkMailPassword(String eMail, String password) {
		for(User usernew : users) {
			if(usernew.geteMail() == eMail && usernew.getPassword() == password) {
				return usernew;
			}		
		}
		return null;
		
	}	

	@Override
	public List<User> getAll() {
		return null;
	}

}
