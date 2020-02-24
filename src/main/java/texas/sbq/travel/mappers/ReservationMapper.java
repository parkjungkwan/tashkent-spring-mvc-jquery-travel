package texas.sbq.travel.mappers;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;

import texas.sbq.travel.domains.Pager;
import texas.sbq.travel.domains.Reservation;
import texas.sbq.travel.domains.Reservation;
@Repository
public interface ReservationMapper {
	
	public void create();
	public void insert(Reservation reservation);
	public String count();
	public Reservation selectById(String reservationSeq);
	public List<Reservation> select(Pager pager);
	public void update(Reservation reservation);
	public void delete(String reservationSeq);
}
