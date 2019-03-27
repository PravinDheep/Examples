class States implements Country{
	
	public void getStates() {
		System.out.println("States");		
	}
	
	public String getCountry() {
		System.out.println("State Country");
		return new String();
	}

}
class City extends States implements Country{
	public String getCountry() {
		System.out.println("City Country");
		return new String();
	}
}
public class GeographicObjects{
	public static void main(String[] args) {
		
	}
}