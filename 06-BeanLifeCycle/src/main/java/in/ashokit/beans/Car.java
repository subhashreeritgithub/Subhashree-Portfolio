package in.ashokit.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class Car implements InitializingBean,DisposableBean {
	public void  drive(){
		System.out.println("I am Driving car...");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
	 System.out.println("car starting.....");
		
	}

	@Override
	public void destroy() throws Exception {
	 System.out.println("Car stopped....");
		
	}

}
