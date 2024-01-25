package it.epicode.be.entities;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "gare_di_atletica")
public class GaraDiAtletica extends Evento{

    @ManyToMany
    @JoinTable(name = "gara_persona", joinColumns = @JoinColumn(name = "gara_id"), inverseJoinColumns = @JoinColumn(name = "atleta_id"))
    private Set<Persona> atleti;

    @ManyToOne
    @JoinColumn(name = "vincitore")
    private Persona vincitore;

    public GaraDiAtletica(){}

    public GaraDiAtletica(String titolo, String dataEvento, String descrizione, it.epicode.be.tipoEvento tipoEvento, int numeroMassimoPartecipanti, Location locationEvento) {
        super(titolo, dataEvento, descrizione, tipoEvento, numeroMassimoPartecipanti, locationEvento);
    }

    public Set<Persona> getAtleti() {
        return atleti;
    }

    public void setAtleti(Set<Persona> atleti) {
        this.atleti = atleti;
    }

    public Persona getVincitore() {
        return vincitore;
    }

    public void setVincitore(Persona vincitore) {
        this.vincitore = vincitore;
    }

    @Override
    public String toString() {
        return "GaraDiAtletica{" +
                "atleti=" + atleti +
                ", vincitore=" + vincitore +
                "} " + super.toString();
    }
}
