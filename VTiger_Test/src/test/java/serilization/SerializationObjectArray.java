package serilization;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import pojo.PojoArrayLibrary;

public class SerializationObjectArray {
	
	@Test
	public void serialization() throws JsonGenerationException, JsonMappingException, IOException {
		int[] arr = {294678,568836,68389};
		PojoArrayLibrary pobj = new PojoArrayLibrary("sanjeeb", arr, "dash@gmail.com");
		
		ObjectMapper mobj = new ObjectMapper();
		mobj.writerWithDefaultPrettyPrinter().writeValue(new File("./objectArray.json"), pobj);
		
	}
}
