package texas.sbq.travel.services;

import java.util.HashMap;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import texas.sbq.travel.domains.Article;
import texas.sbq.travel.domains.Pager;
import texas.sbq.travel.domains.Tourism;
import texas.sbq.travel.mappers.ArticleMapper;
import texas.sbq.travel.services.ArticleService;
import texas.sbq.travel.utils.Box;
import texas.sbq.travel.utils.Inventory;
import texas.sbq.travel.utils.Printer;

@Service
public class ArticleService implements IService{
	@Autowired ArticleMapper articleMapper;
	@Autowired Box<String> box;
	@Autowired Article article;
	@Autowired Printer printer;
	@Autowired Inventory<HashMap<String,String>> inventory;
	@Override public void save(Object o) { articleMapper.insert((Article)o);}
	@Override public String count(Object o) { return articleMapper.count();}
	@Override public Article detail(Object o) { return articleMapper.selectById(String.valueOf(o));}
	@Override public List<?> list(Object o){ return articleMapper.select((Pager) o);}
	@Override public void edit(Object o) { articleMapper.update((Article)o);}
	@Override public void remove(Object o) { articleMapper.delete(String.valueOf(o));}
	public void create() { articleMapper.create();}
	public String favors(String articleSeq) {return articleMapper.countById(articleSeq);}
	public String rating(String hotelSeq) { return articleMapper.selectRatingById(hotelSeq);}
	@Transactional
	public List<?> initialize() {
		//
		String url = "https://store.naver.com/attractions/detail?entry=plt&id=38345004&query=%EB%82%A8%EC%82%B0%EC%84%9C%EC%9A%B8%ED%83%80%EC%9B%8C&tab=fsasReview";
		inventory.clear();
		
		try {
			Document rawData = Jsoup.connect(url).timeout(10 * 1000).get();
			Elements title = rawData.select("div[class=tit] a");
			Elements content = rawData.select("div[class=txt ellp2]");
			Elements img = rawData.select("div[class=thumb]");
			
			HashMap<String, String> map = null;
			for(int i = 0; i<title.size();i++) {
				map = new HashMap<String, String>();
				map.put("title", title.get(i).text());
				map.put("content", content.get(i).text());
				map.put("img", img.get(i).select("img").attr("src"));
				article.setImage(img.get(i).select("img").attr("src"));
				article.setTitle(title.get(i).text());
				article.setContent(content.get(i).text());
				article.setUserid("hong");
				articleMapper.insert(article);
				inventory.add(map);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(inventory+"1111");
		return inventory.get();
	}

	
	
}
