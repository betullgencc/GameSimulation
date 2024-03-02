package Abstract;


	
	import Entities.Game;
	import Entities.GameCampaign;
	import Entities.Gamer;

	public interface SalesService {
		void sale(Gamer gamer,Game game);
		void saleWithCampaign(Gamer gamer, Game game, GameCampaign gameCampaign);
	}
