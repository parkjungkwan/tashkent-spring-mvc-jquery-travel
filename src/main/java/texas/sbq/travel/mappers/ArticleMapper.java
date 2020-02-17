package texas.sbq.travel.mappers;

import java.util.List;
import org.springframework.stereotype.Repository;
import texas.sbq.travel.domains.Article;
import texas.sbq.travel.proxies.Pager;

@Repository
public interface ArticleMapper {
	
	public void create();
	public void insert(Article article);
	public String count();
	public String countFavors(String artseq);
	public Article select(Article article);
	public String selectRatingPerArticle(String hotelSeq);
	public List<Article> filter(Pager proxy);
	public void update(Article article);
	public void delete(String aritcleSeq);
}