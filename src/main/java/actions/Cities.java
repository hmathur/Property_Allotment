package actions;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;

import bean.City;

public class Cities {
	
	List<City> Cities()
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
	
}
