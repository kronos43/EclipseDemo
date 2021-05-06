package DataAccess.Abstract;

import Entites.Concreate.Game;

public interface IGameDal {
	void addGame(Game game);
	void deleteGame(Game game);
	void updateGame(Game game);
}
