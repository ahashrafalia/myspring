package com.myspring.service;

import java.util.List;

import com.myspring.model.HelloLog;

public interface IHelloService  extends ICRUDService<HelloLog>{

	public List<HelloLog> findByAVeryComplicatedQuery(Long id, String name) ;
		
}
