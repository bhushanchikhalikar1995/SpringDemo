package temp;
import java.awt.Shape;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class DrawingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Traingle t=new Traingle();
		
		@SuppressWarnings("deprecation")
		//BeanFactory factory=new XmlBeanFactory(new FileSystemResource("spring.xml"));
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		context.registerShutdownHook();
		
	//	BeanFactory factory=new XmlBeanFactory(new FileSystemResource("innerBean.xml"));
		
//		TraingleList t=(TraingleList) factory.getBean("trainglelist");
		
		//Traingle t=(Traingle) factory.getBean("traingle");
		
		shape sh=(shape) context.getBean("circle");
		
		sh.draw();
		
		System.out.println(context.getMessage("greeting", null,"Default", null));
		
	}

}
