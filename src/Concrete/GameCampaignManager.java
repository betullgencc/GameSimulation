package Concrete;

import Abstract.GameCampaignService;
import Entities.GameCampaign;

public class GameCampaignManager implements GameCampaignService{

	@Override
	public void add(GameCampaign gameCampaign) {
		System.out.println(gameCampaign.getGameCampaignName());
		
	}

	@Override
	public void update(GameCampaign gameCampaign) {
		System.out.println(gameCampaign.getGameCampaignName());
		
	}

	@Override
	public void save(GameCampaign gameCampaign) {
		System.out.println(gameCampaign.getGameCampaignName());
		
	}

	@Override
	public void delete(GameCampaign gameCampaign) {
		System.out.println(gameCampaign.getGameCampaignName());
		
	}

}