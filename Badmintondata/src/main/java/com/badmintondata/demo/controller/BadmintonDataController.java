package com.badmintondata.demo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.badmintondata.demo.model.sports;
import com.badmintondata.demo.service.BadmintonDataService;

@RestController
public class BadmintonDataController {
	@Autowired
	BadmintonDataService badmintonService;
	@GetMapping(value="/fetchdata")
	public List<sports>getAllDatas(){
		List<sports>dataList=badmintonService.getAllDatas();
		return dataList;
	}
	
	@PostMapping(value="/saveBadmintonData")
	public sports saveBadmintonData(@RequestBody sports t)
	{
		return badmintonService.saveBadmintonData(t);
	}
	@PutMapping(value="/updateBadmintonData")
	public sports updateBadmintonData(@RequestBody sports t)
	{
		return badmintonService.saveBadmintonData(t);
	}
	@DeleteMapping(value="/deleteBadmintonData/{id}")
	public void deleteBadmintonData(@PathVariable("id") int playerID)
	{
		badmintonService.deleteBadmintonData(playerID);
	}
	
	@GetMapping("/pagesort/{pageno}/{pagesize}")
	public List<sports>getdetails (@RequestParam int pageno,@RequestParam int pagesize){
		return badmintonService.getdetails(pageno, pagesize);
	}
	@PostMapping("/login")
	public String login(@RequestBody Map<String,String> loginDataMap)
	{
		String username = loginDataMap.get("username");
		String password = loginDataMap.get("password");
		String result = badmintonService.loginCheckData(username, password);
		return result;
	}
}
