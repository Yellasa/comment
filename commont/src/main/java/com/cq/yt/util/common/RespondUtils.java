package com.cq.yt.util.common;


/**
 * 数据返回封装类
 * @author ranpok
 *
 */
public final class RespondUtils {
	/**
	 * 
	 * @param errorMsg 错误信息
	 * @param result 返回结果
	 * @param returnCode返回结果编码 
	 * @return 响应参数PO
	 */
	public static Respond respond(String errorMsg,Object result,String returnCode){
		Respond respond=new Respond();
		respond.setErrorMsg(errorMsg);
		respond.setResult(result);
		respond.setReturnCode(returnCode);
		return respond;
	}
}
