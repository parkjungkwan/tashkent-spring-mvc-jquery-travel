package texas.sbq.travel.mapper;

import java.util.HashMap;
import java.util.List;

import texas.sbq.travel.tourism.Tourism;


public interface TourismMapper {

	public void insertTourism(Tourism T);
	public void createTourism(HashMap<String, String> paramMap);
	public void dropTourism(HashMap<String, String> paramMap);
	public void truncateTourism(HashMap<String, String> paramMap);

	public List<Tourism> selectTourismList(Tourism tourism);

}
