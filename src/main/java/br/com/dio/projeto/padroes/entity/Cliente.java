package br.com.dio.projeto.padroes.entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Cliente {

    @Id
    private String email;
    private String nome;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "endereco_cep", referencedColumnName = "cep")
    private Endereco endereco;

    @OneToMany(mappedBy = "cliente", fetch = FetchType.LAZY)
    private Set<GuiaPagamento> guias = new HashSet<>();

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Set<GuiaPagamento> getGuias() {
        return guias;
    }

    public void setGuias(Set<GuiaPagamento> guias) {
        this.guias = guias;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente{");
        sb.append("email=").append(email);
        sb.append(", nome=").append(nome);
        sb.append(", endereco=").append(endereco);
        sb.append('}');
        return sb.toString();
    }

    // Método helper para manter sincronização
    public void adicionarGuia(GuiaPagamento guia) {
        guias.add(guia);
        guia.setCliente(this);
    }
    
    public void removerGuia(GuiaPagamento guia) {
        guias.remove(guia);
        guia.setCliente(null);
    }
}
