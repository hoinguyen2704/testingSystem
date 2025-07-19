package com.vti.entity;

public class Position {
	private Integer positionId;
	private PositionName name;

	public Position(Integer positionId, String positionName) {
		this.positionId = positionId;
		this.name = PositionName.valueOf(positionName.toUpperCase().replace("-", "_"));
	}

	public Integer getPositionId() {
		return positionId;
	}

	public void setPositionId(Integer positionId) {
		this.positionId = positionId;
	}

	public PositionName getName() {
		return name;
	}

	public void setName(PositionName name) {
		this.name = name;
	}

	public String getPositionName() {
		return name.toString();
	}
}
