package com.POO.gestaoDisk.view.modelo;

/**
 *
 * @author André & Letícia
 */
public class LoginDto {
    
    private String username;
    private String senha;

    public LoginDto() {
    }

    public LoginDto(String username, String senha) {
        this.username = username;
        this.senha = senha;
    }
   

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
}
