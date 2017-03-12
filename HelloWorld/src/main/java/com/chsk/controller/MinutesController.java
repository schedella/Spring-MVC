package com.chsk.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chsk.model.Activity;
import com.chsk.model.Exercise;

@Controller
public class MinutesController {

	/*@RequestMapping(value="/addMinutes")
	public String addMinutes(@ModelAttribute ("exercise") Exercise exercise){
		
		System.out.println("Exercise addMinutes : " + exercise.getMinutes());
		return "forward:addMoreMinutes.html"; // same request will be forwarded
		return "redirect:addMoreMinutes.html";
	}
	
	@RequestMapping(value="/addMoreMinutes")
	public String addMoreMinutes(@ModelAttribute ("exercise") Exercise exercise){
		
		System.out.println("Exercise addMoreMinutes : " + exercise.getMinutes());
		return "addMinutes";
	}*/
	
	@RequestMapping(value="/addMinutes")
	public String addMinutes(@ModelAttribute ("exercise") Exercise exercise){
		
		System.out.println("Exercise addMinutes : " + exercise.getMinutes());
		return "addMinutes";
	}
	
	@RequestMapping(value="/activities", method = RequestMethod.GET)
	public @ResponseBody List<Activity> findAllActivities(){
		List<Activity> activities = new ArrayList<Activity>();
		
		Activity run = new Activity();
		run.setDesc("Run");
		activities.add(run);
		
		Activity bike = new Activity();
		bike.setDesc("Bike");
		activities.add(bike);
		
		Activity swim = new Activity();
		swim.setDesc("Swim");
		activities.add(swim);
		
		return activities;
	}
}
