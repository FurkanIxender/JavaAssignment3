import java.util.Random;


public class tester {
	public static void main(String[] args) {
		
		  
		Vehicle[] vehicles = new Vehicle[20];
		
		for(int i = 0 ; i < vehicles.length; i++)
		{
			Random r = new Random();
			
			int select = r.nextInt(3);
			
			if(select == 0)
			{
				CombustionEngine C1 = new CombustionEngine();
				
				Manufacture M1 = new Manufacture();
				
				ICEV icev = new ICEV(M1, C1);
				
				vehicles[i] = icev;
				
			}
			else if(select == 1)
			{
				HybridEngine C1 = new HybridEngine();
				
				Manufacture M1 = new Manufacture();
				
				HybridV icev = new HybridV(M1, C1);
				
				vehicles[i] = icev;
				
			}
			else if(select == 2)
			{
				
				ElectricEngine C1 = new ElectricEngine();
				
				Manufacture M1 = new Manufacture();
				
				BEV icev = new BEV(M1, C1);
				
				
				vehicles[i] = icev;
				
			}
			
			
		}
		
		for(int i = 0 ; i < vehicles.length; i++)
		{

			vehicles[i].ShowCharacteristics();
		}
		
		
	}

	
}
