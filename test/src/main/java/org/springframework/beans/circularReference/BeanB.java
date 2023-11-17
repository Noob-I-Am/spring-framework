package org.springframework.beans.circularReference;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public interface BeanB {
	void helloBeanA();
}
