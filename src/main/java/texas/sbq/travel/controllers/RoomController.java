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

import texas.sbq.travel.domains.Pager;
import texas.sbq.travel.domains.Room;
import texas.sbq.travel.enums.Messenger;
import texas.sbq.travel.services.RoomService;
import texas.sbq.travel.utils.Printer;

@RestController
@RequestMapping("/rooms")
public class RoomController {
	
	@Autowired Pager pager;
	@Autowired Printer printer;
	@Autowired Room room;
	@Autowired RoomService roomService;
	
	@PostMapping("/")
	public Messenger post(@RequestBody Room room){
		roomService.save(room);
		return Messenger.SUCCESS;
	}
	
	@GetMapping("/{id}")
	public Room get(@PathVariable String id){
		return roomService.detail(id);
	}
	@GetMapping("/")
	public List<?> get() {
		return roomService.list(pager);
	}
	
	@PutMapping("/")
	public Messenger put(@RequestBody Room room) {
		roomService.edit(room); 
		return Messenger.SUCCESS;
	}

	@DeleteMapping("/{id}")
	public Messenger delete(@PathVariable String id) {
		roomService.remove(id);
		return Messenger.SUCCESS;
	}
	

}
