package Business.Abstract;

import Entites.Concreate.Gamer;

public interface GamerService {
	void login(Gamer gamer);
	void addGamer(Gamer gamer);
	void deleteGamer(Gamer gamer);
	void updateGamer(Gamer gamer);
	
}
