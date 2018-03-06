package com.song7749.incident.drs.value;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.song7749.base.AbstractVo;
import com.song7749.incident.drs.type.AuthType;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("회원정보")
public class MemberVo extends AbstractVo {

	private static final long serialVersionUID = -1825545819541825666L;

	@ApiModelProperty("회원번호")
	private Long id;

	@ApiModelProperty("로그인 ID")
	private String loginId;

	@ApiModelProperty("인증키")
	private String certificationKey;

	@ApiModelProperty("패스워드 찾기 질문")
	private String passwordQuestion;

	@ApiModelProperty("팀명칭")
	private String teamName;

	@ApiModelProperty("성명")
	private String name;

	@ApiModelProperty("권한")
	private AuthType authType;

	@ApiModelProperty("가입일")
	@DateTimeFormat(pattern = "yyyy-MM-dd h:i:s")
	private Date createDate;

	@ApiModelProperty("회원정보 수정일")
	@DateTimeFormat(pattern = "yyyy-MM-dd h:i:s")
	private Date modifyDate;

	@ApiModelProperty("최근 로그인 일시")
	@DateTimeFormat(pattern = "yyyy-MM-dd h:i:s")
	private Date lastLoginDate;

	public MemberVo() {}

	/**
	 * @param id
	 * @param loginId
	 * @param certificationKey
	 * @param passwordQuestion
	 * @param teamName
	 * @param name
	 * @param authType
	 * @param createDate
	 * @param modifyDate
	 * @param lastLoginDate
	 */
	public MemberVo(Long id, String loginId, String certificationKey, String passwordQuestion, String teamName,
			String name, AuthType authType, Date createDate, Date modifyDate, Date lastLoginDate) {
		this.id = id;
		this.loginId = loginId;
		this.certificationKey = certificationKey;
		this.passwordQuestion = passwordQuestion;
		this.teamName = teamName;
		this.name = name;
		this.authType = authType;
		this.createDate = createDate;
		this.modifyDate = modifyDate;
		this.lastLoginDate = lastLoginDate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getCertificationKey() {
		return certificationKey;
	}

	public void setCertificationKey(String certificationKey) {
		this.certificationKey = certificationKey;
	}

	public String getPasswordQuestion() {
		return passwordQuestion;
	}

	public void setPasswordQuestion(String passwordQuestion) {
		this.passwordQuestion = passwordQuestion;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public AuthType getAuthType() {
		return authType;
	}

	public void setAuthType(AuthType authType) {
		this.authType = authType;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getModifyDate() {
		return modifyDate;
	}

	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}

	public Date getLastLoginDate() {
		return lastLoginDate;
	}

	public void setLastLoginDate(Date lastLoginDate) {
		this.lastLoginDate = lastLoginDate;
	}
}