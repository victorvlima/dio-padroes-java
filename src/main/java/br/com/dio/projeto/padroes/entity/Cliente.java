package br.com.dio.projeto.padroes.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Cliente {

    @Id
    private String email;
    private String nome;
    @ManyToOne
    private Endereco endereco;
    
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
}
