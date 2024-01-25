package it.epicode.be.dao;

import it.epicode.be.entities.Evento;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class EventoDAO {

    private final EntityManager em;

    public EventoDAO(EntityManager em) {
        this.em = em;
    }

    public void save(Evento evento){
        EntityTransaction transaction = em.getTransaction();

        Evento eventoReference = evento;

        transaction.begin();
        em.persist(evento);
        transaction.commit();

        System.out.println("Evento " + eventoReference.getTitolo() + " aggiunto correttamente");
    }

    public Evento getById(long id){
        return em.find(Evento.class, id);
    }

    public void getByIdAndDelete(long id){
        Evento found = this.getById(id);

        if(found != null){
            EntityTransaction transaction = em.getTransaction();
            transaction.begin();
            em.remove(found);
            transaction.commit();
            System.out.println("Evento " + found.getTitolo() + " eliminato correttamente");
        } else {
            System.out.println("L'evento non è stato trovato");
        }
    }
}
