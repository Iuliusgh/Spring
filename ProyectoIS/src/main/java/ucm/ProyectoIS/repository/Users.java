package ucm.ProyectoIS.repository;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Users {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long ID;
	private String NICKNAME;
	private String PSSWORD;
	  
	protected Users() {}
	
	public Users(String nickname, String pssword) {
		this.NICKNAME = nickname;
		this.PSSWORD = pssword;
	}
	
	@Override
	public String toString() {
		return String.format("Users[id='%d', nickname='%s', pssword='%s'",ID,NICKNAME,PSSWORD);
	}

}
