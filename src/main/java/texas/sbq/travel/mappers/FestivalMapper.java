package texas.sbq.travel.mappers;

import java.util.List;

import org.springframework.stereotype.Repository;

import texas.sbq.travel.domains.Festival;
import texas.sbq.travel.domains.Pager;
import texas.sbq.travel.domains.Festival;
import texas.sbq.travel.domains.Reservation;


@Repository
public interface FestivalMapper {
	
	public void create();
	public void insert(Festival festival);
	public String count();
	public Festival selectById(String id);
	public List<Festival> select(Pager pager);
	public void update(Festival festival);
	public void delete(String id);
}
