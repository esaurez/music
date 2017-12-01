package com.att.research.music.main;

public class ReturnType {
	private ResultType result;
	private String message;
	public ReturnType(ResultType result, String message) {
		super();
		this.result = result;
		this.message = message;
	}

	public String getTimingInfo() {
		return timingInfo;
	}

	public void setTimingInfo(String timingInfo) {
		this.timingInfo = timingInfo;
	}

	private String timingInfo;
	public ResultType getResult() {
		return result;
	}
	public String getMessage() {
		return message;
	}
	
	public String toString(){
		return result+" | "+message;
	}
}