package br.com.five.util;

import java.util.List;

import br.com.five.entidades.Usuario;

public class loginUser {

	public Usuario logar(List<Usuario> users, int senha, int cpf) {
		for (int i = 0; i < users.size(); i++) {
			if(users.get(i).getSenha() == senha & users.get(i).getCpf() == cpf) {
				return users.get(i);
			}
		}
		System.out.println("Usuário não existente, verifique seus dados");
		return null;
		
//		for (Usuario usuario : users) {
//			if(usuario.getSenha() == senha) {
//				return true;
//			}
//		}
//		return false;
//		
//	}

}
}
