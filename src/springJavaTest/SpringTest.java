package springJavaTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTest {

	public static void main(String[] args) {
		String[]locations={"applicationContext.xml"};
		ApplicationContext context=new ClassPathXmlApplicationContext(locations);
		House house=(House)context.getBean("house");
		System.out.println(house);
	}

}
