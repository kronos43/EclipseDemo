package Business.Concreate;

import Business.Abstract.GamerService;
import DataAccess.Concreate.GamerDal;
import Entites.Concreate.Gamer;

public class GamerManager implements GamerService {

	 GamerDal _gamerDal;
	 
	 public GamerManager(GamerDal _gamerDal) {
		 this._gamerDal = _gamerDal;
	 }

	@Override
	public void addGamer(Gamer gamer) {
		
		_gamerDal.addGamer(gamer);
		
		System.out.println(gamer.getGamerId()+ "/"+ gamer.getUserName() + " kaydiniz basariyla yapilmistir.");
		
	}

	@Override
	public void deleteGamer(Gamer gamer) {
		_gamerDal.deleteGame(gamer);
		System.out.println(gamer.getGamerId()+ "/"+ gamer.getUserName() + " kaydiniz basariyla silinmistir.");
	}

	@Override
	public void updateGamer(Gamer gamer) {
		
		_gamerDal.updateGame(gamer);
		System.out.println(gamer.getGamerId()+ "/"+ gamer.getUserName() + " kaydiniz basariyla guncellenmistir.");
	}

	@Override
	public void login(Gamer gamer) {
		
		_gamerDal.login(gamer);
		System.out.println("Sisteme giriliyor..." + gamer.getUserName() + "hosgeldiniz!");
		
	}


	
	

}
