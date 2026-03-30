package br.com.phamtecnologia.apiclientes.entities;

import br.com.phamtecnologia.apiclientes.enums.StatusCliente;
import br.com.phamtecnologia.apiclientes.enums.TipoCliente;

public class Cliente {

    private Integer id;
    private String nome;
    private String email;
    private String telefone;
    private StatusCliente status;
    private TipoCliente tipo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public StatusCliente getStatus() {
        return status;
    }

    public void setStatus(StatusCliente status) {
        this.status = status;
    }

    public TipoCliente getTipo() {
        return tipo;
    }

    public void setTipo(TipoCliente tipo) {
        this.tipo = tipo;
    }
}
