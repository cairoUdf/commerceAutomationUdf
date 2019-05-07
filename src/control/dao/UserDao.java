package control.dao;

import java.util.List;

import model.entity.User;

public interface UserDao {

	public List<User> buscarUsuarios();
	public User buscarUsuarioPorId(Long idUsuario);
	public User detetarUsuarioPorId(Long idUsuario);
}
