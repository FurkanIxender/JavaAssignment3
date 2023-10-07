import java.util.Random;


public class CombustionEngine extends Engine{
	float engineDisplacement;
	String gearboxType;
	
	public CombustionEngine()
	{
		super();
		engineDisplacement = randomEngineDisplacement();
		gearboxType = randomGearboxType();
		
	}
	
	public String toString()
	{
		return ", Horsepower: " + horsepower  + ", Displacement: " + engineDisplacement + ", Gearbox Type: " + gearboxType;
		
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
	
	
}
