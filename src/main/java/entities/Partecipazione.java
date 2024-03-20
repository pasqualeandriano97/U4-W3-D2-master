package entities;


import jakarta.persistence.*;

@Entity
@Table(name = "partecipazione")
public class Partecipazione {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private Stato stato;
    @ManyToOne
    @JoinColumn(name = "persona_Id", nullable = false,unique = true)
    private Persona persona;



    @OneToOne
    @JoinColumn(name = "evento_Id", nullable = false)

    private Evento evento;



public Partecipazione() {}
    public Partecipazione(Persona persona,  Evento evento, Stato stato) {
        this.persona = persona;
        this.evento = evento;
        this.stato = stato;
    }

    public long getId() {
        return id;
    }



    public Stato getStato() {
        return stato;
    }

    public void setStato(Stato stato) {
        this.stato = stato;
    }

    public Persona getPersona() {
        return persona;
    }



    public Evento getEvento() {
        return evento;
    }


}
