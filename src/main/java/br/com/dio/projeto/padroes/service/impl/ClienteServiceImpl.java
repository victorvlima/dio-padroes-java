package br.com.dio.projeto.padroes.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.dio.projeto.padroes.entity.Cliente;
import br.com.dio.projeto.padroes.entity.Endereco;
import br.com.dio.projeto.padroes.repository.ClienteRepository;
import br.com.dio.projeto.padroes.repository.EnderecoRepository;
import br.com.dio.projeto.padroes.service.ClienteService;
import br.com.dio.projeto.padroes.service.ViaCepService;
import jakarta.persistence.EntityNotFoundException;

/**
 * Implementação de <b>Strategy</b> {@link ClienteService}, deverá ser
 * injetada pelo Spring (via {@link Autowired}). Desta forma, esta classe sendo
 * um {@link Service}, ela será tratada como um <b>Singleton</b>.
 * 
 * @author victorvlima
 */
@Service
public class ClienteServiceImpl implements ClienteService {
    // Singleton: Injetar os componentes do Spring com @Autowired.
    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private EnderecoRepository enderecoRepository;
    @Autowired
    private ViaCepService viaCepService;

    // Strategy: Implementar os métodos definidos na interface.
    // Facade: Abstrair integrações com subsistemas, provendo uma interface simples.

    @Override
    public Iterable<Cliente> buscarTodos() {
        // Buscar todos os Clientes.
        return clienteRepository.findAll();
    }

    @Override
    public Cliente buscarPorId(Long id) {
        // Buscar Cliente por ID.
        // Optional<Cliente> cliente = clienteRepository.findById(id);
        // return cliente.get();
        return clienteRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Cliente não encontrado: " + id));
    }

    @Override
    public void inserir(Cliente cliente) {
        salvarClienteComCep(cliente);
    }

    @Override
    public void atualizar(Long id, Cliente cliente) {
        // Verifica se cliente existe
        if (!clienteRepository.existsById(id)) {
            throw new EntityNotFoundException("Cliente não encontrado: " + id);
        }
        // Buscar Cliente por ID, caso exista:
        Optional<Cliente> clienteBd = clienteRepository.findById(id);
        if (clienteBd.isPresent()) {
            cliente.setId(id);
            salvarClienteComCep(cliente);
        }
    }

    @Override
    public void deletar(Long id) {
        // Deletar Cliente por ID.
        clienteRepository.deleteById(id);
    }

    private void salvarClienteComCep(Cliente cliente) {
        // Verificar se o Endereco do Cliente já existe (pelo CEP).
        String cep = cliente.getEndereco().getCep();
        Endereco endereco = enderecoRepository.findById(cep).orElseGet(() -> {
            // Caso não exista, integrar com o ViaCEP e persistir o retorno.
            Endereco novoEndereco = viaCepService.consultarCep(cep);
            enderecoRepository.save(novoEndereco);
            return novoEndereco;
        });
        cliente.setEndereco(endereco);
        // Inserir Cliente, vinculando o Endereco (novo ou existente).
        clienteRepository.save(cliente);
    }
}
