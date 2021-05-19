package gun5Odev1.core.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import gun5Odev1.core.abstracts.CheckMailService;
import gun5Odev1.entities.concretes.User;

public class CheckMail implements CheckMailService{

	
	String mailPattern = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";
	Pattern pattern = Pattern.compile(mailPattern, Pattern.CASE_INSENSITIVE);
	
	
	@Override
	public boolean checkUser(User user) {
		Matcher matcher = pattern.matcher(user.geteMail());
		if(matcher.matches() == true) {
			System.out.println("Mail kurala uygun.");
			return true;
		}
		System.out.println("Mail uygun deðil. Lütfen gecerli bir mail adresi yaziniz.");
		return false;
	}
}
