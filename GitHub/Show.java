
public class Show {

	private String name;
	private String network;
	private String airtime;
	private String desc;
	
	public Show(String _name, String _network, String _airtime, String _desc){
		
		name = _name;
		network = _network;
		airtime = _airtime;
		desc = _desc;
		
	}
	
	
	public String getName(){
		return name;
	}
	
	public String getNetwork(){
		return network;
	}
	
	public String getAirtime(){
		return airtime;
	}
	
	public String getDesc(){
		return desc;
	}
	
	public String toString(){
		String output = "Name: " + this.name + "\nNetwork: " + this.network + "\nAirtime: " +
	this.airtime + "\nDescription: " + this.desc;
		return output;
	}
	
}

	