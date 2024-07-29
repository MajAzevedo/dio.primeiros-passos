package dio.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dio.springboot.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
