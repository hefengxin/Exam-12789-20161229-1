package hand.exam.command;

import hand.exam.service.FilmService;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	
	public static void main(String[] args) {
		ConfigurableApplicationContext context = 
				new ClassPathXmlApplicationContext("ApplicationContext.xml");
		FilmService filmService=(FilmService) context.getBean("filmService");
		context.start();
		filmService.ContextStart();
		context.stop();
	}
	
}