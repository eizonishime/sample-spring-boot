package sample.domain;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


import lombok.val;

@Component
@Qualifier("specific")
public class SimpleControllerSpecificBean implements SimpleController {
	
	
	/* (non-Javadoc)
	 * @see sample.domain.SimpleController#getSimpleValue()
	 */
	@Override
	public String getSimpleValue() {
		val newString = "In SimpleControllerSpecificBean";
		
		return newString;
	}
	
	@Override
	public List<String> getListValue() {
		val example = new ArrayList<String>();
		example.add("SimpleControllerSpecificBean.getListValue 1");
		example.add("SimpleControllerSpecificBean.getListValue 2");
		
		return example;
	}

}
