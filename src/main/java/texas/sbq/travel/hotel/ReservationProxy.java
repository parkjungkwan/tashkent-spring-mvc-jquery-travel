package texas.sbq.travel.hotel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;
import texas.sbq.travel.mapper.HotelMapper;

@Data
@Component
public class ReservationProxy {
	@Autowired HotelMapper hotelMapper;
}
