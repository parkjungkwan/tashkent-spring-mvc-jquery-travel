package texas.sbq.travel.tourism;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import texas.sbq.travel.mapper.TourismMapper;

@Service
public class TourServiceImpl implements TourService{
	@Autowired TourismMapper tourismMapper;
	@Override
	public List<Tourism> findTourismList(Tourism tourism) {
		// TODO Auto-generated method stub
		return tourismMapper.selectTourismList(tourism);
	}

}
