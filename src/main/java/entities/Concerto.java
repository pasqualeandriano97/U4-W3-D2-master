package entities;

import jakarta.persistence.*;

@Entity
public class Concerto extends Evento{
    @Id
    @GeneratedValue
    private int id;
    @Enumerated(EnumType.STRING)
    private Genere genere;
    @Enumerated(EnumType.STRING)
    private Streaming inStreaming;

    public Concerto() {
    }

    public Concerto(Genere genere, Streaming inStreaming) {
        this.genere = genere;
        this.inStreaming = inStreaming;
    }
    public long getId() {
        return id;
    }
    public Genere getGenere() {
        return genere;
    }

    public void setGenere(Genere genere) {
        this.genere = genere;
    }

    public Streaming getInStreaming() {
        return inStreaming;
    }

    public void setInStreaming(Streaming inStreaming) {
        this.inStreaming = inStreaming;
    }
}
