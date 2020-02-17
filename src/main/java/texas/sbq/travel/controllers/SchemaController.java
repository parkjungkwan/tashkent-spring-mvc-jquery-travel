package texas.sbq.travel.controllers;

import java.util.HashMap;
import java.util.function.Consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import texas.sbq.travel.enums.Messenger;
import texas.sbq.travel.services.ArticleService;
import texas.sbq.travel.services.FestivalService;
import texas.sbq.travel.services.HotelService;
import texas.sbq.travel.services.LocationService;
import texas.sbq.travel.services.OpinionService;
import texas.sbq.travel.services.ReplyService;
import texas.sbq.travel.services.ReservationService;
import texas.sbq.travel.services.RoomService;
import texas.sbq.travel.services.TourismService;
import texas.sbq.travel.services.UserService;

@RestController
@RequestMapping("/schema")
public class SchemaController {
	
	@Autowired ArticleService articleService;
	@Autowired FestivalService festivalService;
	@Autowired HotelService hotelService;
	@Autowired LocationService locationService;
	@Autowired OpinionService opinionService;
	@Autowired ReplyService replyService;
	@Autowired ReservationService reservationService;
	@Autowired RoomService roomService;
	@Autowired TourismService tourismService;
	@Autowired UserService userService;
	
	@GetMapping("/articles")
	public Messenger createArticles(){
		articleService.create();
		return Messenger.SUCCESS;
	}
	@GetMapping("/festivals")
	public Messenger createFestivals(){
		festivalService.create();
		return Messenger.SUCCESS;
	}
	@GetMapping("/hotels")
	public Messenger createHotels(){
		hotelService.create();
		return Messenger.SUCCESS;
	}
	@GetMapping("/locations")
	public Messenger createLocations(){
		locationService.create();
		return Messenger.SUCCESS;
	}
	@GetMapping("/opinions")
	public Messenger createOpinions(){
		opinionService.create();
		return Messenger.SUCCESS;
	}
	@GetMapping("/replies")
	public Messenger createReplies(){
		replyService.create();
		return Messenger.SUCCESS;
	}
	@GetMapping("/reservations")
	public Messenger createReservations(){
		reservationService.create();
		return Messenger.SUCCESS;
	}
	@GetMapping("/rooms")
	public Messenger createRooms(){
		roomService.create();
		return Messenger.SUCCESS;
	}
	@GetMapping("/tourisms")
	public Messenger createTourisms(){
		tourismService.create();
		return Messenger.SUCCESS;
	}
	@GetMapping("/users")
    public Messenger createUsers(){
		userService.create();
    	return Messenger.SUCCESS;
    }
	@PostMapping("/articles")
	public Messenger saveArticles(){
		articleService.create();
		return Messenger.SUCCESS;
	}
	@PostMapping("/festivals")
	public Messenger saveFestivals(){
		festivalService.create();
		return Messenger.SUCCESS;
	}
	@PostMapping("/hotels")
	public Messenger saveHotels(){
		hotelService.create();
		return Messenger.SUCCESS;
	}
	@PostMapping("/locations")
	public Messenger saveLocations(){
		locationService.create();
		return Messenger.SUCCESS;
	}
	@PostMapping("/opinions")
	public Messenger saveOpinions(){
		opinionService.create();
		return Messenger.SUCCESS;
	}
	@PostMapping("/replies")
	public Messenger saveReplies(){
		replyService.create();
		return Messenger.SUCCESS;
	}
	@PostMapping("/reservations")
	public Messenger saveReservations(){
		reservationService.create();
		return Messenger.SUCCESS;
	}
	@PostMapping("/rooms")
	public Messenger saveRooms(){
		roomService.create();
		return Messenger.SUCCESS;
	}
	@PostMapping("/tourisms")
	public Messenger saveTourisms(){
		tourismService.create();
		return Messenger.SUCCESS;
	}
	@PostMapping("/users")
    public Messenger saveUsers(){
		userService.create();
    	return Messenger.SUCCESS;
    }
}
