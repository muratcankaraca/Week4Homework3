package Concretes;

import Abstracts.GameService;
import Entities.Game;

public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		System.out.println("oyun eklendi: " + game.getName());	
	}

	@Override
	public void delete(Game game) {
		System.out.println("oyun silindi: " + game.getName());	
		
	}

	@Override
	public void update(Game game) {
		System.out.println("oyun güncellendi " + game.getName());	
		
	}

}
