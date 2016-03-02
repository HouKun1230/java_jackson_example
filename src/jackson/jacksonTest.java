package jackson;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;


public class jacksonTest {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		// TODO Auto-generated method stub
		String sCurrentLine = null;
		List<device> list = new ArrayList<device>();
		ObjectMapper mapper = new ObjectMapper();
		device d = new device();
		
		File f = new File("test.json");
		
				
		
		
		list = mapper.readValue(f, TypeFactory.defaultInstance().constructCollectionType(List.class, device.class));

		System.out.println(list.hashCode());
		for (int i = 0; i < list.size(); i++) {
		   
		    System.out.println(list.get(i).getid());
		    System.out.println(list.get(i).getname());
		  
		    System.out.println("--------------------");
		}
		
		

		

	}

}
