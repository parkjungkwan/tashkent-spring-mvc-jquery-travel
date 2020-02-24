package texas.sbq.travel.mappers;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;

import texas.sbq.travel.domains.Pager;
import texas.sbq.travel.domains.User;
import texas.sbq.travel.domains.User;

@Repository
public interface UserMapper {
	
	public void create();
	public void insert(User user);
	public String count();
	public String exist(String userid);
	public User selectById(String userid);
	public User selectUser(User user);
	public User selectUserid(User user);
	public User selectPasswd(User user);
	public List<User> select(Pager pager);
	public void update(User user);
	public void delete(String userid);
	public void truncate();
}
