package com.badmintondata.demo.service;

import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.badmintondata.demo.dao.BadmintonDataRepository;
import com.badmintondata.demo.model.sports;

@Service
public class BadmintonDataService {
	@Autowired
	BadmintonDataRepository dataRepository;
	public List<sports> getAllDatas () {
		List<sports>dataList=dataRepository.findAll();
		return dataList;
	}
	public sports saveBadmintonData(sports t)
	{
		sports obj=dataRepository.save(t);
		return obj;
	}
	public sports updateBadmintonData(sports t)
	{
		sports obj=dataRepository.save(t);
		return obj;
	}
	public void deleteBadmintonData(int sno)
	{
		dataRepository.deleteById(sno);
	}
	public List<sports> getdetails(int pageno, int pagesize) {
		// TODO Auto-generated method stub
		Pageable page=PageRequest.of(pageno, pagesize,Direction.DESC,"id");
		return dataRepository.findAll(page).getContent() ;
	}
	public String loginCheckData(String username,String password)
	{
		sports user = dataRepository.findByusername(username);
		if(user == null)
		{
			return "No User Found/nPlease Try Again!!!!";
		}
		else
		{
			if(user.getPassword().equals(password))
			{
				return "Login Successful";
			}
			else
			{
				return "Login Failed";
			}
		}
	}

}
