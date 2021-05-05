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
		System.out.println(" kiþi kaydedildi: " + gamer.getFirstName() );		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println(gamer.getFirstName() + "adlý kiþi güncellendi");		
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("kiþi silindi: " + gamer.getFirstName() );		
		
	}

}
