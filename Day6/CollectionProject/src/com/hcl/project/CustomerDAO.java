package com.hcl.project;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
	import java.util.List;

	public class CustomerDAO {
		static List<Customer> lstCustomer = null;
		static {
			lstCustomer = new ArrayList<Customer>();
		}

		public String addCustomer(Customer customer) {
			lstCustomer.add(customer);
			return "customer created succusfully";
		}

		public Customer searchCustomerDao(int sno) {
			Customer objCustomer = null;
			for (Customer customer : lstCustomer) {
				if (customer.getCustId() == sno) {
					customer = customer;
				}
			}
			return objCustomer;
		}

		public List<Customer> showCustomerDao() {
			return lstCustomer;
		}

		public String updateCustomerDao(Customer objCustomer) {
			Customer customer = searchCustomerDao(objCustomer.getCustId() );
			if (customer != null) {
				for (Customer c : lstCustomer) {
					if (c.getCustId() == objCustomer.getCustId()) {
						c.setCustName(objCustomer.getCustName());
						c.setAnnualPremium(objCustomer.getAnnualPremium());
						c.setModalPremium(objCustomer.getModalPremium());
						c.setPaymentMode(objCustomer.getPaymentMode());
					}

				}
				return "record updated..";

			} else {
				return "customer not found";
			}
		}

		public String deleteCustomerDAO(int sno) {
			Customer customer = searchCustomerDao(sno);
			if (customer != null) {
				lstCustomer.remove(customer);
				return "Customer Removed";
			} else {
				return "Customer no not found";
			}
			}
		
			public void writeCustomerFileDao() {
				try {
					FileOutputStream fout=new FileOutputStream("c:/files/customer.txt");
					ObjectOutputStream objout=new ObjectOutputStream(fout);
					objout.writeObject(lstCustomer);
					objout.close();
					fout.close();
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			public void readCustomerFileDao() {
				try {
					FileInputStream fin=new FileInputStream("c:/files/customer.txt");
					ObjectInputStream objin=new ObjectInputStream(fin);
					lstCustomer =(List<Customer>)objin.readObject();
					objin.close();
					fin.close();
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}

		
		}
		

	


