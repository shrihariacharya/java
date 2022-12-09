package com.jdbc.labTest14.HiberUtil;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HiberUtil {

	public static Session getSession() {
		Configuration cfg = new Configuration();
		cfg.configure("NewFile.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		return factory.openSession();

	}
}