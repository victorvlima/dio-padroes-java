package br.com.dio.projeto.padroes.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class GuiaPagamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cliente_email", referencedColumnName = "email")
    private Cliente cliente;
    
    private String solicitacao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getSolicitacao() {
        return solicitacao;
    }

    public void setSolicitacao(String solicitacao) {
        this.solicitacao = solicitacao;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GuiaPagamento{");
        sb.append("id=").append(id);
        sb.append(", cliente=").append(cliente);
        sb.append(", solicitacao=").append(solicitacao);
        sb.append('}');
        return sb.toString();
    }

}
