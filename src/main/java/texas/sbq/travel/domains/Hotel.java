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
public class Hotel {		
	private String hotelSeq, name,image, area, information, phoneNum, locationSeq;
	 public Hotel(String name, String image,String locationSeq, 
			  String area, String information,String phoneNum) { 
	  this.name = name;
	  this.locationSeq =locationSeq;
	  this.image = image;
	  this.area = area;
	  this.information = information;
	  this.phoneNum = phoneNum;
	  }
	 


	
}