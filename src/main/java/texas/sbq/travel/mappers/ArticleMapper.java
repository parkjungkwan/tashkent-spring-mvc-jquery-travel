package texas.sbq.travel.mappers;

import java.util.List;
import org.springframework.stereotype.Repository;
import texas.sbq.travel.domains.Article;
import texas.sbq.travel.domains.Pager;

@Repository
public interface ArticleMapper {
	
	public void create();
	public void insert(Article o);
	public String count();
	public String countById(String id);
	public Article selectById(String id);
	public String selectRatingById(String id);
	public List<Article> select(Pager pager);
	public void update(Article o);
	public void delete(String id);
}