package br.co.agenda.aplicacao;

import java.util.Date;

import br.com.agenda.dao.ContatoDAO;
import br.com.agenda.model.Contato;

public class Main {

	public static void main(String[] args) {
		
		ContatoDAO contatoDao = new ContatoDAO();

		// Inserção dos registros do banco de dados
		Contato contato = new Contato();
		contato.setNome("João Dias");
		contato.setIdade(18);
		contato.setDataCadastro(new Date());
		//contatoDao.save(contato);
		
		
		// Atualizar o contato.
		Contato c1 = new Contato();
		c1.setNome("João Dias Souza Lima");
		c1.setIdade(19);
		c1.setDataCadastro(new Date());
		c1.setId(1); // número que está no banco de dados da PK
		//contatoDao.update(c1);
		
		
		// Deletar o contato pelo seu numero de ID
		contatoDao.deleteById(4);
		
		
		// Visualização dos registros do banco de dados (TODOS)
		for (Contato c : contatoDao.getContatos()) {
			System.out.println("Contato: " + c.getNome());
		}
		
		
		
	}

}
