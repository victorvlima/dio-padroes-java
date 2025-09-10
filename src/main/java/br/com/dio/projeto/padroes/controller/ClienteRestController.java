package br.com.dio.projeto.padroes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.dio.projeto.padroes.entity.Cliente;
import br.com.dio.projeto.padroes.service.ClienteService;

/**
 * Este {@link RestController} representa uma <b>Facade</b>, abstraindo toda
 * a complexidade de integrações (Banco de Dados H2 e API do ViaCEP) em uma
 * interface simples e coesa (API REST).
 * 
 * @author victorvlima
 */
@RestController
@RequestMapping("clientes")
public class ClienteRestController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping
	public ResponseEntity<Iterable<Cliente>> buscarTodos() {
		return ResponseEntity.ok(clienteService.buscarTodos());
	}

	@GetMapping("/{id}")
	public ResponseEntity<Cliente> buscarPorId(@PathVariable Long id) {
		return ResponseEntity.ok(clienteService.buscarPorId(id));
	}
}
