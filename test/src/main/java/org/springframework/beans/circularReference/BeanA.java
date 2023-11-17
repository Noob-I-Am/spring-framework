package org.springframework.beans.circularReference;

import org.springframework.stereotype.Component;

@Component
public interface BeanA {

	public void helloBeanB();
}
