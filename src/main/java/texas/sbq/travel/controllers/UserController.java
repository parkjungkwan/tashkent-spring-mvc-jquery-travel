package texas.sbq.travel.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;

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

import texas.sbq.travel.domains.User;
import texas.sbq.travel.enums.Messenger;
import texas.sbq.travel.proxies.Pager;
import texas.sbq.travel.services.UserService;
import texas.sbq.travel.util.Printer;



@RestController
@RequestMapping("/users")
public class UserController {
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	@Autowired User user;
	@Autowired Printer printer;
	@Autowired UserService userService;
	@Autowired Pager pager;
	
	@PostMapping("/")
	public Messenger post(@RequestBody User user){
		userService.save(user);
		return Messenger.SUCCESS;
	}
	
	@GetMapping("/{id}")
	public User get(@PathVariable String id){
		return userService.detail(id);
	}
	@GetMapping("/{id}/login")
	public User login(@PathVariable("id") String userid, @RequestBody User user) {
		return userService.login(user);
	}
	@GetMapping("/{id}/exist")
	public Messenger exist(@PathVariable String id ){
		return Messenger.SUCCESS;
	}
	@GetMapping("/userid/{name}/{phone}")
	public User findUserid(@PathVariable("name") String name,
			@PathVariable("phone") String phoneNum) {
		user.setUsername(name);
		user.setPhoneNum(phoneNum);
		return userService.findUserid(user);
	}
	@GetMapping("/passwd/{id}/{phone}")
	public User findPasswd(@PathVariable("id") String userid, 
			@PathVariable("phone") String phoneNum) {
		user.setUserid(userid);
		user.setPhoneNum(phoneNum);
		return userService.findPasswd(user);
	}
	@GetMapping("/")
	public List<?> get() {
		return userService.list(pager);
	}
	
	
	@PutMapping("/")
	public Messenger put(@RequestBody User user) {
		userService.edit(user); 
		return Messenger.SUCCESS;
	}

	@DeleteMapping("/{id}")
	public Messenger delete(@PathVariable String id) {
		userService.remove(id);
		return Messenger.SUCCESS;
	}
	


}
