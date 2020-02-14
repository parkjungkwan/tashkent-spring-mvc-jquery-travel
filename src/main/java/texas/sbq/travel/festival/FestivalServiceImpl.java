package texas.sbq.travel.festival;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import texas.sbq.travel.mapper.FestivalMapper;

@Service
public class FestivalServiceImpl implements FestivalService{
	@Autowired FestivalMapper festivalmapper;
	
	@Override
	public List<Festival> findFestivalList(Festival festival) {
		return festivalmapper.selectFestivalList(festival);
	}

	@Override
	public Festival findFestivalInfo(int feseq) {
		// TODO Auto-generated method stub
		return festivalmapper.selectFestivalInfo(feseq);
	}




}
