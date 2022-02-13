package serilization;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import pojo.PojoEmployeeLibray;
import pojo.PojoObjectLibrary;

public class SerializationPojoObj {
	
	@Test
	public void serialization() throws JsonGenerationException, JsonMappingException, IOException {
		int[] arr= {12344,344543,34533};
		PojoEmployeeLibray eobj = new PojoEmployeeLibray("sanjeeb", arr, "dash@gmail.com");
		PojoObjectLibrary pobj = new PojoObjectLibrary("Sanjeeb", 8983468973l, "sanjeeb2gmail.com", eobj);
		
		ObjectMapper mobj = new ObjectMapper();
		mobj.writerWithDefaultPrettyPrinter().writeValue(new File("./objectemployee.json"), pobj);
	}
}
