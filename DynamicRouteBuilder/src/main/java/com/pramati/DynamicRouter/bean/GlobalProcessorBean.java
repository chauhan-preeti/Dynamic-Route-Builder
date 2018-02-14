package com.pramati.DynamicRouter.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pramati.DynamicRouter.ModelBuilder.ActionType;
import com.pramati.DynamicRouter.ModelBuilder.Constants;
import com.pramati.DynamicRouter.impl.GlobalProcessorImpl;
import com.pramati.DynamicRouter.impl.LeaveProcessorImpl;

@Component("globalProcessorBean")
public class GlobalProcessorBean {
	
	@Autowired
	GlobalProcessorImpl objGlobalProcessorImpl;
	
	@Autowired
	LeaveProcessorImpl objLeaveProcessorImpl;
	
	private Logger log = LoggerFactory.getLogger(GlobalProcessorBean.class);

	public void process(String input) throws Exception {
		if (input == null && !input.isEmpty() ) {
			throw new Exception("Please enter some message");
		} else {
			String type="";
			type=objGlobalProcessorImpl.getActionType();	
			if(type != null && !type.isEmpty())
			{
				if(type.equals(Constants.LEAVE_TYPE))
				{
					objLeaveProcessorImpl.doAction();
				}
			}
		}
	}

}
