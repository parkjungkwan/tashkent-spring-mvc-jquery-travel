package texas.sbq.travel.controllers;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import texas.sbq.travel.domains.Article;
import texas.sbq.travel.enums.Messenger;
import texas.sbq.travel.generics.Box;
import texas.sbq.travel.proxies.Crawler;
import texas.sbq.travel.proxies.Filer;
import texas.sbq.travel.proxies.Pager;
import texas.sbq.travel.proxies.Proxy;
import texas.sbq.travel.services.ArticleService;

@RestController
@RequestMapping("/articles")
public class ArticleController extends Proxy {
	@Autowired ArticleService articleService;
	@Autowired Article article;
	@Autowired Crawler crawler;
	@Autowired Pager pager;
	@Autowired Filer filemgr;
	@Autowired Article board;
	@Autowired Box<Object> trunk;

	@PostMapping("/{category}")
	public Messenger post(@RequestBody Article article) {
		articleService.save(article);
		return Messenger.SUCCESS;
	}
	
	@GetMapping("/{group}/{id}")
	public Messenger get(@PathVariable("group") String category,
			@PathVariable("id") String articleSeq) {
		article.setCategory(category);
		article.setArticleSeq(articleSeq);
		articleService.detail(article);
		return Messenger.SUCCESS;
	}
	@GetMapping("/{group}/{pageSize}/{nowPage}/{option}/{search}")
	public List<Article> get(@PathVariable("pageSize") String pageSize, @PathVariable("nowPage") String nowPage,
			 @PathVariable("option") String option, @PathVariable("search") String search, @PathVariable("group") String category) {
		pager.setCtype(category);
		articleService.count();
		pager.setRowCount(0);
		pager.setPageSize(Integer.parseInt(pageSize));
		pager.setBlockSize(5);
		pager.setNowPage(integer(nowPage));
		pager.setOption(option);
		pager.setSearch(search);
		pager.paging();
		List<Article> list = null;
			
		return list;
	}

	@PutMapping("/")
	public Messenger put(@RequestBody Article article) {
		articleService.edit(article); 
		return Messenger.SUCCESS;
	}

	@DeleteMapping("/{id}")
	public Messenger delete(@PathVariable String id) {
		articleService.remove(id);
		return Messenger.SUCCESS;
	}
		
	

}