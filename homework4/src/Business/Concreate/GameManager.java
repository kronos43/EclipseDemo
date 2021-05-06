package Business.Concreate;

import Business.Abstract.GameService;
import DataAccess.Concreate.GameDal;
import Entites.Concreate.Game;

public class GameManager implements GameService{
	
	private GameDal _gameDal;
	
	
	public GameManager(GameDal _gameDal) {
		this._gameDal = _gameDal;
	}

	@Override
	public void addGame(Game game) {
		
		_gameDal.addGame(game);
	}

	@Override
	public void deleteGame(Game game) {
		_gameDal.deleteGame(game);
		
	}

	@Override
	public void updateGame(Game game) {
		_gameDal.updateGame(game);
		
	}


}
