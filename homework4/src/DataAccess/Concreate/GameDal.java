package DataAccess.Concreate;

import DataAccess.Abstract.IGameDal;
import Entites.Concreate.Game;

public class GameDal implements IGameDal{

	@Override
	public void addGame(Game game) {
		System.out.println("Oyununuz eklenmistir : " + game.getName());
		
	}

	@Override
	public void deleteGame(Game game) {
		System.out.println("Oyununuz silinmistir : " + game.getName());
		
	}

	@Override
	public void updateGame(Game game) {
		System.out.println("Oyununuz guncellenmistir : " + game.getName());
		
	}

}
