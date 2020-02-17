package texas.sbq.travel.mappers;

import java.util.HashMap;
import java.util.List;

import texas.sbq.travel.domains.Tourism;
import texas.sbq.travel.domains.Tourism;
import texas.sbq.travel.proxies.Pager;


public interface TourismMapper {
	
	public void create();
	public void insert(Tourism tourism);
	public String count();
	public Tourism select(String tourismSeq);
	public List<Tourism> filter(Pager pager);
	public void update(Tourism tourism);
	public void delete(String tourismSeq);

}
