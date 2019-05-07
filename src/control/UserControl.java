package control;

import control.impl.UserDaoImpl;
import model.entity.User;

public class UserControl {
	
	private User user;
	private UserDaoImpl connection;
	
	public void deletarUser(Long id){
		connection.detetarUsuarioPorId(id);
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
}
