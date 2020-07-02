package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.nt.beans.WishMessageGenerator;

@SuppressWarnings("deprecation")
public class SetterInjectTest {

	public static void main(String[] args) {
		Resource res = null;
		WishMessageGenerator target = null;
		BeanFactory factory = null;
		//hold the name and locations spring beans cfg file in Resource object
		res = new FileSystemResource("src/com/nt/config/applicationContext.xml");
		//create IOC container /spring container (beanfactory)
		factory =new XmlBeanFactory(res);
		//get target bean class object from BeanFactory container
		Object obj = factory.getBean("wmg");
		
		//System.out.println(obj.generateWishMessage("Vivek"));
		target = (WishMessageGenerator)obj;
		String result = target.generateWishMessage("vivek");
		System.out.println("Result is::"+result);
	}
}

