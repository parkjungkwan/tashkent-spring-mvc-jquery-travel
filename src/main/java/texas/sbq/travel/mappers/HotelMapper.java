package texas.sbq.travel.mappers;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;

import texas.sbq.travel.domains.Opinion;
import texas.sbq.travel.domains.Hotel;
import texas.sbq.travel.domains.Hotel;
import texas.sbq.travel.domains.Reservation;
import texas.sbq.travel.domains.Room;
import texas.sbq.travel.proxies.Pager;


@Repository
public interface HotelMapper {
	
	public void create();
	public void insert(Hotel hotel);
	public String count();
	public Hotel select(String hotelSeq);
	public List<Hotel> filter(Pager pager);
	public void update(Hotel hotel);
	public void delete(String hotelSeq);
}