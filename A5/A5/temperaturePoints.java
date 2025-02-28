import java.util.Scanner;

public class temperaturePoints {
	//temperature variable
	private double temperature;
	
	//temperature constructor
	public temperaturePoints(double temperature) {
		this.temperature = temperature;
	}


//getters and setters for temperature
	public double getTemperature() {
		return temperature;
	}


	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

	 public boolean isEthylFreezing() {
	        return temperature <= -173; // Freezing point of ethyl alcohol in Fahr.
	    }

	    public boolean isEthylBoiling() {
	        return temperature >= 172; // Boiling point of ethyl alcohol in Fahr.
	    }

	    public boolean isOxygenFreezing() {
	        return temperature <= -362; // Freezing point of oxygen in Fahr.
	    }

	    public boolean isOxygenBoiling() {
	        return temperature >= -306; // Boiling point of oxygen in Fahr.
	    }

	    public boolean isWaterFreezing() {
	        return temperature <= 32; // Freezing point of water in Fahr.
	    }

	    public boolean isWaterBoiling() {
	        return temperature >= 212; // Boiling point of water in Fahr.
	    }
	    
//MAIN	    
	    public static void main(String[] args) {
	    	//scanner for user input
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter temperature in Fahrenheit: ");
	        double temp = scanner.nextDouble();

	        temperaturePoints temperature = new temperaturePoints(temp);

	        //freezing substances
	        System.out.println("Substances that will freeze:");
	        
	        if (temperature.isWaterFreezing()) {
	            System.out.println("- Water");
	        }
	        if (temperature.isOxygenFreezing()) {
	            System.out.println("- Oxygen");
	        }
	        if (temperature.isEthylFreezing()) {
	            System.out.println("- Ethyl Alcohol");
	        }

	        //boil substances
	        System.out.println("Substances that will boil:");
	        
	        if (temperature.isWaterBoiling()) {
	            System.out.println("- Water");
	        }
	        if (temperature.isOxygenBoiling()) {
	            System.out.println("- Oxygen");
	        }
	        if (temperature.isEthylBoiling()) {
	            System.out.println("- Ethyl Alcohol");
	        }

	        //close scanner
	        scanner.close();
	    }
}
