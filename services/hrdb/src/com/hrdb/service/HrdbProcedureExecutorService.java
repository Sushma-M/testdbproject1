/*Copyright (c) 2015-2016 vcs1.com All Rights Reserved.
 This software is the confidential and proprietary information of vcs1.com You shall not disclose such Confidential Information and shall use it only in accordance
 with the terms of the source code license agreement you entered into with vcs1.com*/


package com.hrdb.service;

import java.util.Map;
import java.util.List;


import com.wavemaker.runtime.data.model.CustomProcedure;
import com.wavemaker.runtime.data.exception.QueryParameterMismatchException;

public interface HrdbProcedureExecutorService {

	
	List<Object> executeWMCustomProcedure(CustomProcedure procedure) ;


}

