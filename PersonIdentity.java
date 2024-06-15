package Program_assignment6;
import java.time.*;

public class PersonIdentity{
	
	private String name;
	private String phoneNumber;
	private LocalDate birthDate;
	private int jerseyNumber;
	
	public PersonIdentity(String name, String phoneNumber, LocalDate birthDate, int jerseyNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.birthDate = birthDate;
		this.jerseyNumber = jerseyNumber;
	}
	
	public String getName() {
		return name;
	}
	
	public String getphoneNumber() {
		return phoneNumber;
	}
	
	public LocalDate getbirthDate() {
		return birthDate;
	}
	
	public int getJerseyNumber() {
		return jerseyNumber;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
	
	public void setJerseyNumber(int jerseyNumber) {
		this.jerseyNumber = jerseyNumber;
	}
	
	public String toString () {
		return "Name: " + name + "Contact: " + phoneNumber + "birthday: " + birthDate + "JerseyNumber " + jerseyNumber;
	}
	
}