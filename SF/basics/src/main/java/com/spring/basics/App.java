package com.spring.basics;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.basics.config.ComputerSysConfig;
import com.spring.basics.core.ComputerSys;
//import com.spring.basics.core.CDPlayer;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaBasedCDConfig.class);
        CDPlayer cdPlayer = context.getBean(CDPlayer.class);
        cdPlayer.listenToMusic();
        /*AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ComputerSysConfig.class);
    	ComputerSys sys = context.getBean(ComputerSys.class);
    	sys.getSysConfig();*/
    	/*ClassPathXmlApplicationContext classPathXmlApplicationContext = 
    			new ClassPathXmlApplicationContext("/SpringConfig.xml");
    	CDPlayer cdPlayer = classPathXmlApplicationContext.getBean(CDPlayer.class);
    	cdPlayer.letsPlay();*/
    }
}
