package dby.common;

/**
 * 
 * Title: ResponseCode Description: 状态码枚举类
 * 
 * @author 董博源
 * @date 2019/11/25 13:45:35
 */
public enum ResponseCode {
	SUCESS(0, "SUCCESS"), ERROR(1, "REEOR"), NEED_LOGIN(10, "NEED_LOGIN"), ILLEGAL_ARGUMENT(2, "ILLEGAL_ARGUMENT");

	private final int code;
	private final String desc;

	ResponseCode(int code, String desc) {
		this.code = code;
		this.desc = desc;
	}

	public int getCode() {
		return code;
	}

	public String getDesc() {
		return desc;
	}

	

}
