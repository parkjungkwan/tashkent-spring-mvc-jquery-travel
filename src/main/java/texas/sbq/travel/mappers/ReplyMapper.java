package texas.sbq.travel.mappers;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;

import texas.sbq.travel.domains.Reply;
import texas.sbq.travel.domains.Reservation;
import texas.sbq.travel.proxies.Pager;
@Repository
public interface ReplyMapper {
	
	public void create();
	public void insert(Reply reply);
	public String count();
	public Reply select(String replySeq);
	public List<Reply> filter(Pager pager);
	public void update(Reply reply);
	public void delete(String replySeq);
}
