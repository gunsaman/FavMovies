package fi.haagahelia.moviedatabase.service;

import java.util.List;

import org.springframework.data.domain.Page;

import fi.haagahelia.moviedatabase.domain.MovieList;

public interface MovieService {
	List<MovieList> getAllMovies();
	void saveMovie(MovieList movie);
	MovieList getMovieListById(long id);
	void deleteMovieListById(long id);
	static Page<MovieList> findPaginated(int pageNo, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
