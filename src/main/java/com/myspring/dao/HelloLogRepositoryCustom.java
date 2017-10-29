package com.myspring.dao;

import java.util.List;

import com.myspring.model.HelloLog;

public interface HelloLogRepositoryCustom {
	List<HelloLog> findByAVeryComplicatedQuery(Long id, String name);
}
