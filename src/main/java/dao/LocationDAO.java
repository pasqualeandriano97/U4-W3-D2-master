package dao;

import entities.Evento;
import entities.Location;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class LocationDAO {
    private final EntityManager em;

    public LocationDAO(EntityManager em) {
        this.em = em;
    }

    public void save (Location location) {
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        em.persist(location);
        tx.commit();
        System.out.println("Evento salvato con successo!");

    }
    public Location findById(long id) {
        Location location = em.find(Location.class, id);
        if (location == null) {
            throw new IllegalArgumentException("Nessun evento trovato con l'id: " + id);
        } else {
            return location;
        }

    }

    public void deleteById (long id) {
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        Location location = em.find(Location.class, id);
        if (location == null) {
            throw new IllegalArgumentException("Nessun evento trovato con l'id: " + id);
        } else {
            em.remove(location);
            tx.commit();
            System.out.println("Evento eliminato con successo!");
        }
    }
}
