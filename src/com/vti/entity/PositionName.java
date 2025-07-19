package com.vti.entity;

public enum PositionName {
	DEV("dev"), TEST("Test"), SCRUM_MASTER("Scrum master"), PM("PM");

	private String value;

	PositionName(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	// lay enum theo value
	public static PositionName fromValue(String value) {
		for (PositionName positionName : PositionName.values()) {
			if (positionName.getValue().equals(value)) {
				return positionName;
			}
		}
		return null;
	}
}
