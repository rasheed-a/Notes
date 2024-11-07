//	String email = "gary@aol.com";
//	String[] a = email.split("@");
//	ArrayList<Customer> customers

//1
/**
public CreditCompany() {
	customers = new ArrayList<Customer>();
	customers.add(new Customer ("bob"));
}
**/

//2
/**
public void displayAccount(String name) {
	for (Customer c: customers) {
		if(c.getName().equals(name)) {
			System.out.println(c);
		}
	}
}
**/

//1*
/**
Hashmap<String,Customer> customers;
public CreditCompany() {
	customers = new HashMap<String,Customers>();
	Customer c = new Customer("Bob");
	customers.put("Bob",c);
}
**/

//2*
/**
public void displayAccount(String name) {
	System.out.println(customers.get(name));
}
**/

//3*
/**
public void increaseLimit(String name, double a){
	Customer c = customer.get(name);
	double lim = c.getLimit()+a;
	c.setLimit(lim);
}
**/

//4*
/**
public void printDebtors(double a){
	for(Customer c: customers.values()){
		if(c.getbalance > a)
			System.out.println(c.getName());
		}
	}
}
**/

//5*
/**
public void purge(){
	Iterator<Customer>iter = customer.value().iterator();
	while(iter.hasNext()){
		Customer c = iter.next();
		if(c.getBalance()==0)
			iter.removes();
		}
	}
}
**/

//Iterator Methods:
/**
hasNext(): returns true if iterator has not reached end of list.
next(): returns the next object in the list it visits (always starts with 1st).
remove(): deletes from the list the last object returned by next().
iterator(): calls to it
**/
