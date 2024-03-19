package in.ashokit;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class CustomerTojson {

	public static void main(String[] args) throws StreamWriteException, DatabindException, IOException {
		Customer c=new Customer(101,"subha","spdarsini2000@g,ail.com");
		 
		//convert object to json format
		ObjectMapper mapper=new ObjectMapper();
		mapper.writeValue(new File("Customer.json"), c);

	}

}
