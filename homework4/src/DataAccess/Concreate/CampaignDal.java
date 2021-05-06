package DataAccess.Concreate;
import DataAccess.Abstract.ICampaignDal;
import Entites.Concreate.Campaign;

public class CampaignDal implements ICampaignDal{

	@Override
	public void addCampaign(Campaign campaign) {
		System.out.println("Eklenen kampanya : " + campaign.getCampaignId() + "/" +campaign.getCampaignName());
	}

	@Override
	public void deleteCampaign(Campaign campaign) {
		System.out.println("Silinen kampanya : " + campaign.getCampaignId() + "/" +campaign.getCampaignName());
		
	}

	@Override
	public void updateCampaign(Campaign campaign) {
		System.out.println("Guncellenen kampanya : " + campaign.getCampaignId() + "/" +campaign.getCampaignName());
		
	}

}
