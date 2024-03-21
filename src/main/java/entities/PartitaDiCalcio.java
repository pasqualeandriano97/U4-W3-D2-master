package entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class PartitaDiCalcio extends Evento {

    private String squadraDiCasa;
    private String squadraOspite;
    private int GolCasa;
    private int GolOspite;
    private String risultato;


    public PartitaDiCalcio() {}

//    public PartitaDiCalcio(String squadraDiCasa, String squadraOspite, int golCasa, int golOspite,Location location) {
//        super(location)
//        this.squadraDiCasa = squadraDiCasa;
//        this.squadraOspite = squadraOspite;
//        GolCasa = golCasa;
//        GolOspite = golOspite;
//        if (golCasa > golOspite) {
//            risultato = "Vittoria Casa";
//        } else if (golCasa < golOspite) {
//            risultato = "Vittoria Ospite";
//        } else {
//            risultato = "Pareggio";
//        }
//    }

    public PartitaDiCalcio(String title, Date date, String description, tipoEvento tipo, int maxParticipants, Location location, String squadraDiCasa, String squadraOspite, int golCasa, int golOspite) {
        super(title, date, description, tipo, maxParticipants, location);
        this.squadraDiCasa = squadraDiCasa;
        this.squadraOspite = squadraOspite;
        GolCasa = golCasa;
        GolOspite = golOspite;
        if (golCasa > golOspite) {
            risultato = "Vittoria Casa";
        } else if (golCasa < golOspite) {
            risultato = "Vittoria Ospite";
        } else {
            risultato = "Pareggio";
        }
    }

    public String getSquadraDiCasa() {
        return squadraDiCasa;
    }

    public void setSquadraDiCasa(String squadraDiCasa) {
        this.squadraDiCasa = squadraDiCasa;
    }

    public String getSquadraOspite() {
        return squadraOspite;
    }

    public void setSquadraOspite(String squadraOspite) {
        this.squadraOspite = squadraOspite;
    }

    public int getGolCasa() {
        return GolCasa;
    }

    public void setGolCasa(int golCasa) {
        GolCasa = golCasa;
    }

    public int getGolOspite() {
        return GolOspite;
    }

    public void setGolOspite(int golOspite) {
        GolOspite = golOspite;
    }

    public String getRisultato() {
        return risultato;
    }

    public void setRisultato(String risultato) {
        this.risultato = risultato;
    }
}
