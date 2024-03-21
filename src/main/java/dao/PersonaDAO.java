package dao;

import entities.Evento;
import entities.Persona;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class PersonaDAO {
    private final EntityManager em;

    public PersonaDAO(EntityManager em) {
        this.em = em;
    }

    public void save (Persona persona) {
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(persona);
        tx.commit();
        System.out.println("Evento salvato con successo!");

    }
    public Persona findById(long id) {
        Persona persona = em.find(Persona.class, id);
        if (persona == null) {
            throw new IllegalArgumentException("Nessun evento trovato con l'id: " + id);
        } else {
            return persona;
        }

    }

    public void deleteById (long id) {
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        Persona persona = em.find(Persona.class, id);
        if (persona == null) {
            throw new IllegalArgumentException("Nessun evento trovato con l'id: " + id);
        } else {
            em.remove(persona);
            tx.commit();
            System.out.println("Evento eliminato con successo!");
        }
    }
}
