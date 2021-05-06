package Business.Concreate;

import Entites.Concreate.Campaign;
import Business.Abstract.CampaignService;

public class CampaignManager implements CampaignService{

	@Override
	public void AddCampaign(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + "campaign added.");
		
	}

	@Override
	public void DeleteCampaign(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + "campaign deleted.");
		
	}

	@Override
	public void UpdateCampaign(Campaign campaign) {
		System.out.println(campaign.getCampaignName() + "campaign updated.");
		
	}

	

}
