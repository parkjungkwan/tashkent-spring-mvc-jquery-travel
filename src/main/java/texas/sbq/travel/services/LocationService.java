package texas.sbq.travel.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import texas.sbq.travel.domains.Location;
import texas.sbq.travel.domains.Tourism;
import texas.sbq.travel.mappers.LocationMapper;
import texas.sbq.travel.mappers.TourismMapper;
import texas.sbq.travel.proxies.Pager;
import texas.sbq.travel.services.LocationService;

@Service
public class LocationService {
	
	@Autowired LocationMapper locationMapper;
	
	public void create() { locationMapper.create();}
	public void save(Location location) { locationMapper.insert(location);}
	public String count() { return locationMapper.count();}
	public Location detail(String locationSeq) { return locationMapper.select(locationSeq);}
	public List<Location> list(Pager pager){ return locationMapper.filter(pager);}
	public void edit(Location location) { locationMapper.update(location);}
	public void remove(String locationSeq) { locationMapper.delete(locationSeq);}
	
	public List<String> placeList() {
		List<String> place = Arrays.asList("테헤란로","선릉과정릉","포스코미술관",
				"카페거리","코엑스아쿠아리움");
		
		return place;
	}
	public List<String> latitudeList() {
		List<String> latitude = Arrays.asList("127.050147/37.5048086","127.049405/37.5071363","127.056133/37.5057728",
				"127.027597/37.5001153","127.058796/37.5125020");
		
		return latitude;
	}
	 public List<Location> mapDB() {
		 Location maps= null;
		 List<Location> mapList = new ArrayList<>();
		 for(int i = 0 ; i<placeList().size();i++) {
			 maps = new Location(placeList().get(i), latitudeList().get(i));
			 mapList.add(maps);
			
		 }
		 
	  return mapList;
	 }
		
	@Transactional
	public void insertMapDB() {
		 List<Location> mList = mapDB();
		for(int i=0;i<mList.size();i++) {
			locationMapper.insert(mList.get(i));
		}
	
	}
	
}
