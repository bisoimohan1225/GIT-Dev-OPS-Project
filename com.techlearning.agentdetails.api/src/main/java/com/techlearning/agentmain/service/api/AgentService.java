package com.techlearning.agentmain.service.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AgentService {

	@Autowired
	private AgentRepository agentRepo;
	
	public List<Agent> getAgents() {
		List<Agent> agents= new ArrayList<>();
		agentRepo.findAll().forEach(agents::add);
		return agents;
	}
	
	
	public void addAgent(Agent agent) {
		agentRepo.save(agent);
	}



}
