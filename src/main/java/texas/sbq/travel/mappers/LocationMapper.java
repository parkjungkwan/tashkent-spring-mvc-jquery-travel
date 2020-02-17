package texas.sbq.travel.mappers;


import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;

import texas.sbq.travel.domains.Location;
import texas.sbq.travel.domains.Location;
import texas.sbq.travel.proxies.Pager;


@Repository
public interface LocationMapper {
		
	public void create();
	public void insert(Location location);
	public String count();
	public Location select(String locationSeq);
	public List<Location> filter(Pager pager);
	public void update(Location location);
	public void delete(String locationSeq);
}
