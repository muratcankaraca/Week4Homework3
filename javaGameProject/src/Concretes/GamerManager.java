package Concretes;

import Abstracts.GamerService;
import Adapters.MerniceServiceAdapter;
import Entities.Gamer;

public class GamerManager implements GamerService {

	public GamerManager(MerniceServiceAdapter merniceServiceAdapter) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void add(Gamer gamer) {
		System.out.println(" ki�i kaydedildi: " + gamer.getFirstName() );		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println(gamer.getFirstName() + "adl� ki�i g�ncellendi");		
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("ki�i silindi: " + gamer.getFirstName() );		
		
	}

}
