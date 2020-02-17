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
public class Room {
	private String roomSeq,image,roomType, hotelSeq;
	private int price;
	public Room(String roomType,  
			String image, int price, String hotelSeq) {
		this.roomType=roomType;
		this.image=image;
		this.price=price;
		this.hotelSeq=hotelSeq;
	}
}