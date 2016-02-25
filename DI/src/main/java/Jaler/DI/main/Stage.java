package Jaler.DI.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Jaler.DI.Singer;

public class Stage {
	public static void main(String[] args){
		ApplicationContext ctx = new ClassPathXmlApplicationContext("singer.xml");
		Singer singer = (Singer) ctx.getBean("jaler");
		singer.sing();
		
		singer = (Singer)ctx.getBean("superJaler");
		singer.sing();
	}
}
