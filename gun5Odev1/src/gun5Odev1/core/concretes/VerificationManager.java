package gun5Odev1.core.concretes;

import gun5Odev1.core.abstracts.VerificationService;

public class VerificationManager implements VerificationService {

	@Override
	public void sendEmail(String eMail) {
		System.out.println(eMail + " adresine doğrulama e-postası gönderilmiştir.");
	}

	@Override
	public boolean verifyEmail() {
		return true;
	}

}
