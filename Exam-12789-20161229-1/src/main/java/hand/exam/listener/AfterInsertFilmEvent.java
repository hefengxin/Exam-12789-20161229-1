package hand.exam.listener;

import org.springframework.context.ApplicationEvent;

public class AfterInsertFilmEvent extends ApplicationEvent {
    
	
	
	
	public AfterInsertFilmEvent(Object source) {
		super(source);
	}
	
	public void after(){
		System.out.println("After Insert Film Data");
	}

}
