package encapsulation;

public class AccessAndModifyAmount {

	public static void main(String[] args) {
		AmountDetails obj=new AmountDetails();
		System.out.println(obj.getAmount());
		obj.setAmount(120);
		System.out.println(obj.getAmount());
		obj.setAmount(100);
		System.out.println(obj.getAmount());
	}
}
