package com.xust.easyschool.bean;

import java.util.Date;

public class login {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column login.login_id
     *
     * @mbg.generated Wed Apr 18 21:28:41 CST 2018
     */
    private Integer loginId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column login.login_number
     *
     * @mbg.generated Wed Apr 18 21:28:41 CST 2018
     */
    private Integer loginNumber;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column login.login_pwd
     *
     * @mbg.generated Wed Apr 18 21:28:41 CST 2018
     */
    private String loginPwd;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column login.create_at
     *
     * @mbg.generated Wed Apr 18 21:28:41 CST 2018
     */
    private Date createAt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column login.update_at
     *
     * @mbg.generated Wed Apr 18 21:28:41 CST 2018
     */
    private Date updateAt;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column login.deleted
     *
     * @mbg.generated Wed Apr 18 21:28:41 CST 2018
     */
    private String deleted;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column login.login_id
     *
     * @return the value of login.login_id
     *
     * @mbg.generated Wed Apr 18 21:28:41 CST 2018
     */
    public Integer getLoginId() {
        return loginId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column login.login_id
     *
     * @param loginId the value for login.login_id
     *
     * @mbg.generated Wed Apr 18 21:28:41 CST 2018
     */
    public void setLoginId(Integer loginId) {
        this.loginId = loginId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column login.login_number
     *
     * @return the value of login.login_number
     *
     * @mbg.generated Wed Apr 18 21:28:41 CST 2018
     */
    public Integer getLoginNumber() {
        return loginNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column login.login_number
     *
     * @param loginNumber the value for login.login_number
     *
     * @mbg.generated Wed Apr 18 21:28:41 CST 2018
     */
    public void setLoginNumber(Integer loginNumber) {
        this.loginNumber = loginNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column login.login_pwd
     *
     * @return the value of login.login_pwd
     *
     * @mbg.generated Wed Apr 18 21:28:41 CST 2018
     */
    public String getLoginPwd() {
        return loginPwd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column login.login_pwd
     *
     * @param loginPwd the value for login.login_pwd
     *
     * @mbg.generated Wed Apr 18 21:28:41 CST 2018
     */
    public void setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd == null ? null : loginPwd.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column login.create_at
     *
     * @return the value of login.create_at
     *
     * @mbg.generated Wed Apr 18 21:28:41 CST 2018
     */
    public Date getCreateAt() {
        return createAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column login.create_at
     *
     * @param createAt the value for login.create_at
     *
     * @mbg.generated Wed Apr 18 21:28:41 CST 2018
     */
    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column login.update_at
     *
     * @return the value of login.update_at
     *
     * @mbg.generated Wed Apr 18 21:28:41 CST 2018
     */
    public Date getUpdateAt() {
        return updateAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column login.update_at
     *
     * @param updateAt the value for login.update_at
     *
     * @mbg.generated Wed Apr 18 21:28:41 CST 2018
     */
    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column login.deleted
     *
     * @return the value of login.deleted
     *
     * @mbg.generated Wed Apr 18 21:28:41 CST 2018
     */
    public String getDeleted() {
        return deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column login.deleted
     *
     * @param deleted the value for login.deleted
     *
     * @mbg.generated Wed Apr 18 21:28:41 CST 2018
     */
    public void setDeleted(String deleted) {
        this.deleted = deleted == null ? null : deleted.trim();
    }
}