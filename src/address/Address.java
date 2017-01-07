package address;

/**
 * @author Olga
 *
 */
class Address {
	private String index;
	private String country;
	private String city;
	private String street;
	private String apartment;
	private int number;
	
	public Address(){
		
	}
	
	public Address(String index, String country, String city, String street, String apartment, int number){
		this.index 		= index;
		this.country 	= city;
		this.city 		= country;
		this.street 	= street;
		this.apartment 	= apartment;
		this.number 	= number;
	}
	
	public String info(){
		return this.index+", "+this.country+", "+this.city+", "+this.street+", "+this.apartment+", "+this.number;
	}
	
	public String getIndex() {
		return index;
	}
	public void setIndex(String index) {
		this.index = index;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getApartment() {
		return apartment;
	}
	public void setApartment(String apartment) {
		this.apartment = apartment;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	
}
