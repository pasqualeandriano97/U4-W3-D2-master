package entities;


import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "location")
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    private String nome;
    private String cognome;
    private Date dataNascita;
    private String luogoNascita;
    private String sesso;


    @OneToMany(mappedBy = "persona")
    private List<Partecipazione> partecipazioni;




    public Persona() {}

    public Persona(String nome, String cognome, Date dataNascita, String luogoNascita, String sesso,List<Partecipazione>partecipazioni) {
        this.nome = nome;
        this.cognome = cognome;
        this.dataNascita = dataNascita;
        this.luogoNascita = luogoNascita;
        this.sesso = sesso;
        this.partecipazioni = partecipazioni;
    }

    public long getId() {
        return id;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public Date getDataNascita() {
        return dataNascita;
    }

    public void setDataNascita(Date dataNascita) {
        this.dataNascita = dataNascita;
    }

    public String getLuogoNascita() {
        return luogoNascita;
    }

    public void setLuogoNascita(String luogoNascita) {
        this.luogoNascita = luogoNascita;
    }

    public String getSesso() {
        return sesso;
    }

    public void setSesso(String sesso) {
        this.sesso = sesso;
    }

    public List<Partecipazione> getPartecipazioni() {
        return partecipazioni;
    }

    public void setPartecipazioni(List<Partecipazione> partecipazioni) {
        this.partecipazioni = partecipazioni;
    }
}


