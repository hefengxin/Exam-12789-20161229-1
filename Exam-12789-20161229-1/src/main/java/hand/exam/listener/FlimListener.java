package hand.exam.listener;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;


/**
 * 监听事件
 * @author hfx
 *
 */
public class FlimListener implements ApplicationListener {

	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		if(event instanceof AfterInsertFilmEvent){
			((AfterInsertFilmEvent) event).after();
		}else if(event instanceof BeforeInsertFilmEvent){
			((BeforeInsertFilmEvent) event).before();
		}
	}



}
