package com.jdbc.labTest14.DaoImpl;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.jdbc.labTest14.Dao.StudentDao;
import com.jdbc.labTest14.HiberUtil.HiberUtil;
import com.jdbc.labTest14.entities.Student;


public class StudentDaoImpl implements StudentDao {

	Session sn = HiberUtil.getSession();
	
	public Student insertStudent(Student st) {
		Transaction tx = sn.beginTransaction();
		sn.save(st);
		tx.commit();
		sn.close();
		return st;
	}
	
	
	public Student getStudent(int id) {
		Transaction tx = sn.beginTransaction();
		Student st = sn.get(Student.class, id);
		st.setSid(id);
		tx.commit();
		sn.close();
		return st;
	}

	public Student updateStudent(int id, String nm) {
		Transaction tr = sn.beginTransaction();
		Student st = sn.get(Student.class, id);
		st.setSname(nm);
		sn.update(st);
		tr.commit();
		sn.close();
		return st;

	}
	
	public boolean deleteStudent(int id) {
		Transaction tr = sn.beginTransaction();
		Student st = sn.get(Student.class, id);
		sn.delete(st);
		tr.commit();
		sn.close();
		return true;
	}

}