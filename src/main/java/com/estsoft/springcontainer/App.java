package com.estsoft.springcontainer;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * Hello world!
 *
 */
public class App{
	
    public static void main( String[] args ){
    	//beanFactoryTest();
    	applicationContext();
    }
    
    public static void beanFactoryTest(){
    	BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("config/applicationContext.xml"));
//    	BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("config/applicationContext2.xml"));
    	
    	User user1 = beanFactory.getBean(User.class);
    	user1.setName("최연지");
    	System.out.println(user1);
    }
    
    public static void applicationContext(){
    	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config/applicationContext.xml");
    	
    	User user1 = applicationContext.getBean(User.class);		// type으로 값 가져오기
    	user1.setName("최연지");
    	System.out.println(user1);
    	
    	User user2 = (User)applicationContext.getBean("user1");		// id로 값 가져오기 (name도 가능), 보통 id사용 더 많이 함
    	System.out.println(user2);
    	
    	
    	
    }
    
}
