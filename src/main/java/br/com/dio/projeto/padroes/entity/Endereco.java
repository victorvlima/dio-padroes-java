package br.com.dio.projeto.padroes.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Endereco.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this)))
                .append('[');
        sb.append("cep");
        sb.append('=');
        sb.append(((this.cep == null) ? "<null>" : this.cep));
        sb.append(',');
        sb.append("logradouro");
        sb.append('=');
        sb.append(((this.logradouro == null) ? "<null>" : this.logradouro));
        sb.append(',');
        sb.append("complemento");
        sb.append('=');
        sb.append(((this.complemento == null) ? "<null>" : this.complemento));
        sb.append(',');
        sb.append("unidade");
        sb.append('=');
        sb.append(((this.unidade == null) ? "<null>" : this.unidade));
        sb.append(',');
        sb.append("bairro");
        sb.append('=');
        sb.append(((this.bairro == null) ? "<null>" : this.bairro));
        sb.append(',');
        sb.append("localidade");
        sb.append('=');
        sb.append(((this.localidade == null) ? "<null>" : this.localidade));
        sb.append(',');
        sb.append("uf");
        sb.append('=');
        sb.append(((this.uf == null) ? "<null>" : this.uf));
        sb.append(',');
        sb.append("estado");
        sb.append('=');
        sb.append(((this.estado == null) ? "<null>" : this.estado));
        sb.append(',');
        sb.append("regiao");
        sb.append('=');
        sb.append(((this.regiao == null) ? "<null>" : this.regiao));
        sb.append(',');
        sb.append("ibge");
        sb.append('=');
        sb.append(((this.ibge == null) ? "<null>" : this.ibge));
        sb.append(',');
        sb.append("gia");
        sb.append('=');
        sb.append(((this.gia == null) ? "<null>" : this.gia));
        sb.append(',');
        sb.append("ddd");
        sb.append('=');
        sb.append(((this.ddd == null) ? "<null>" : this.ddd));
        sb.append(',');
        sb.append("siafi");
        sb.append('=');
        sb.append(((this.siafi == null) ? "<null>" : this.siafi));
        sb.append(',');
        if (sb.charAt((sb.length() - 1)) == ',') {
            sb.setCharAt((sb.length() - 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}