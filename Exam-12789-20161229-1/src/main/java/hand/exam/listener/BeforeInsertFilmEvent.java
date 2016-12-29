package hand.exam.listener;

import org.springframework.context.ApplicationEvent;

public class BeforeInsertFilmEvent extends ApplicationEvent {

	public BeforeInsertFilmEvent(Object source) {
		super(source);
		
	}
	
	public void before(){
		System.out.println("Before Insert Film Data");
	}

}
