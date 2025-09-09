package br.com.dio.projeto.padroes.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.dio.projeto.padroes.entity.Endereco;

@Repository
public interface EnderecoRepository extends CrudRepository<Endereco, Long> {

}