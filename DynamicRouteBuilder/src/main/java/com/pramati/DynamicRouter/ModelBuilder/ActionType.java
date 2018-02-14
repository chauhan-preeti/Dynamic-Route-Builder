package com.pramati.DynamicRouter.ModelBuilder;

public enum ActionType{

	ACTION_ONE("LEAVETYPE"), ACTION_TWO("TRAVELTYPE");

	private final String actionType;

	ActionType(String actionType) {
		this.actionType = actionType;
	}

	public String getActionType() {
		return this.actionType;
	}

}
