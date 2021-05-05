import Adapters.MerniceServiceAdapter;
import Concretes.CampaignManager;
import Concretes.GameManager;
import Concretes.GamerCheckManager;
import Concretes.GamerManager;
import Concretes.SaleManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;


public class Main {

	public static void main(String[] args) {
		
		Gamer gamer1 = new Gamer();
		gamer1.setId(1);
		gamer1.setFirstName("Murat");
		gamer1.setLastName("karaca");
		gamer1.setBirthYear(2000);
		gamer1.setNationalIdentity("9324149234");

		
		Gamer gamer2 = new Gamer();
		gamer2.setId(2);
		gamer2.setFirstName("Can");
		gamer2.setLastName("Dener");
		gamer2.setNationalIdentity("134432345");
		gamer2.setBirthYear(1992);
		
		Gamer gamer3 = new Gamer();
		gamer3.setId(3);
		gamer3.setFirstName("Ayşe");
		gamer3.setLastName("Kaya");
		gamer3.setNationalIdentity("3412345267");
		gamer3.setBirthYear(1950);
		
		//-------------------------------------
		
		Game game1 = new Game();
		game1.setId(1);
		game1.setName("Gta V");
		game1.setPrice(299.9);
		
		Game game2 = new Game();
		game2.setId(2);
		game2.setName("FIFA 21");
		game2.setPrice(199.95);
		
		Game game3 = new Game();
		game3.setId(3);
		game3.setName("MAFIA 2");
		game3.setPrice(999.9);
		
		//-------------------------------------
		
		Campaign campaign1 = new Campaign();
		campaign1.setId(1);
		campaign1.setName(" Yaz indirimi ");
		campaign1.setRate(10);
		
		Campaign campaign2 = new Campaign();
		campaign2.setId(2);
		campaign2.setName(" Kış indirimi ");
		campaign2.setRate(20);
		
		Campaign campaign3 = new Campaign();
		campaign3.setId(3);
		campaign3.setName(" Bahar indirimi ");
		campaign3.setRate(30);
		
		//-------------------------------------
		
		GamerManager gamerManager = new GamerManager(new MerniceServiceAdapter());
		gamerManager.add(gamer1);
		gamerManager.delete(gamer2);
		gamerManager.update(gamer1);
		
		System.out.println("------------------------------------");
		
		//-------------------------------------
		
		GameManager gameManager = new GameManager();
		gameManager.add(game1);
		gameManager.delete(game2);
		gameManager.update(game3);
		
		System.out.println("------------------------------------");
		
		//-------------------------------------
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(campaign1);
		campaignManager.delete(campaign2);
		campaignManager.update(campaign3);
		
		System.out.println("------------------------------------");
		
		//-------------------------------------
		
		SaleManager saleManager = new SaleManager();
		saleManager.sell(gamer1, game1, campaign1);
		saleManager.sell(gamer2, game2, campaign2);
		saleManager.sell(gamer3, game3, campaign3);
		
	}
		
		
	}


