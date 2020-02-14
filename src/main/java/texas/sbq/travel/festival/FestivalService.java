package texas.sbq.travel.festival;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public interface FestivalService {
	public List<Festival> findFestivalList(Festival festival);
	public Festival findFestivalInfo(int feseq);

}
