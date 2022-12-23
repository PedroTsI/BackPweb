package br.edu.ifpb.meuimovel.io.models;

import br.edu.ifpb.meuimovel.io.exception.IdZeroInvalidoException;
import br.edu.ifpb.meuimovel.io.exception.ValorNegativoException;
import jakarta.persistence.*;
import org.apache.catalina.User;
import org.w3c.dom.Text;

import java.util.List;
@Entity
public class Imovel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String endereco;
    @Column(unique = true)
    private String numero;
    @Column
    private String telefone;
    @Column
    private Long valor;
    @Column
    private String status;

    @Column(length = 1337)
    private String imagem;

    public Long getId() {
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

    public Long getValor() {
        return valor;
    }

    public void setValor(Long valor) {
        if (valor < 0) {
            throw new ValorNegativoException();
        }
        this.valor = valor;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        if (Status.getStatusByString(status) != null) {
            this.status = status;
        } else {
            throw new IllegalArgumentException("Status inválido");
        }
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public void setId(Long id) {
        if (id <= 0) {
            throw new IdZeroInvalidoException();
        }
        this.id = id;
    }
}
