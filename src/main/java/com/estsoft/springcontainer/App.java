package com.estsoft.springcontainer;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
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
    	
//    	User user1 = applicationContext.getBean(User.class);		// 1. type으로 값 가져오기
//    	user1.setName("최연지");
//    	System.out.println(user1);
    	
    	User user1 = (User)applicationContext.getBean("user1");		// 2. id로 값 가져오기 (name도 가능), 보통 id사용 더 많이 함
    	System.out.println(user1);
    	
    	User user2 = (User)applicationContext.getBean("user2");		
    	System.out.println(user2);
    	
    	User user3 = (User)applicationContext.getBean("user3");		// 3. 
    	System.out.println(user3);
    	
    	User user4 = (User)applicationContext.getBean("user4");		// 4. 기본생성자로 생성한 다음에 setName, setEmail로 설정 
    	System.out.println(user4);
    	
    	Guest guest1 = (Guest)applicationContext.getBean("guest");
    	System.out.println(guest1);
    
    	Guest guest2 = (Guest)applicationContext.getBean("guest2");
    	System.out.println(guest2);
    	
    	
    	
    	
    	// ----- warning 없애기
    	((ConfigurableApplicationContext)applicationContext).close();
    	
    }
    
}
