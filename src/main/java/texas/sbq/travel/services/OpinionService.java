package texas.sbq.travel.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import texas.sbq.travel.domains.Opinion;
import texas.sbq.travel.domains.Pager;
import texas.sbq.travel.domains.Tourism;
import texas.sbq.travel.mappers.OpinionMapper;
import texas.sbq.travel.mappers.TourismMapper;
import texas.sbq.travel.services.OpinionService;

@Service
public class OpinionService implements IService{
	
	@Autowired OpinionMapper opinionMapper;
	public void create() { opinionMapper.create();}
	@Override public void save(Object o) { opinionMapper.insert((Opinion) o);}
	@Override public String count(Object o) { return opinionMapper.count();}
	@Override public Opinion detail(Object o) { return opinionMapper.selectById(String.valueOf(o));}
	@Override public List<Opinion> list(Object o){ return opinionMapper.select((Pager) o);}
	@Override public void edit(Object o) { opinionMapper.update((Opinion) o);}
	@Override public void remove(Object o) { opinionMapper.delete(String.valueOf(o));}

}
