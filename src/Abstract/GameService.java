package Abstract;


import Entities.Game;

	public interface GameService {
		
		void add(Game game);
		void update(Game game);
		void save(Game game);
		void delete(Game game);
	}
	

