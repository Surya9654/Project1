package basics;

enum TrafficSignal {
	RED("STOP"), GREEN("GO"), ORANGE("SLOW DOWN"); // these are the enum variables
	
	private String action; // all the strings "STOP","GO",.. are stored in this String Variable
	
	private TrafficSignal(String action) { //calling this constructor intialises the action vaira
		this.action = action;
	}
	public String getAction() {
		return this.action;
	}
}
public class EnumConstructorExample {

	public static void main(String[] args) {

		TrafficSignal[] signals = TrafficSignal.values();
		
		for(TrafficSignal signal: signals){
			System.out.println("name: "+ signal.name() + "  action: " + signal.getAction());
		}
	}
}
