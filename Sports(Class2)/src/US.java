
public class US extends Item {
	double tax;
	US(String name, String category, double price) {
	super(name, category, price);
	// TODO Auto-generated constructor stub
	tax=0.1;
	System.out.print("\tCountry: US\t");
	TotalBill();

	}

	void TotalBill()
	{	
		System.out.println("Total price including taxes is "+(price+(tax*price)));
		
	}
}

