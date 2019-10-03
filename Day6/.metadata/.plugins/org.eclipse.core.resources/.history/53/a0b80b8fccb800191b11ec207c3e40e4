package com.hcl.project;


	import java.util.List;
	import java.util.ResourceBundle;
	import java.util.Scanner;

	public class CustomerMain {

			public static void deleteCustomer() {
				int custId;
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter customerId  ");
				custId=sc.nextInt();
				CustomerBAl obj=new CustomerBAl();
				String res=obj.deleteCustomerBal(custId);
				System.out.println(res);
			}
			public static void updateCustomer() {
				Customer objCustomer=new Customer();
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter Customer id  ");
				objCustomer.setCustId(Integer.parseInt(sc.nextLine()));
				System.out.println("Enter Customer name  ");
				objCustomer.setCustName(sc.nextLine());
				System.out.println("Enter annual premium   ");
				objCustomer.setAnnualPremium(Double.parseDouble(sc.nextLine()));
				System.out.println("Enter modal premium  ");
				objCustomer.setModalPremium(Double.parseDouble(sc.nextLine()));
				System.out.println("Enter payment mode  ");
				objCustomer.setPaymentMode(Integer.parseInt(sc.nextLine()));
				CustomerBAl obj=new CustomerBAl();
				String res=obj.updateCustomerBal(objCustomer);
				System.out.println(res);
			}
			public static void showCustomer() {
				CustomerBAl obj=new CustomerBAl();
				List<Customer> lstCustomer=obj.showCustomerBal();
				for (Customer customer : lstCustomer) {
					System.out.println(customer);
				}
			}
			public static void searchCustomer() {
				int custId;
				System.out.println("Enter Customer id  ");
				Scanner sc=new Scanner(System.in);
				custId=sc.nextInt();
				 CustomerBAl obj=new CustomerBAl(); 
				 Customer objCustomer=obj.searchCustomerBal(custId);
				if(objCustomer!=null) {
					System.out.println(objCustomer);
				} else {
					System.out.println("Record not found...");
				}
				
			}
			public static void addCustomer() {
				ResourceBundle rb = ResourceBundle.getBundle("project");
				Customer objCustomer=new Customer();
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter Customer id  ");
				objCustomer.setCustId(Integer.parseInt(sc.nextLine()));
				System.out.println("Enter customer Name  ");
				objCustomer.setCustName(sc.nextLine());
				System.out.println("Enter annual premium  ");
				objCustomer.setAnnualPremium(Double.parseDouble(sc.nextLine()));
				System.out.println("Enter modal premium ");
				objCustomer.setModalPremium(Double.parseDouble(sc.nextLine()));
				System.out.println("Enter payment mode  ");
				objCustomer.setPaymentMode(Integer.parseInt(sc.nextLine()));
				CustomerBAl obj=new CustomerBAl();
				try {
					boolean res=obj.addCustomerBal(objCustomer);
					if(res==true) {
						System.out.println("Customer Record Added");
					}
				} catch (CustomerException e) {
					System.out.println(e.getMessage());
				}
			}
			public static void main(String[] args) {
				int ch;
				Scanner sc=new Scanner(System.in);
				do {
					System.out.println("Options");
					System.out.println("---------");
					System.out.println("1. Add Customer");
					System.out.println("2. Show Customer");
					System.out.println("3. Search Customer");
					System.out.println("4. Update Customer");
					System.out.println("5. Delete Customer");
					System.out.println("6. Exit");
					System.out.println("Enter Ur Choice  ");
					ch=sc.nextInt();
					switch(ch) {
					case 1 : 
						addCustomer();
						break;
					case 2 :
						showCustomer();
						break;
					case 3 :
						searchCustomer();
						break;
					case 4 : 
						updateCustomer();
						break;
					case 5 : 
						deleteCustomer();
						break;
					case 6 : 
						return;
					default : 
						System.out.println("Invalid Choice");
					}
				} while(ch!=6);
			}
		
}
