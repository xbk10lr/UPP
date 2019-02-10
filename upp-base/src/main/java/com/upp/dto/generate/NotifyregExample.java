package com.upp.dto.generate;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class NotifyregExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NotifyregExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andNotifynbrIsNull() {
            addCriterion("NOTIFYNBR is null");
            return (Criteria) this;
        }

        public Criteria andNotifynbrIsNotNull() {
            addCriterion("NOTIFYNBR is not null");
            return (Criteria) this;
        }

        public Criteria andNotifynbrEqualTo(String value) {
            addCriterion("NOTIFYNBR =", value, "notifynbr");
            return (Criteria) this;
        }

        public Criteria andNotifynbrNotEqualTo(String value) {
            addCriterion("NOTIFYNBR <>", value, "notifynbr");
            return (Criteria) this;
        }

        public Criteria andNotifynbrGreaterThan(String value) {
            addCriterion("NOTIFYNBR >", value, "notifynbr");
            return (Criteria) this;
        }

        public Criteria andNotifynbrGreaterThanOrEqualTo(String value) {
            addCriterion("NOTIFYNBR >=", value, "notifynbr");
            return (Criteria) this;
        }

        public Criteria andNotifynbrLessThan(String value) {
            addCriterion("NOTIFYNBR <", value, "notifynbr");
            return (Criteria) this;
        }

        public Criteria andNotifynbrLessThanOrEqualTo(String value) {
            addCriterion("NOTIFYNBR <=", value, "notifynbr");
            return (Criteria) this;
        }

        public Criteria andNotifynbrLike(String value) {
            addCriterion("NOTIFYNBR like", value, "notifynbr");
            return (Criteria) this;
        }

        public Criteria andNotifynbrNotLike(String value) {
            addCriterion("NOTIFYNBR not like", value, "notifynbr");
            return (Criteria) this;
        }

        public Criteria andNotifynbrIn(List<String> values) {
            addCriterion("NOTIFYNBR in", values, "notifynbr");
            return (Criteria) this;
        }

        public Criteria andNotifynbrNotIn(List<String> values) {
            addCriterion("NOTIFYNBR not in", values, "notifynbr");
            return (Criteria) this;
        }

        public Criteria andNotifynbrBetween(String value1, String value2) {
            addCriterion("NOTIFYNBR between", value1, value2, "notifynbr");
            return (Criteria) this;
        }

        public Criteria andNotifynbrNotBetween(String value1, String value2) {
            addCriterion("NOTIFYNBR not between", value1, value2, "notifynbr");
            return (Criteria) this;
        }

        public Criteria andUppertransnbrIsNull() {
            addCriterion("UPPERTRANSNBR is null");
            return (Criteria) this;
        }

        public Criteria andUppertransnbrIsNotNull() {
            addCriterion("UPPERTRANSNBR is not null");
            return (Criteria) this;
        }

        public Criteria andUppertransnbrEqualTo(String value) {
            addCriterion("UPPERTRANSNBR =", value, "uppertransnbr");
            return (Criteria) this;
        }

        public Criteria andUppertransnbrNotEqualTo(String value) {
            addCriterion("UPPERTRANSNBR <>", value, "uppertransnbr");
            return (Criteria) this;
        }

        public Criteria andUppertransnbrGreaterThan(String value) {
            addCriterion("UPPERTRANSNBR >", value, "uppertransnbr");
            return (Criteria) this;
        }

        public Criteria andUppertransnbrGreaterThanOrEqualTo(String value) {
            addCriterion("UPPERTRANSNBR >=", value, "uppertransnbr");
            return (Criteria) this;
        }

        public Criteria andUppertransnbrLessThan(String value) {
            addCriterion("UPPERTRANSNBR <", value, "uppertransnbr");
            return (Criteria) this;
        }

        public Criteria andUppertransnbrLessThanOrEqualTo(String value) {
            addCriterion("UPPERTRANSNBR <=", value, "uppertransnbr");
            return (Criteria) this;
        }

        public Criteria andUppertransnbrLike(String value) {
            addCriterion("UPPERTRANSNBR like", value, "uppertransnbr");
            return (Criteria) this;
        }

        public Criteria andUppertransnbrNotLike(String value) {
            addCriterion("UPPERTRANSNBR not like", value, "uppertransnbr");
            return (Criteria) this;
        }

        public Criteria andUppertransnbrIn(List<String> values) {
            addCriterion("UPPERTRANSNBR in", values, "uppertransnbr");
            return (Criteria) this;
        }

        public Criteria andUppertransnbrNotIn(List<String> values) {
            addCriterion("UPPERTRANSNBR not in", values, "uppertransnbr");
            return (Criteria) this;
        }

        public Criteria andUppertransnbrBetween(String value1, String value2) {
            addCriterion("UPPERTRANSNBR between", value1, value2, "uppertransnbr");
            return (Criteria) this;
        }

        public Criteria andUppertransnbrNotBetween(String value1, String value2) {
            addCriterion("UPPERTRANSNBR not between", value1, value2, "uppertransnbr");
            return (Criteria) this;
        }

        public Criteria andTransdateIsNull() {
            addCriterion("TRANSDATE is null");
            return (Criteria) this;
        }

        public Criteria andTransdateIsNotNull() {
            addCriterion("TRANSDATE is not null");
            return (Criteria) this;
        }

        public Criteria andTransdateEqualTo(Date value) {
            addCriterionForJDBCDate("TRANSDATE =", value, "transdate");
            return (Criteria) this;
        }

        public Criteria andTransdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("TRANSDATE <>", value, "transdate");
            return (Criteria) this;
        }

        public Criteria andTransdateGreaterThan(Date value) {
            addCriterionForJDBCDate("TRANSDATE >", value, "transdate");
            return (Criteria) this;
        }

        public Criteria andTransdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TRANSDATE >=", value, "transdate");
            return (Criteria) this;
        }

        public Criteria andTransdateLessThan(Date value) {
            addCriterionForJDBCDate("TRANSDATE <", value, "transdate");
            return (Criteria) this;
        }

        public Criteria andTransdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("TRANSDATE <=", value, "transdate");
            return (Criteria) this;
        }

        public Criteria andTransdateIn(List<Date> values) {
            addCriterionForJDBCDate("TRANSDATE in", values, "transdate");
            return (Criteria) this;
        }

        public Criteria andTransdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("TRANSDATE not in", values, "transdate");
            return (Criteria) this;
        }

        public Criteria andTransdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TRANSDATE between", value1, value2, "transdate");
            return (Criteria) this;
        }

        public Criteria andTransdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("TRANSDATE not between", value1, value2, "transdate");
            return (Criteria) this;
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

        public Criteria andUppersysnbrIsNull() {
            addCriterion("UPPERSYSNBR is null");
            return (Criteria) this;
        }

        public Criteria andUppersysnbrIsNotNull() {
            addCriterion("UPPERSYSNBR is not null");
            return (Criteria) this;
        }

        public Criteria andUppersysnbrEqualTo(String value) {
            addCriterion("UPPERSYSNBR =", value, "uppersysnbr");
            return (Criteria) this;
        }

        public Criteria andUppersysnbrNotEqualTo(String value) {
            addCriterion("UPPERSYSNBR <>", value, "uppersysnbr");
            return (Criteria) this;
        }

        public Criteria andUppersysnbrGreaterThan(String value) {
            addCriterion("UPPERSYSNBR >", value, "uppersysnbr");
            return (Criteria) this;
        }

        public Criteria andUppersysnbrGreaterThanOrEqualTo(String value) {
            addCriterion("UPPERSYSNBR >=", value, "uppersysnbr");
            return (Criteria) this;
        }

        public Criteria andUppersysnbrLessThan(String value) {
            addCriterion("UPPERSYSNBR <", value, "uppersysnbr");
            return (Criteria) this;
        }

        public Criteria andUppersysnbrLessThanOrEqualTo(String value) {
            addCriterion("UPPERSYSNBR <=", value, "uppersysnbr");
            return (Criteria) this;
        }

        public Criteria andUppersysnbrLike(String value) {
            addCriterion("UPPERSYSNBR like", value, "uppersysnbr");
            return (Criteria) this;
        }

        public Criteria andUppersysnbrNotLike(String value) {
            addCriterion("UPPERSYSNBR not like", value, "uppersysnbr");
            return (Criteria) this;
        }

        public Criteria andUppersysnbrIn(List<String> values) {
            addCriterion("UPPERSYSNBR in", values, "uppersysnbr");
            return (Criteria) this;
        }

        public Criteria andUppersysnbrNotIn(List<String> values) {
            addCriterion("UPPERSYSNBR not in", values, "uppersysnbr");
            return (Criteria) this;
        }

        public Criteria andUppersysnbrBetween(String value1, String value2) {
            addCriterion("UPPERSYSNBR between", value1, value2, "uppersysnbr");
            return (Criteria) this;
        }

        public Criteria andUppersysnbrNotBetween(String value1, String value2) {
            addCriterion("UPPERSYSNBR not between", value1, value2, "uppersysnbr");
            return (Criteria) this;
        }

        public Criteria andNotifystatusIsNull() {
            addCriterion("NOTIFYSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andNotifystatusIsNotNull() {
            addCriterion("NOTIFYSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andNotifystatusEqualTo(String value) {
            addCriterion("NOTIFYSTATUS =", value, "notifystatus");
            return (Criteria) this;
        }

        public Criteria andNotifystatusNotEqualTo(String value) {
            addCriterion("NOTIFYSTATUS <>", value, "notifystatus");
            return (Criteria) this;
        }

        public Criteria andNotifystatusGreaterThan(String value) {
            addCriterion("NOTIFYSTATUS >", value, "notifystatus");
            return (Criteria) this;
        }

        public Criteria andNotifystatusGreaterThanOrEqualTo(String value) {
            addCriterion("NOTIFYSTATUS >=", value, "notifystatus");
            return (Criteria) this;
        }

        public Criteria andNotifystatusLessThan(String value) {
            addCriterion("NOTIFYSTATUS <", value, "notifystatus");
            return (Criteria) this;
        }

        public Criteria andNotifystatusLessThanOrEqualTo(String value) {
            addCriterion("NOTIFYSTATUS <=", value, "notifystatus");
            return (Criteria) this;
        }

        public Criteria andNotifystatusLike(String value) {
            addCriterion("NOTIFYSTATUS like", value, "notifystatus");
            return (Criteria) this;
        }

        public Criteria andNotifystatusNotLike(String value) {
            addCriterion("NOTIFYSTATUS not like", value, "notifystatus");
            return (Criteria) this;
        }

        public Criteria andNotifystatusIn(List<String> values) {
            addCriterion("NOTIFYSTATUS in", values, "notifystatus");
            return (Criteria) this;
        }

        public Criteria andNotifystatusNotIn(List<String> values) {
            addCriterion("NOTIFYSTATUS not in", values, "notifystatus");
            return (Criteria) this;
        }

        public Criteria andNotifystatusBetween(String value1, String value2) {
            addCriterion("NOTIFYSTATUS between", value1, value2, "notifystatus");
            return (Criteria) this;
        }

        public Criteria andNotifystatusNotBetween(String value1, String value2) {
            addCriterion("NOTIFYSTATUS not between", value1, value2, "notifystatus");
            return (Criteria) this;
        }

        public Criteria andCrtdatetimeIsNull() {
            addCriterion("CRTDATETIME is null");
            return (Criteria) this;
        }

        public Criteria andCrtdatetimeIsNotNull() {
            addCriterion("CRTDATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andCrtdatetimeEqualTo(Date value) {
            addCriterion("CRTDATETIME =", value, "crtdatetime");
            return (Criteria) this;
        }

        public Criteria andCrtdatetimeNotEqualTo(Date value) {
            addCriterion("CRTDATETIME <>", value, "crtdatetime");
            return (Criteria) this;
        }

        public Criteria andCrtdatetimeGreaterThan(Date value) {
            addCriterion("CRTDATETIME >", value, "crtdatetime");
            return (Criteria) this;
        }

        public Criteria andCrtdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CRTDATETIME >=", value, "crtdatetime");
            return (Criteria) this;
        }

        public Criteria andCrtdatetimeLessThan(Date value) {
            addCriterion("CRTDATETIME <", value, "crtdatetime");
            return (Criteria) this;
        }

        public Criteria andCrtdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("CRTDATETIME <=", value, "crtdatetime");
            return (Criteria) this;
        }

        public Criteria andCrtdatetimeIn(List<Date> values) {
            addCriterion("CRTDATETIME in", values, "crtdatetime");
            return (Criteria) this;
        }

        public Criteria andCrtdatetimeNotIn(List<Date> values) {
            addCriterion("CRTDATETIME not in", values, "crtdatetime");
            return (Criteria) this;
        }

        public Criteria andCrtdatetimeBetween(Date value1, Date value2) {
            addCriterion("CRTDATETIME between", value1, value2, "crtdatetime");
            return (Criteria) this;
        }

        public Criteria andCrtdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("CRTDATETIME not between", value1, value2, "crtdatetime");
            return (Criteria) this;
        }

        public Criteria andDatelastmaintIsNull() {
            addCriterion("DATELASTMAINT is null");
            return (Criteria) this;
        }

        public Criteria andDatelastmaintIsNotNull() {
            addCriterion("DATELASTMAINT is not null");
            return (Criteria) this;
        }

        public Criteria andDatelastmaintEqualTo(Date value) {
            addCriterion("DATELASTMAINT =", value, "datelastmaint");
            return (Criteria) this;
        }

        public Criteria andDatelastmaintNotEqualTo(Date value) {
            addCriterion("DATELASTMAINT <>", value, "datelastmaint");
            return (Criteria) this;
        }

        public Criteria andDatelastmaintGreaterThan(Date value) {
            addCriterion("DATELASTMAINT >", value, "datelastmaint");
            return (Criteria) this;
        }

        public Criteria andDatelastmaintGreaterThanOrEqualTo(Date value) {
            addCriterion("DATELASTMAINT >=", value, "datelastmaint");
            return (Criteria) this;
        }

        public Criteria andDatelastmaintLessThan(Date value) {
            addCriterion("DATELASTMAINT <", value, "datelastmaint");
            return (Criteria) this;
        }

        public Criteria andDatelastmaintLessThanOrEqualTo(Date value) {
            addCriterion("DATELASTMAINT <=", value, "datelastmaint");
            return (Criteria) this;
        }

        public Criteria andDatelastmaintIn(List<Date> values) {
            addCriterion("DATELASTMAINT in", values, "datelastmaint");
            return (Criteria) this;
        }

        public Criteria andDatelastmaintNotIn(List<Date> values) {
            addCriterion("DATELASTMAINT not in", values, "datelastmaint");
            return (Criteria) this;
        }

        public Criteria andDatelastmaintBetween(Date value1, Date value2) {
            addCriterion("DATELASTMAINT between", value1, value2, "datelastmaint");
            return (Criteria) this;
        }

        public Criteria andDatelastmaintNotBetween(Date value1, Date value2) {
            addCriterion("DATELASTMAINT not between", value1, value2, "datelastmaint");
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