
public class Item {
	String name,category;
	double price;
	Item(String name,String category,double price)
	{
		this.name=name;
		this.category=category;
		this.price=price;
		disp();
	}
	void disp()
	{
		System.out.println("Name: "+name+"\tCategory: "+category+"\tPrice: "+price);
	}
	
}
