package br.com.dio.projeto.padroes.service;

import br.com.dio.projeto.padroes.entity.Cliente;

/**
 * Interface em <b>Strategy</b> no domínio de cliente. Desta forma, 
 * se necessário, podemos ter multiplas implementações dessa mesma
 * interface.
 * 
 * @author victorvlima
 */
public interface ClienteService {

	Iterable<Cliente> buscarTodos();

	Cliente buscarPorId(Long id);

	void inserir(Cliente cliente);

	void atualizar(Long id, Cliente cliente);

	void deletar(Long id);
}