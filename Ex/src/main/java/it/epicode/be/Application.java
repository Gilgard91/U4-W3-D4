package it.epicode.be;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Application {

    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("test");

    public static void main(String[] args) {

        EntityManager em = emf.createEntityManager();

//        System.out.println("Esercitazione D2");
//
//
//        EventoDAO ed = new EventoDAO(em);
//
//        Evento beatles = new Evento("Beatles", "25/01/24", "Concerto", tipoEvento.PUBBLICO, 100);
//
//        ed.save(beatles);

//        try{
//            LocationsDAO ld = new LocationsDAO(em);
//            PartecipazioniDAO pd = new PartecipazioniDAO(em);
//            PersoneDAO ppd = new PersoneDAO(em);
//            EventoDAO ed = new EventoDAO(em);
//
//            Location location1 = new Location("Caffè Arnaldo", "Brescia");
//
//            LocalDate annoDiNascita = LocalDate.of(1991, 5, 31);
//            Persona persona1 = new Persona("Mario", "Rossi", "mario@rossi.it", annoDiNascita, Sesso.M);
//
//            LocalDate dataEvento = LocalDate.of(2024, 2, 15);
//            Evento evento1 = new Evento("Evento prova", dataEvento, "netflix & chill", tipoEvento.PRIVATO, 5);
//
//            Partecipazione partecipazione1 = new Partecipazione(persona1, evento1);
//
//            ppd.save(persona1);
//            ld.save(location1);
//            ed.save(evento1);
//            pd.save(partecipazione1);
//
//        } catch (Exception exception) {
//            System.err.println(exception.getMessage());
//        } finally {
//            em.close();
//            emf.close();
//        }




    }
}
