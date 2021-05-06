package DataAccess.Concreate;

import DataAccess.Abstract.IGamerDal;
import Entites.Concreate.Gamer;

public class GamerDal implements IGamerDal{

	@Override
	public void addGamer(Gamer gamer) {
		System.out.println(gamer.getUserName() + ": hesabiniz silinmistir.");
		
	}
	
	@Override
	public void deleteGame(Gamer gamer) {
		System.out.println(gamer.getUserName() + ": hesabiniz silinmistir.");
		
	}

	@Override
	public void updateGame(Gamer gamer) {
		System.out.println(gamer.getUserName() + ": hesabiniz guncellenmistir.");
		
	}

	@Override
	public void login(Gamer gamer) {
		System.out.println(gamer.getUserName() + ": Hosgeldiniz!.");
	}

}
