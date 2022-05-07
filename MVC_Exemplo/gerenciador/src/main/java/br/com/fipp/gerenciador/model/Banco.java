package br.com.fipp.gerenciador.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {

	private static List<Empresa> lista = new ArrayList<>();
	private static List<User> userList = new ArrayList<>();

	private static Integer chaveSequencial = 1;

	static {
		
		lista.add(new Empresa(chaveSequencial++, "Facebook", "50%"));
		lista.add(new Empresa(chaveSequencial++, "Google", "65%"));
		lista.add(new Empresa(chaveSequencial++, "Toninho LTDA", "70%"));
		lista.add(new Empresa(chaveSequencial++, "GO SIMULADOS", "300% TOP DAS GALAXYA!!!"));

		// CREATE USERS
		userList.add(new User("cebola", "blabla"));
		userList.add(new User("taveira", "12345678"));
		userList.add(new User("erm", "12345678"));
	}

	public void adiciona(Empresa empresa) {
		empresa.setId(Banco.chaveSequencial++);
		Banco.lista.add(empresa);
	}

	public List<Empresa> getEmpresas() {
		return Banco.lista;
	}

	public void removeEmpresa(Integer id) {

		Iterator<Empresa> it = lista.iterator();

		while (it.hasNext()) {
			Empresa emp = it.next();

			if (emp.getId() == id) {
				it.remove();
			}
		}
	}

	public Empresa buscaEmpresaPelaId(Integer id) {
		for (Empresa empresa : lista) {
			if (empresa.getId() == id) {
				return empresa;
			}
		}
		return null;
	}

	public User userIsValid(String login, String pass) {
		for (User u : userList) {
			if (u.isEqual(login, pass)) {
				return u;
			}
		}
		return null;
	}
}
