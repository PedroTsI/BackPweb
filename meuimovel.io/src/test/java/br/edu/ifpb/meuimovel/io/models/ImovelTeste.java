package br.edu.ifpb.meuimovel.io.models;

import br.edu.ifpb.meuimovel.io.exception.IdZeroInvalidoException;
import br.edu.ifpb.meuimovel.io.exception.ValorNegativoException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ImovelTeste {
    Imovel i1;

    @BeforeEach
    public void configuraImovel() {
        i1 = new Imovel();
        i1.setId(10L);
    }


    @Test
    public void ImovelNaoPodeTerIdZero() {
        // Config
        Long numeroIdValido = 0L;

        // executa
        Assertions.assertThrows(IdZeroInvalidoException.class, () -> {
            i1.setId(numeroIdValido);
        });

        // teste
    }

    @Test
    public void IdCorretoInserido(){
        // Config
        Long numeroIdValido = 10L;

        // executa
        i1.setId(numeroIdValido);

        // teste
        Assertions.assertEquals(numeroIdValido, i1.getId());
    }

    @Test
    public void ValorDoImovelNaoPodeSerNegativo(){

        Long valorNegativo = -10L;

        Assertions.assertThrows(ValorNegativoException.class, () -> {
            i1.setValor(valorNegativo);
        });
    }

    @Test
    public void StatusDoImovelInseridoCorretamente(){
        // Config
        String status = "vendido";

        // executa
        i1.setStatus(status);

        // teste
        Assertions.assertEquals(status, i1.getStatus());
    }

    @Test
    public void StatusDoImovelInseridoIncorretamente(){
        // Config
        String status = "disponivel";

        // executa
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            i1.setStatus(status);
        });
    }
}
