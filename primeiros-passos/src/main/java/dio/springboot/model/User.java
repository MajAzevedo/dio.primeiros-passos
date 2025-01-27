package dio.springboot.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private Integer idUser;
	
	@Column(length = 50, nullable = false)
	private String name;
	
	@Column(length = 20, nullable = false)
	private String userName;
	
	@Column(length = 100, nullable = false)
	private String password;

}
