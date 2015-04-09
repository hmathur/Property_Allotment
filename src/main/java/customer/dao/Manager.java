package customer.dao;

import java.util.Date;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import bean.*;


public class Manager {
	private static SessionFactory factory;
	
	Manager m=new Manager();
	
	
	public static void main(String[] args) {
		try {

			Configuration configuration = new Configuration().configure();
			StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
					.applySettings(configuration.getProperties());
			factory = configuration.buildSessionFactory(builder.build());

		} catch (Throwable ex) {
			System.err.println("Failed to create sessionfactory object " + ex);
			// throw new ExceptionInInitializerError(ex);

		}
		
	}

	

	

	@SuppressWarnings("unchecked")
	public static List<Allotment> getAllotByTransId(int transactionid) {
		Session session = factory.openSession();
		Transaction trans = null;
		List<Allotment> allotments = null;

		try {
			trans = session.beginTransaction();
			allotments = (List<Allotment>) session
					.createQuery("FROM allotment a,transaction t where a.transactionid=t.transactionid");

			
			trans.commit();
			
		} catch (Exception e) {
			if (trans != null)
				trans.rollback();
			e.printStackTrace();
		} finally {

			session.close();
		}
		return allotments;
	}

	public static int regCustomer(int customerid, String customername,
			String address, char email, int number, char password) {
		Session session = factory.openSession();
		Transaction trans = null;

		try {
			trans = session.beginTransaction();
			Customer cust = new Customer(customerid, customername, address,
					email, number, password);
			customerid = (Integer) session.save(cust);
			trans.commit();

		} catch (Exception e) {
			if (trans != null)
				trans.rollback();
			e.printStackTrace();

		} finally {
			session.close();
		}
		return (customerid);
	}

	@SuppressWarnings("unchecked")
	public static List<Customer> listCustomers() {
		Session session = factory.openSession();
		Transaction trans = null;
		List<Customer> customers = null;
		try {
			trans = session.beginTransaction();
			Criteria cr=session.createCriteria(Customer.class);
			customers=cr.list();
			
			trans.commit();
			
		} catch (Exception e) {
			if (trans != null)
				trans.rollback();
			e.printStackTrace();
		} finally {

			session.close();
		}
		return customers;

	}

	@SuppressWarnings("unchecked")
	public static List<Admin> listAdmins() {
		Session session = factory.openSession();
		Transaction trans = null;
		List<Admin> admins = null;
		try {
			trans = session.beginTransaction();
			Criteria cr=session.createCriteria(Admin.class);
			
			admins=cr.list();
			
			trans.commit();
			
		} catch (Exception e) {
			if (trans != null)
				trans.rollback();
			e.printStackTrace();
		} finally {

			session.close();
		}
		return admins;

	}

	@SuppressWarnings("unchecked")
	public static List<Customer> checkUser(String c, String p)

	{
		Session session = factory.openSession();
		Transaction trans = null;
		List<Customer> customer = null;
		try {
			trans=session.beginTransaction();	
			customer = (List<Customer>) session
					.createQuery("SELECT customername,password FROM customer c where customername='"
							+ c + "' and password='" + p + "'");
			
			trans.commit();
			
			

		} catch (Exception e) {
			System.out.println("Data Cannot be found " + e);
		}
		return customer;

	}

	@SuppressWarnings("unchecked")
	public static List<Admin> checkAdmin(String a, String p)

	{
		Session session = factory.openSession();
		Transaction trans = null;
		List<Admin> admin = null;
		try {
			trans=session.beginTransaction();
			admin = (List<Admin>) session
					.createQuery("SELECT adminname,password from Admin a WHERE adminname='"+a+"' and adminpass='"+p+"'");

			trans.commit();
			

		} catch (Exception e) {
			System.out.println("Data Cannot be found " + e);
		}
		return admin;

	}
	public static void bookApartment(int allotmentno,int aid, int customerid, Date date,int transactionid)
	
	{	
		Session session=factory.openSession();
		Transaction trans=null;
		try
		{
			trans=session.beginTransaction();
			String quer="INSERT into allotment(allotno,aid,customerid,date,transactionid) values(?,?,?,?,?)";
			Query query=session.createQuery(quer);
			query.executeUpdate();
			trans.commit();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
				
		
		
	}
	public static void updateAccount(int trans_id,int cust_id,Date date)
	{
		Session session=factory.openSession();
		Transaction trans=null;
		try
		{	
			trans=session.beginTransaction();
			String quer="INSERT into account(acc_no,trans_id,cust_id,date) values(?,?,?,?)";
			Query query=session.createQuery(quer);
			query.executeUpdate();
			trans.commit();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	
		
	}
	
}
