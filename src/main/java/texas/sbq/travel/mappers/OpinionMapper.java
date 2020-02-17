package texas.sbq.travel.mappers;

import java.util.HashMap;
import java.util.List;

import texas.sbq.travel.domains.Opinion;
import texas.sbq.travel.domains.Opinion;
import texas.sbq.travel.proxies.Pager;

public interface OpinionMapper {
	
	public void create();
	public void insert(Opinion opinion);
	public String count();
	public Opinion select(String opinionSeq);
	public List<Opinion> filter(Pager pager);
	public void update(Opinion opinion);
	public void delete(String opinionSeq);

}
