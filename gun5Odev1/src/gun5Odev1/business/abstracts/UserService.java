package gun5Odev1.business.abstracts;

import java.util.List;

import gun5Odev1.entities.concretes.User;

public interface UserService {
	void add(User user);
	void delete(User user);
	void update(User user);
	User getByMailUser(String eMail);
	List <User>getAll();

}
