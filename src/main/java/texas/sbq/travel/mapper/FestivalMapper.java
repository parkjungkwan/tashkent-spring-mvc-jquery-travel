package texas.sbq.travel.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import texas.sbq.travel.festival.Festival;
import texas.sbq.travel.festival.FestivalBook;


@Repository
public interface FestivalMapper {
	public void insertFestival(Festival festival);
	public List<Festival> selectFestivalList(Festival festival);
	public Festival selectFestivalInfo(int feseq);
	public void insertFestivalBook(FestivalBook festivalbook);
}
