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
public class Opinion {
	private String opinionSeq,opinion, userid, rating, hotelSeq;
	public Opinion( String opinion, String rating,String userid, String hotelSeq){
		this.opinion = opinion;
		this.userid = userid;
		this.rating = rating;
		this.hotelSeq = hotelSeq;
	}
}
