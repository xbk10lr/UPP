package com.upp.dto.generate;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ChannelroutExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ChannelroutExample() {
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

        public Criteria andFundchannelcodeIsNull() {
            addCriterion("FUNDCHANNELCODE is null");
            return (Criteria) this;
        }

        public Criteria andFundchannelcodeIsNotNull() {
            addCriterion("FUNDCHANNELCODE is not null");
            return (Criteria) this;
        }

        public Criteria andFundchannelcodeEqualTo(String value) {
            addCriterion("FUNDCHANNELCODE =", value, "fundchannelcode");
            return (Criteria) this;
        }

        public Criteria andFundchannelcodeNotEqualTo(String value) {
            addCriterion("FUNDCHANNELCODE <>", value, "fundchannelcode");
            return (Criteria) this;
        }

        public Criteria andFundchannelcodeGreaterThan(String value) {
            addCriterion("FUNDCHANNELCODE >", value, "fundchannelcode");
            return (Criteria) this;
        }

        public Criteria andFundchannelcodeGreaterThanOrEqualTo(String value) {
            addCriterion("FUNDCHANNELCODE >=", value, "fundchannelcode");
            return (Criteria) this;
        }

        public Criteria andFundchannelcodeLessThan(String value) {
            addCriterion("FUNDCHANNELCODE <", value, "fundchannelcode");
            return (Criteria) this;
        }

        public Criteria andFundchannelcodeLessThanOrEqualTo(String value) {
            addCriterion("FUNDCHANNELCODE <=", value, "fundchannelcode");
            return (Criteria) this;
        }

        public Criteria andFundchannelcodeLike(String value) {
            addCriterion("FUNDCHANNELCODE like", value, "fundchannelcode");
            return (Criteria) this;
        }

        public Criteria andFundchannelcodeNotLike(String value) {
            addCriterion("FUNDCHANNELCODE not like", value, "fundchannelcode");
            return (Criteria) this;
        }

        public Criteria andFundchannelcodeIn(List<String> values) {
            addCriterion("FUNDCHANNELCODE in", values, "fundchannelcode");
            return (Criteria) this;
        }

        public Criteria andFundchannelcodeNotIn(List<String> values) {
            addCriterion("FUNDCHANNELCODE not in", values, "fundchannelcode");
            return (Criteria) this;
        }

        public Criteria andFundchannelcodeBetween(String value1, String value2) {
            addCriterion("FUNDCHANNELCODE between", value1, value2, "fundchannelcode");
            return (Criteria) this;
        }

        public Criteria andFundchannelcodeNotBetween(String value1, String value2) {
            addCriterion("FUNDCHANNELCODE not between", value1, value2, "fundchannelcode");
            return (Criteria) this;
        }

        public Criteria andRoutstateIsNull() {
            addCriterion("ROUTSTATE is null");
            return (Criteria) this;
        }

        public Criteria andRoutstateIsNotNull() {
            addCriterion("ROUTSTATE is not null");
            return (Criteria) this;
        }

        public Criteria andRoutstateEqualTo(String value) {
            addCriterion("ROUTSTATE =", value, "routstate");
            return (Criteria) this;
        }

        public Criteria andRoutstateNotEqualTo(String value) {
            addCriterion("ROUTSTATE <>", value, "routstate");
            return (Criteria) this;
        }

        public Criteria andRoutstateGreaterThan(String value) {
            addCriterion("ROUTSTATE >", value, "routstate");
            return (Criteria) this;
        }

        public Criteria andRoutstateGreaterThanOrEqualTo(String value) {
            addCriterion("ROUTSTATE >=", value, "routstate");
            return (Criteria) this;
        }

        public Criteria andRoutstateLessThan(String value) {
            addCriterion("ROUTSTATE <", value, "routstate");
            return (Criteria) this;
        }

        public Criteria andRoutstateLessThanOrEqualTo(String value) {
            addCriterion("ROUTSTATE <=", value, "routstate");
            return (Criteria) this;
        }

        public Criteria andRoutstateLike(String value) {
            addCriterion("ROUTSTATE like", value, "routstate");
            return (Criteria) this;
        }

        public Criteria andRoutstateNotLike(String value) {
            addCriterion("ROUTSTATE not like", value, "routstate");
            return (Criteria) this;
        }

        public Criteria andRoutstateIn(List<String> values) {
            addCriterion("ROUTSTATE in", values, "routstate");
            return (Criteria) this;
        }

        public Criteria andRoutstateNotIn(List<String> values) {
            addCriterion("ROUTSTATE not in", values, "routstate");
            return (Criteria) this;
        }

        public Criteria andRoutstateBetween(String value1, String value2) {
            addCriterion("ROUTSTATE between", value1, value2, "routstate");
            return (Criteria) this;
        }

        public Criteria andRoutstateNotBetween(String value1, String value2) {
            addCriterion("ROUTSTATE not between", value1, value2, "routstate");
            return (Criteria) this;
        }

        public Criteria andPriorityIsNull() {
            addCriterion("PRIORITY is null");
            return (Criteria) this;
        }

        public Criteria andPriorityIsNotNull() {
            addCriterion("PRIORITY is not null");
            return (Criteria) this;
        }

        public Criteria andPriorityEqualTo(String value) {
            addCriterion("PRIORITY =", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotEqualTo(String value) {
            addCriterion("PRIORITY <>", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityGreaterThan(String value) {
            addCriterion("PRIORITY >", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityGreaterThanOrEqualTo(String value) {
            addCriterion("PRIORITY >=", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLessThan(String value) {
            addCriterion("PRIORITY <", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLessThanOrEqualTo(String value) {
            addCriterion("PRIORITY <=", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLike(String value) {
            addCriterion("PRIORITY like", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotLike(String value) {
            addCriterion("PRIORITY not like", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityIn(List<String> values) {
            addCriterion("PRIORITY in", values, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotIn(List<String> values) {
            addCriterion("PRIORITY not in", values, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityBetween(String value1, String value2) {
            addCriterion("PRIORITY between", value1, value2, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotBetween(String value1, String value2) {
            addCriterion("PRIORITY not between", value1, value2, "priority");
            return (Criteria) this;
        }

        public Criteria andLimitamtIsNull() {
            addCriterion("LIMITAMT is null");
            return (Criteria) this;
        }

        public Criteria andLimitamtIsNotNull() {
            addCriterion("LIMITAMT is not null");
            return (Criteria) this;
        }

        public Criteria andLimitamtEqualTo(BigDecimal value) {
            addCriterion("LIMITAMT =", value, "limitamt");
            return (Criteria) this;
        }

        public Criteria andLimitamtNotEqualTo(BigDecimal value) {
            addCriterion("LIMITAMT <>", value, "limitamt");
            return (Criteria) this;
        }

        public Criteria andLimitamtGreaterThan(BigDecimal value) {
            addCriterion("LIMITAMT >", value, "limitamt");
            return (Criteria) this;
        }

        public Criteria andLimitamtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LIMITAMT >=", value, "limitamt");
            return (Criteria) this;
        }

        public Criteria andLimitamtLessThan(BigDecimal value) {
            addCriterion("LIMITAMT <", value, "limitamt");
            return (Criteria) this;
        }

        public Criteria andLimitamtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LIMITAMT <=", value, "limitamt");
            return (Criteria) this;
        }

        public Criteria andLimitamtIn(List<BigDecimal> values) {
            addCriterion("LIMITAMT in", values, "limitamt");
            return (Criteria) this;
        }

        public Criteria andLimitamtNotIn(List<BigDecimal> values) {
            addCriterion("LIMITAMT not in", values, "limitamt");
            return (Criteria) this;
        }

        public Criteria andLimitamtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LIMITAMT between", value1, value2, "limitamt");
            return (Criteria) this;
        }

        public Criteria andLimitamtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LIMITAMT not between", value1, value2, "limitamt");
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