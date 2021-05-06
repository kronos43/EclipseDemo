package Business.Abstract;

import Entites.Concreate.Game;

public interface GameService {
	void addGame(Game game);
	void deleteGame(Game game);
	void updateGame(Game game);
}
