package Business.Concreate;

import Business.Abstract.GameSalesService;
import Entites.Concreate.Campaign;
import Entites.Concreate.Game;
import Entites.Concreate.Gamer;

public class GameSalesManager implements GameSalesService {

	@Override
	public void sell(Gamer gamer, Game game) {
		System.out.println(gamer.getUserName()+ "! " + game.getName() + "oyunu hesabiniza " +  game.getUnitPrice() + "Tl alinarak eklenmistir.");
		
	}

	@Override
	public void sellDiscount(Gamer gamer, Game game, Campaign campaign) {
		double lastPrice = (game.getUnitPrice() -(game.getUnitPrice() * Campaign.getDiscount()) / 100);
		System.out.println(gamer.getUserName()+ "! " + game.getName() + "oyunu hesabiniza " +  lastPrice + "Tl alinarak eklenmistir.");
	}

}
