package com.upp.dto.generate;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ChannelbanklimitExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ChannelbanklimitExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andBankcodeIsNull() {
            addCriterion("BANKCODE is null");
            return (Criteria) this;
        }

        public Criteria andBankcodeIsNotNull() {
            addCriterion("BANKCODE is not null");
            return (Criteria) this;
        }

        public Criteria andBankcodeEqualTo(String value) {
            addCriterion("BANKCODE =", value, "bankcode");
            return (Criteria) this;
        }

        public Criteria andBankcodeNotEqualTo(String value) {
            addCriterion("BANKCODE <>", value, "bankcode");
            return (Criteria) this;
        }

        public Criteria andBankcodeGreaterThan(String value) {
            addCriterion("BANKCODE >", value, "bankcode");
            return (Criteria) this;
        }

        public Criteria andBankcodeGreaterThanOrEqualTo(String value) {
            addCriterion("BANKCODE >=", value, "bankcode");
            return (Criteria) this;
        }

        public Criteria andBankcodeLessThan(String value) {
            addCriterion("BANKCODE <", value, "bankcode");
            return (Criteria) this;
        }

        public Criteria andBankcodeLessThanOrEqualTo(String value) {
            addCriterion("BANKCODE <=", value, "bankcode");
            return (Criteria) this;
        }

        public Criteria andBankcodeLike(String value) {
            addCriterion("BANKCODE like", value, "bankcode");
            return (Criteria) this;
        }

        public Criteria andBankcodeNotLike(String value) {
            addCriterion("BANKCODE not like", value, "bankcode");
            return (Criteria) this;
        }

        public Criteria andBankcodeIn(List<String> values) {
            addCriterion("BANKCODE in", values, "bankcode");
            return (Criteria) this;
        }

        public Criteria andBankcodeNotIn(List<String> values) {
            addCriterion("BANKCODE not in", values, "bankcode");
            return (Criteria) this;
        }

        public Criteria andBankcodeBetween(String value1, String value2) {
            addCriterion("BANKCODE between", value1, value2, "bankcode");
            return (Criteria) this;
        }

        public Criteria andBankcodeNotBetween(String value1, String value2) {
            addCriterion("BANKCODE not between", value1, value2, "bankcode");
            return (Criteria) this;
        }

        public Criteria andChannelbankcodeIsNull() {
            addCriterion("CHANNELBANKCODE is null");
            return (Criteria) this;
        }

        public Criteria andChannelbankcodeIsNotNull() {
            addCriterion("CHANNELBANKCODE is not null");
            return (Criteria) this;
        }

        public Criteria andChannelbankcodeEqualTo(String value) {
            addCriterion("CHANNELBANKCODE =", value, "channelbankcode");
            return (Criteria) this;
        }

        public Criteria andChannelbankcodeNotEqualTo(String value) {
            addCriterion("CHANNELBANKCODE <>", value, "channelbankcode");
            return (Criteria) this;
        }

        public Criteria andChannelbankcodeGreaterThan(String value) {
            addCriterion("CHANNELBANKCODE >", value, "channelbankcode");
            return (Criteria) this;
        }

        public Criteria andChannelbankcodeGreaterThanOrEqualTo(String value) {
            addCriterion("CHANNELBANKCODE >=", value, "channelbankcode");
            return (Criteria) this;
        }

        public Criteria andChannelbankcodeLessThan(String value) {
            addCriterion("CHANNELBANKCODE <", value, "channelbankcode");
            return (Criteria) this;
        }

        public Criteria andChannelbankcodeLessThanOrEqualTo(String value) {
            addCriterion("CHANNELBANKCODE <=", value, "channelbankcode");
            return (Criteria) this;
        }

        public Criteria andChannelbankcodeLike(String value) {
            addCriterion("CHANNELBANKCODE like", value, "channelbankcode");
            return (Criteria) this;
        }

        public Criteria andChannelbankcodeNotLike(String value) {
            addCriterion("CHANNELBANKCODE not like", value, "channelbankcode");
            return (Criteria) this;
        }

        public Criteria andChannelbankcodeIn(List<String> values) {
            addCriterion("CHANNELBANKCODE in", values, "channelbankcode");
            return (Criteria) this;
        }

        public Criteria andChannelbankcodeNotIn(List<String> values) {
            addCriterion("CHANNELBANKCODE not in", values, "channelbankcode");
            return (Criteria) this;
        }

        public Criteria andChannelbankcodeBetween(String value1, String value2) {
            addCriterion("CHANNELBANKCODE between", value1, value2, "channelbankcode");
            return (Criteria) this;
        }

        public Criteria andChannelbankcodeNotBetween(String value1, String value2) {
            addCriterion("CHANNELBANKCODE not between", value1, value2, "channelbankcode");
            return (Criteria) this;
        }

        public Criteria andIsomnichannelIsNull() {
            addCriterion("ISOMNICHANNEL is null");
            return (Criteria) this;
        }

        public Criteria andIsomnichannelIsNotNull() {
            addCriterion("ISOMNICHANNEL is not null");
            return (Criteria) this;
        }

        public Criteria andIsomnichannelEqualTo(String value) {
            addCriterion("ISOMNICHANNEL =", value, "isomnichannel");
            return (Criteria) this;
        }

        public Criteria andIsomnichannelNotEqualTo(String value) {
            addCriterion("ISOMNICHANNEL <>", value, "isomnichannel");
            return (Criteria) this;
        }

        public Criteria andIsomnichannelGreaterThan(String value) {
            addCriterion("ISOMNICHANNEL >", value, "isomnichannel");
            return (Criteria) this;
        }

        public Criteria andIsomnichannelGreaterThanOrEqualTo(String value) {
            addCriterion("ISOMNICHANNEL >=", value, "isomnichannel");
            return (Criteria) this;
        }

        public Criteria andIsomnichannelLessThan(String value) {
            addCriterion("ISOMNICHANNEL <", value, "isomnichannel");
            return (Criteria) this;
        }

        public Criteria andIsomnichannelLessThanOrEqualTo(String value) {
            addCriterion("ISOMNICHANNEL <=", value, "isomnichannel");
            return (Criteria) this;
        }

        public Criteria andIsomnichannelLike(String value) {
            addCriterion("ISOMNICHANNEL like", value, "isomnichannel");
            return (Criteria) this;
        }

        public Criteria andIsomnichannelNotLike(String value) {
            addCriterion("ISOMNICHANNEL not like", value, "isomnichannel");
            return (Criteria) this;
        }

        public Criteria andIsomnichannelIn(List<String> values) {
            addCriterion("ISOMNICHANNEL in", values, "isomnichannel");
            return (Criteria) this;
        }

        public Criteria andIsomnichannelNotIn(List<String> values) {
            addCriterion("ISOMNICHANNEL not in", values, "isomnichannel");
            return (Criteria) this;
        }

        public Criteria andIsomnichannelBetween(String value1, String value2) {
            addCriterion("ISOMNICHANNEL between", value1, value2, "isomnichannel");
            return (Criteria) this;
        }

        public Criteria andIsomnichannelNotBetween(String value1, String value2) {
            addCriterion("ISOMNICHANNEL not between", value1, value2, "isomnichannel");
            return (Criteria) this;
        }

        public Criteria andOnynIsNull() {
            addCriterion("ONYN is null");
            return (Criteria) this;
        }

        public Criteria andOnynIsNotNull() {
            addCriterion("ONYN is not null");
            return (Criteria) this;
        }

        public Criteria andOnynEqualTo(String value) {
            addCriterion("ONYN =", value, "onyn");
            return (Criteria) this;
        }

        public Criteria andOnynNotEqualTo(String value) {
            addCriterion("ONYN <>", value, "onyn");
            return (Criteria) this;
        }

        public Criteria andOnynGreaterThan(String value) {
            addCriterion("ONYN >", value, "onyn");
            return (Criteria) this;
        }

        public Criteria andOnynGreaterThanOrEqualTo(String value) {
            addCriterion("ONYN >=", value, "onyn");
            return (Criteria) this;
        }

        public Criteria andOnynLessThan(String value) {
            addCriterion("ONYN <", value, "onyn");
            return (Criteria) this;
        }

        public Criteria andOnynLessThanOrEqualTo(String value) {
            addCriterion("ONYN <=", value, "onyn");
            return (Criteria) this;
        }

        public Criteria andOnynLike(String value) {
            addCriterion("ONYN like", value, "onyn");
            return (Criteria) this;
        }

        public Criteria andOnynNotLike(String value) {
            addCriterion("ONYN not like", value, "onyn");
            return (Criteria) this;
        }

        public Criteria andOnynIn(List<String> values) {
            addCriterion("ONYN in", values, "onyn");
            return (Criteria) this;
        }

        public Criteria andOnynNotIn(List<String> values) {
            addCriterion("ONYN not in", values, "onyn");
            return (Criteria) this;
        }

        public Criteria andOnynBetween(String value1, String value2) {
            addCriterion("ONYN between", value1, value2, "onyn");
            return (Criteria) this;
        }

        public Criteria andOnynNotBetween(String value1, String value2) {
            addCriterion("ONYN not between", value1, value2, "onyn");
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

        public Criteria andTranstypeIsNull() {
            addCriterion("TRANSTYPE is null");
            return (Criteria) this;
        }

        public Criteria andTranstypeIsNotNull() {
            addCriterion("TRANSTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTranstypeEqualTo(String value) {
            addCriterion("TRANSTYPE =", value, "transtype");
            return (Criteria) this;
        }

        public Criteria andTranstypeNotEqualTo(String value) {
            addCriterion("TRANSTYPE <>", value, "transtype");
            return (Criteria) this;
        }

        public Criteria andTranstypeGreaterThan(String value) {
            addCriterion("TRANSTYPE >", value, "transtype");
            return (Criteria) this;
        }

        public Criteria andTranstypeGreaterThanOrEqualTo(String value) {
            addCriterion("TRANSTYPE >=", value, "transtype");
            return (Criteria) this;
        }

        public Criteria andTranstypeLessThan(String value) {
            addCriterion("TRANSTYPE <", value, "transtype");
            return (Criteria) this;
        }

        public Criteria andTranstypeLessThanOrEqualTo(String value) {
            addCriterion("TRANSTYPE <=", value, "transtype");
            return (Criteria) this;
        }

        public Criteria andTranstypeLike(String value) {
            addCriterion("TRANSTYPE like", value, "transtype");
            return (Criteria) this;
        }

        public Criteria andTranstypeNotLike(String value) {
            addCriterion("TRANSTYPE not like", value, "transtype");
            return (Criteria) this;
        }

        public Criteria andTranstypeIn(List<String> values) {
            addCriterion("TRANSTYPE in", values, "transtype");
            return (Criteria) this;
        }

        public Criteria andTranstypeNotIn(List<String> values) {
            addCriterion("TRANSTYPE not in", values, "transtype");
            return (Criteria) this;
        }

        public Criteria andTranstypeBetween(String value1, String value2) {
            addCriterion("TRANSTYPE between", value1, value2, "transtype");
            return (Criteria) this;
        }

        public Criteria andTranstypeNotBetween(String value1, String value2) {
            addCriterion("TRANSTYPE not between", value1, value2, "transtype");
            return (Criteria) this;
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