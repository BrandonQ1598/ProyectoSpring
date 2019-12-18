package repository;

import models.User;

import org.springframework.data.repository.CrudRepository;

public interface UserRpository extends CrudRepository<User, Long>{

}
