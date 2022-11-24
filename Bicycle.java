public class Bicycle
{
	private String OwnerName, TagNo;
	
	public Bicycle( ){
		OwnerName = "Unknown";
		TagNo = "Unknown";
		}
		
	public Bicycle (String name,String tagNo){
		OwnerName = name;
	    TagNo = tagNo;
			
		
		}

		public String getOwnerName(){
			return OwnerName;
		}
	 public String getTagNo(){
		 return TagNo;
		 
	 }
	 public void setOwnerName(String name){
		 OwnerName = name;
	 }
	public void setTagNo(String name){
		TagNo = name;
	}
	 }
	
	
	
