package dao;

import entities.Evento;
import entities.Partecipazione;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class PartecipazioneDAO {
    private final EntityManager em;

    public PartecipazioneDAO(EntityManager em) {
        this.em = em;
    }

    public void save (Partecipazione partecipazione) {
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(partecipazione);
        tx.commit();
        System.out.println("Partecipazione salvata con successo!");

    }
    public Partecipazione findById(long id) {
        Partecipazione partecipazione = em.find(Partecipazione.class, id);
        if (partecipazione == null) {
            throw new IllegalArgumentException("Nessuna partecipazione trovata con l'id: " + id);
        } else {
            return partecipazione;
        }

    }

    public void deleteById (long id) {
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        Partecipazione partecipazione = em.find(Partecipazione.class, id);
        if (partecipazione == null) {
            throw new IllegalArgumentException("Nessuna partecipazione trovata con l'id: " + id);
        } else {
            em.remove(partecipazione);
            tx.commit();
            System.out.println("Partecipazione eliminata con successo!");
        }
    }
}
