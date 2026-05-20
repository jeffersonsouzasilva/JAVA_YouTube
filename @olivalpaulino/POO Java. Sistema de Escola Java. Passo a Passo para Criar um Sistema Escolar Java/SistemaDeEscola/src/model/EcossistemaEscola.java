package model;

import java.util.ArrayList;

public class EcossistemaEscola {
    private ArrayList<Escola> escolas;

    public EcossistemaEscola() {
        this.escolas = new ArrayList<>();
    }

    public void adicionarEscola(Escola escola){
        escolas.add(escola);
    }
    public void removerEscola(Escola escola){
        escolas.remove(escola);
    }
}
