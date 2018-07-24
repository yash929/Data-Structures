import java.util.*;
public class Hash_Set {

	public static void main(String args[]) 
	 {
	   HashSet<String> hs = new HashSet<String>();
	   HashSet<String> Hs = new HashSet<String>();
	   hs.add("Yash");
	   hs.add("Diwaker");
	   hs.add("Sakshi");
	   hs.add("Smriti");
	   
	   System.out.println(hs);
	   //contains() or containsAll() returns a boolean value
	   System.out.println("The Hashtable contains Purab or not : "+hs.contains("Purab"));
	   System.out.println("The Hashtable contains Yash or not : "+hs.contains("Yash"));
	   System.out.println();
	   Hs.add("Yash");
	   Hs.add("Prateek");
	   Hs.add("Adil");
	   Hs.add("Alpana");
	   Hs.add("Himanshu");
	   Hs.add("Vaibhav");
	   Hs.add("Vaibhav");
	   //Hs.remove("Yash");
	   System.out.println(Hs);
	   System.out.println();
	  // System.out.print(hs.Intersection(Hs));
	   Iterator Itr = Hs.iterator();
	   while(Itr.hasNext())
	     {
		   System.out.println(Itr.next());
	   }
	   System.out.println();
	   //retainAll() function is used here to perform intesection operation on both the sets
	   HashSet<String> intersection = new HashSet<String>(Hs);
	   intersection.retainAll(hs);
	   System.out.print("intersection of both the sets : ");
	   System.out.println(intersection);
	   
}
}

