package br.edu.ifba.saj.fwads.model;

import java.util.UUID;

public class Usuario extends AbstractModel<UUID> {

    private String login;
    private String senha;
    private TipoUsuario tipoUsuario;
}
