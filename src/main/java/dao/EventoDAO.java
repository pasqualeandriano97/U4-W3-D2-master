package dao;

import entities.Evento;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class EventoDAO {
    private final EntityManager em;

    public EventoDAO(EntityManager em) {
        this.em = em;
    }

    public void save (Evento evento) {
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(evento);
        tx.commit();
        System.out.println("Evento salvato con successo!");

}
     public Evento findById(long id) {
        Evento evento = em.find(Evento.class, id);
        if (evento == null) {
           throw new IllegalArgumentException("Nessun evento trovato con l'id: " + id);
        } else {
            return evento;
        }

     }

     public void deleteById (long id) {
         EntityTransaction tx = em.getTransaction();
         tx.begin();
         Evento evento = em.find(Evento.class, id);
         if (evento == null) {
             throw new IllegalArgumentException("Nessun evento trovato con l'id: " + id);
         } else {
             em.remove(evento);
             tx.commit();
             System.out.println("Evento eliminato con successo!");
         }
     }
}
