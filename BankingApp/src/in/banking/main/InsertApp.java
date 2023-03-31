package in.banking.main;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import in.banking.Model.Customer;
import in.banking.util.HibernateUtil;

public class InsertApp {

	public static void main(String[] args) {
		Session session = null;
		Transaction transaction = null;
		boolean flag = false;

		try {
			session = HibernateUtil.getSession();

			if (session != null)
				transaction = session.beginTransaction();

			if (transaction != null) {
				Customer customer = new Customer();
				customer.setCustomerID(10);
				customer.setCustomerName("sachin");
				customer.setCustomeremail("sac421@gmail.com");

				session.save(customer);
				flag = true;
			}
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			if(flag == true)
				transaction.commit();
			else
				transaction.rollback();
			
			HibernateUtil.closeSession(session);
		}

	}
}
