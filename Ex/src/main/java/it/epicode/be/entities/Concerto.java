package it.epicode.be.entities;

import it.epicode.be.Genere;

import javax.persistence.*;

@Entity
@Table(name = "concerti")
public class Concerto extends Evento{

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private Genere genere;

    @Column(nullable = false)
    private boolean inStreaming;

    public Concerto(){}

    public Concerto(String titolo, String dataEvento, String descrizione, it.epicode.be.tipoEvento tipoEvento, int numeroMassimoPartecipanti, Location locationEvento, Genere genere, boolean inStreaming) {
        super(titolo, dataEvento, descrizione, tipoEvento, numeroMassimoPartecipanti, locationEvento);
        this.genere = genere;
        this.inStreaming = inStreaming;
    }

    public Genere getGenere() {
        return genere;
    }

    public void setGenere(Genere genere) {
        this.genere = genere;
    }

    public boolean isInStreaming() {
        return inStreaming;
    }

    public void setInStreaming(boolean inStreaming) {
        this.inStreaming = inStreaming;
    }

    @Override
    public String toString() {
        return "Concerto{" +
                "genere=" + genere +
                ", inStreaming=" + inStreaming +
                "} " + super.toString();
    }
}
