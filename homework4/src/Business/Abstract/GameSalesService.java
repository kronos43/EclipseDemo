package Business.Abstract;

import Entites.Concreate.Campaign;
import Entites.Concreate.Game;
import Entites.Concreate.Gamer;

public interface GameSalesService {
	void sell(Gamer gamer, Game game);
	void sellDiscount(Gamer gamer, Game game, Campaign campaign);
}
