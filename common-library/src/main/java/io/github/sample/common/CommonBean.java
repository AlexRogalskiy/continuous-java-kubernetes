package io.github.sample.common;

import java.util.UUID;

import org.springframework.stereotype.Service;

/**
 * @author romeh
 */
@Service
public class CommonBean {

	public String sayHelloRandom(){
		final String response = "Hello User2: " + UUID.randomUUID().toString();
		System.out.println(response);
		return response;
	}
}
