package com.revature.ws;

import javax.jws.WebService;

@WebService(endpointInterface = "com.revature.ws.TestingGen",
serviceName = "testingGenService")
public class TestingGenImpl implements TestingGen {

	@Override
	public String getTestingMessage() {
		return "Hello from TesingGenImpl class and getTestingMessage()";
	}

}
