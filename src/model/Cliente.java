package model;

import java.util.HashMap;
import java.util.List;

public class Cliente {
    private List<Documento> documentos;
    private HashMap<String, String> dados;

    public Cliente(List<Documento> documentos, HashMap<String, String> dados) {
        this.documentos = documentos;
        this.dados = dados;
    }

    public List<Documento> getDocumentos() {
        return documentos;
    }

    public void setDocumentos(List<Documento> documentos) {
        this.documentos = documentos;
    }

    public HashMap<String, String> getDados() {
        return dados;
    }

    public void setDados(HashMap<String, String> dados) {
        this.dados = dados;
    }
}
