package com.techlearning.agentmain.service.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AgentController {

	@Autowired
	private AgentService agentService;
	
	@RequestMapping("/getagent")
	public List<Agent> getAgents(){
		return agentService.getAgents();
		
	}
	@RequestMapping(method = RequestMethod.POST, value="/agent")	
	public void addAgent(@RequestBody Agent agent) {
		agentService.addAgent(agent);
	}
	

}
