package net.jradius.dal.model;

import com.coova.dal.Example;
import com.coova.dal.ExampleCriteria;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UIHelpExample extends Example {
    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database table uihelp
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    protected String orderByClause;

    protected Integer startRow;

    protected Integer rowCount;

    /**
     * This field was generated by Abator for iBATIS.
     * This field corresponds to the database table uihelp
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table uihelp
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    public UIHelpExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table uihelp
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    protected UIHelpExample(UIHelpExample example) {
        this.orderByClause = example.orderByClause;
        this.oredCriteria = example.oredCriteria;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table uihelp
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public void setStartRow(Integer startRow) {
        this.startRow = startRow;
    }

    public void setRowCount(Integer rowCount) {
        this.rowCount = rowCount;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table uihelp
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    public Integer getStartRow() {
        return startRow;
    }

    public Integer getRowCount() {
        return rowCount;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table uihelp
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table uihelp
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table uihelp
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table uihelp
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    public Criteria appendCriteria() {
        if (oredCriteria.size() == 0) {
            return createCriteria();
        }
        return oredCriteria.get(0);
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table uihelp
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by Abator for iBATIS.
     * This method corresponds to the database table uihelp
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    public void clear() {
        oredCriteria.clear();
    }

    /**
     * This class was generated by Abator for iBATIS.
     * This class corresponds to the database table uihelp
     *
     * @abatorgenerated Wed Sep 10 13:54:28 CEST 2008
     */
    public static class Criteria extends ExampleCriteria {
        protected List<String> criteriaWithoutValue;

        protected List<Map<String, Object>> criteriaWithSingleValue;

        protected List<Map<String, Object>> criteriaWithListValue;

        protected List<Map<String, Object>> criteriaWithBetweenValue;

        protected Criteria() {
            super();
            criteriaWithoutValue = new ArrayList<String>();
            criteriaWithSingleValue = new ArrayList<Map<String, Object>>();
            criteriaWithListValue = new ArrayList<Map<String, Object>>();
            criteriaWithBetweenValue = new ArrayList<Map<String, Object>>();
        }

        public boolean isValid() {
            return criteriaWithoutValue.size() > 0
                || criteriaWithSingleValue.size() > 0
                || criteriaWithListValue.size() > 0
                || criteriaWithBetweenValue.size() > 0;
        }

        public List<String> getCriteriaWithoutValue() {
            return criteriaWithoutValue;
        }

        public List<Map<String, Object>> getCriteriaWithSingleValue() {
            return criteriaWithSingleValue;
        }

        public List<Map<String, Object>> getCriteriaWithListValue() {
            return criteriaWithListValue;
        }

        public List<Map<String, Object>> getCriteriaWithBetweenValue() {
            return criteriaWithBetweenValue;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteriaWithoutValue.add(condition);
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("condition", condition);
            map.put("value", value);
            criteriaWithSingleValue.add(map);
        }

        protected void addCriterion(String condition, List<? extends Object> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("condition", condition);
            map.put("values", values);
            criteriaWithListValue.add(map);
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            List<Object> list = new ArrayList<Object>();
            list.add(value1);
            list.add(value2);
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("condition", condition);
            map.put("values", list);
            criteriaWithBetweenValue.add(map);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return this;
        }

        public Criteria andKeyidIsNull() {
            addCriterion("keyid is null");
            return this;
        }

        public Criteria andKeyidIsNotNull() {
            addCriterion("keyid is not null");
            return this;
        }

        public Criteria andKeyidEqualTo(String value) {
            addCriterion("keyid =", value, "keyid");
            return this;
        }

        public Criteria andKeyidNotEqualTo(String value) {
            addCriterion("keyid <>", value, "keyid");
            return this;
        }

        public Criteria andKeyidGreaterThan(String value) {
            addCriterion("keyid >", value, "keyid");
            return this;
        }

        public Criteria andKeyidGreaterThanOrEqualTo(String value) {
            addCriterion("keyid >=", value, "keyid");
            return this;
        }

        public Criteria andKeyidLessThan(String value) {
            addCriterion("keyid <", value, "keyid");
            return this;
        }

        public Criteria andKeyidLessThanOrEqualTo(String value) {
            addCriterion("keyid <=", value, "keyid");
            return this;
        }

        public Criteria andKeyidLike(String value) {
            addCriterion("keyid like", value, "keyid");
            return this;
        }

        public Criteria andKeyidNotLike(String value) {
            addCriterion("keyid not like", value, "keyid");
            return this;
        }

        public Criteria andKeyidIn(List<String> values) {
            addCriterion("keyid in", values, "keyid");
            return this;
        }

        public Criteria andKeyidNotIn(List<String> values) {
            addCriterion("keyid not in", values, "keyid");
            return this;
        }

        public Criteria andKeyidBetween(String value1, String value2) {
            addCriterion("keyid between", value1, value2, "keyid");
            return this;
        }

        public Criteria andKeyidNotBetween(String value1, String value2) {
            addCriterion("keyid not between", value1, value2, "keyid");
            return this;
        }

        public Criteria andHelptextIsNull() {
            addCriterion("helptext is null");
            return this;
        }

        public Criteria andHelptextIsNotNull() {
            addCriterion("helptext is not null");
            return this;
        }

        public Criteria andHelptextEqualTo(String value) {
            addCriterion("helptext =", value, "helptext");
            return this;
        }

        public Criteria andHelptextNotEqualTo(String value) {
            addCriterion("helptext <>", value, "helptext");
            return this;
        }

        public Criteria andHelptextGreaterThan(String value) {
            addCriterion("helptext >", value, "helptext");
            return this;
        }

        public Criteria andHelptextGreaterThanOrEqualTo(String value) {
            addCriterion("helptext >=", value, "helptext");
            return this;
        }

        public Criteria andHelptextLessThan(String value) {
            addCriterion("helptext <", value, "helptext");
            return this;
        }

        public Criteria andHelptextLessThanOrEqualTo(String value) {
            addCriterion("helptext <=", value, "helptext");
            return this;
        }

        public Criteria andHelptextLike(String value) {
            addCriterion("helptext like", value, "helptext");
            return this;
        }

        public Criteria andHelptextNotLike(String value) {
            addCriterion("helptext not like", value, "helptext");
            return this;
        }

        public Criteria andHelptextIn(List<String> values) {
            addCriterion("helptext in", values, "helptext");
            return this;
        }

        public Criteria andHelptextNotIn(List<String> values) {
            addCriterion("helptext not in", values, "helptext");
            return this;
        }

        public Criteria andHelptextBetween(String value1, String value2) {
            addCriterion("helptext between", value1, value2, "helptext");
            return this;
        }

        public Criteria andHelptextNotBetween(String value1, String value2) {
            addCriterion("helptext not between", value1, value2, "helptext");
            return this;
        }
    }
}