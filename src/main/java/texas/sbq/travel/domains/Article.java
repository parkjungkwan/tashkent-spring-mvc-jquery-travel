package texas.sbq.travel.domains;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data 
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Article {
	private String articleSeq, 
	userid, image, title, content, tourismSeq, festivalSeq, modifyDate, category;
}
	