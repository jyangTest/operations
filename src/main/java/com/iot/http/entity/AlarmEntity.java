package com.iot.http.entity;

import org.apache.ibatis.type.Alias;

import java.util.Date;

/**
 * Created by XiaoJiang01 on 2017/4/13.
 */
//@Alias("AlarmEntity")
public class AlarmEntity {
    private int id;
    private int deviceId;
    private Date startTime;
    private Date endTime;
    private int status;
    private int confirm;
    private String name;
    private String describes;
    private String systemName;
    private String locationName;
    private String roomName;
    private String groupName;

    public AlarmEntity() {
    }

    public AlarmEntity(int id, int deviceId, Date startTime, Date endTime, String name, int status, int confirm, String describes,String systemName,String locationName,String roomName,String groupName) {
        this.id = id;
        this.deviceId = deviceId;
        this.setStartTime(startTime);
        this.endTime = endTime;
        this.status = status;
        this.confirm = confirm;
        this.name = name;
        this.describes = describes;
        this.systemName = systemName;
        this.locationName = locationName;
        this.roomName = roomName;
        this.groupName = groupName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(int deviceId) {
        this.deviceId = deviceId;
    }

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getConfirm() {
		return confirm;
	}

	public void setConfirm(int confirm) {
		this.confirm = confirm;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescribes() {
		return describes;
	}

	public void setDescribes(String describes) {
		this.describes = describes;
	}

	public String getSystemName() {
		return systemName;
	}

	public void setSystemName(String systemName) {
		this.systemName = systemName;
	}

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	public String getRoomName() {
		return roomName;
	}

	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
}
