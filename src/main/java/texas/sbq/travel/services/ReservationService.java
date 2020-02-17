package texas.sbq.travel.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import texas.sbq.travel.domains.Reservation;
import texas.sbq.travel.domains.Tourism;
import texas.sbq.travel.mappers.ReservationMapper;
import texas.sbq.travel.mappers.TourismMapper;
import texas.sbq.travel.proxies.Pager;
import texas.sbq.travel.services.ReservationService;

@Service
public class ReservationService {
	
	@Autowired ReservationMapper reservationMapper;
	public void create() { reservationMapper.create();}
	public void save(Reservation reservation) { reservationMapper.insert(reservation);}
	public String count() { return reservationMapper.count();}
	public Reservation detail(String reservationSeq) { return reservationMapper.select(reservationSeq);}
	public List<Reservation> list(Pager pager){ return reservationMapper.filter(pager);}
	public void edit(Reservation reservation) { reservationMapper.update(reservation);}
	public void remove(String reservationSeq) { reservationMapper.delete(reservationSeq);}
}
