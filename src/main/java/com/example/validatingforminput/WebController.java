package com.example.validatingforminput;

import java.util.HashMap;
import javax.validation.Valid;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("getSyainInfo")
public class WebController {

	@RequestMapping(method = RequestMethod.GET)
	public String getSyainInfo() {
		return "SyainInfo";
	}

}
