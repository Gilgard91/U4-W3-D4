package it.epicode.be.dao;

import it.epicode.be.entities.Partecipazione;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class PartecipazioniDAO {

    private EntityManager em;

    public PartecipazioniDAO(EntityManager em) {
        this.em = em;
    }
    public void save(Partecipazione partecipazione) {
        try {
            EntityTransaction t = em.getTransaction();
            t.begin();
            em.persist(partecipazione);
            t.commit();
            System.out.println("Partecipazione all'evento " + partecipazione.getEvento() + " per la persona " + partecipazione.getPersona().getCognome() + ", creata");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public Partecipazione findById(long id) {
        return em.find(Partecipazione.class, id);
    }

    public void findByIdAndDelete(long id) {
        try {
            EntityTransaction t = em.getTransaction();
            t.begin();
            Partecipazione found = em.find(Partecipazione.class, id);
            if (found != null) {
                em.remove(found);
                t.commit();
                System.out.println("Partecipazione cancellata");
            } else System.out.println("Partecipazione non trovata");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
