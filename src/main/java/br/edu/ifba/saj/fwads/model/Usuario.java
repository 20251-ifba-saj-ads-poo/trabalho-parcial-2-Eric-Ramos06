package br.edu.ifba.saj.fwads.model;

import java.util.UUID;

public class Usuario extends AbstractModel<UUID> {

    private String login;
    private String senha;
    private TipoUsuario tipoUsuario;

    public enum TipoUsuario {
        ADMIN,
        MOTORISTA,
        PASSAGEIRO
    }
    public Usuario(String login, String senha, TipoUsuario tipoUsuario) {
        this.login = login;
        this.senha = senha;
        this.tipoUsuario = tipoUsuario;
        this.setCreatedAt(java.time.LocalDateTime.now());
        this.setUpdatedAt(java.time.LocalDateTime.now());
    }

    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }
    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
    
}
