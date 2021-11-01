package main;

public class CorporateHolder extends AccountHolder {
	private String contact;
	public CorporateHolder(int iD, String address, String contact) {
	super(iD, address);
	this.contact=contact;
	//TODO Auto-generated constructor stub
	}
	public void setContact(String contact){
	this.contact=contact;
	}
}
