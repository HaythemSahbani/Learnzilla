package hibernate.can;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.*;

public class DataManipulation {
	
	public static void main(String[] args) {
		
		Benutzer b = new Benutzer();
		b = login("horst","horst");
	}
	
	//Hier wird die Connection geöffnet und eine Session zurückgegeben
	public static Session getConnection()
	{
		Configuration cfg =new Configuration();
		cfg.configure("hibernate.learnzilla.cfg.xml"); //populates the data of the configuration file
		
		//creating session factory object
		SessionFactory factory = cfg.buildSessionFactory();
		
		//creating session object
		Session session=factory.openSession();
		
		return session;		
	}
	
	// Hier wird die Connection zur Datenbank geschlossen
	public static void closeConnection(Session session)
	{
		session.close();
	}
	
	public static Benutzer login(String benutzername, String passwort)
	{
		Session session;
		session = getConnection();
		
		Transaction t= session.beginTransaction();
		
		Benutzer currentUser = new Benutzer();
		
		Query query = session.createQuery("FROM benutzer b WHERE b.benutzername =" + benutzername);
		List results = query.list();
		
		System.out.println(results);
		
		return currentUser;
	}
	
	
	public int getFettigkeitsgrad()
	{
		Session session;

		session = getConnection();
		
		Transaction t= session.beginTransaction();
		
		//Transaction macht iwas
		//int f = benutzer.getFettigkeitsgrad();
		//session.persist(benutzer);
		
		//Änderungen werden gespeichert
		//t.commit();
		
		//Connection wird geschlossen und Session- Objekt übergeben
		closeConnection(session);
		
		return 0;
	}
	
}
