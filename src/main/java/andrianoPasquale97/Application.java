package andrianoPasquale97;

import com.github.javafaker.Faker;
import dao.EventoDAO;
import entities.Evento;
import entities.tipoEvento;
import exepitions.InvalidIdExepition;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.function.Supplier;

public class Application {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestioneeventi");
    public static void main(String[] args) {
        EntityManager em = emf.createEntityManager();
        EventoDAO dao = new EventoDAO(em);
//        Faker faker = new Faker();Supplier <Evento> createEvento= (()-> new Evento(faker.name().title(),faker.date().birthday(),"Bellissimo", tipoEvento.PRIVATO,50));Supplier <Evento> createEvento1= (()-> new Evento(faker.name().title(),faker.date().birthday(),"Stupendo", tipoEvento.PUBBLICO,1000));Supplier <Evento> createEvento2= (()-> new Evento(faker.name().title(),faker.date().birthday(),"Entusiasmante", tipoEvento.PRIVATO,100));
//        Supplier <Evento> createEvento3= (()-> new Evento(faker.name().title(),faker.date().birthday(),"Estremamente Bello", tipoEvento.PUBBLICO,2000));
//        Evento evento1=createEvento.get();
//        Evento evento2 = createEvento1.get();
//        Evento evento3 = createEvento2.get();
//        Evento evento4 = createEvento3.get();
////        dao.save(evento1);
//        dao.save(evento2);
//        dao.save(evento3);
//        dao.save(evento4);
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
