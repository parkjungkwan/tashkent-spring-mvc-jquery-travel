package texas.sbq.travel.controllers;

import java.util.List;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
import texas.sbq.travel.domains.Tourism;
import texas.sbq.travel.enums.Messenger;
import texas.sbq.travel.services.TourismService;
import texas.sbq.travel.utils.Printer;


@RestController
@RequestMapping("/tourism")
public class TourismController {
	private static final Logger logger = LoggerFactory.getLogger(TourismController.class);
	@Autowired Pager pager;
	@Autowired Printer printer;
	@Autowired Tourism tourism;
	@Autowired TourismService tourismService;
	
	@PostMapping("/")
	public Messenger post(@RequestBody Tourism tourism){
		tourismService.save(tourism);
		return Messenger.SUCCESS;
	}
	
	@GetMapping("/{id}")
	public Tourism get(@PathVariable String id){
		return tourismService.detail(id);
	}
	@GetMapping("/")
	public List<?> get() {
		return tourismService.list(pager);
	}
	
	@PutMapping("/")
	public Messenger put(@RequestBody Tourism tourism) {
		tourismService.edit(tourism); 
		return Messenger.SUCCESS;
	}

	@DeleteMapping("/{id}")
	public Messenger delete(@PathVariable String id) {
		tourismService.remove(id);
		return Messenger.SUCCESS;
	}
	
	
	
}
