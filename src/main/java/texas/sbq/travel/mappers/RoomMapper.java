package texas.sbq.travel.mappers;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;

import texas.sbq.travel.domains.Pager;
import texas.sbq.travel.domains.Room;
import texas.sbq.travel.domains.Room;
@Repository
public interface RoomMapper {
	
	public void create();
	public void insert(Room room);
	public String count();
	public Room selectById(String roomSeq);
	public List<Room> select(Pager pager);
	public void update(Room room);
	public void delete(String roomSeq);
}
