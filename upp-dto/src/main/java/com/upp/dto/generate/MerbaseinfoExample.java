package com.upp.dto.generate;

import java.util.ArrayList;
import java.util.List;

public class MerbaseinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MerbaseinfoExample() {
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

        public Criteria andMernbrIsNull() {
            addCriterion("MERNBR is null");
            return (Criteria) this;
        }

        public Criteria andMernbrIsNotNull() {
            addCriterion("MERNBR is not null");
            return (Criteria) this;
        }

        public Criteria andMernbrEqualTo(String value) {
            addCriterion("MERNBR =", value, "mernbr");
            return (Criteria) this;
        }

        public Criteria andMernbrNotEqualTo(String value) {
            addCriterion("MERNBR <>", value, "mernbr");
            return (Criteria) this;
        }

        public Criteria andMernbrGreaterThan(String value) {
            addCriterion("MERNBR >", value, "mernbr");
            return (Criteria) this;
        }

        public Criteria andMernbrGreaterThanOrEqualTo(String value) {
            addCriterion("MERNBR >=", value, "mernbr");
            return (Criteria) this;
        }

        public Criteria andMernbrLessThan(String value) {
            addCriterion("MERNBR <", value, "mernbr");
            return (Criteria) this;
        }

        public Criteria andMernbrLessThanOrEqualTo(String value) {
            addCriterion("MERNBR <=", value, "mernbr");
            return (Criteria) this;
        }

        public Criteria andMernbrLike(String value) {
            addCriterion("MERNBR like", value, "mernbr");
            return (Criteria) this;
        }

        public Criteria andMernbrNotLike(String value) {
            addCriterion("MERNBR not like", value, "mernbr");
            return (Criteria) this;
        }

        public Criteria andMernbrIn(List<String> values) {
            addCriterion("MERNBR in", values, "mernbr");
            return (Criteria) this;
        }

        public Criteria andMernbrNotIn(List<String> values) {
            addCriterion("MERNBR not in", values, "mernbr");
            return (Criteria) this;
        }

        public Criteria andMernbrBetween(String value1, String value2) {
            addCriterion("MERNBR between", value1, value2, "mernbr");
            return (Criteria) this;
        }

        public Criteria andMernbrNotBetween(String value1, String value2) {
            addCriterion("MERNBR not between", value1, value2, "mernbr");
            return (Criteria) this;
        }

        public Criteria andMernameIsNull() {
            addCriterion("MERNAME is null");
            return (Criteria) this;
        }

        public Criteria andMernameIsNotNull() {
            addCriterion("MERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andMernameEqualTo(String value) {
            addCriterion("MERNAME =", value, "mername");
            return (Criteria) this;
        }

        public Criteria andMernameNotEqualTo(String value) {
            addCriterion("MERNAME <>", value, "mername");
            return (Criteria) this;
        }

        public Criteria andMernameGreaterThan(String value) {
            addCriterion("MERNAME >", value, "mername");
            return (Criteria) this;
        }

        public Criteria andMernameGreaterThanOrEqualTo(String value) {
            addCriterion("MERNAME >=", value, "mername");
            return (Criteria) this;
        }

        public Criteria andMernameLessThan(String value) {
            addCriterion("MERNAME <", value, "mername");
            return (Criteria) this;
        }

        public Criteria andMernameLessThanOrEqualTo(String value) {
            addCriterion("MERNAME <=", value, "mername");
            return (Criteria) this;
        }

        public Criteria andMernameLike(String value) {
            addCriterion("MERNAME like", value, "mername");
            return (Criteria) this;
        }

        public Criteria andMernameNotLike(String value) {
            addCriterion("MERNAME not like", value, "mername");
            return (Criteria) this;
        }

        public Criteria andMernameIn(List<String> values) {
            addCriterion("MERNAME in", values, "mername");
            return (Criteria) this;
        }

        public Criteria andMernameNotIn(List<String> values) {
            addCriterion("MERNAME not in", values, "mername");
            return (Criteria) this;
        }

        public Criteria andMernameBetween(String value1, String value2) {
            addCriterion("MERNAME between", value1, value2, "mername");
            return (Criteria) this;
        }

        public Criteria andMernameNotBetween(String value1, String value2) {
            addCriterion("MERNAME not between", value1, value2, "mername");
            return (Criteria) this;
        }

        public Criteria andMerstatusIsNull() {
            addCriterion("MERSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andMerstatusIsNotNull() {
            addCriterion("MERSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andMerstatusEqualTo(String value) {
            addCriterion("MERSTATUS =", value, "merstatus");
            return (Criteria) this;
        }

        public Criteria andMerstatusNotEqualTo(String value) {
            addCriterion("MERSTATUS <>", value, "merstatus");
            return (Criteria) this;
        }

        public Criteria andMerstatusGreaterThan(String value) {
            addCriterion("MERSTATUS >", value, "merstatus");
            return (Criteria) this;
        }

        public Criteria andMerstatusGreaterThanOrEqualTo(String value) {
            addCriterion("MERSTATUS >=", value, "merstatus");
            return (Criteria) this;
        }

        public Criteria andMerstatusLessThan(String value) {
            addCriterion("MERSTATUS <", value, "merstatus");
            return (Criteria) this;
        }

        public Criteria andMerstatusLessThanOrEqualTo(String value) {
            addCriterion("MERSTATUS <=", value, "merstatus");
            return (Criteria) this;
        }

        public Criteria andMerstatusLike(String value) {
            addCriterion("MERSTATUS like", value, "merstatus");
            return (Criteria) this;
        }

        public Criteria andMerstatusNotLike(String value) {
            addCriterion("MERSTATUS not like", value, "merstatus");
            return (Criteria) this;
        }

        public Criteria andMerstatusIn(List<String> values) {
            addCriterion("MERSTATUS in", values, "merstatus");
            return (Criteria) this;
        }

        public Criteria andMerstatusNotIn(List<String> values) {
            addCriterion("MERSTATUS not in", values, "merstatus");
            return (Criteria) this;
        }

        public Criteria andMerstatusBetween(String value1, String value2) {
            addCriterion("MERSTATUS between", value1, value2, "merstatus");
            return (Criteria) this;
        }

        public Criteria andMerstatusNotBetween(String value1, String value2) {
            addCriterion("MERSTATUS not between", value1, value2, "merstatus");
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