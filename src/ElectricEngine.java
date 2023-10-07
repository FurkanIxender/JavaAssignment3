import java.util.Random;

public class ElectricEngine extends Engine{
	int numberOfElectricMotors;
	
	public ElectricEngine()
	{
		super();

		numberOfElectricMotors = randomNumberOfElectricMotors();
		
	}
	
	public String toString()
	{
		
		return ", Horsepower: " + horsepower + ", number of electic motors: " + numberOfElectricMotors;
	}
	
	
	public int randomNumberOfElectricMotors()
	{
		Random r = new Random();
		
		return r.nextInt(1,4);
	}
	
	
}
