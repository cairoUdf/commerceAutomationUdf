package control.impl;

import java.util.ArrayList;
import java.util.List;

import javax.management.Query;

import control.dao.UserDao;
import model.entity.User;

public class UserDaoImpl implements UserDao{

	@Override
	public List<User> buscarUsuarios() {
		List<User> listaUsuarios = new ArrayList<User>();
		String jpql = "SELECT * FROM USUARIO R";
		return listaUsuarios;
	}

	@Override
	public User buscarUsuarioPorId(Long idUsuario) {
		Query query;
		String jpql = "SELECT * FROM USUARIO R WHERE R.ID_USUARIO = :idUsuario";
		User user = new User();
		return user;
	}

	@Override
	public User detetarUsuarioPorId(Long idUsuario) {
		String jpql = "DELETE USUARIO R WHERE R.ID_USUARIO = :idUsuario";
		return null;
	}
}
