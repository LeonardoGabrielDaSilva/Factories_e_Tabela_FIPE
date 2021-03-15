package Fabricas;

import java.net.URL;
import java.util.List;

public interface IFactory {

	public List<?> criar(URL url);
}
