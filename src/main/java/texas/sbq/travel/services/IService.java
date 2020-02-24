package texas.sbq.travel.services;

import java.util.List;

import org.springframework.stereotype.Component;
@Component
public interface IService {
	public void save(Object o);
	public String count(Object o);
	public List<?> list(Object o);
	public Object detail(Object o);
	public void edit(Object o);
	public void remove(Object o);
}
