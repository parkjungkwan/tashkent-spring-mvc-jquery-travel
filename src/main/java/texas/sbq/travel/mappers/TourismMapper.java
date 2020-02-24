package texas.sbq.travel.mappers;

import java.util.HashMap;
import java.util.List;

import texas.sbq.travel.domains.Pager;
import texas.sbq.travel.domains.Tourism;
import texas.sbq.travel.domains.Tourism;


public interface TourismMapper {
	
	public void create();
	public void insert(Tourism tourism);
	public String count();
	public Tourism selectById(String tourismSeq);
	public List<Tourism> select(Pager pager);
	public void update(Tourism tourism);
	public void delete(String tourismSeq);

}
