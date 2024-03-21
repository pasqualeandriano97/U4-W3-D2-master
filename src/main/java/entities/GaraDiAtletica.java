package entities;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Set;
@Entity
public class GaraDiAtletica extends Evento {



    @OneToMany
    @JoinColumn(name = "atleti_id")
    private Set<Persona> atleti;

    @OneToOne
    private Persona vincitore;


    public GaraDiAtletica() {}

    public GaraDiAtletica(String title, Date date, String description, tipoEvento tipo, int maxParticipants, Location location, Set<Persona> atleti, Persona vincitore) {
        super(title, date, description, tipo, maxParticipants, location);
        this.atleti = atleti;
        this.vincitore = vincitore;
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
}
