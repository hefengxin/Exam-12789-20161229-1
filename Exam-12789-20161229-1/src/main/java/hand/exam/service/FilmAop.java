package hand.exam.service;

import hand.exam.listener.FilmEventPublisher;


public class FilmAop {
	     
		private FilmEventPublisher filmEventPublisher;
		public void setFilmEventPublisher(FilmEventPublisher filmEventPublisher) {
			this.filmEventPublisher = filmEventPublisher;
		}
		
	
	
	
	   //前置通知
		public void begin() {
			filmEventPublisher.publishBefore();
		}
		
		//后置通知
		public void commit() {
			filmEventPublisher.publishAfter();
		}
		

}
