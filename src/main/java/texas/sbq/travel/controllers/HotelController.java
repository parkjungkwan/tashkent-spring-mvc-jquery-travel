package texas.sbq.travel.controllers;

import java.util.List;
import java.util.Map;
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
import texas.sbq.travel.domains.Opinion;
import texas.sbq.travel.domains.Pager;
import texas.sbq.travel.domains.Reservation;
import texas.sbq.travel.domains.Room;
import texas.sbq.travel.enums.Messenger;
import texas.sbq.travel.services.HotelService;
import texas.sbq.travel.services.ReservationService;
import texas.sbq.travel.utils.Printer;

@RestController
@RequestMapping("/hotels")
public class HotelController {
	@Autowired Pager pager;
	@Autowired Printer printer;
	@Autowired Room room;
	@Autowired HotelService hotelService;
	@Autowired Hotel hotel;
	@Autowired Opinion comments;
	@Autowired Reservation reservation;
	
	@PostMapping("/")
	public Messenger post(@RequestBody Hotel hotel) {
		hotelService.save(hotel);
		return Messenger.SUCCESS;
	}
	@GetMapping("/{id}")
	public Hotel get(@PathVariable String id){
		return hotelService.detail(id);
	}
	@GetMapping("/")
	public List<?> get() {
		return hotelService.list(pager);
	}
	@GetMapping("/{keyword}")
	public Hotel[] search(@PathVariable String keyword){
		return hotelService.list(pager).stream().toArray(Hotel[]::new);
	}
	
	@PutMapping("/")
	public Messenger put(@RequestBody Hotel hotel) {
		hotelService.edit(hotel); 
		return Messenger.SUCCESS;
	}

	@DeleteMapping("/{id}")
	public Messenger delete(@PathVariable String id) {
		hotelService.remove(id);
		return Messenger.SUCCESS;
	}
}
