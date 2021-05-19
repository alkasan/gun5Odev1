package gun5Odev1.business.abstracts;

public interface AuthService {
	public void Login (String eMail, String password);
	public void Register(int id, String firstName, String lastName, String eMail, String password);
}
