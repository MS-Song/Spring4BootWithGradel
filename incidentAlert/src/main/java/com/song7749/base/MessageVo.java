package com.song7749.base;

import java.sql.Date;
import java.sql.Time;

import com.fasterxml.jackson.annotation.JsonFormat;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <pre>
 * Class Name : Message.java
 * Description : Client 에 보내는 메세지를 정의 한다.
*
*
*  Modification Information
*  Modify Date 		Modifier				Comment
*  -----------------------------------------------
*  2018. 3. 7.		song7749@gmail.com		NEW
 *
 * </pre>
 *
 * @author song7749@gmail.com
 * @since 2018. 3. 7.
 */

@ApiModel("response wrapper")
public class MessageVo extends AbstractVo {

	private static final long serialVersionUID = -1400334184587170703L;

	/**
	 * <pre>
	 * http 상태 코드.
	 * HttpServletResponse의 상수사용
	 * =============================
	 * 200 - OK
	 * 400 - Bad Request
	 * 500 - Internal Server Error
	 * 201 - Created
	 * 304 - Not Modified
	 * 404 - Not Found
	 * 401 - Unauthorized
	 * 403 - Forbidden
	 * =============================
	 * </pre>
	 *
	 * <code>
	 * Response.setStatus(HttpStatus.OK)
	 * </code>
	 */
	@ApiModelProperty("HttpStatus")
	private int httpStatus;

	/**
	 * work database row or work Object count
	 */
	private Integer rowCount;

	/**
	 * return contents
	 */
	private Object contents;

	/**
	 * error message
	 */
	private String message;

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-dd-MM")
	@ApiModelProperty(value = "api call date")
	private Date date = new Date(System.currentTimeMillis());

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "hh:mm:ss")
	@ApiModelProperty(value = "api call time")
	private Time time = new Time(System.currentTimeMillis());

	public MessageVo() {
	}

	/**
	 * @param httpStatus
	 * @param message
	 */
	public MessageVo(Integer httpStatus, String message) {
		this.httpStatus = httpStatus;
		this.message = message;
	}

	/**
	 * @param httpStatus
	 * @param contents
	 */
	public MessageVo(Integer httpStatus, Object contents) {
		this.httpStatus = httpStatus;
		this.contents = contents;
	}

	/**
	 * @param httpStatus
	 * @param contents
	 * @param message
	 */
	public MessageVo(Integer httpStatus, Object contents, String message) {
		this.httpStatus = httpStatus;
		this.contents = contents;
		this.message = message;
	}

	/**
	 * @param httpStatus
	 * @param message
	 * @param affectedRows
	 */
	public MessageVo(Integer httpStatus, String message, Integer rowCount) {
		this.httpStatus = httpStatus;
		this.message = message;
		this.rowCount = rowCount;
	}

	/**
	 * @param httpStatus
	 * @param rowCount
	 * @param contents
	 */
	public MessageVo(int httpStatus, Integer rowCount, Object contents) {
		this.httpStatus = httpStatus;
		this.rowCount = rowCount;
		this.contents = contents;
	}

	public int getHttpStatus() {
		return httpStatus;
	}

	public void setHttpStatus(int httpStatus) {
		this.httpStatus = httpStatus;
	}

	public Integer getRowCount() {
		return rowCount;
	}

	public void setRowCount(Integer rowCount) {
		this.rowCount = rowCount;
	}

	public Object getContents() {
		return contents;
	}

	public void setContents(Object contents) {
		this.contents = contents;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Date getDate() {
		return date;
	}

	public Time getTime() {
		return time;
	}
}