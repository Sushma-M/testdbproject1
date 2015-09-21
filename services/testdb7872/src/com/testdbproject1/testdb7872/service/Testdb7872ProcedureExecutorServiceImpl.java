/*Copyright (c) 2015-2016 vcs1.com All Rights Reserved.
 This software is the confidential and proprietary information of vcs1.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with vcs1.com*/


package com.testdbproject1.testdb7872.service;


import java.util.HashMap;
import java.util.Map;
import java.util.Collections;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.wavemaker.runtime.data.model.CustomProcedure;
import com.wavemaker.runtime.data.dao.procedure.WMProcedureExecutor;
import com.wavemaker.runtime.data.exception.QueryParameterMismatchException;

@Service
public class Testdb7872ProcedureExecutorServiceImpl implements Testdb7872ProcedureExecutorService {
	private static final Logger LOGGER = LoggerFactory.getLogger(Testdb7872ProcedureExecutorServiceImpl.class);

	@Autowired
	@Qualifier("testdb7872WMProcedureExecutor")
	private WMProcedureExecutor procedureExecutor;


	@Transactional(value = "testdb7872TransactionManager")
	@Override
	public List<Object> executeWMCustomProcedure(CustomProcedure procedure) {
	    return procedureExecutor.executeCustomProcedure(procedure);
	}


}

