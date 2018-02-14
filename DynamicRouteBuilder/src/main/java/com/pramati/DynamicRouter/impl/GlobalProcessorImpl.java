package com.pramati.DynamicRouter.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.pramati.DynamicRouter.ModelBuilder.GlobalProcessor;

public class GlobalProcessorImpl implements GlobalProcessor {
	
	private Logger log = LoggerFactory.getLogger(GlobalProcessorImpl.class);
	
	public String getActionType()
	{
		String actionType="LEAVETYPE";
		
		return actionType;
	}

}
