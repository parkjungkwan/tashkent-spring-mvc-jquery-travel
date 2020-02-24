package texas.sbq.travel.mappers;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Repository;

import texas.sbq.travel.domains.Pager;
import texas.sbq.travel.domains.Reply;
import texas.sbq.travel.domains.Reservation;
@Repository
public interface ReplyMapper {
	
	public void create();
	public void insert(Reply reply);
	public String count();
	public Reply selectById(String replySeq);
	public List<Reply> select(Pager pager);
	public void update(Reply reply);
	public void delete(String replySeq);
}
