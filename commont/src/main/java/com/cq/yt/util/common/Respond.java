package com.cq.yt.util.common;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;

/**
 * 响应参数PO
 * @author ranpok
 *
 */
public class Respond implements Serializable  {
	private static final long serialVersionUID = -4215186135280197349L;
	/* 错误信息*/
	private String errorMsg;
	/* 返回结果*/
	private Object result;
	/* 返回结果编码 */
	private String returnCode;

	private long currentTime;
	/*
	 * 页面信息
	 * */
	private HashMap<String,Object> pageMap;
	
	public HashMap<String, Object> getPageMap() {
		return pageMap;
	}
	public void setPageMap(HashMap<String, Object> pageMap) {
		this.pageMap = pageMap;
	}
	public String getErrorMsg() {
		return errorMsg;
	}
	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	public Object getResult() {
		return result;
	}
	public void setResult(Object result) {
		this.result = result;
	}
	public String getReturnCode() {
		return returnCode;
	}
	public void setReturnCode(String returnCode) {
		this.returnCode = returnCode;
	}

	public long getCurrentTime()
	{
		return currentTime;
	}

	public void setCurrentTime(long currentTime)
	{
		this.currentTime = currentTime;
	}

	@Override
	public String toString() {
		return "RespondPo [errorMsg=" + errorMsg + ", result=" + result
				+ ", returnCode=" + returnCode + "]";
	}

	public Respond()
	{
	}

	/**
	 * 不带数据的返回集,页面信息需要自己填写
	 */
	public Respond(IntefaceEnum intefaceEnum)
	{
		this.errorMsg = intefaceEnum.getDesc();
		this.returnCode = intefaceEnum.getCode();
		this.currentTime = new Date().getTime();
    }

	/**
	 * 带数据的返回，但页面信息需要自己填写
	 * @param intefaceEnum
	 * @param result
	 */
	public Respond(IntefaceEnum intefaceEnum,Object result)
	{
		this.errorMsg =	intefaceEnum.getDesc();
		this.result = result;
		this.returnCode = intefaceEnum.getCode();
		this.currentTime = new Date().getTime();
	}
}