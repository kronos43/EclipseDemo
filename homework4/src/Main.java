import Business.Concreate.CampaignManager;
import Business.Concreate.GameManager;
import Business.Concreate.GameSalesManager;
import Business.Concreate.GamerManager;
import DataAccess.Concreate.GameDal;
import DataAccess.Concreate.GamerDal;
import Entites.Concreate.Campaign;
import Entites.Concreate.Game;
import Entites.Concreate.Gamer;

public class Main {

	public static void main(String[] args) {
		Game game1= new Game();
		game1.setName("Dark Souls 3");
		game1.setUnitPrice(0);
		game1.setDetail("Souls like");
		game1.setUnitPrice(260);
		Game game2= new Game();
		
		GameManager gameManager = new GameManager(new GameDal());
		gameManager.addGame(game1);
		gameManager.updateGame(game1);
		
		Gamer gamer1=new Gamer();
		gamer1.setGamerId(1);
		gamer1.setNationalityId("123456789012");
		gamer1.setUserName("Bilgehan");
		
		GamerManager gamerManager= new GamerManager(new GamerDal());
		gamerManager.addGamer(gamer1);
		gamerManager.updateGamer(gamer1);
		
		Campaign campaign1= new Campaign();
		campaign1.setCampaignId(1);
		campaign1.setCampaignName("Yilbasi indirimi");
		campaign1.setDiscount(50);
		
		CampaignManager campaignManager= new CampaignManager();
		campaignManager.AddCampaign(campaign1);
		
		GameSalesManager salesManager=new GameSalesManager();
		salesManager.sell(gamer1, game1);
		salesManager.sellDiscount(gamer1, game1, campaign1); 
			
	}

}
