package texas.sbq.travel.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import texas.sbq.travel.domains.Article;
import texas.sbq.travel.domains.Festival;
import texas.sbq.travel.domains.Pager;
import texas.sbq.travel.domains.Reservation;
import texas.sbq.travel.enums.Messenger;
import texas.sbq.travel.services.FestivalService;
import texas.sbq.travel.services.ReservationService;
import texas.sbq.travel.utils.Printer;


@Lazy
@RestController
@RequestMapping("/festivals")
public class FestivalController {
	private static final Logger logger = LoggerFactory.getLogger(FestivalController.class);
	@Autowired Pager pager;
	@Autowired Festival festival;
	@Autowired Printer printer;
	@Autowired FestivalService festivalService;
	@Autowired ReservationService reservationService;
	
	@GetMapping("/crawling")
	   public ArrayList<HashMap<String, String>> crawl() throws Exception{
	      return festivalService.crawling();
	}
	
	
	@PostMapping("/")
	public Messenger post(@RequestBody Festival festival) {
		festivalService.save(festival);
		return Messenger.SUCCESS;
	}
	@GetMapping("/{id}")
	public Festival get(@PathVariable String id){
		return festivalService.detail(id);
	}
	@GetMapping("/")
	public List<?> get(){
		return festivalService.list(pager);
	}
	@PutMapping("/")
	public Messenger put(@RequestBody Festival festival) {
		festivalService.edit(festival); 
		return Messenger.SUCCESS;
	}

	@DeleteMapping("/{id}")
	public Messenger delete(@PathVariable String id) {
		festivalService.remove(id);
		return Messenger.SUCCESS;
	}
	
	
	
	
	
	
	
}
