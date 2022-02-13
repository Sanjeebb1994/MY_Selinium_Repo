package serilization;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import pojo.PojoLibreary;

public class DeserealizationObject {
	@Test
	public void deSerialization() throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper mobj = new ObjectMapper();
		PojoLibreary pobj = mobj.readValue(new File("./objectJsonData.json"), PojoLibreary.class);
		
		System.out.println(pobj.name);
		System.out.println(pobj.phNo);
		System.out.println(pobj.emailId);
	}
}
