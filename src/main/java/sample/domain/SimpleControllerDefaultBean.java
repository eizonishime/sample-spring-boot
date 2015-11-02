package sample.domain;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import lombok.val;

@Component
@Qualifier("default")
public class SimpleControllerDefaultBean implements SimpleController {
	
	
	/* (non-Javadoc)
	 * @see sample.domain.SimpleController#getSimpleValue()
	 */
	@Override
	public String getSimpleValue() {
		val newString = "In SimpleControllerBean";
		
		return newString;
	}
	
	@Override
	public List<String> getListValue() {
		val example = new ArrayList<String>();
		example.add("SimpleControllerDefaultBean.getListValue 1");
		example.add("SimpleControllerDefaultBean.getListValue 2");
		
		return example;
	}

}
