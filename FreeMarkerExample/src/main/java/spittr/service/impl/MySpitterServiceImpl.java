package spittr.service.impl;

import java.util.HashMap;

import java.util.Map;
import java.util.Random;

import org.springframework.stereotype.Service;

import spittr.entity.Spitter;
import spittr.service.SpitterService;

/**
 * 
 * @author mingqiu
 *
 */
@Service("mySpitterService")
public class MySpitterServiceImpl implements SpitterService {
	
	Map<String, Spitter> users = new HashMap<String, Spitter>();
	
	Random rand = new Random(12);

	@Override
	public Spitter save(Spitter spitter) {
		
		Long id = (long) -1;
		while (id < 0 ){
			id = rand.nextLong();
		}
		spitter.setId(id);
		users.put(spitter.getUsername(), spitter);
		return spitter;
	}

	@Override
	public Spitter findByUsername(String username) {
		return users.get(username);
	}

}
