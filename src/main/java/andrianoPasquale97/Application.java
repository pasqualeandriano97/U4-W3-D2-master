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


        Supplier <Evento> createEvento= (()-> new Evento(faker.name().title(),faker.date().birthday(),"Bellissimo", tipoEvento.PRIVATO,50,daoL.findById(1)));
//        Supplier <Evento> createEvento1= (()-> new Evento(faker.name().title(),faker.date().birthday(),"Stupendo", tipoEvento.PUBBLICO,1000));
//        Supplier <Evento> createEvento2= (()-> new Evento(faker.name().title(),faker.date().birthday(),"Entusiasmante", tipoEvento.PRIVATO,100));
//        Supplier <Evento> createEvento3= (()-> new Evento(faker.name().title(),faker.date().birthday(),"Estremamente Bello", tipoEvento.PUBBLICO,2000));
        Evento evento1=createEvento.get();
//        Evento evento2 = createEvento1.get();
//        Evento evento3 = createEvento2.get();
//        Evento evento4 = createEvento3.get();
//        List<Evento> eventi = List.of(evento1, evento2, evento3, evento4);

        Supplier<Persona> personaF = (()->new Persona(faker.name().firstName(), faker.name().lastName(),faker.date().birthday(), faker.address().streetAddress(), Sesso.F));
        Supplier<Persona> personaM = (()->new Persona(faker.name().firstName(), faker.name().lastName(),faker.date().birthday(), faker.address().streetAddress(), Sesso.M));
        Supplier<Location> location =(()-> new Location(faker.address().streetAddress(), faker.address().city()));
        Supplier<Partecipazione> partecipazione = (() -> new Partecipazione(daoP.findById(1),daoE.findById(2),Stato.CONFERMATA));
        Supplier<Partecipazione> partecipazione1 = (() -> new Partecipazione(daoP.findById(4),daoE.findById(2),Stato.DA_CONFERMARE));
        Supplier<Partecipazione> partecipazione2 = (() -> new Partecipazione(daoP.findById(3),daoE.findById(3),Stato.CONFERMATA));
        Persona persona1 = personaF.get();
        Persona persona2 = personaM.get();
        Location location1 = location.get();
        Partecipazione partecipazione3 = partecipazione.get();
        Partecipazione partecipazione4 = partecipazione1.get();
        Partecipazione partecipazione5 = partecipazione2.get();
//        daoP2.save(partecipazione3);
//        daoP2.save(partecipazione4);
//        daoP2.save(partecipazione5);
          Evento evento2 = daoE.findById(2);
          evento2.getPartecipazioni().forEach( System.out::println);
//       dao1.save(persona1);
//        dao1.save(persona2);
//        dao2.save(location1);
//        dao.save(evento1);
//        dao.save(evento1);
//        dao.save(evento2);
//        dao.save(evento3);
//        dao.save(evento4);
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
