import java.util.Random;


public class Engine {
	int horsepower;
	
	public Engine()
	{
		horsepower = randomHorsepower();
	}
	
	public int randomHorsepower() 
	{
		Random r = new Random();
		
		return 100 + r.nextInt(200);
	}
}
