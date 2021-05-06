package Entites.Concreate;

public class Campaign {
	int campaignId;
	String campaignName;
	static double discount;



	public int getCampaignId() {
		return campaignId;
	}


	public void setCampaignId(int campaignId) {
		this.campaignId = campaignId;
	}


	public String getCampaignName() {
		return campaignName;
	}


	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}


	public static double getDiscount() {
		return discount;
	}


	public void setDiscount(double discount) {
		Campaign.discount = discount;
	}


}
