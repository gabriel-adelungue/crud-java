package br.co.agenda.aplicacao;

import java.util.Date;

import br.com.agenda.dao.ContatoDAO;
import br.com.agenda.model.Contato;

public class Main {

	public static void main(String[] args) {
		
		ContatoDAO contatoDao = new ContatoDAO();

		// Inser��o dos registros do banco de dados
		Contato contato = new Contato();
		contato.setNome("Jo�o Dias");
		contato.setIdade(18);
		contato.setDataCadastro(new Date());
		//contatoDao.save(contato);
		
		
		// Atualizar o contato.
		Contato c1 = new Contato();
		c1.setNome("Jo�o Dias Souza Lima");
		c1.setIdade(19);
		c1.setDataCadastro(new Date());
		c1.setId(1); // n�mero que est� no banco de dados da PK
		//contatoDao.update(c1);
		
		
		// Deletar o contato pelo seu numero de ID
		contatoDao.deleteById(4);
		
		
		// Visualiza��o dos registros do banco de dados (TODOS)
		for (Contato c : contatoDao.getContatos()) {
			System.out.println("Contato: " + c.getNome());
		}
		
		
		
	}

}
