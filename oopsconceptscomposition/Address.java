package oopsconceptscomposition;

public class Address {
	
		String street;
		String city;
		int zip;
		
		
		public Address(String street,String city, int zip) {
			
			this.street=street;
			
			this.city = city;
			
			this.zip = zip;
			
		}
		
		public void printAddress() {
			System.out.println("Address details will be:"+street+" ,"+city+" ,"+zip);

		}

}
