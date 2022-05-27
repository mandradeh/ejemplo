/**
 * 
 */
package com.ejemplo.escuela.demo.pojo;

/**
 * @author Admin
 *
 */
public class RespuestaEscuela {

	private String success;
	private String msg;
	
	public RespuestaEscuela() {
		super();
		this.success = "";
		this.msg = "";
	}
	

	public RespuestaEscuela(String success, String msg) {
		super();
		this.success = success;
		this.msg = msg;
	}


	public String getSuccess() {
		return success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	@Override
	public String toString() {
		return "RespuestaEscuela [success=" + success + ", msg=" + msg + "]";
	}
	
}
