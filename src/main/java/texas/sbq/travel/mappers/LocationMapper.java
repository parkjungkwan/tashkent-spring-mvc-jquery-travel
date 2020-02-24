package texas.sbq.travel.mappers;


import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;

import texas.sbq.travel.domains.Location;
import texas.sbq.travel.domains.Pager;
import texas.sbq.travel.domains.Location;


@Repository
public interface LocationMapper {
		
	public void create();
	public void insert(Location location);
	public void update(Location location);
	public void delete(String locationSeq);
	public String count();
	public Location selectById(String locationSeq);
	public List<Location> select(Pager pager);
	
}
