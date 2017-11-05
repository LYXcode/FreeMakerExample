package spittr.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.springframework.stereotype.Service;

import spittr.entity.Spittle;
import spittr.service.SpittleService;

/**
 * 
 * @author mingqiu
 *
 */
@Service
public class MySpittleServiceImpl implements SpittleService {
	
	Map<Long, Spittle> spittles = new HashMap<Long, Spittle>();
	List<Spittle> sortedSpittles = new ArrayList<Spittle>();
	Random rand = new Random(34);
	
	@Override
	public List<Spittle> findRecentSpittles() {
		return this.findSpittles(100000,20);
	}

	@Override
	public List<Spittle> findSpittles(long max, int count) {
		
		int lastIndex = count - 1;
		Collections.sort(this.sortedSpittles, new Comparator<Spittle>(){

			@Override
			public int compare(Spittle o1, Spittle o2) {
				return o1.getTime().compareTo(o2.getTime());
			}
			
		});
		if (lastIndex > sortedSpittles.size()){
			lastIndex = sortedSpittles.size();
		}
		return  sortedSpittles.subList(0, lastIndex);
	}

	@Override
	public Spittle findOne(long id) {
		return spittles.get(new Long(id));
	}

	@Override
	public void save(Spittle spittle) {
		Long id = (long) -1;
		while (id < 0 ){
			id = rand.nextLong();
		}
		spittle.setId(id);
		spittles.put(id, spittle);
		sortedSpittles.add(spittle);
	}
}
