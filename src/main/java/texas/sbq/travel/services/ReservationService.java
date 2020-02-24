package texas.sbq.travel.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import texas.sbq.travel.domains.Pager;
import texas.sbq.travel.domains.Reservation;
import texas.sbq.travel.domains.Tourism;
import texas.sbq.travel.mappers.ReservationMapper;
import texas.sbq.travel.mappers.TourismMapper;
import texas.sbq.travel.services.ReservationService;

@Service
public class ReservationService implements IService{
	
	@Autowired ReservationMapper reservationMapper;
	@Override public void save(Object o) { reservationMapper.insert((Reservation) o);}
	@Override public String count(Object o) { return reservationMapper.count();}
	@Override public Reservation detail(Object o) { return reservationMapper.selectById(String.valueOf(o));}
	@Override public List<Reservation> list(Object o){ return reservationMapper.select((Pager) o);}
	@Override public void edit(Object o) { reservationMapper.update((Reservation) o);}
	@Override public void remove(Object o) { reservationMapper.delete(String.valueOf(o));}
	public void create() { reservationMapper.create();}
}
