package DataAccess.Abstract;

import Entites.Concreate.Campaign;

public interface ICampaignDal {
	void addCampaign(Campaign campaign);
	void deleteCampaign(Campaign campaign);
	void updateCampaign(Campaign campaign);
}
