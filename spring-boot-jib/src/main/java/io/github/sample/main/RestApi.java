package io.github.sample.main;

import javax.validation.constraints.NotNull;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import io.github.sample.common.CommonBean;

@RestController
public class RestApi {

	private final CommonBean commonBean;

	public RestApi(CommonBean commonBean) {
		this.commonBean = commonBean;
	}

	@GetMapping(value = "/echo/{text}")
	public ResponseEntity test(@NotNull @PathVariable String text) {
		return ResponseEntity.ok(text);
	}

	@GetMapping
	public ResponseEntity hello() {
		return ResponseEntity.ok(commonBean.sayHelloRandom());
	}
}
