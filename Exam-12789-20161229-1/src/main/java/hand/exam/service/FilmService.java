package hand.exam.service;

import hand.exam.dao.FilmDao;
import hand.exam.domain.Film;

import java.util.Scanner;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

public class FilmService {
	
	Scanner scanner=new Scanner(System.in);
	
	private FilmDao filmDao;
	public void setFilmDao(FilmDao filmDao) {
		this.filmDao = filmDao;
	}
	public void ContextStart(){
		
		System.out.println("请输入电影名字：");
		String filmName=scanner.next();
		
		System.out.println("请输入电影描述：");
		String description=scanner.next();
		
		System.out.println("请输入语言ID：");
		int language_id=scanner.nextInt();
		
		
		Film film=new Film(filmName,description,language_id);
		
		filmDao.addFilm(film);
		
	}
}
