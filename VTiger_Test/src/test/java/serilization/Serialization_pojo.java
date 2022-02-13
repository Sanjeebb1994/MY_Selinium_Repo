package serilization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojo.PojoLibrary;

public class Serialization_pojo {
	
@Test
		public void serialization() throws JsonGenerationException, JsonMappingException, IOException{
		PojoLibrary pobj=new PojoLibrary("Sanjeeb", 46788363, "SIq234");
		ObjectMapper omap=new ObjectMapper();
		omap.writerWithDefaultPrettyPrinter().writeValue(new File("./simePojo.json"), pobj);

	}



}
