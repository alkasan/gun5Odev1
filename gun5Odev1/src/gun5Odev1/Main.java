package gun5Odev1;


import gun5Odev1.business.concretes.AuthManager;
import gun5Odev1.business.concretes.UserManager;
import gun5Odev1.core.concretes.CheckMail;
import gun5Odev1.core.concretes.VerificationManager;
import gun5Odev1.dataAccess.concretes.GoogleUserDao;
import gun5Odev1.entities.concretes.User;

public class Main {


	public static void main(String[] args) {
	
		User user1 = new User(1, "Ayse", "Siyah", "ayse@hotmail.com","11123");
		User user2 = new User(2, "Fatma", "K", "fatma@hotmail.com","44456");
		User user3 = new User(3, "A", "Sahin", "sahin@hotmail.com","789999");
		User user4 = new User(4, "Ayse", "Sahin", "sahin@hotmail.comtttt","789");
		
	
		UserManager userManager = new UserManager(null);
		userManager.add(user1);
		userManager.add(user2);
		userManager.add(user3);
		userManager.add(user4);
		System.out.println("------");
		
		userManager.delete(user1);
		userManager.update(user2);
		System.out.println("------");
		
		userManager.userValidate(user2);
		userManager.userValidate(user3);
		System.out.println("------");
		
		userManager.checkPassword(user4);
		System.out.println("------");
		
		VerificationManager verificationManager = new VerificationManager();
		verificationManager.sendEmail(user1.geteMail());
		System.out.println("------");
		
		GoogleUserDao googleUserDao = new GoogleUserDao();
		googleUserDao.add(user4);
		System.out.println("------");
		
		AuthManager authManager = new AuthManager(userManager);
		authManager.Register(user1.getId(), user1.getFirstName(), user1.getLastName(), user1.geteMail(), user1.getPassword());
		System.out.println("------");
		
		authManager.Login(user1.geteMail(), user1.getPassword());
		System.out.println("------");
		
		CheckMail checkMail = new CheckMail();
		checkMail.checkUser(user4);
		 
		
		 
	}

}
