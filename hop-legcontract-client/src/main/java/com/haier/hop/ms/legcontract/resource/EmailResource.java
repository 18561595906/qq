package com.haier.hop.ms.legcontract.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

public interface EmailResource {
	@RequestMapping(value = "/sendEmail", method = RequestMethod.POST)
	public void sendEmail(@RequestParam(value = "host") final String host, @RequestParam(value = "emailUser") String emailUser,
			@RequestParam(value = "pswd") final String pswd, @RequestParam(value = "emailStr") String emailStr, @RequestParam(value = "subject") String subject,
			@RequestParam(value = "htmlText") String htmlText) throws Exception;
}
