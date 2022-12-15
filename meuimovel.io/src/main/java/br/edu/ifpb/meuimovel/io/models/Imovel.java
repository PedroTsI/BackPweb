package br.edu.ifpb.meuimovel.io.models;

import jakarta.persistence.*;
import org.apache.catalina.User;

import java.util.List;

public class Imovel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    @Column(unique = true)
    private String endereco;
    @Column(unique = true)
    private String numero;
    @Column
    private String telefone;
    @Column
    private Long valor;
    @Column
    private String status;


    public String getId() {
        return id;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNumero() {
        return numero;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}
