package br.com.phamtecnologia.apiclientes.entities;

import br.com.phamtecnologia.apiclientes.enums.StatusCliente;
import br.com.phamtecnologia.apiclientes.enums.TipoCliente;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Cliente {

    private Integer id;
    private String nome;
    private String email;
    private String telefone;
    private StatusCliente status;
    private TipoCliente tipo;

}
