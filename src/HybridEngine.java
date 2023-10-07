import java.util.Random;


public class HybridEngine extends Engine{
	float engineDisplacement;
	String gearboxType;
	int numberOfElectricMotors;

	public HybridEngine()
	{
		super();
		engineDisplacement = randomEngineDisplacement();
		gearboxType = randomGearboxType();
		numberOfElectricMotors = randomNumberOfElectricMotors();
		
	}
	
	public String toString()
	{
		return ", Horsepower: " + horsepower + ", number of electic motors: " + numberOfElectricMotors
        		+ ", Displacement: " + engineDisplacement + ", Gearbox Type: " + gearboxType;
	}
	
	public float randomEngineDisplacement()
	{
		Random r = new Random();
		float f = 1 + Float.valueOf(r.nextInt(5))/2 ;
		
		return f;
	}
	
	public String randomGearboxType()
	{
		String[] gb = {"manual","automatic"};
		
		Random r = new Random();
		
		return gb[r.nextInt(2)];
				
	}
	
	public int randomNumberOfElectricMotors()
	{
		Random r = new Random();
		
		return r.nextInt(1,4);
	}
	
	
}
