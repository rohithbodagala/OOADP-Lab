
public class Canada extends Item {
	double tax;
	Canada(String name, String category, double price) {
	super(name, category, price);
	// TODO Auto-generated constructor stub
	tax=0.15;
	System.out.print("\tCountry: Canada\t");
	TotalBill();
}









	void TotalBill()
	{	
		System.out.println("Total price including taxes is "+(price+(tax*price)));
		
	}

}
