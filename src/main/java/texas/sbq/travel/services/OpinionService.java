package texas.sbq.travel.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import texas.sbq.travel.domains.Opinion;
import texas.sbq.travel.domains.Tourism;
import texas.sbq.travel.mappers.OpinionMapper;
import texas.sbq.travel.mappers.TourismMapper;
import texas.sbq.travel.proxies.Pager;
import texas.sbq.travel.services.OpinionService;

@Service
public class OpinionService {
	
	@Autowired OpinionMapper opinionMapper;
	public void create() { opinionMapper.create();}
	public void save(Opinion opinion) { opinionMapper.insert(opinion);}
	public String count() { return opinionMapper.count();}
	public Opinion detail(String opinionSeq) { return opinionMapper.select(opinionSeq);}
	public List<Opinion> list(Pager pager){ return opinionMapper.filter(pager);}
	public void edit(Opinion opinion) { opinionMapper.update(opinion);}
	public void remove(String opinionSeq) { opinionMapper.delete(opinionSeq);}

}
