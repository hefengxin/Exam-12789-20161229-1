package hand.exam.listener;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class FilmEventPublisher implements ApplicationEventPublisherAware {
	
	private ApplicationEventPublisher publisher;

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		this.publisher=publisher;
	}
	
    public void publishAfter() { 
	
    	AfterInsertFilmEvent af=new AfterInsertFilmEvent(this);
		publisher.publishEvent(af);
	}
    public void publishBefore() { 
    	
    	BeforeInsertFilmEvent af=new BeforeInsertFilmEvent(this);
		publisher.publishEvent(af);
	}
	
	
	

}
