public class BicycleRegistration
{
	public static void main(String[] args){
		Bicycle bike1,bike2,bike;
		String Owner1,Owner2,TagNo;
		bike1 = new Bicycle();
		bike1.setOwnerName("Adam Smith");
		
		bike2 = new Bicycle();
		bike2.setOwnerName("Ben Jones");
		
		bike = new Bicycle ();
		bike.setTagNo("2004-134R");
	    
		Owner1 = bike1.getOwnerName();
		Owner2 = bike2.getOwnerName();
		TagNo= bike.getTagNo();

		System.out.println(Owner1 + " owns a bicycle.");
	    System.out.println(Owner2 + " also owns a bicycle ");
		System.out.println(TagNo + " is the TagNo. 2004-134R ");
		
		}
}
