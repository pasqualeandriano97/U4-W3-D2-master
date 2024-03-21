package andrianoPasquale97;

import com.github.javafaker.Faker;
import dao.EventoDAO;
import dao.LocationDAO;
import dao.PartecipazioneDAO;
import dao.PersonaDAO;
import entities.*;
import exepitions.InvalidIdExepition;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;


import java.util.List;

import java.util.Set;
import java.util.function.Supplier;

public class Application {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestioneeventi");
    public static void main(String[] args) {
        EntityManager em = emf.createEntityManager();
        EventoDAO daoE = new EventoDAO(em);
        PersonaDAO daoP = new PersonaDAO(em);
        LocationDAO daoL = new LocationDAO(em);
        PartecipazioneDAO daoP2 = new PartecipazioneDAO(em);

        Faker faker = new Faker();
//        Persona persona = daoP.findById(1);
//        Persona persona1 = daoP.findById(2);
//        Persona persona2 = daoP.findById(52);
//        Persona persona3 = daoP.findById(153);
//        Set<Persona> partecipanti = Set.of(persona, persona1, persona2, persona3);
//        Set<Persona> partecipanti1 = Set.of(persona, persona1, persona2, persona3);
//        GaraDiAtletica gara = new GaraDiAtletica(faker.name().title(),faker.date().birthday(),faker.currency().name(),tipoEvento.PRIVATO,50,daoL.findById(1),partecipanti,persona1);
//        GaraDiAtletica gara1 = new GaraDiAtletica(faker.name().title(), faker.date().birthday(), faker.currency().name(), tipoEvento.PUBBLICO, 1000, daoL.findById(5), partecipanti1, persona3);
//        GaraDiAtletica gara2 = new GaraDiAtletica(faker.name().title(), faker.date().birthday(), faker.currency().name(), tipoEvento.PRIVATO, 1000, daoL.findById(3), partecipanti, persona3);
//        GaraDiAtletica gara3 = new GaraDiAtletica(faker.name().title(), faker.date().birthday(), faker.currency().name(), tipoEvento.PUBBLICO, 1000, daoL.findById(7), partecipanti, persona);

//        daoE.saveEvento(gara1);
//        daoE.saveEvento(gara2);
//        daoE.saveEvento(gara3);
//          PartitaDiCalcio partita = new PartitaDiCalcio(faker.name().title(), faker.date().birthday(), "Bellissimo", tipoEvento.PRIVATO, 50, daoL.findById(1), "Italia", "Francia", 1, 2);
//          PartitaDiCalcio partita1 = new PartitaDiCalcio(faker.name().title(), faker.date().birthday(), "Stupendo", tipoEvento.PUBBLICO, 1000, daoL.findById(2), "Napoli", "Milan", 3, 3);
//          PartitaDiCalcio partita2 = new PartitaDiCalcio(faker.name().title(), faker.date().birthday(), "Entusiasmante", tipoEvento.PRIVATO, 100, daoL.findById(3), "Roma", "Lazio", 3, 1);
//         daoE.saveEvento(partita);
//         daoE.saveEvento(partita1);
//         daoE.saveEvento(partita2);

//        Supplier <Evento> createEvento= (()-> new Evento(faker.name().title(),faker.date().birthday(),"Bellissimo", tipoEvento.PRIVATO,50,daoL.findById(1)));
//        Supplier <Evento> createEvento1= (()-> new Evento(faker.name().title(),faker.date().birthday(),"Stupendo", tipoEvento.PUBBLICO,1000,daoL.findById(2)));
//        Supplier <Evento> createEvento2= (()-> new Evento(faker.name().title(),faker.date().birthday(),"Entusiasmante", tipoEvento.PRIVATO,100,daoL.findById(3)));
//        Supplier <Evento> createEvento3= (()-> new Evento(faker.name().title(),faker.date().birthday(),"Estremamente Bello", tipoEvento.PUBBLICO,2000,daoL.findById(4)));
//        Evento evento1=createEvento.get();
//        Evento evento2 = createEvento1.get();
//        Evento evento3 = createEvento2.get();
//        Evento evento4 = createEvento3.get();
//        List<Evento> eventi = List.of(evento1, evento2, evento3, evento4);

//        Supplier<Persona> personaF = (()->new Persona(faker.name().firstName(), faker.name().lastName(),faker.date().birthday(), faker.address().streetAddress(), Sesso.F));
//      Supplier<Persona> personaM = (()->new Persona(faker.name().firstName(), faker.name().lastName(),faker.date().birthday(), faker.address().streetAddress(), Sesso.M));
//        Supplier<Location> location =(()-> new Location(faker.address().streetAddress(), faker.address().city()));
        Supplier<Partecipazione> partecipazione = (() -> new Partecipazione(daoP.findById(153),daoE.findEventoById(105),Stato.CONFERMATA));
        Supplier<Partecipazione> partecipazione1 = (() -> new Partecipazione(daoP.findById(152),daoE.findEventoById(153),Stato.DA_CONFERMARE));
        Supplier<Partecipazione> partecipazione2 = (() -> new Partecipazione(daoP.findById(103),daoE.findEventoById(154),Stato.CONFERMATA));
//        Persona persona1 = personaF.get();
//        Persona persona2 = personaM.get();
//        Location location1 = location.get();
//        Location location2 = location.get();
//        Location location3 = location.get();
//        Location location4 = location.get();
//        daoL.save(location1);
//        daoL.save(location2);
//        daoL.save(location3);
//            daoL.save(location4);

        Partecipazione partecipazione3 = partecipazione.get();
        Partecipazione partecipazione4 = partecipazione1.get();
        Partecipazione partecipazione5 = partecipazione2.get();
        daoP2.save(partecipazione3);
        daoP2.save(partecipazione4);
        daoP2.save(partecipazione5);
//          Evento evento2 = daoE.findById(2);
//          evento2.getPartecipazioni().forEach( System.out::println);
//       daoP.save(persona1);
//        daoP.save(persona2);
//        dao2.save(location1);
//        daoE.saveEvento(evento1);
//        daoE.saveEvento(evento1);
//        daoE.saveEvento(evento2);
//        daoE.saveEvento(evento3);
//        daoE.saveEvento(evento4);
//        Supplier<Location> createLocation = () -> new Location(faker.address().streetAddress(), faker.address().city(),
//        try { Evento evento1 = dao.findById(1);System.out.println(evento1);}catch (InvalidIdExepition e){
//            System.out.println(e.getMessage());
//        }
//        try { Evento evento2 = dao.findById(2);System.out.println(evento2);}catch (InvalidIdExepition e){
//            System.out.println(e.getMessage());
//        }
//        try {
//            Evento evento3 = dao.findById(3);
//            System.out.println(evento3);
//        } catch (InvalidIdExepition e) {
//            System.out.println(e.getMessage());
//        }
//        try {
//            Evento evento4 = dao.findById(4);
//            System.out.println(evento4);
//        } catch (InvalidIdExepition e) {
//            System.out.println(e.getMessage());
//        }
//
//        try{
//            dao.deleteById(1);
//        } catch (InvalidIdExepition e) {
//            System.out.println(e.getMessage());
//        }
//        try {
//            dao.deleteById(3);}
//         catch (InvalidIdExepition e) {
//             System.out.println(e.getMessage());
//         }
//        try {
//            dao.deleteById(5);}
//         catch (InvalidIdExepition e) {
//             System.out.println(e.getMessage());
//         }
//
//




                System.out.println("Hello World!");
                em.close();
                emf.close();
    }
}
