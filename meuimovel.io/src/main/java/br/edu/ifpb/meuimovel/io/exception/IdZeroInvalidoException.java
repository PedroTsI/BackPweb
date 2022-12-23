package br.edu.ifpb.meuimovel.io.exception;

public class IdZeroInvalidoException extends RuntimeException {
    public IdZeroInvalidoException() {
        super("Id não pode ser zero ou negativo");
    }
}

