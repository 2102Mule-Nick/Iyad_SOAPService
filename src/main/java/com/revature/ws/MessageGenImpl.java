package com.revature.ws;

import javax.jws.WebService;

@WebService(endpointInterface = "com.revature.ws.MessageGen",
serviceName = "messageGenService")
public class MessageGenImpl implements MessageGen {

	@Override
	public String getMessage() {
		return "Hi Brian....";
	}

	@Override
	public String getAnotherMessage() {
		return "Hello from another message......";
	}

}
