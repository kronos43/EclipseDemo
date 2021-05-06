package Business.Abstract;

import Entites.Concreate.Campaign;

public interface CampaignService{
	public void AddCampaign(Campaign campaign);
	public void DeleteCampaign(Campaign campaign);
	public void UpdateCampaign(Campaign campaign);
}
