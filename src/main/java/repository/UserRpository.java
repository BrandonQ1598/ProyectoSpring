package repository;

import models.User;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRpository extends CrudRepository<User, Long>{
	
	public User findByName(String name);
	
	@Query("SELECT user FROM User user WHERE user.name=?1")
	public User getUserByName(String name);
	
	public User save(User user);
}
