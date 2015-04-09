package listener;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class Config {
	public static SessionFactory factory;
	
	void config()
	{
	try {

		Configuration configuration = new Configuration().configure();
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties());
		factory = configuration.buildSessionFactory(builder.build());

	} catch (Throwable ex) {
		System.err.println("Failed to create sessionfactory object " + ex);

	}
	}
}
