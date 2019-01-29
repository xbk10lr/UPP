package com.upp.dto.generate;

import java.util.ArrayList;
import java.util.List;

public class UppersysinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UppersysinfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andSystemcodeIsNull() {
            addCriterion("SYSTEMCODE is null");
            return (Criteria) this;
        }

        public Criteria andSystemcodeIsNotNull() {
            addCriterion("SYSTEMCODE is not null");
            return (Criteria) this;
        }

        public Criteria andSystemcodeEqualTo(String value) {
            addCriterion("SYSTEMCODE =", value, "systemcode");
            return (Criteria) this;
        }

        public Criteria andSystemcodeNotEqualTo(String value) {
            addCriterion("SYSTEMCODE <>", value, "systemcode");
            return (Criteria) this;
        }

        public Criteria andSystemcodeGreaterThan(String value) {
            addCriterion("SYSTEMCODE >", value, "systemcode");
            return (Criteria) this;
        }

        public Criteria andSystemcodeGreaterThanOrEqualTo(String value) {
            addCriterion("SYSTEMCODE >=", value, "systemcode");
            return (Criteria) this;
        }

        public Criteria andSystemcodeLessThan(String value) {
            addCriterion("SYSTEMCODE <", value, "systemcode");
            return (Criteria) this;
        }

        public Criteria andSystemcodeLessThanOrEqualTo(String value) {
            addCriterion("SYSTEMCODE <=", value, "systemcode");
            return (Criteria) this;
        }

        public Criteria andSystemcodeLike(String value) {
            addCriterion("SYSTEMCODE like", value, "systemcode");
            return (Criteria) this;
        }

        public Criteria andSystemcodeNotLike(String value) {
            addCriterion("SYSTEMCODE not like", value, "systemcode");
            return (Criteria) this;
        }

        public Criteria andSystemcodeIn(List<String> values) {
            addCriterion("SYSTEMCODE in", values, "systemcode");
            return (Criteria) this;
        }

        public Criteria andSystemcodeNotIn(List<String> values) {
            addCriterion("SYSTEMCODE not in", values, "systemcode");
            return (Criteria) this;
        }

        public Criteria andSystemcodeBetween(String value1, String value2) {
            addCriterion("SYSTEMCODE between", value1, value2, "systemcode");
            return (Criteria) this;
        }

        public Criteria andSystemcodeNotBetween(String value1, String value2) {
            addCriterion("SYSTEMCODE not between", value1, value2, "systemcode");
            return (Criteria) this;
        }

        public Criteria andSystemnameIsNull() {
            addCriterion("SYSTEMNAME is null");
            return (Criteria) this;
        }

        public Criteria andSystemnameIsNotNull() {
            addCriterion("SYSTEMNAME is not null");
            return (Criteria) this;
        }

        public Criteria andSystemnameEqualTo(String value) {
            addCriterion("SYSTEMNAME =", value, "systemname");
            return (Criteria) this;
        }

        public Criteria andSystemnameNotEqualTo(String value) {
            addCriterion("SYSTEMNAME <>", value, "systemname");
            return (Criteria) this;
        }

        public Criteria andSystemnameGreaterThan(String value) {
            addCriterion("SYSTEMNAME >", value, "systemname");
            return (Criteria) this;
        }

        public Criteria andSystemnameGreaterThanOrEqualTo(String value) {
            addCriterion("SYSTEMNAME >=", value, "systemname");
            return (Criteria) this;
        }

        public Criteria andSystemnameLessThan(String value) {
            addCriterion("SYSTEMNAME <", value, "systemname");
            return (Criteria) this;
        }

        public Criteria andSystemnameLessThanOrEqualTo(String value) {
            addCriterion("SYSTEMNAME <=", value, "systemname");
            return (Criteria) this;
        }

        public Criteria andSystemnameLike(String value) {
            addCriterion("SYSTEMNAME like", value, "systemname");
            return (Criteria) this;
        }

        public Criteria andSystemnameNotLike(String value) {
            addCriterion("SYSTEMNAME not like", value, "systemname");
            return (Criteria) this;
        }

        public Criteria andSystemnameIn(List<String> values) {
            addCriterion("SYSTEMNAME in", values, "systemname");
            return (Criteria) this;
        }

        public Criteria andSystemnameNotIn(List<String> values) {
            addCriterion("SYSTEMNAME not in", values, "systemname");
            return (Criteria) this;
        }

        public Criteria andSystemnameBetween(String value1, String value2) {
            addCriterion("SYSTEMNAME between", value1, value2, "systemname");
            return (Criteria) this;
        }

        public Criteria andSystemnameNotBetween(String value1, String value2) {
            addCriterion("SYSTEMNAME not between", value1, value2, "systemname");
            return (Criteria) this;
        }

        public Criteria andSysstatusIsNull() {
            addCriterion("SYSSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andSysstatusIsNotNull() {
            addCriterion("SYSSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andSysstatusEqualTo(String value) {
            addCriterion("SYSSTATUS =", value, "sysstatus");
            return (Criteria) this;
        }

        public Criteria andSysstatusNotEqualTo(String value) {
            addCriterion("SYSSTATUS <>", value, "sysstatus");
            return (Criteria) this;
        }

        public Criteria andSysstatusGreaterThan(String value) {
            addCriterion("SYSSTATUS >", value, "sysstatus");
            return (Criteria) this;
        }

        public Criteria andSysstatusGreaterThanOrEqualTo(String value) {
            addCriterion("SYSSTATUS >=", value, "sysstatus");
            return (Criteria) this;
        }

        public Criteria andSysstatusLessThan(String value) {
            addCriterion("SYSSTATUS <", value, "sysstatus");
            return (Criteria) this;
        }

        public Criteria andSysstatusLessThanOrEqualTo(String value) {
            addCriterion("SYSSTATUS <=", value, "sysstatus");
            return (Criteria) this;
        }

        public Criteria andSysstatusLike(String value) {
            addCriterion("SYSSTATUS like", value, "sysstatus");
            return (Criteria) this;
        }

        public Criteria andSysstatusNotLike(String value) {
            addCriterion("SYSSTATUS not like", value, "sysstatus");
            return (Criteria) this;
        }

        public Criteria andSysstatusIn(List<String> values) {
            addCriterion("SYSSTATUS in", values, "sysstatus");
            return (Criteria) this;
        }

        public Criteria andSysstatusNotIn(List<String> values) {
            addCriterion("SYSSTATUS not in", values, "sysstatus");
            return (Criteria) this;
        }

        public Criteria andSysstatusBetween(String value1, String value2) {
            addCriterion("SYSSTATUS between", value1, value2, "sysstatus");
            return (Criteria) this;
        }

        public Criteria andSysstatusNotBetween(String value1, String value2) {
            addCriterion("SYSSTATUS not between", value1, value2, "sysstatus");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}