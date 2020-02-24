package texas.sbq.travel.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import texas.sbq.travel.domains.Hotel;
import texas.sbq.travel.domains.Pager;
import texas.sbq.travel.domains.Reservation;
import texas.sbq.travel.enums.Messenger;
import texas.sbq.travel.services.ReservationService;

@RestController
@RequestMapping("/reservations")
public class ReservationController {
	@Autowired ReservationService reservationService;
	@Autowired Pager pager;
	
	@PostMapping("/")
	public Messenger post(@RequestBody Reservation reservation){
		reservationService.save(reservation);
		return Messenger.SUCCESS;
	}
	@GetMapping("/{id}")
	public Reservation get(@PathVariable String id){
		return reservationService.detail(id);
	}
	@GetMapping("/")
	public List<?> get() {
		return reservationService.list(pager);
	}
	@GetMapping("/{keyword}")
	public Hotel[] getHotels(@PathVariable String keyword){
		return reservationService.list(pager).stream().toArray(Hotel[]::new);
	}
	
	@PutMapping("/")
	public Messenger put(@RequestBody Reservation reservation) {
		reservationService.edit(reservation); 
		return Messenger.SUCCESS;
	}

	@DeleteMapping("/{id}")
	public Messenger delete(@PathVariable String id) {
		reservationService.remove(id);
		return Messenger.SUCCESS;
	}
	
	

}
