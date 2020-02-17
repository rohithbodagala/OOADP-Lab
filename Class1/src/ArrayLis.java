import java.util.*;
public class ArrayLis {
	public static void main(String args[])
	{
	ArrayList<String> arrlist = new ArrayList<String>();
	arrlist.add("ABC");
	arrlist.add(0,"XYZ");
	System.out.println(arrlist);
	ArrayList<String> a2=new ArrayList<String>();
	for(String s:arrlist)
	{
			a2.add(s);
	}
	System.out.println(arrlist);
	System.out.println(arrlist.get(0));
	 Iterator<String> it= a2.iterator(); 
	 while (it.hasNext()) { 
     System.out.print(it.next() + " "); 
     ListIterator<String >lit=a2.listIterator();
     
     System.out.println("Traversing the list in forward direction:");
     while(lit.hasNext()){
        System.out.println(lit.next());
     }
     System.out.println("\nTraversing the list in backward direction:");
     while(lit.hasPrevious()){
        System.out.println(lit.previous());
     System.out.println("Using for loop");
     for(int i=0;i<=1;i++)
    	 System.out.println(arrlist.get(i));
     }
 } 

	}
	
}
