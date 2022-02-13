package pojo;

public class PojoLibrary {
	
		//Declaration Global variable.
			public String name;
			public int phNo;
			public String Id;


		//Initialization through Parameterization Constructor 
		     public PojoLibrary(String name, int phNo, String Id){
			      super();
			       this.name=name;
			       this.phNo=phNo;
		               this.Id=Id;		
			}	

		//Provides getters and setters Method	
			public String getName(){
				return name;
			}
			public void setName(String name){
				this.name=name;
			}
			public int getPhNo(){
				return phNo;
			}
			public void setPhNo(int phNo){
				this.phNo=phNo;
			}
			public String getId(){
				return Id;
			}
			public void setId(String Id){
				this.Id=Id;
			}


}
