package texas.sbq.travel.mappers;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;

import texas.sbq.travel.domains.Opinion;
import texas.sbq.travel.domains.Pager;
import texas.sbq.travel.domains.Hotel;
import texas.sbq.travel.domains.Hotel;
import texas.sbq.travel.domains.Reservation;
import texas.sbq.travel.domains.Room;


@Repository
public interface HotelMapper {
	
	public void create();
	public void insert(Hotel o);
	public void update(Hotel o);
	public void delete(String id);
	public String count();
	public Hotel selectById(String id);
	public Hotel selectLatitudeById(String id);
	public List<Hotel> select(Pager o);
	public List<Hotel> selectByPrice(Hotel o);
	public List<Hotel> selectByArea(String area);
	public List<Hotel> selectLocationsOfHotels(Hotel o);
	
}