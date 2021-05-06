package DataAccess.Abstract;

import Entites.Concreate.Gamer;

public interface IGamerDal {
	void addGamer(Gamer gamer);
	void deleteGame(Gamer gamer);
	void updateGame(Gamer gamer);
	void login(Gamer gamer);
}
