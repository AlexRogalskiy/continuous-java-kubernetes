package io.github.sample.common;

import java.util.UUID;

import org.springframework.stereotype.Service;

/**
 * @author romeh
 */
@Service
public class CommonBean {

	public String sayHelloRandom(){
		return "Hello: "+ UUID.randomUUID();

	}
}
