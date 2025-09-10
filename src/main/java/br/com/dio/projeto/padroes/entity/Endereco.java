package br.com.dio.projeto.padroes.entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

/**
 * Os atributos desse modelo/entity foram gerados automaticamente pelo site
 * jsonschema2pojo.org. Para isso, foi usado o JSON de retorno da API do ViaCEP.
 * 
 * @see <a href="https://viacep.com.br/">ViaCEP</a>
 * @see <a href="https://www.jsonschema2pojo.org/">jsonschema2pojo.org</a>
 * 
 * @author victorvlima
 */
@Entity
public class Endereco {

    @Id
    private String cep;
    private String logradouro;
    private String complemento;
    private String unidade;
    private String bairro;
    private String localidade;
    private String uf;
    private String estado;
    private String regiao;
    private String ibge;
    private String gia;
    private String ddd;
    private String siafi;

    @OneToMany(mappedBy = "endereco", fetch = FetchType.LAZY)
    private Set<Cliente> clientes = new HashSet<>();

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    public String getIbge() {
        return ibge;
    }

    public void setIbge(String ibge) {
        this.ibge = ibge;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getSiafi() {
        return siafi;
    }

    public void setSiafi(String siafi) {
        this.siafi = siafi;
    }

    public Set<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(Set<Cliente> clientes) {
        this.clientes = clientes;
    }

    @Override
    public String toString() {
        return "Endereco [cep=" + cep + ", logradouro=" + logradouro + ", complemento=" + complemento + ", unidade="
                + unidade + ", bairro=" + bairro + ", localidade=" + localidade + ", uf=" + uf + ", estado=" + estado
                + ", regiao=" + regiao + ", ibge=" + ibge + ", gia=" + gia + ", ddd=" + ddd + ", siafi=" + siafi
                + ", clientes=" + clientes + "]";
    }

    // Método helper
    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
        cliente.setEndereco(this);
    }
}