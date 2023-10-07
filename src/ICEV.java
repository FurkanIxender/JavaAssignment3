

class ICEV extends Vehicle{
	
	public ICEV(Manufacture m , Engine e)
	{
		super(m, e);
	}
	
	public String toString() 
	{
        return manu.toString() + engine.toString();
 	}
	
	public void ShowCharacteristics() 
	{
		System.out.println(this);
	}
}
