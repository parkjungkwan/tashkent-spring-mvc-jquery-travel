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

import texas.sbq.travel.domains.Location;
import texas.sbq.travel.domains.Pager;
import texas.sbq.travel.enums.Messenger;
import texas.sbq.travel.services.LocationService;
import texas.sbq.travel.utils.Printer;

@RestController
@RequestMapping("/locations")
public class LocationController {
		@Autowired LocationService locationService;
		@Autowired Printer printer;
		@Autowired Pager pager;
		
		@PostMapping("/")
		public Messenger post(@RequestBody Location location) {
			locationService.save(location);
			return Messenger.SUCCESS;
		}
		@GetMapping("/{keyword}")  
		public List<?> get(@PathVariable String keyword){	
			return locationService.list(pager);
		}
		@PutMapping("/")
		public Messenger put(@RequestBody Location location) {
			locationService.edit(location); 
			return Messenger.SUCCESS;
		}
		@DeleteMapping("/{id}")
		public Messenger delete(@PathVariable String id) {
			locationService.remove(id);
			return Messenger.SUCCESS;
		}
		
}
		
		

