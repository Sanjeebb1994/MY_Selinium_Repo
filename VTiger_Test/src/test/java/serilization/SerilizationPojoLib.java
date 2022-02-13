package serilization;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import pojo.PojoLibreary;

public class SerilizationPojoLib {
	@Test
	public void serialization() throws JsonGenerationException, JsonMappingException, IOException {
		PojoLibreary pobj = new PojoLibreary("Sanjeeb", 8984263, "sanjeeb@gmail.com");
		
		ObjectMapper mobj = new ObjectMapper();
		mobj.writerWithDefaultPrettyPrinter().writeValue(new File("./objectJsonData.json"), pobj);
	}
}
