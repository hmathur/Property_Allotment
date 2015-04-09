package customer.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import bean.*;

public class Select {
	private static SessionFactory factory;
	View v = new View();

	public static void main(String[] args) {
		try {

			Configuration configuration = new Configuration().configure();
			StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
					.applySettings(configuration.getProperties());
			factory = configuration.buildSessionFactory(builder.build());

		} catch (Throwable ex) {
			System.err.println("Failed to create sessionfactory object " + ex);

		}

	}
	
	@SuppressWarnings("unchecked")
	public static List<Locations> getLocAccToCity(int citycode) {

		Session session = factory.openSession();
		Transaction trans = null;
		List<Locations> locations = null;

		try {
			trans = session.beginTransaction();
			locations = (List<Locations>) session
					.createQuery("FROM locations l,city c where l.citycode=c.citycode");

			
			trans.commit();
			
		} catch (Exception e) {
			if (trans != null)
				trans.rollback();
			e.printStackTrace();
		} finally {

			session.close();
		}
		return locations;

	}

	@SuppressWarnings("unchecked")
	public static List<Builders> getBuilderAccToLoc(int lid) {

		Session session = factory.openSession();
		Transaction trans = null;
		List<Builders> builders = null;
		try {
			trans = session.beginTransaction();
			builders = (List<Builders>) session
					.createQuery("From builders b,locations l where b.lid=l.lid");

			

		} catch (Exception e) {
			if (trans != null)
				trans.rollback();
			e.printStackTrace();
		} finally {
			session.close();

		}

		return builders;

	}

	@SuppressWarnings("unchecked")
	public static List<Schemes> getSchemeAccToBuilder(int bid) {

		Session session = factory.openSession();
		Transaction trans = null;
		List<Schemes> schemes = null;
		try {
			trans = session.beginTransaction();
			schemes = (List<Schemes>) session
					.createQuery("From schemes s,builders b where s.bid=b.bid");

			
		} catch (Exception e) {
			if (trans != null)
				trans.rollback();
			e.printStackTrace();
		} finally {
			session.close();

		}
		return schemes;

	}

	@SuppressWarnings("unchecked")
	public static List<Apartment> getApAccToScheme(int sid) {

		Session session = factory.openSession();
		Transaction trans = null;
		List<Apartment> apartments = null;

		try {
			trans = session.beginTransaction();
			apartments = (List<Apartment>) session
					.createQuery("From apartment a,schemes s where a.sid=s.sid");

			

		} catch (Exception e) {
			if (trans != null)
				trans.rollback();
			e.printStackTrace();
		} finally {
			session.close();

		}
		return apartments;

	}
}
