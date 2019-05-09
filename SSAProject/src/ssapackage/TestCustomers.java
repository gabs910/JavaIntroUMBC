package ssapackage;

import java.io.IOException;
import java.util.Scanner;

public class TestCustomers {

	public static void main(String[] args) {
		Customer c1, c2, c3, c4, c5;
		c1 = new Customer();
		c2 =new Customer();
		

		c1.setCustName("Mary");
		c1.custID = 11;
		c1.setCustBalance(1000);
		
		c2.setCustName("John");
		c2.setCustBalance(500);
		c2.custID = 12;
		
		System.out.println("Customer c1");
		System.out.println(c1.getCustName());
		System.out.println(c1.custID);
		System.out.println(c1.getCustBalance());
		c1.printLineSep('*', 50);
		
		System.out.println("Customer c2");
		System.out.println(c2.getCustName());
		System.out.println(c2.custID);
		System.out.println(c2.getCustBalance());
		c2.printLineSep('-', 60);
		
		c1.updateBalance(200);
		System.out.println(c1.getCustBalance());
		

/*		Scanner scan;
		System.out.println("Please enter your name:");
		scan = new Scanner(System.in);
		String name = scan.nextLine();
		System.out.println(name);*/
		
		
		MDCustomer md1;
		md1 = new MDCustomer();
		md1.setCustName("Sam");
		md1.setCustID(111);
		md1.setCustBalance(1200);
		md1.mdID = 3;

		c1.printLineSep('&', 50);
		c1.printCustData();
		c2.printLineSep('#', 80);
		c2.printCustData();
		
		md1.printLineSep('@', 80);
		md1.printCustData();
		
		c1.printCustData("100 Main St");
		c3 = new Customer("Sally");
		c3.printCustData();
		c4 = new Customer("Lori");
		c4.printCustData();
		
		c5 = new Customer("Danny", 212, 1200);
		c5.printCustData();
		
		MDCustomer md2;
		md2 = new MDCustomer("Joe", 333, 3000, 25);
		md2.printLineSep('%', 70);
		md2.printCustData();
		
		BaltimoreCustomer bal;
		bal = new BaltimoreCustomer("Smith", 111, 1100 , 2, 33);
		bal.printLineSep('#', 70);
		bal.printCustData();
		
		Customer ourCustomers[];
		ourCustomers = new Customer[6];
		ourCustomers[0] = new NYCustomer();
		ourCustomers[1] = new MDCustomer();
		ourCustomers[2] = new BaltimoreCustomer();
		ourCustomers[3] = new TXCustomer();
		ourCustomers[4] = new Customer();
		ourCustomers[5] = new BaltimoreCustomer();
		int totalMDCustomers = 0;
		
		for (int i = 0; i < ourCustomers.length; i++) {
			ourCustomers[i].processInvoice(i + 100);  
			if (ourCustomers[i] instanceof MDCustomer) {
				totalMDCustomers ++;
				
			}//if
			
		}//for
		System.out.println("The total number of MDCustomers is " + totalMDCustomers);
		c1.printLineSep('#', 70);
		System.out.println(c1);
		md1.printLineSep('$', 70);
		System.out.println(md1);
		bal.printLineSep('$', 70);
		System.out.println(bal);

		Customer c10, c11, c12;
		c10 = new Customer("John",123, 102);
		c11 = new Customer("John",123, 102);
		c12= c11;
		
		if (c10.equals(c11)) {
			System.out.println("c10 equals c11");
		}//if
		
		else {
			System.out.println("c10 not equals c11, it is not the same John");
		}//else
	
		/*if (c12.equals(c11)) {
			System.out.println("c12 equals c11");
		}//if
		
		else {
			System.out.println("c12 not equals c11, it is not the same John");
		}//else
		
	*/	
		MDCustomer md10, md11;
		md10 = new MDCustomer("Mary", 444, 1002, 2);
		md11 = new MDCustomer("Mary", 444, 1100, 33);
	
		if (md10.equals(md11)) {
			System.out.println("md10 equals md11, it is the same Mary");
		}//if
		
		else {
			System.out.println("md10 not equals md11, it is not the same Mary");
		}//else
		int result = 0;
		
		try {
			result = c1.divNums(10, 0);
			System.out.println("dev result is " + result);
		}//try 
		catch (IOException e) {
			e.printStackTrace();
		}//catch
		catch (SSAException e) {
			e.printStackTrace();
		}//catch
		finally {
			System.out.println("The block will always print");
		}//finally
		
	}//main
	
}//class
