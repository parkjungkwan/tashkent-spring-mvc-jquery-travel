package texas.sbq.travel.domains;


import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Component
@NoArgsConstructor
@Lazy
public class Tourism {
	private String tourismSeq, 
	title, area, information, phoneNum, image,
	locationSeq;
	
}
