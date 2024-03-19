package in.ashokit;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConvertJsonToObject {

	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		
		//convert Json to javaObject
      File f=new File("Customer.json");
      ObjectMapper mapper=new ObjectMapper();
       Customer customer=mapper.readValue(f, Customer.class);
      System.out.println(customer);
      
      

	}

} 
