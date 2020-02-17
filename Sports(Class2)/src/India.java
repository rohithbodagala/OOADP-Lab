
public class India extends Item{
		double tax;
		India(String name, String category, double price) {
		super(name, category, price);
		// TODO Auto-generated constructor stub
		tax=0.18;
		System.out.print("\tCountry: India\t");
		TotalBill();
	}



		void TotalBill()
		{	
			System.out.println("Total price including taxes is "+(price+(tax*price)));
			
		}
}
