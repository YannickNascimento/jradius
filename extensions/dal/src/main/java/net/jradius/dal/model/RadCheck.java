package net.jradius.dal.model;

import com.coova.dal.Record;

public class RadCheck extends Record {
    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column radcheck.id
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    private Long id;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column radcheck.username
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    private String username = "";

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column radcheck.attribute
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    private String attribute = "";

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column radcheck.op
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    private String op = "==";

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database column radcheck.value
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    private String value = "";

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column radcheck.id
     *
     * @return the value of radcheck.id
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column radcheck.id
     *
     * @param id the value for radcheck.id
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column radcheck.username
     *
     * @return the value of radcheck.username
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column radcheck.username
     *
     * @param username the value for radcheck.username
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column radcheck.attribute
     *
     * @return the value of radcheck.attribute
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    public String getAttribute() {
        return attribute;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column radcheck.attribute
     *
     * @param attribute the value for radcheck.attribute
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    public void setAttribute(String attribute) {
        this.attribute = attribute == null ? null : attribute.trim();
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column radcheck.op
     *
     * @return the value of radcheck.op
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    public String getOp() {
        return op;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column radcheck.op
     *
     * @param op the value for radcheck.op
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    public void setOp(String op) {
        this.op = op == null ? null : op.trim();
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method returns the value of the database column radcheck.value
     *
     * @return the value of radcheck.value
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    public String getValue() {
        return value;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method sets the value of the database column radcheck.value
     *
     * @param value the value for radcheck.value
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }

    public Record synchronizedRecord() {
        return new SynchronizedRadCheck(this);
    }
}