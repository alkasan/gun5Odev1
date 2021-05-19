package gun5Odev1.business.concretes;

import java.util.List;

import gun5Odev1.business.abstracts.UserService;
import gun5Odev1.dataAccess.abstracts.UserDao;
import gun5Odev1.entities.concretes.User;

public class UserManager implements UserService {

	private UserDao userDao;

	
	public UserManager(UserDao userDao) {
		this.userDao=userDao;
	}
		
	@Override
	public void add(User user) {
	
		System.out.println(user.getFullName() + " " +"Adli kullanici eklendi.");
			
		
	}

	@Override
	public void delete(User user) {
	
		System.out.println(user.getFullName()+ " " + "Adli kullanici silindi.");
	}

	@Override
	public void update(User user) {
	
		System.out.println(user.getFullName() +" " +"Adli kullanici güncellendi.");	
	}

	@Override
	public User getByMailUser(String eMail) {
		return userDao.getByMail(eMail);
	}

	@Override
	public List<User> getAll() {
		for(User user : userDao.getAll()) {
			System.out.println(user.getId()+" "+ user.getFullName() +" "+ user.geteMail());
		}
		return userDao.getAll();
	}
	
	public boolean userValidate(User user) {
		if(user.getFirstName().length()>=2 && user.getLastName().length()>=2) {
			return true;				
		}
		System.out.println("Adiniz ve soyadiniz minimum 2 karakter olmalidir.");
		return false;
	}
	
	public boolean checkPassword(User user) {
		if(user.getPassword().length()>=6) {
			return true;				
		}
		System.out.println("Parolaniz minimum 6 karakter olmalidir.");
		return false;
	}

}
