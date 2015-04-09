package customer.dao;
import listener.Config;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import bean.*;

public class View {
	
	
	@SuppressWarnings("unchecked")
	List<City> View()
	{
	
		List<City> cities=new ArrayList<City>();
		Session session = listener.Config.factory.openSession();
		Transaction trans = null;
		

		try {
			trans = session.beginTransaction();

			Criteria cr = session.createCriteria(City.class);
			cities = cr.list();
			
			trans.commit();

		} catch (Exception e) {
			if (trans != null)
				trans.rollback();
			e.printStackTrace();
		} finally {

			session.close();
		}
		return cities;
		
		
	}

	/*@SuppressWarnings("unchecked")
	public static List<Locations> listLocations() {
		Session session = factory.openSession();
		Transaction trans = null;
		List<Locations> locations = null;
		try {
			trans = session.beginTransaction();
			Criteria cr = session.createCriteria(Locations.class);
			locations = cr.list();
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
	public static List<Builders> listBuilders() {
		Session session = factory.openSession();
		Transaction trans = null;
		List<Builders> builders = null;

		try {
			trans = session.beginTransaction();
			Criteria cr = session.createCriteria(Builders.class);
			builders = cr.list();
			trans.commit();

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
	public static List<Schemes> listSchemes() {
		Session session = factory.openSession();
		Transaction trans = null;

		List<Schemes> schemes = null;
		try {
			trans = session.beginTransaction();
			Criteria cr = session.createCriteria(Schemes.class);
			schemes = cr.list();
			trans.commit();

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
	public static List<Apartment> listApartments() {
		Session session = factory.openSession();
		Transaction trans = null;
		List<Apartment> apartments = null;

		try {
			trans = session.beginTransaction();
			Criteria cr = session.createCriteria(Apartment.class);
			apartments = cr.list();
			trans.commit();

		} catch (Exception e) {
			if (trans != null)
				trans.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}
		return apartments;

	}*/

}
