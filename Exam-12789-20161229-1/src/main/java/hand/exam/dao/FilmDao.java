package hand.exam.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import hand.exam.domain.Film;

public class FilmDao {
	
	private SqlSessionFactory sqlSessionFactory;
	
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		this.sqlSessionFactory = sqlSessionFactory;
	}
	
	/**
	 * 添加电影
	 */
	public void addFilm(Film film){
		SqlSession sqlSession = sqlSessionFactory.openSession();
		sqlSession.insert(Film.class.getName()+".addFilm", film);
		sqlSession.close();
	}

}
