package br.edu.ifpb.meuimovel.io.models;

public enum Status {
    VENDIDO("vendido"),
    A_VENDA("a venda");

    private String status;

    Status(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public static String getStatusByString(String status) {
        for (Status s : Status.values()) {
            if (s.getStatus().equals(status)) {
                return s.getStatus();
            }
        }
        return null;
    }
}

