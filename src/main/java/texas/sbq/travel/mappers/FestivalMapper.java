package texas.sbq.travel.mappers;

import java.util.List;

import org.springframework.stereotype.Repository;

import texas.sbq.travel.domains.Festival;
import texas.sbq.travel.domains.Festival;
import texas.sbq.travel.domains.Reservation;
import texas.sbq.travel.proxies.Pager;


@Repository
public interface FestivalMapper {
	
	public void create();
	public void insert(Festival festival);
	public String count();
	public Festival select(String festivalSeq);
	public List<Festival> filter(Pager pager);
	public void update(Festival festival);
	public void delete(String festivalSeq);
}
