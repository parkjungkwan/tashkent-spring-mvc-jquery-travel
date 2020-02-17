package texas.sbq.travel.domains;

import java.util.List;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Lazy
@Component
@AllArgsConstructor
@NoArgsConstructor
public class Location {
	private int locationSeq;
	private String address, latitude, longitude;
	private List<Location> locations;
	public Location(String address, String latitude) {
		this.address = address;
		this.latitude = latitude;
	}
}
