package encapsulation;

public class AmountDetails {

	int amount=1200;

	public int getAmount() 
	{
		return amount;
	}

	public void setAmount(int amount) 
	{
		this.amount =this.amount+ amount;
	}
}
