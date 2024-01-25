package it.epicode.be.entities;

import it.epicode.be.tipoEvento;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "evento")
public abstract class Evento {

    @Id
    @GeneratedValue
    private long id;

    @Column(name = "titolo")
    private String titolo;

    @Column(name = "data_evento")
    private String dataEvento;

    @Column(name = "descrizione")
    private String descrizione;

    @Enumerated(EnumType.STRING)
    private tipoEvento tipoEvento;

    @Column(name = "numero_massimo_partecipanti")
    private int numeroMassimoPartecipanti;


    @ManyToOne
    @JoinColumn(name = "location_evento_id")
    private Location locationEvento;

    @OneToMany(mappedBy = "evento")
    private List<Partecipazione> listaPartecipazioni;

    public Evento() {
    }

    public Evento(String titolo, String dataEvento, String descrizione, it.epicode.be.tipoEvento tipoEvento, int numeroMassimoPartecipanti, Location locationEvento) {
        this.titolo = titolo;
        this.dataEvento = dataEvento;
        this.descrizione = descrizione;
        this.tipoEvento = tipoEvento;
        this.numeroMassimoPartecipanti = numeroMassimoPartecipanti;
        this.locationEvento = locationEvento;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getDataEvento() {
        return dataEvento;
    }

    public void setDataEvento(String dataEvento) {
        this.dataEvento = dataEvento;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public it.epicode.be.tipoEvento getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(it.epicode.be.tipoEvento tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public int getNumeroMassimoPartecipanti() {
        return numeroMassimoPartecipanti;
    }

    public void setNumeroMassimoPartecipanti(int numeroMassimoPartecipanti) {
        this.numeroMassimoPartecipanti = numeroMassimoPartecipanti;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Location getLocationEvento() {
        return locationEvento;
    }

    public void setLocationEvento(Location locationEvento) {
        this.locationEvento = locationEvento;
    }

    public List<Partecipazione> getListaPartecipazioni() {
        return listaPartecipazioni;
    }

    public void setListaPartecipazioni(List<Partecipazione> listaPartecipazioni) {
        this.listaPartecipazioni = listaPartecipazioni;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "id=" + id +
                ", titolo='" + titolo + '\'' +
                ", dataEvento=" + dataEvento +
                ", descrizione='" + descrizione + '\'' +
                ", tipoEvento=" + tipoEvento +
                ", numeroMassimoPartecipanti=" + numeroMassimoPartecipanti +
                '}';
    }

    @Entity
    public class Department {
        @Id
        @GeneratedValue
        private Long id;
        private String name;
        @OneToMany(mappedBy = "department")
        private List<Employee> employees = new ArrayList<>();
    }

    @Entity
    public class Employee {
        @Id
        @GeneratedValue
        private UUID id;
        private String name;
        @ManyToOne
        @JoinColumn(name = "department_id")
        private Department department;
    }
}
