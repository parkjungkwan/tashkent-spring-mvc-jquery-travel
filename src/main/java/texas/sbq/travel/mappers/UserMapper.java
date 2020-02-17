package texas.sbq.travel.mappers;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;

import texas.sbq.travel.domains.User;
import texas.sbq.travel.domains.User;
import texas.sbq.travel.proxies.Pager;

@Repository
public interface UserMapper {
	
	public void create();
	public void insert(User user);
	public String count();
	public String exist(String userid);
	public User select(String userid);
	public User login(User user);
	public User findUserid(User user);
	public User findPasswd(User user);
	public List<User> filter(Pager pager);
	public void update(User user);
	public void delete(String userid);
	public void truncate();
}
