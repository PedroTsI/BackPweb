package br.edu.ifpb.meuimovel.io.exception;

public class ValorNegativoException extends RuntimeException {
    public ValorNegativoException() {
        super("Valor do Imovel não pode ser negativo");
    }
}
