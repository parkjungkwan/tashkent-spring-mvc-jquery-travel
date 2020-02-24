package texas.sbq.travel.mappers;

import java.util.HashMap;
import java.util.List;

import texas.sbq.travel.domains.Opinion;
import texas.sbq.travel.domains.Pager;
import texas.sbq.travel.domains.Opinion;

public interface OpinionMapper {
	
	public void create();
	public void insert(Opinion opinion);
	public String count();
	public Opinion selectById(String opinionSeq);
	public List<Opinion> select(Pager pager);
	public void update(Opinion opinion);
	public void delete(String opinionSeq);

}
