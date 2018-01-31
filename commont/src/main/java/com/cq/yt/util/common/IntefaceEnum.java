package com.cq.yt.util.common;
/**
 * 接口常量类
 * @author ranpok
 * 1-49 为系统参数
 */
public enum IntefaceEnum {
		/**(code:100001,desc:请求失败)*/
	 	ERROR("100001","请求失败"),
	 	/**(code:100002,desc:请求异常,联系管理员)*/
	 	ERROR_500("100002","请求异常,联系管理员"),
	 	/**(code:000000,desc:请求成功)*/
	    SUCCESS("000000","请求成功"),
	 	/**(code:100002,desc:参数请求错误)*/
	    PARAM_ERROR("100002","参数请求错误"),
	    /**(code:100003,desc:登录超时)*/
	    SESSION_ERROR("100003","登录超时"),
		/**(code:100004,desc:保存超时)*/
	    SAVE_ERROR("100004","保存超时"),

	    
		//100-511为http 状态码
		// --- 4xx Client Error ---
		http_status_bad_request("400", "Bad Request"),
		http_status_unauthorized("401", "Unauthorized"),
		http_status_payment_required("402", "Payment Required"),
		http_status_forbidden("403", "Forbidden"),
		http_status_not_found("404", "Not Found"),

		// --- 5xx Server Error ---
		http_status_internal_server_error("500", "系统错误"),

		// -1为通用失败（根据ApiResult.java中的构造方法注释而来）
		FAIL("-1", "common fail"),
		/**(code:3,desc:非法图片文件！)*/
		error_pic_file("3","非法图片文件"),
		/**(code:4,desc:图片上传失败！)*/
		error_pic_upload("4","图片上传失败"),
		/**(code:5,desc:没有找到对应的数据！)*/
		error_record_not_found("5", "没有找到对应的数据"),
		/**(code:6,desc:请求记录数超出每次请求最大允许值！)*/
		error_max_page_size("6", "请求记录数超出每次请求最大允许值"),
		/**(code:7,desc:新增失败！)*/
		error_create_failed("7","新增失败"),
		/**(code:8,desc:修改失败！)*/
		error_update_failed("8","修改失败"),
		/**(code:9,desc:删除失败！)*/
		error_delete_failed("9","删除失败"),
		/**(code:10,desc:查询失败！)*/
		error_search_failed("10","查询失败"),
		/**(code:11,desc:查询数据总数失败！)*/
		error_count_failed("11","查询数据总数失败"),
		/**(code:12,desc:字符串转java对象失败！)*/
		error_string_to_obj("12","字符串转java对象失败"),
		/**(code:13,desc:参数不合法！)*/
		error_invalid_argument("13","参数不合法"),
		/**(code:14,desc:更新失败：%s！)*/
		error_update_not_allowed("14","更新失败：%s"),
		/**(code:15,desc:数据已存在！)*/
		error_duplicated_data("15","数据已存在"),
		/**(code:16,desc:未知数据库操作失败，请联系管理员解决！)*/
		error_unknown_database_operation("16","未知数据库操作失败，请联系管理员解决"),
		/**(code:17,desc:字段s%违反唯一约束性条件！)*/
		error_column_unique("17","字段s%违反唯一约束性条件"),
		/**(code:18,desc:文件下载失败！)*/
		error_file_download("18","文件下载失败"),
		/**(code:19,desc:文件上传失败！)*/
		error_file_upload("19","文件上传失败"),
		/**(code:20,desc:非法请求参数！)*/
		illicit_req_params("20","非法请求参数"),
		/**(code:21,desc:类型不匹配!)*/
		type_unmap("21","类型不匹配!"),
		/**(code:22,desc:新密码与确认密码不一致！)*/
		error_pwd_mismatch("22","新密码与确认密码不一致！"),
		/**(code:23,desc:原密码错误！)*/
		error_pwd_original("23","原密码错误！"),

		/**(code:50,desc:删除成功！)*/
		REGISTER_50("50","删除成功！"),
		/**(code:51,desc:新增成功！)*/
		REGISTER_51("51","新增成功！"),
		/**(code:52,desc:数据查询为null！)*/
		REGISTER_52("52","数据查询为null！"),
		/**(code:53,desc:操作失败！)*/
		REGISTER_53("52","操作失败！"),
		/**(code:54,desc:设置成功！)*/
		REGISTER_54("54","设置成功！"),
		/**(code:55,desc:退出成功！)*/
		REGISTER_55("55","退出成功！"),
		/**(code:56,desc:更新成功！)*/
		REGISTER_56("56","更新成功！"),
		/**(code:57,desc:操作成功！)*/
		REGISTER_57("57","操作成功！"),
		
		//图片处理
		image_size("570","上传图片不能超过10M"),
		image_error("571","上传图片格式错误,支持的格式:jpg,png,jpeg,gif,bmp"),

		//1000以内是系统错误，
		no_login("1000","没有登录"),
		config_error("1001","参数配置表错误"),
		user_exist("1002","用户名已存在"),
		userpwd_not_exist("1003","用户名不存在或者密码错误"),
		login_succss("1004","登录成功"),

		/**
		 * 订单状态
		 */
		order_status("102","已支付"),

	    /**(code:050,desc:修改成功！)*/
	    REGISTER_050("050","修改成功！"),
	    /**(code:051,desc:账号错误，请重新输入！)*/
	    REMINDER_051("051","账号错误，请重新输入！"),
	    /**(code:052,desc:账号验证正确！)*/
	    REMINDER_052("052","账号验证正确！")
	    ;

	 	//状态
	 	private String code;
	    private String desc;
	    
	    IntefaceEnum(String code, String desc){
	        this.setCode(code);
	        this.desc = desc;
	    }

	    public String getCode() {
	        return code;
	    }

	    public void setCode(String code) {
	        this.code = code;
	    }

		public String getDesc() {
			return desc;
		}

		public void setDesc(String desc) {
			this.desc = desc;
		}
	    
}
