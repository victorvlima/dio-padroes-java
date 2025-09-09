package br.com.dio.projeto.padroes.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.dio.projeto.padroes.entity.GuiaPagamento;

@Repository
public interface GuiapagamentoRepository extends CrudRepository<GuiaPagamento, Long> {

}