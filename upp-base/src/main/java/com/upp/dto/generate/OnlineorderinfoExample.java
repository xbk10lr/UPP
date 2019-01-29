package com.upp.dto.generate;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class OnlineorderinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OnlineorderinfoExample() {
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

        public Criteria andTransseqnbrIsNull() {
            addCriterion("TRANSSEQNBR is null");
            return (Criteria) this;
        }

        public Criteria andTransseqnbrIsNotNull() {
            addCriterion("TRANSSEQNBR is not null");
            return (Criteria) this;
        }

        public Criteria andTransseqnbrEqualTo(String value) {
            addCriterion("TRANSSEQNBR =", value, "transseqnbr");
            return (Criteria) this;
        }

        public Criteria andTransseqnbrNotEqualTo(String value) {
            addCriterion("TRANSSEQNBR <>", value, "transseqnbr");
            return (Criteria) this;
        }

        public Criteria andTransseqnbrGreaterThan(String value) {
            addCriterion("TRANSSEQNBR >", value, "transseqnbr");
            return (Criteria) this;
        }

        public Criteria andTransseqnbrGreaterThanOrEqualTo(String value) {
            addCriterion("TRANSSEQNBR >=", value, "transseqnbr");
            return (Criteria) this;
        }

        public Criteria andTransseqnbrLessThan(String value) {
            addCriterion("TRANSSEQNBR <", value, "transseqnbr");
            return (Criteria) this;
        }

        public Criteria andTransseqnbrLessThanOrEqualTo(String value) {
            addCriterion("TRANSSEQNBR <=", value, "transseqnbr");
            return (Criteria) this;
        }

        public Criteria andTransseqnbrLike(String value) {
            addCriterion("TRANSSEQNBR like", value, "transseqnbr");
            return (Criteria) this;
        }

        public Criteria andTransseqnbrNotLike(String value) {
            addCriterion("TRANSSEQNBR not like", value, "transseqnbr");
            return (Criteria) this;
        }

        public Criteria andTransseqnbrIn(List<String> values) {
            addCriterion("TRANSSEQNBR in", values, "transseqnbr");
            return (Criteria) this;
        }

        public Criteria andTransseqnbrNotIn(List<String> values) {
            addCriterion("TRANSSEQNBR not in", values, "transseqnbr");
            return (Criteria) this;
        }

        public Criteria andTransseqnbrBetween(String value1, String value2) {
            addCriterion("TRANSSEQNBR between", value1, value2, "transseqnbr");
            return (Criteria) this;
        }

        public Criteria andTransseqnbrNotBetween(String value1, String value2) {
            addCriterion("TRANSSEQNBR not between", value1, value2, "transseqnbr");
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

        public Criteria andMerseqnbrIsNull() {
            addCriterion("MERSEQNBR is null");
            return (Criteria) this;
        }

        public Criteria andMerseqnbrIsNotNull() {
            addCriterion("MERSEQNBR is not null");
            return (Criteria) this;
        }

        public Criteria andMerseqnbrEqualTo(String value) {
            addCriterion("MERSEQNBR =", value, "merseqnbr");
            return (Criteria) this;
        }

        public Criteria andMerseqnbrNotEqualTo(String value) {
            addCriterion("MERSEQNBR <>", value, "merseqnbr");
            return (Criteria) this;
        }

        public Criteria andMerseqnbrGreaterThan(String value) {
            addCriterion("MERSEQNBR >", value, "merseqnbr");
            return (Criteria) this;
        }

        public Criteria andMerseqnbrGreaterThanOrEqualTo(String value) {
            addCriterion("MERSEQNBR >=", value, "merseqnbr");
            return (Criteria) this;
        }

        public Criteria andMerseqnbrLessThan(String value) {
            addCriterion("MERSEQNBR <", value, "merseqnbr");
            return (Criteria) this;
        }

        public Criteria andMerseqnbrLessThanOrEqualTo(String value) {
            addCriterion("MERSEQNBR <=", value, "merseqnbr");
            return (Criteria) this;
        }

        public Criteria andMerseqnbrLike(String value) {
            addCriterion("MERSEQNBR like", value, "merseqnbr");
            return (Criteria) this;
        }

        public Criteria andMerseqnbrNotLike(String value) {
            addCriterion("MERSEQNBR not like", value, "merseqnbr");
            return (Criteria) this;
        }

        public Criteria andMerseqnbrIn(List<String> values) {
            addCriterion("MERSEQNBR in", values, "merseqnbr");
            return (Criteria) this;
        }

        public Criteria andMerseqnbrNotIn(List<String> values) {
            addCriterion("MERSEQNBR not in", values, "merseqnbr");
            return (Criteria) this;
        }

        public Criteria andMerseqnbrBetween(String value1, String value2) {
            addCriterion("MERSEQNBR between", value1, value2, "merseqnbr");
            return (Criteria) this;
        }

        public Criteria andMerseqnbrNotBetween(String value1, String value2) {
            addCriterion("MERSEQNBR not between", value1, value2, "merseqnbr");
            return (Criteria) this;
        }

        public Criteria andDownsystransnbrIsNull() {
            addCriterion("DOWNSYSTRANSNBR is null");
            return (Criteria) this;
        }

        public Criteria andDownsystransnbrIsNotNull() {
            addCriterion("DOWNSYSTRANSNBR is not null");
            return (Criteria) this;
        }

        public Criteria andDownsystransnbrEqualTo(String value) {
            addCriterion("DOWNSYSTRANSNBR =", value, "downsystransnbr");
            return (Criteria) this;
        }

        public Criteria andDownsystransnbrNotEqualTo(String value) {
            addCriterion("DOWNSYSTRANSNBR <>", value, "downsystransnbr");
            return (Criteria) this;
        }

        public Criteria andDownsystransnbrGreaterThan(String value) {
            addCriterion("DOWNSYSTRANSNBR >", value, "downsystransnbr");
            return (Criteria) this;
        }

        public Criteria andDownsystransnbrGreaterThanOrEqualTo(String value) {
            addCriterion("DOWNSYSTRANSNBR >=", value, "downsystransnbr");
            return (Criteria) this;
        }

        public Criteria andDownsystransnbrLessThan(String value) {
            addCriterion("DOWNSYSTRANSNBR <", value, "downsystransnbr");
            return (Criteria) this;
        }

        public Criteria andDownsystransnbrLessThanOrEqualTo(String value) {
            addCriterion("DOWNSYSTRANSNBR <=", value, "downsystransnbr");
            return (Criteria) this;
        }

        public Criteria andDownsystransnbrLike(String value) {
            addCriterion("DOWNSYSTRANSNBR like", value, "downsystransnbr");
            return (Criteria) this;
        }

        public Criteria andDownsystransnbrNotLike(String value) {
            addCriterion("DOWNSYSTRANSNBR not like", value, "downsystransnbr");
            return (Criteria) this;
        }

        public Criteria andDownsystransnbrIn(List<String> values) {
            addCriterion("DOWNSYSTRANSNBR in", values, "downsystransnbr");
            return (Criteria) this;
        }

        public Criteria andDownsystransnbrNotIn(List<String> values) {
            addCriterion("DOWNSYSTRANSNBR not in", values, "downsystransnbr");
            return (Criteria) this;
        }

        public Criteria andDownsystransnbrBetween(String value1, String value2) {
            addCriterion("DOWNSYSTRANSNBR between", value1, value2, "downsystransnbr");
            return (Criteria) this;
        }

        public Criteria andDownsystransnbrNotBetween(String value1, String value2) {
            addCriterion("DOWNSYSTRANSNBR not between", value1, value2, "downsystransnbr");
            return (Criteria) this;
        }

        public Criteria andDownsystranstimeIsNull() {
            addCriterion("DOWNSYSTRANSTIME is null");
            return (Criteria) this;
        }

        public Criteria andDownsystranstimeIsNotNull() {
            addCriterion("DOWNSYSTRANSTIME is not null");
            return (Criteria) this;
        }

        public Criteria andDownsystranstimeEqualTo(Date value) {
            addCriterion("DOWNSYSTRANSTIME =", value, "downsystranstime");
            return (Criteria) this;
        }

        public Criteria andDownsystranstimeNotEqualTo(Date value) {
            addCriterion("DOWNSYSTRANSTIME <>", value, "downsystranstime");
            return (Criteria) this;
        }

        public Criteria andDownsystranstimeGreaterThan(Date value) {
            addCriterion("DOWNSYSTRANSTIME >", value, "downsystranstime");
            return (Criteria) this;
        }

        public Criteria andDownsystranstimeGreaterThanOrEqualTo(Date value) {
            addCriterion("DOWNSYSTRANSTIME >=", value, "downsystranstime");
            return (Criteria) this;
        }

        public Criteria andDownsystranstimeLessThan(Date value) {
            addCriterion("DOWNSYSTRANSTIME <", value, "downsystranstime");
            return (Criteria) this;
        }

        public Criteria andDownsystranstimeLessThanOrEqualTo(Date value) {
            addCriterion("DOWNSYSTRANSTIME <=", value, "downsystranstime");
            return (Criteria) this;
        }

        public Criteria andDownsystranstimeIn(List<Date> values) {
            addCriterion("DOWNSYSTRANSTIME in", values, "downsystranstime");
            return (Criteria) this;
        }

        public Criteria andDownsystranstimeNotIn(List<Date> values) {
            addCriterion("DOWNSYSTRANSTIME not in", values, "downsystranstime");
            return (Criteria) this;
        }

        public Criteria andDownsystranstimeBetween(Date value1, Date value2) {
            addCriterion("DOWNSYSTRANSTIME between", value1, value2, "downsystranstime");
            return (Criteria) this;
        }

        public Criteria andDownsystranstimeNotBetween(Date value1, Date value2) {
            addCriterion("DOWNSYSTRANSTIME not between", value1, value2, "downsystranstime");
            return (Criteria) this;
        }

        public Criteria andDownsystransdateIsNull() {
            addCriterion("DOWNSYSTRANSDATE is null");
            return (Criteria) this;
        }

        public Criteria andDownsystransdateIsNotNull() {
            addCriterion("DOWNSYSTRANSDATE is not null");
            return (Criteria) this;
        }

        public Criteria andDownsystransdateEqualTo(Date value) {
            addCriterionForJDBCDate("DOWNSYSTRANSDATE =", value, "downsystransdate");
            return (Criteria) this;
        }

        public Criteria andDownsystransdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("DOWNSYSTRANSDATE <>", value, "downsystransdate");
            return (Criteria) this;
        }

        public Criteria andDownsystransdateGreaterThan(Date value) {
            addCriterionForJDBCDate("DOWNSYSTRANSDATE >", value, "downsystransdate");
            return (Criteria) this;
        }

        public Criteria andDownsystransdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DOWNSYSTRANSDATE >=", value, "downsystransdate");
            return (Criteria) this;
        }

        public Criteria andDownsystransdateLessThan(Date value) {
            addCriterionForJDBCDate("DOWNSYSTRANSDATE <", value, "downsystransdate");
            return (Criteria) this;
        }

        public Criteria andDownsystransdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DOWNSYSTRANSDATE <=", value, "downsystransdate");
            return (Criteria) this;
        }

        public Criteria andDownsystransdateIn(List<Date> values) {
            addCriterionForJDBCDate("DOWNSYSTRANSDATE in", values, "downsystransdate");
            return (Criteria) this;
        }

        public Criteria andDownsystransdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("DOWNSYSTRANSDATE not in", values, "downsystransdate");
            return (Criteria) this;
        }

        public Criteria andDownsystransdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DOWNSYSTRANSDATE between", value1, value2, "downsystransdate");
            return (Criteria) this;
        }

        public Criteria andDownsystransdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DOWNSYSTRANSDATE not between", value1, value2, "downsystransdate");
            return (Criteria) this;
        }

        public Criteria andMertranstimeIsNull() {
            addCriterion("MERTRANSTIME is null");
            return (Criteria) this;
        }

        public Criteria andMertranstimeIsNotNull() {
            addCriterion("MERTRANSTIME is not null");
            return (Criteria) this;
        }

        public Criteria andMertranstimeEqualTo(Date value) {
            addCriterion("MERTRANSTIME =", value, "mertranstime");
            return (Criteria) this;
        }

        public Criteria andMertranstimeNotEqualTo(Date value) {
            addCriterion("MERTRANSTIME <>", value, "mertranstime");
            return (Criteria) this;
        }

        public Criteria andMertranstimeGreaterThan(Date value) {
            addCriterion("MERTRANSTIME >", value, "mertranstime");
            return (Criteria) this;
        }

        public Criteria andMertranstimeGreaterThanOrEqualTo(Date value) {
            addCriterion("MERTRANSTIME >=", value, "mertranstime");
            return (Criteria) this;
        }

        public Criteria andMertranstimeLessThan(Date value) {
            addCriterion("MERTRANSTIME <", value, "mertranstime");
            return (Criteria) this;
        }

        public Criteria andMertranstimeLessThanOrEqualTo(Date value) {
            addCriterion("MERTRANSTIME <=", value, "mertranstime");
            return (Criteria) this;
        }

        public Criteria andMertranstimeIn(List<Date> values) {
            addCriterion("MERTRANSTIME in", values, "mertranstime");
            return (Criteria) this;
        }

        public Criteria andMertranstimeNotIn(List<Date> values) {
            addCriterion("MERTRANSTIME not in", values, "mertranstime");
            return (Criteria) this;
        }

        public Criteria andMertranstimeBetween(Date value1, Date value2) {
            addCriterion("MERTRANSTIME between", value1, value2, "mertranstime");
            return (Criteria) this;
        }

        public Criteria andMertranstimeNotBetween(Date value1, Date value2) {
            addCriterion("MERTRANSTIME not between", value1, value2, "mertranstime");
            return (Criteria) this;
        }

        public Criteria andCleardateIsNull() {
            addCriterion("CLEARDATE is null");
            return (Criteria) this;
        }

        public Criteria andCleardateIsNotNull() {
            addCriterion("CLEARDATE is not null");
            return (Criteria) this;
        }

        public Criteria andCleardateEqualTo(Date value) {
            addCriterionForJDBCDate("CLEARDATE =", value, "cleardate");
            return (Criteria) this;
        }

        public Criteria andCleardateNotEqualTo(Date value) {
            addCriterionForJDBCDate("CLEARDATE <>", value, "cleardate");
            return (Criteria) this;
        }

        public Criteria andCleardateGreaterThan(Date value) {
            addCriterionForJDBCDate("CLEARDATE >", value, "cleardate");
            return (Criteria) this;
        }

        public Criteria andCleardateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CLEARDATE >=", value, "cleardate");
            return (Criteria) this;
        }

        public Criteria andCleardateLessThan(Date value) {
            addCriterionForJDBCDate("CLEARDATE <", value, "cleardate");
            return (Criteria) this;
        }

        public Criteria andCleardateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CLEARDATE <=", value, "cleardate");
            return (Criteria) this;
        }

        public Criteria andCleardateIn(List<Date> values) {
            addCriterionForJDBCDate("CLEARDATE in", values, "cleardate");
            return (Criteria) this;
        }

        public Criteria andCleardateNotIn(List<Date> values) {
            addCriterionForJDBCDate("CLEARDATE not in", values, "cleardate");
            return (Criteria) this;
        }

        public Criteria andCleardateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CLEARDATE between", value1, value2, "cleardate");
            return (Criteria) this;
        }

        public Criteria andCleardateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CLEARDATE not between", value1, value2, "cleardate");
            return (Criteria) this;
        }

        public Criteria andTranstimeIsNull() {
            addCriterion("TRANSTIME is null");
            return (Criteria) this;
        }

        public Criteria andTranstimeIsNotNull() {
            addCriterion("TRANSTIME is not null");
            return (Criteria) this;
        }

        public Criteria andTranstimeEqualTo(Date value) {
            addCriterion("TRANSTIME =", value, "transtime");
            return (Criteria) this;
        }

        public Criteria andTranstimeNotEqualTo(Date value) {
            addCriterion("TRANSTIME <>", value, "transtime");
            return (Criteria) this;
        }

        public Criteria andTranstimeGreaterThan(Date value) {
            addCriterion("TRANSTIME >", value, "transtime");
            return (Criteria) this;
        }

        public Criteria andTranstimeGreaterThanOrEqualTo(Date value) {
            addCriterion("TRANSTIME >=", value, "transtime");
            return (Criteria) this;
        }

        public Criteria andTranstimeLessThan(Date value) {
            addCriterion("TRANSTIME <", value, "transtime");
            return (Criteria) this;
        }

        public Criteria andTranstimeLessThanOrEqualTo(Date value) {
            addCriterion("TRANSTIME <=", value, "transtime");
            return (Criteria) this;
        }

        public Criteria andTranstimeIn(List<Date> values) {
            addCriterion("TRANSTIME in", values, "transtime");
            return (Criteria) this;
        }

        public Criteria andTranstimeNotIn(List<Date> values) {
            addCriterion("TRANSTIME not in", values, "transtime");
            return (Criteria) this;
        }

        public Criteria andTranstimeBetween(Date value1, Date value2) {
            addCriterion("TRANSTIME between", value1, value2, "transtime");
            return (Criteria) this;
        }

        public Criteria andTranstimeNotBetween(Date value1, Date value2) {
            addCriterion("TRANSTIME not between", value1, value2, "transtime");
            return (Criteria) this;
        }

        public Criteria andTranscodeIsNull() {
            addCriterion("TRANSCODE is null");
            return (Criteria) this;
        }

        public Criteria andTranscodeIsNotNull() {
            addCriterion("TRANSCODE is not null");
            return (Criteria) this;
        }

        public Criteria andTranscodeEqualTo(String value) {
            addCriterion("TRANSCODE =", value, "transcode");
            return (Criteria) this;
        }

        public Criteria andTranscodeNotEqualTo(String value) {
            addCriterion("TRANSCODE <>", value, "transcode");
            return (Criteria) this;
        }

        public Criteria andTranscodeGreaterThan(String value) {
            addCriterion("TRANSCODE >", value, "transcode");
            return (Criteria) this;
        }

        public Criteria andTranscodeGreaterThanOrEqualTo(String value) {
            addCriterion("TRANSCODE >=", value, "transcode");
            return (Criteria) this;
        }

        public Criteria andTranscodeLessThan(String value) {
            addCriterion("TRANSCODE <", value, "transcode");
            return (Criteria) this;
        }

        public Criteria andTranscodeLessThanOrEqualTo(String value) {
            addCriterion("TRANSCODE <=", value, "transcode");
            return (Criteria) this;
        }

        public Criteria andTranscodeLike(String value) {
            addCriterion("TRANSCODE like", value, "transcode");
            return (Criteria) this;
        }

        public Criteria andTranscodeNotLike(String value) {
            addCriterion("TRANSCODE not like", value, "transcode");
            return (Criteria) this;
        }

        public Criteria andTranscodeIn(List<String> values) {
            addCriterion("TRANSCODE in", values, "transcode");
            return (Criteria) this;
        }

        public Criteria andTranscodeNotIn(List<String> values) {
            addCriterion("TRANSCODE not in", values, "transcode");
            return (Criteria) this;
        }

        public Criteria andTranscodeBetween(String value1, String value2) {
            addCriterion("TRANSCODE between", value1, value2, "transcode");
            return (Criteria) this;
        }

        public Criteria andTranscodeNotBetween(String value1, String value2) {
            addCriterion("TRANSCODE not between", value1, value2, "transcode");
            return (Criteria) this;
        }

        public Criteria andPayercardtypcdIsNull() {
            addCriterion("PAYERCARDTYPCD is null");
            return (Criteria) this;
        }

        public Criteria andPayercardtypcdIsNotNull() {
            addCriterion("PAYERCARDTYPCD is not null");
            return (Criteria) this;
        }

        public Criteria andPayercardtypcdEqualTo(String value) {
            addCriterion("PAYERCARDTYPCD =", value, "payercardtypcd");
            return (Criteria) this;
        }

        public Criteria andPayercardtypcdNotEqualTo(String value) {
            addCriterion("PAYERCARDTYPCD <>", value, "payercardtypcd");
            return (Criteria) this;
        }

        public Criteria andPayercardtypcdGreaterThan(String value) {
            addCriterion("PAYERCARDTYPCD >", value, "payercardtypcd");
            return (Criteria) this;
        }

        public Criteria andPayercardtypcdGreaterThanOrEqualTo(String value) {
            addCriterion("PAYERCARDTYPCD >=", value, "payercardtypcd");
            return (Criteria) this;
        }

        public Criteria andPayercardtypcdLessThan(String value) {
            addCriterion("PAYERCARDTYPCD <", value, "payercardtypcd");
            return (Criteria) this;
        }

        public Criteria andPayercardtypcdLessThanOrEqualTo(String value) {
            addCriterion("PAYERCARDTYPCD <=", value, "payercardtypcd");
            return (Criteria) this;
        }

        public Criteria andPayercardtypcdLike(String value) {
            addCriterion("PAYERCARDTYPCD like", value, "payercardtypcd");
            return (Criteria) this;
        }

        public Criteria andPayercardtypcdNotLike(String value) {
            addCriterion("PAYERCARDTYPCD not like", value, "payercardtypcd");
            return (Criteria) this;
        }

        public Criteria andPayercardtypcdIn(List<String> values) {
            addCriterion("PAYERCARDTYPCD in", values, "payercardtypcd");
            return (Criteria) this;
        }

        public Criteria andPayercardtypcdNotIn(List<String> values) {
            addCriterion("PAYERCARDTYPCD not in", values, "payercardtypcd");
            return (Criteria) this;
        }

        public Criteria andPayercardtypcdBetween(String value1, String value2) {
            addCriterion("PAYERCARDTYPCD between", value1, value2, "payercardtypcd");
            return (Criteria) this;
        }

        public Criteria andPayercardtypcdNotBetween(String value1, String value2) {
            addCriterion("PAYERCARDTYPCD not between", value1, value2, "payercardtypcd");
            return (Criteria) this;
        }

        public Criteria andPayeecardtypcdIsNull() {
            addCriterion("PAYEECARDTYPCD is null");
            return (Criteria) this;
        }

        public Criteria andPayeecardtypcdIsNotNull() {
            addCriterion("PAYEECARDTYPCD is not null");
            return (Criteria) this;
        }

        public Criteria andPayeecardtypcdEqualTo(String value) {
            addCriterion("PAYEECARDTYPCD =", value, "payeecardtypcd");
            return (Criteria) this;
        }

        public Criteria andPayeecardtypcdNotEqualTo(String value) {
            addCriterion("PAYEECARDTYPCD <>", value, "payeecardtypcd");
            return (Criteria) this;
        }

        public Criteria andPayeecardtypcdGreaterThan(String value) {
            addCriterion("PAYEECARDTYPCD >", value, "payeecardtypcd");
            return (Criteria) this;
        }

        public Criteria andPayeecardtypcdGreaterThanOrEqualTo(String value) {
            addCriterion("PAYEECARDTYPCD >=", value, "payeecardtypcd");
            return (Criteria) this;
        }

        public Criteria andPayeecardtypcdLessThan(String value) {
            addCriterion("PAYEECARDTYPCD <", value, "payeecardtypcd");
            return (Criteria) this;
        }

        public Criteria andPayeecardtypcdLessThanOrEqualTo(String value) {
            addCriterion("PAYEECARDTYPCD <=", value, "payeecardtypcd");
            return (Criteria) this;
        }

        public Criteria andPayeecardtypcdLike(String value) {
            addCriterion("PAYEECARDTYPCD like", value, "payeecardtypcd");
            return (Criteria) this;
        }

        public Criteria andPayeecardtypcdNotLike(String value) {
            addCriterion("PAYEECARDTYPCD not like", value, "payeecardtypcd");
            return (Criteria) this;
        }

        public Criteria andPayeecardtypcdIn(List<String> values) {
            addCriterion("PAYEECARDTYPCD in", values, "payeecardtypcd");
            return (Criteria) this;
        }

        public Criteria andPayeecardtypcdNotIn(List<String> values) {
            addCriterion("PAYEECARDTYPCD not in", values, "payeecardtypcd");
            return (Criteria) this;
        }

        public Criteria andPayeecardtypcdBetween(String value1, String value2) {
            addCriterion("PAYEECARDTYPCD between", value1, value2, "payeecardtypcd");
            return (Criteria) this;
        }

        public Criteria andPayeecardtypcdNotBetween(String value1, String value2) {
            addCriterion("PAYEECARDTYPCD not between", value1, value2, "payeecardtypcd");
            return (Criteria) this;
        }

        public Criteria andPayeracctnbrIsNull() {
            addCriterion("PAYERACCTNBR is null");
            return (Criteria) this;
        }

        public Criteria andPayeracctnbrIsNotNull() {
            addCriterion("PAYERACCTNBR is not null");
            return (Criteria) this;
        }

        public Criteria andPayeracctnbrEqualTo(String value) {
            addCriterion("PAYERACCTNBR =", value, "payeracctnbr");
            return (Criteria) this;
        }

        public Criteria andPayeracctnbrNotEqualTo(String value) {
            addCriterion("PAYERACCTNBR <>", value, "payeracctnbr");
            return (Criteria) this;
        }

        public Criteria andPayeracctnbrGreaterThan(String value) {
            addCriterion("PAYERACCTNBR >", value, "payeracctnbr");
            return (Criteria) this;
        }

        public Criteria andPayeracctnbrGreaterThanOrEqualTo(String value) {
            addCriterion("PAYERACCTNBR >=", value, "payeracctnbr");
            return (Criteria) this;
        }

        public Criteria andPayeracctnbrLessThan(String value) {
            addCriterion("PAYERACCTNBR <", value, "payeracctnbr");
            return (Criteria) this;
        }

        public Criteria andPayeracctnbrLessThanOrEqualTo(String value) {
            addCriterion("PAYERACCTNBR <=", value, "payeracctnbr");
            return (Criteria) this;
        }

        public Criteria andPayeracctnbrLike(String value) {
            addCriterion("PAYERACCTNBR like", value, "payeracctnbr");
            return (Criteria) this;
        }

        public Criteria andPayeracctnbrNotLike(String value) {
            addCriterion("PAYERACCTNBR not like", value, "payeracctnbr");
            return (Criteria) this;
        }

        public Criteria andPayeracctnbrIn(List<String> values) {
            addCriterion("PAYERACCTNBR in", values, "payeracctnbr");
            return (Criteria) this;
        }

        public Criteria andPayeracctnbrNotIn(List<String> values) {
            addCriterion("PAYERACCTNBR not in", values, "payeracctnbr");
            return (Criteria) this;
        }

        public Criteria andPayeracctnbrBetween(String value1, String value2) {
            addCriterion("PAYERACCTNBR between", value1, value2, "payeracctnbr");
            return (Criteria) this;
        }

        public Criteria andPayeracctnbrNotBetween(String value1, String value2) {
            addCriterion("PAYERACCTNBR not between", value1, value2, "payeracctnbr");
            return (Criteria) this;
        }

        public Criteria andPayeraccttypcdIsNull() {
            addCriterion("PAYERACCTTYPCD is null");
            return (Criteria) this;
        }

        public Criteria andPayeraccttypcdIsNotNull() {
            addCriterion("PAYERACCTTYPCD is not null");
            return (Criteria) this;
        }

        public Criteria andPayeraccttypcdEqualTo(String value) {
            addCriterion("PAYERACCTTYPCD =", value, "payeraccttypcd");
            return (Criteria) this;
        }

        public Criteria andPayeraccttypcdNotEqualTo(String value) {
            addCriterion("PAYERACCTTYPCD <>", value, "payeraccttypcd");
            return (Criteria) this;
        }

        public Criteria andPayeraccttypcdGreaterThan(String value) {
            addCriterion("PAYERACCTTYPCD >", value, "payeraccttypcd");
            return (Criteria) this;
        }

        public Criteria andPayeraccttypcdGreaterThanOrEqualTo(String value) {
            addCriterion("PAYERACCTTYPCD >=", value, "payeraccttypcd");
            return (Criteria) this;
        }

        public Criteria andPayeraccttypcdLessThan(String value) {
            addCriterion("PAYERACCTTYPCD <", value, "payeraccttypcd");
            return (Criteria) this;
        }

        public Criteria andPayeraccttypcdLessThanOrEqualTo(String value) {
            addCriterion("PAYERACCTTYPCD <=", value, "payeraccttypcd");
            return (Criteria) this;
        }

        public Criteria andPayeraccttypcdLike(String value) {
            addCriterion("PAYERACCTTYPCD like", value, "payeraccttypcd");
            return (Criteria) this;
        }

        public Criteria andPayeraccttypcdNotLike(String value) {
            addCriterion("PAYERACCTTYPCD not like", value, "payeraccttypcd");
            return (Criteria) this;
        }

        public Criteria andPayeraccttypcdIn(List<String> values) {
            addCriterion("PAYERACCTTYPCD in", values, "payeraccttypcd");
            return (Criteria) this;
        }

        public Criteria andPayeraccttypcdNotIn(List<String> values) {
            addCriterion("PAYERACCTTYPCD not in", values, "payeraccttypcd");
            return (Criteria) this;
        }

        public Criteria andPayeraccttypcdBetween(String value1, String value2) {
            addCriterion("PAYERACCTTYPCD between", value1, value2, "payeraccttypcd");
            return (Criteria) this;
        }

        public Criteria andPayeraccttypcdNotBetween(String value1, String value2) {
            addCriterion("PAYERACCTTYPCD not between", value1, value2, "payeraccttypcd");
            return (Criteria) this;
        }

        public Criteria andPayeracctkindIsNull() {
            addCriterion("PAYERACCTKIND is null");
            return (Criteria) this;
        }

        public Criteria andPayeracctkindIsNotNull() {
            addCriterion("PAYERACCTKIND is not null");
            return (Criteria) this;
        }

        public Criteria andPayeracctkindEqualTo(String value) {
            addCriterion("PAYERACCTKIND =", value, "payeracctkind");
            return (Criteria) this;
        }

        public Criteria andPayeracctkindNotEqualTo(String value) {
            addCriterion("PAYERACCTKIND <>", value, "payeracctkind");
            return (Criteria) this;
        }

        public Criteria andPayeracctkindGreaterThan(String value) {
            addCriterion("PAYERACCTKIND >", value, "payeracctkind");
            return (Criteria) this;
        }

        public Criteria andPayeracctkindGreaterThanOrEqualTo(String value) {
            addCriterion("PAYERACCTKIND >=", value, "payeracctkind");
            return (Criteria) this;
        }

        public Criteria andPayeracctkindLessThan(String value) {
            addCriterion("PAYERACCTKIND <", value, "payeracctkind");
            return (Criteria) this;
        }

        public Criteria andPayeracctkindLessThanOrEqualTo(String value) {
            addCriterion("PAYERACCTKIND <=", value, "payeracctkind");
            return (Criteria) this;
        }

        public Criteria andPayeracctkindLike(String value) {
            addCriterion("PAYERACCTKIND like", value, "payeracctkind");
            return (Criteria) this;
        }

        public Criteria andPayeracctkindNotLike(String value) {
            addCriterion("PAYERACCTKIND not like", value, "payeracctkind");
            return (Criteria) this;
        }

        public Criteria andPayeracctkindIn(List<String> values) {
            addCriterion("PAYERACCTKIND in", values, "payeracctkind");
            return (Criteria) this;
        }

        public Criteria andPayeracctkindNotIn(List<String> values) {
            addCriterion("PAYERACCTKIND not in", values, "payeracctkind");
            return (Criteria) this;
        }

        public Criteria andPayeracctkindBetween(String value1, String value2) {
            addCriterion("PAYERACCTKIND between", value1, value2, "payeracctkind");
            return (Criteria) this;
        }

        public Criteria andPayeracctkindNotBetween(String value1, String value2) {
            addCriterion("PAYERACCTKIND not between", value1, value2, "payeracctkind");
            return (Criteria) this;
        }

        public Criteria andPayeracctdeptnbrIsNull() {
            addCriterion("PAYERACCTDEPTNBR is null");
            return (Criteria) this;
        }

        public Criteria andPayeracctdeptnbrIsNotNull() {
            addCriterion("PAYERACCTDEPTNBR is not null");
            return (Criteria) this;
        }

        public Criteria andPayeracctdeptnbrEqualTo(String value) {
            addCriterion("PAYERACCTDEPTNBR =", value, "payeracctdeptnbr");
            return (Criteria) this;
        }

        public Criteria andPayeracctdeptnbrNotEqualTo(String value) {
            addCriterion("PAYERACCTDEPTNBR <>", value, "payeracctdeptnbr");
            return (Criteria) this;
        }

        public Criteria andPayeracctdeptnbrGreaterThan(String value) {
            addCriterion("PAYERACCTDEPTNBR >", value, "payeracctdeptnbr");
            return (Criteria) this;
        }

        public Criteria andPayeracctdeptnbrGreaterThanOrEqualTo(String value) {
            addCriterion("PAYERACCTDEPTNBR >=", value, "payeracctdeptnbr");
            return (Criteria) this;
        }

        public Criteria andPayeracctdeptnbrLessThan(String value) {
            addCriterion("PAYERACCTDEPTNBR <", value, "payeracctdeptnbr");
            return (Criteria) this;
        }

        public Criteria andPayeracctdeptnbrLessThanOrEqualTo(String value) {
            addCriterion("PAYERACCTDEPTNBR <=", value, "payeracctdeptnbr");
            return (Criteria) this;
        }

        public Criteria andPayeracctdeptnbrLike(String value) {
            addCriterion("PAYERACCTDEPTNBR like", value, "payeracctdeptnbr");
            return (Criteria) this;
        }

        public Criteria andPayeracctdeptnbrNotLike(String value) {
            addCriterion("PAYERACCTDEPTNBR not like", value, "payeracctdeptnbr");
            return (Criteria) this;
        }

        public Criteria andPayeracctdeptnbrIn(List<String> values) {
            addCriterion("PAYERACCTDEPTNBR in", values, "payeracctdeptnbr");
            return (Criteria) this;
        }

        public Criteria andPayeracctdeptnbrNotIn(List<String> values) {
            addCriterion("PAYERACCTDEPTNBR not in", values, "payeracctdeptnbr");
            return (Criteria) this;
        }

        public Criteria andPayeracctdeptnbrBetween(String value1, String value2) {
            addCriterion("PAYERACCTDEPTNBR between", value1, value2, "payeracctdeptnbr");
            return (Criteria) this;
        }

        public Criteria andPayeracctdeptnbrNotBetween(String value1, String value2) {
            addCriterion("PAYERACCTDEPTNBR not between", value1, value2, "payeracctdeptnbr");
            return (Criteria) this;
        }

        public Criteria andPayeracctnameIsNull() {
            addCriterion("PAYERACCTNAME is null");
            return (Criteria) this;
        }

        public Criteria andPayeracctnameIsNotNull() {
            addCriterion("PAYERACCTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andPayeracctnameEqualTo(String value) {
            addCriterion("PAYERACCTNAME =", value, "payeracctname");
            return (Criteria) this;
        }

        public Criteria andPayeracctnameNotEqualTo(String value) {
            addCriterion("PAYERACCTNAME <>", value, "payeracctname");
            return (Criteria) this;
        }

        public Criteria andPayeracctnameGreaterThan(String value) {
            addCriterion("PAYERACCTNAME >", value, "payeracctname");
            return (Criteria) this;
        }

        public Criteria andPayeracctnameGreaterThanOrEqualTo(String value) {
            addCriterion("PAYERACCTNAME >=", value, "payeracctname");
            return (Criteria) this;
        }

        public Criteria andPayeracctnameLessThan(String value) {
            addCriterion("PAYERACCTNAME <", value, "payeracctname");
            return (Criteria) this;
        }

        public Criteria andPayeracctnameLessThanOrEqualTo(String value) {
            addCriterion("PAYERACCTNAME <=", value, "payeracctname");
            return (Criteria) this;
        }

        public Criteria andPayeracctnameLike(String value) {
            addCriterion("PAYERACCTNAME like", value, "payeracctname");
            return (Criteria) this;
        }

        public Criteria andPayeracctnameNotLike(String value) {
            addCriterion("PAYERACCTNAME not like", value, "payeracctname");
            return (Criteria) this;
        }

        public Criteria andPayeracctnameIn(List<String> values) {
            addCriterion("PAYERACCTNAME in", values, "payeracctname");
            return (Criteria) this;
        }

        public Criteria andPayeracctnameNotIn(List<String> values) {
            addCriterion("PAYERACCTNAME not in", values, "payeracctname");
            return (Criteria) this;
        }

        public Criteria andPayeracctnameBetween(String value1, String value2) {
            addCriterion("PAYERACCTNAME between", value1, value2, "payeracctname");
            return (Criteria) this;
        }

        public Criteria andPayeracctnameNotBetween(String value1, String value2) {
            addCriterion("PAYERACCTNAME not between", value1, value2, "payeracctname");
            return (Criteria) this;
        }

        public Criteria andPayeeacctnbrIsNull() {
            addCriterion("PAYEEACCTNBR is null");
            return (Criteria) this;
        }

        public Criteria andPayeeacctnbrIsNotNull() {
            addCriterion("PAYEEACCTNBR is not null");
            return (Criteria) this;
        }

        public Criteria andPayeeacctnbrEqualTo(String value) {
            addCriterion("PAYEEACCTNBR =", value, "payeeacctnbr");
            return (Criteria) this;
        }

        public Criteria andPayeeacctnbrNotEqualTo(String value) {
            addCriterion("PAYEEACCTNBR <>", value, "payeeacctnbr");
            return (Criteria) this;
        }

        public Criteria andPayeeacctnbrGreaterThan(String value) {
            addCriterion("PAYEEACCTNBR >", value, "payeeacctnbr");
            return (Criteria) this;
        }

        public Criteria andPayeeacctnbrGreaterThanOrEqualTo(String value) {
            addCriterion("PAYEEACCTNBR >=", value, "payeeacctnbr");
            return (Criteria) this;
        }

        public Criteria andPayeeacctnbrLessThan(String value) {
            addCriterion("PAYEEACCTNBR <", value, "payeeacctnbr");
            return (Criteria) this;
        }

        public Criteria andPayeeacctnbrLessThanOrEqualTo(String value) {
            addCriterion("PAYEEACCTNBR <=", value, "payeeacctnbr");
            return (Criteria) this;
        }

        public Criteria andPayeeacctnbrLike(String value) {
            addCriterion("PAYEEACCTNBR like", value, "payeeacctnbr");
            return (Criteria) this;
        }

        public Criteria andPayeeacctnbrNotLike(String value) {
            addCriterion("PAYEEACCTNBR not like", value, "payeeacctnbr");
            return (Criteria) this;
        }

        public Criteria andPayeeacctnbrIn(List<String> values) {
            addCriterion("PAYEEACCTNBR in", values, "payeeacctnbr");
            return (Criteria) this;
        }

        public Criteria andPayeeacctnbrNotIn(List<String> values) {
            addCriterion("PAYEEACCTNBR not in", values, "payeeacctnbr");
            return (Criteria) this;
        }

        public Criteria andPayeeacctnbrBetween(String value1, String value2) {
            addCriterion("PAYEEACCTNBR between", value1, value2, "payeeacctnbr");
            return (Criteria) this;
        }

        public Criteria andPayeeacctnbrNotBetween(String value1, String value2) {
            addCriterion("PAYEEACCTNBR not between", value1, value2, "payeeacctnbr");
            return (Criteria) this;
        }

        public Criteria andPayeeaccttypcdIsNull() {
            addCriterion("PAYEEACCTTYPCD is null");
            return (Criteria) this;
        }

        public Criteria andPayeeaccttypcdIsNotNull() {
            addCriterion("PAYEEACCTTYPCD is not null");
            return (Criteria) this;
        }

        public Criteria andPayeeaccttypcdEqualTo(String value) {
            addCriterion("PAYEEACCTTYPCD =", value, "payeeaccttypcd");
            return (Criteria) this;
        }

        public Criteria andPayeeaccttypcdNotEqualTo(String value) {
            addCriterion("PAYEEACCTTYPCD <>", value, "payeeaccttypcd");
            return (Criteria) this;
        }

        public Criteria andPayeeaccttypcdGreaterThan(String value) {
            addCriterion("PAYEEACCTTYPCD >", value, "payeeaccttypcd");
            return (Criteria) this;
        }

        public Criteria andPayeeaccttypcdGreaterThanOrEqualTo(String value) {
            addCriterion("PAYEEACCTTYPCD >=", value, "payeeaccttypcd");
            return (Criteria) this;
        }

        public Criteria andPayeeaccttypcdLessThan(String value) {
            addCriterion("PAYEEACCTTYPCD <", value, "payeeaccttypcd");
            return (Criteria) this;
        }

        public Criteria andPayeeaccttypcdLessThanOrEqualTo(String value) {
            addCriterion("PAYEEACCTTYPCD <=", value, "payeeaccttypcd");
            return (Criteria) this;
        }

        public Criteria andPayeeaccttypcdLike(String value) {
            addCriterion("PAYEEACCTTYPCD like", value, "payeeaccttypcd");
            return (Criteria) this;
        }

        public Criteria andPayeeaccttypcdNotLike(String value) {
            addCriterion("PAYEEACCTTYPCD not like", value, "payeeaccttypcd");
            return (Criteria) this;
        }

        public Criteria andPayeeaccttypcdIn(List<String> values) {
            addCriterion("PAYEEACCTTYPCD in", values, "payeeaccttypcd");
            return (Criteria) this;
        }

        public Criteria andPayeeaccttypcdNotIn(List<String> values) {
            addCriterion("PAYEEACCTTYPCD not in", values, "payeeaccttypcd");
            return (Criteria) this;
        }

        public Criteria andPayeeaccttypcdBetween(String value1, String value2) {
            addCriterion("PAYEEACCTTYPCD between", value1, value2, "payeeaccttypcd");
            return (Criteria) this;
        }

        public Criteria andPayeeaccttypcdNotBetween(String value1, String value2) {
            addCriterion("PAYEEACCTTYPCD not between", value1, value2, "payeeaccttypcd");
            return (Criteria) this;
        }

        public Criteria andPayeeacctkindIsNull() {
            addCriterion("PAYEEACCTKIND is null");
            return (Criteria) this;
        }

        public Criteria andPayeeacctkindIsNotNull() {
            addCriterion("PAYEEACCTKIND is not null");
            return (Criteria) this;
        }

        public Criteria andPayeeacctkindEqualTo(String value) {
            addCriterion("PAYEEACCTKIND =", value, "payeeacctkind");
            return (Criteria) this;
        }

        public Criteria andPayeeacctkindNotEqualTo(String value) {
            addCriterion("PAYEEACCTKIND <>", value, "payeeacctkind");
            return (Criteria) this;
        }

        public Criteria andPayeeacctkindGreaterThan(String value) {
            addCriterion("PAYEEACCTKIND >", value, "payeeacctkind");
            return (Criteria) this;
        }

        public Criteria andPayeeacctkindGreaterThanOrEqualTo(String value) {
            addCriterion("PAYEEACCTKIND >=", value, "payeeacctkind");
            return (Criteria) this;
        }

        public Criteria andPayeeacctkindLessThan(String value) {
            addCriterion("PAYEEACCTKIND <", value, "payeeacctkind");
            return (Criteria) this;
        }

        public Criteria andPayeeacctkindLessThanOrEqualTo(String value) {
            addCriterion("PAYEEACCTKIND <=", value, "payeeacctkind");
            return (Criteria) this;
        }

        public Criteria andPayeeacctkindLike(String value) {
            addCriterion("PAYEEACCTKIND like", value, "payeeacctkind");
            return (Criteria) this;
        }

        public Criteria andPayeeacctkindNotLike(String value) {
            addCriterion("PAYEEACCTKIND not like", value, "payeeacctkind");
            return (Criteria) this;
        }

        public Criteria andPayeeacctkindIn(List<String> values) {
            addCriterion("PAYEEACCTKIND in", values, "payeeacctkind");
            return (Criteria) this;
        }

        public Criteria andPayeeacctkindNotIn(List<String> values) {
            addCriterion("PAYEEACCTKIND not in", values, "payeeacctkind");
            return (Criteria) this;
        }

        public Criteria andPayeeacctkindBetween(String value1, String value2) {
            addCriterion("PAYEEACCTKIND between", value1, value2, "payeeacctkind");
            return (Criteria) this;
        }

        public Criteria andPayeeacctkindNotBetween(String value1, String value2) {
            addCriterion("PAYEEACCTKIND not between", value1, value2, "payeeacctkind");
            return (Criteria) this;
        }

        public Criteria andPayeeacctdeptnbrIsNull() {
            addCriterion("PAYEEACCTDEPTNBR is null");
            return (Criteria) this;
        }

        public Criteria andPayeeacctdeptnbrIsNotNull() {
            addCriterion("PAYEEACCTDEPTNBR is not null");
            return (Criteria) this;
        }

        public Criteria andPayeeacctdeptnbrEqualTo(String value) {
            addCriterion("PAYEEACCTDEPTNBR =", value, "payeeacctdeptnbr");
            return (Criteria) this;
        }

        public Criteria andPayeeacctdeptnbrNotEqualTo(String value) {
            addCriterion("PAYEEACCTDEPTNBR <>", value, "payeeacctdeptnbr");
            return (Criteria) this;
        }

        public Criteria andPayeeacctdeptnbrGreaterThan(String value) {
            addCriterion("PAYEEACCTDEPTNBR >", value, "payeeacctdeptnbr");
            return (Criteria) this;
        }

        public Criteria andPayeeacctdeptnbrGreaterThanOrEqualTo(String value) {
            addCriterion("PAYEEACCTDEPTNBR >=", value, "payeeacctdeptnbr");
            return (Criteria) this;
        }

        public Criteria andPayeeacctdeptnbrLessThan(String value) {
            addCriterion("PAYEEACCTDEPTNBR <", value, "payeeacctdeptnbr");
            return (Criteria) this;
        }

        public Criteria andPayeeacctdeptnbrLessThanOrEqualTo(String value) {
            addCriterion("PAYEEACCTDEPTNBR <=", value, "payeeacctdeptnbr");
            return (Criteria) this;
        }

        public Criteria andPayeeacctdeptnbrLike(String value) {
            addCriterion("PAYEEACCTDEPTNBR like", value, "payeeacctdeptnbr");
            return (Criteria) this;
        }

        public Criteria andPayeeacctdeptnbrNotLike(String value) {
            addCriterion("PAYEEACCTDEPTNBR not like", value, "payeeacctdeptnbr");
            return (Criteria) this;
        }

        public Criteria andPayeeacctdeptnbrIn(List<String> values) {
            addCriterion("PAYEEACCTDEPTNBR in", values, "payeeacctdeptnbr");
            return (Criteria) this;
        }

        public Criteria andPayeeacctdeptnbrNotIn(List<String> values) {
            addCriterion("PAYEEACCTDEPTNBR not in", values, "payeeacctdeptnbr");
            return (Criteria) this;
        }

        public Criteria andPayeeacctdeptnbrBetween(String value1, String value2) {
            addCriterion("PAYEEACCTDEPTNBR between", value1, value2, "payeeacctdeptnbr");
            return (Criteria) this;
        }

        public Criteria andPayeeacctdeptnbrNotBetween(String value1, String value2) {
            addCriterion("PAYEEACCTDEPTNBR not between", value1, value2, "payeeacctdeptnbr");
            return (Criteria) this;
        }

        public Criteria andPayeeacctnameIsNull() {
            addCriterion("PAYEEACCTNAME is null");
            return (Criteria) this;
        }

        public Criteria andPayeeacctnameIsNotNull() {
            addCriterion("PAYEEACCTNAME is not null");
            return (Criteria) this;
        }

        public Criteria andPayeeacctnameEqualTo(String value) {
            addCriterion("PAYEEACCTNAME =", value, "payeeacctname");
            return (Criteria) this;
        }

        public Criteria andPayeeacctnameNotEqualTo(String value) {
            addCriterion("PAYEEACCTNAME <>", value, "payeeacctname");
            return (Criteria) this;
        }

        public Criteria andPayeeacctnameGreaterThan(String value) {
            addCriterion("PAYEEACCTNAME >", value, "payeeacctname");
            return (Criteria) this;
        }

        public Criteria andPayeeacctnameGreaterThanOrEqualTo(String value) {
            addCriterion("PAYEEACCTNAME >=", value, "payeeacctname");
            return (Criteria) this;
        }

        public Criteria andPayeeacctnameLessThan(String value) {
            addCriterion("PAYEEACCTNAME <", value, "payeeacctname");
            return (Criteria) this;
        }

        public Criteria andPayeeacctnameLessThanOrEqualTo(String value) {
            addCriterion("PAYEEACCTNAME <=", value, "payeeacctname");
            return (Criteria) this;
        }

        public Criteria andPayeeacctnameLike(String value) {
            addCriterion("PAYEEACCTNAME like", value, "payeeacctname");
            return (Criteria) this;
        }

        public Criteria andPayeeacctnameNotLike(String value) {
            addCriterion("PAYEEACCTNAME not like", value, "payeeacctname");
            return (Criteria) this;
        }

        public Criteria andPayeeacctnameIn(List<String> values) {
            addCriterion("PAYEEACCTNAME in", values, "payeeacctname");
            return (Criteria) this;
        }

        public Criteria andPayeeacctnameNotIn(List<String> values) {
            addCriterion("PAYEEACCTNAME not in", values, "payeeacctname");
            return (Criteria) this;
        }

        public Criteria andPayeeacctnameBetween(String value1, String value2) {
            addCriterion("PAYEEACCTNAME between", value1, value2, "payeeacctname");
            return (Criteria) this;
        }

        public Criteria andPayeeacctnameNotBetween(String value1, String value2) {
            addCriterion("PAYEEACCTNAME not between", value1, value2, "payeeacctname");
            return (Criteria) this;
        }

        public Criteria andCurrencycdIsNull() {
            addCriterion("CURRENCYCD is null");
            return (Criteria) this;
        }

        public Criteria andCurrencycdIsNotNull() {
            addCriterion("CURRENCYCD is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencycdEqualTo(String value) {
            addCriterion("CURRENCYCD =", value, "currencycd");
            return (Criteria) this;
        }

        public Criteria andCurrencycdNotEqualTo(String value) {
            addCriterion("CURRENCYCD <>", value, "currencycd");
            return (Criteria) this;
        }

        public Criteria andCurrencycdGreaterThan(String value) {
            addCriterion("CURRENCYCD >", value, "currencycd");
            return (Criteria) this;
        }

        public Criteria andCurrencycdGreaterThanOrEqualTo(String value) {
            addCriterion("CURRENCYCD >=", value, "currencycd");
            return (Criteria) this;
        }

        public Criteria andCurrencycdLessThan(String value) {
            addCriterion("CURRENCYCD <", value, "currencycd");
            return (Criteria) this;
        }

        public Criteria andCurrencycdLessThanOrEqualTo(String value) {
            addCriterion("CURRENCYCD <=", value, "currencycd");
            return (Criteria) this;
        }

        public Criteria andCurrencycdLike(String value) {
            addCriterion("CURRENCYCD like", value, "currencycd");
            return (Criteria) this;
        }

        public Criteria andCurrencycdNotLike(String value) {
            addCriterion("CURRENCYCD not like", value, "currencycd");
            return (Criteria) this;
        }

        public Criteria andCurrencycdIn(List<String> values) {
            addCriterion("CURRENCYCD in", values, "currencycd");
            return (Criteria) this;
        }

        public Criteria andCurrencycdNotIn(List<String> values) {
            addCriterion("CURRENCYCD not in", values, "currencycd");
            return (Criteria) this;
        }

        public Criteria andCurrencycdBetween(String value1, String value2) {
            addCriterion("CURRENCYCD between", value1, value2, "currencycd");
            return (Criteria) this;
        }

        public Criteria andCurrencycdNotBetween(String value1, String value2) {
            addCriterion("CURRENCYCD not between", value1, value2, "currencycd");
            return (Criteria) this;
        }

        public Criteria andTransamtIsNull() {
            addCriterion("TRANSAMT is null");
            return (Criteria) this;
        }

        public Criteria andTransamtIsNotNull() {
            addCriterion("TRANSAMT is not null");
            return (Criteria) this;
        }

        public Criteria andTransamtEqualTo(BigDecimal value) {
            addCriterion("TRANSAMT =", value, "transamt");
            return (Criteria) this;
        }

        public Criteria andTransamtNotEqualTo(BigDecimal value) {
            addCriterion("TRANSAMT <>", value, "transamt");
            return (Criteria) this;
        }

        public Criteria andTransamtGreaterThan(BigDecimal value) {
            addCriterion("TRANSAMT >", value, "transamt");
            return (Criteria) this;
        }

        public Criteria andTransamtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TRANSAMT >=", value, "transamt");
            return (Criteria) this;
        }

        public Criteria andTransamtLessThan(BigDecimal value) {
            addCriterion("TRANSAMT <", value, "transamt");
            return (Criteria) this;
        }

        public Criteria andTransamtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TRANSAMT <=", value, "transamt");
            return (Criteria) this;
        }

        public Criteria andTransamtIn(List<BigDecimal> values) {
            addCriterion("TRANSAMT in", values, "transamt");
            return (Criteria) this;
        }

        public Criteria andTransamtNotIn(List<BigDecimal> values) {
            addCriterion("TRANSAMT not in", values, "transamt");
            return (Criteria) this;
        }

        public Criteria andTransamtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRANSAMT between", value1, value2, "transamt");
            return (Criteria) this;
        }

        public Criteria andTransamtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRANSAMT not between", value1, value2, "transamt");
            return (Criteria) this;
        }

        public Criteria andRefundedamtIsNull() {
            addCriterion("REFUNDEDAMT is null");
            return (Criteria) this;
        }

        public Criteria andRefundedamtIsNotNull() {
            addCriterion("REFUNDEDAMT is not null");
            return (Criteria) this;
        }

        public Criteria andRefundedamtEqualTo(BigDecimal value) {
            addCriterion("REFUNDEDAMT =", value, "refundedamt");
            return (Criteria) this;
        }

        public Criteria andRefundedamtNotEqualTo(BigDecimal value) {
            addCriterion("REFUNDEDAMT <>", value, "refundedamt");
            return (Criteria) this;
        }

        public Criteria andRefundedamtGreaterThan(BigDecimal value) {
            addCriterion("REFUNDEDAMT >", value, "refundedamt");
            return (Criteria) this;
        }

        public Criteria andRefundedamtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("REFUNDEDAMT >=", value, "refundedamt");
            return (Criteria) this;
        }

        public Criteria andRefundedamtLessThan(BigDecimal value) {
            addCriterion("REFUNDEDAMT <", value, "refundedamt");
            return (Criteria) this;
        }

        public Criteria andRefundedamtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("REFUNDEDAMT <=", value, "refundedamt");
            return (Criteria) this;
        }

        public Criteria andRefundedamtIn(List<BigDecimal> values) {
            addCriterion("REFUNDEDAMT in", values, "refundedamt");
            return (Criteria) this;
        }

        public Criteria andRefundedamtNotIn(List<BigDecimal> values) {
            addCriterion("REFUNDEDAMT not in", values, "refundedamt");
            return (Criteria) this;
        }

        public Criteria andRefundedamtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REFUNDEDAMT between", value1, value2, "refundedamt");
            return (Criteria) this;
        }

        public Criteria andRefundedamtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REFUNDEDAMT not between", value1, value2, "refundedamt");
            return (Criteria) this;
        }

        public Criteria andUnrefundedamtIsNull() {
            addCriterion("UNREFUNDEDAMT is null");
            return (Criteria) this;
        }

        public Criteria andUnrefundedamtIsNotNull() {
            addCriterion("UNREFUNDEDAMT is not null");
            return (Criteria) this;
        }

        public Criteria andUnrefundedamtEqualTo(BigDecimal value) {
            addCriterion("UNREFUNDEDAMT =", value, "unrefundedamt");
            return (Criteria) this;
        }

        public Criteria andUnrefundedamtNotEqualTo(BigDecimal value) {
            addCriterion("UNREFUNDEDAMT <>", value, "unrefundedamt");
            return (Criteria) this;
        }

        public Criteria andUnrefundedamtGreaterThan(BigDecimal value) {
            addCriterion("UNREFUNDEDAMT >", value, "unrefundedamt");
            return (Criteria) this;
        }

        public Criteria andUnrefundedamtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("UNREFUNDEDAMT >=", value, "unrefundedamt");
            return (Criteria) this;
        }

        public Criteria andUnrefundedamtLessThan(BigDecimal value) {
            addCriterion("UNREFUNDEDAMT <", value, "unrefundedamt");
            return (Criteria) this;
        }

        public Criteria andUnrefundedamtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("UNREFUNDEDAMT <=", value, "unrefundedamt");
            return (Criteria) this;
        }

        public Criteria andUnrefundedamtIn(List<BigDecimal> values) {
            addCriterion("UNREFUNDEDAMT in", values, "unrefundedamt");
            return (Criteria) this;
        }

        public Criteria andUnrefundedamtNotIn(List<BigDecimal> values) {
            addCriterion("UNREFUNDEDAMT not in", values, "unrefundedamt");
            return (Criteria) this;
        }

        public Criteria andUnrefundedamtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UNREFUNDEDAMT between", value1, value2, "unrefundedamt");
            return (Criteria) this;
        }

        public Criteria andUnrefundedamtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("UNREFUNDEDAMT not between", value1, value2, "unrefundedamt");
            return (Criteria) this;
        }

        public Criteria andRespcodeIsNull() {
            addCriterion("RESPCODE is null");
            return (Criteria) this;
        }

        public Criteria andRespcodeIsNotNull() {
            addCriterion("RESPCODE is not null");
            return (Criteria) this;
        }

        public Criteria andRespcodeEqualTo(String value) {
            addCriterion("RESPCODE =", value, "respcode");
            return (Criteria) this;
        }

        public Criteria andRespcodeNotEqualTo(String value) {
            addCriterion("RESPCODE <>", value, "respcode");
            return (Criteria) this;
        }

        public Criteria andRespcodeGreaterThan(String value) {
            addCriterion("RESPCODE >", value, "respcode");
            return (Criteria) this;
        }

        public Criteria andRespcodeGreaterThanOrEqualTo(String value) {
            addCriterion("RESPCODE >=", value, "respcode");
            return (Criteria) this;
        }

        public Criteria andRespcodeLessThan(String value) {
            addCriterion("RESPCODE <", value, "respcode");
            return (Criteria) this;
        }

        public Criteria andRespcodeLessThanOrEqualTo(String value) {
            addCriterion("RESPCODE <=", value, "respcode");
            return (Criteria) this;
        }

        public Criteria andRespcodeLike(String value) {
            addCriterion("RESPCODE like", value, "respcode");
            return (Criteria) this;
        }

        public Criteria andRespcodeNotLike(String value) {
            addCriterion("RESPCODE not like", value, "respcode");
            return (Criteria) this;
        }

        public Criteria andRespcodeIn(List<String> values) {
            addCriterion("RESPCODE in", values, "respcode");
            return (Criteria) this;
        }

        public Criteria andRespcodeNotIn(List<String> values) {
            addCriterion("RESPCODE not in", values, "respcode");
            return (Criteria) this;
        }

        public Criteria andRespcodeBetween(String value1, String value2) {
            addCriterion("RESPCODE between", value1, value2, "respcode");
            return (Criteria) this;
        }

        public Criteria andRespcodeNotBetween(String value1, String value2) {
            addCriterion("RESPCODE not between", value1, value2, "respcode");
            return (Criteria) this;
        }

        public Criteria andRespmsgIsNull() {
            addCriterion("RESPMSG is null");
            return (Criteria) this;
        }

        public Criteria andRespmsgIsNotNull() {
            addCriterion("RESPMSG is not null");
            return (Criteria) this;
        }

        public Criteria andRespmsgEqualTo(String value) {
            addCriterion("RESPMSG =", value, "respmsg");
            return (Criteria) this;
        }

        public Criteria andRespmsgNotEqualTo(String value) {
            addCriterion("RESPMSG <>", value, "respmsg");
            return (Criteria) this;
        }

        public Criteria andRespmsgGreaterThan(String value) {
            addCriterion("RESPMSG >", value, "respmsg");
            return (Criteria) this;
        }

        public Criteria andRespmsgGreaterThanOrEqualTo(String value) {
            addCriterion("RESPMSG >=", value, "respmsg");
            return (Criteria) this;
        }

        public Criteria andRespmsgLessThan(String value) {
            addCriterion("RESPMSG <", value, "respmsg");
            return (Criteria) this;
        }

        public Criteria andRespmsgLessThanOrEqualTo(String value) {
            addCriterion("RESPMSG <=", value, "respmsg");
            return (Criteria) this;
        }

        public Criteria andRespmsgLike(String value) {
            addCriterion("RESPMSG like", value, "respmsg");
            return (Criteria) this;
        }

        public Criteria andRespmsgNotLike(String value) {
            addCriterion("RESPMSG not like", value, "respmsg");
            return (Criteria) this;
        }

        public Criteria andRespmsgIn(List<String> values) {
            addCriterion("RESPMSG in", values, "respmsg");
            return (Criteria) this;
        }

        public Criteria andRespmsgNotIn(List<String> values) {
            addCriterion("RESPMSG not in", values, "respmsg");
            return (Criteria) this;
        }

        public Criteria andRespmsgBetween(String value1, String value2) {
            addCriterion("RESPMSG between", value1, value2, "respmsg");
            return (Criteria) this;
        }

        public Criteria andRespmsgNotBetween(String value1, String value2) {
            addCriterion("RESPMSG not between", value1, value2, "respmsg");
            return (Criteria) this;
        }

        public Criteria andFeeamtIsNull() {
            addCriterion("FEEAMT is null");
            return (Criteria) this;
        }

        public Criteria andFeeamtIsNotNull() {
            addCriterion("FEEAMT is not null");
            return (Criteria) this;
        }

        public Criteria andFeeamtEqualTo(BigDecimal value) {
            addCriterion("FEEAMT =", value, "feeamt");
            return (Criteria) this;
        }

        public Criteria andFeeamtNotEqualTo(BigDecimal value) {
            addCriterion("FEEAMT <>", value, "feeamt");
            return (Criteria) this;
        }

        public Criteria andFeeamtGreaterThan(BigDecimal value) {
            addCriterion("FEEAMT >", value, "feeamt");
            return (Criteria) this;
        }

        public Criteria andFeeamtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FEEAMT >=", value, "feeamt");
            return (Criteria) this;
        }

        public Criteria andFeeamtLessThan(BigDecimal value) {
            addCriterion("FEEAMT <", value, "feeamt");
            return (Criteria) this;
        }

        public Criteria andFeeamtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FEEAMT <=", value, "feeamt");
            return (Criteria) this;
        }

        public Criteria andFeeamtIn(List<BigDecimal> values) {
            addCriterion("FEEAMT in", values, "feeamt");
            return (Criteria) this;
        }

        public Criteria andFeeamtNotIn(List<BigDecimal> values) {
            addCriterion("FEEAMT not in", values, "feeamt");
            return (Criteria) this;
        }

        public Criteria andFeeamtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FEEAMT between", value1, value2, "feeamt");
            return (Criteria) this;
        }

        public Criteria andFeeamtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FEEAMT not between", value1, value2, "feeamt");
            return (Criteria) this;
        }

        public Criteria andTransstatusIsNull() {
            addCriterion("TRANSSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andTransstatusIsNotNull() {
            addCriterion("TRANSSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andTransstatusEqualTo(String value) {
            addCriterion("TRANSSTATUS =", value, "transstatus");
            return (Criteria) this;
        }

        public Criteria andTransstatusNotEqualTo(String value) {
            addCriterion("TRANSSTATUS <>", value, "transstatus");
            return (Criteria) this;
        }

        public Criteria andTransstatusGreaterThan(String value) {
            addCriterion("TRANSSTATUS >", value, "transstatus");
            return (Criteria) this;
        }

        public Criteria andTransstatusGreaterThanOrEqualTo(String value) {
            addCriterion("TRANSSTATUS >=", value, "transstatus");
            return (Criteria) this;
        }

        public Criteria andTransstatusLessThan(String value) {
            addCriterion("TRANSSTATUS <", value, "transstatus");
            return (Criteria) this;
        }

        public Criteria andTransstatusLessThanOrEqualTo(String value) {
            addCriterion("TRANSSTATUS <=", value, "transstatus");
            return (Criteria) this;
        }

        public Criteria andTransstatusLike(String value) {
            addCriterion("TRANSSTATUS like", value, "transstatus");
            return (Criteria) this;
        }

        public Criteria andTransstatusNotLike(String value) {
            addCriterion("TRANSSTATUS not like", value, "transstatus");
            return (Criteria) this;
        }

        public Criteria andTransstatusIn(List<String> values) {
            addCriterion("TRANSSTATUS in", values, "transstatus");
            return (Criteria) this;
        }

        public Criteria andTransstatusNotIn(List<String> values) {
            addCriterion("TRANSSTATUS not in", values, "transstatus");
            return (Criteria) this;
        }

        public Criteria andTransstatusBetween(String value1, String value2) {
            addCriterion("TRANSSTATUS between", value1, value2, "transstatus");
            return (Criteria) this;
        }

        public Criteria andTransstatusNotBetween(String value1, String value2) {
            addCriterion("TRANSSTATUS not between", value1, value2, "transstatus");
            return (Criteria) this;
        }

        public Criteria andProcstepIsNull() {
            addCriterion("PROCSTEP is null");
            return (Criteria) this;
        }

        public Criteria andProcstepIsNotNull() {
            addCriterion("PROCSTEP is not null");
            return (Criteria) this;
        }

        public Criteria andProcstepEqualTo(String value) {
            addCriterion("PROCSTEP =", value, "procstep");
            return (Criteria) this;
        }

        public Criteria andProcstepNotEqualTo(String value) {
            addCriterion("PROCSTEP <>", value, "procstep");
            return (Criteria) this;
        }

        public Criteria andProcstepGreaterThan(String value) {
            addCriterion("PROCSTEP >", value, "procstep");
            return (Criteria) this;
        }

        public Criteria andProcstepGreaterThanOrEqualTo(String value) {
            addCriterion("PROCSTEP >=", value, "procstep");
            return (Criteria) this;
        }

        public Criteria andProcstepLessThan(String value) {
            addCriterion("PROCSTEP <", value, "procstep");
            return (Criteria) this;
        }

        public Criteria andProcstepLessThanOrEqualTo(String value) {
            addCriterion("PROCSTEP <=", value, "procstep");
            return (Criteria) this;
        }

        public Criteria andProcstepLike(String value) {
            addCriterion("PROCSTEP like", value, "procstep");
            return (Criteria) this;
        }

        public Criteria andProcstepNotLike(String value) {
            addCriterion("PROCSTEP not like", value, "procstep");
            return (Criteria) this;
        }

        public Criteria andProcstepIn(List<String> values) {
            addCriterion("PROCSTEP in", values, "procstep");
            return (Criteria) this;
        }

        public Criteria andProcstepNotIn(List<String> values) {
            addCriterion("PROCSTEP not in", values, "procstep");
            return (Criteria) this;
        }

        public Criteria andProcstepBetween(String value1, String value2) {
            addCriterion("PROCSTEP between", value1, value2, "procstep");
            return (Criteria) this;
        }

        public Criteria andProcstepNotBetween(String value1, String value2) {
            addCriterion("PROCSTEP not between", value1, value2, "procstep");
            return (Criteria) this;
        }

        public Criteria andProcstatusIsNull() {
            addCriterion("PROCSTATUS is null");
            return (Criteria) this;
        }

        public Criteria andProcstatusIsNotNull() {
            addCriterion("PROCSTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andProcstatusEqualTo(String value) {
            addCriterion("PROCSTATUS =", value, "procstatus");
            return (Criteria) this;
        }

        public Criteria andProcstatusNotEqualTo(String value) {
            addCriterion("PROCSTATUS <>", value, "procstatus");
            return (Criteria) this;
        }

        public Criteria andProcstatusGreaterThan(String value) {
            addCriterion("PROCSTATUS >", value, "procstatus");
            return (Criteria) this;
        }

        public Criteria andProcstatusGreaterThanOrEqualTo(String value) {
            addCriterion("PROCSTATUS >=", value, "procstatus");
            return (Criteria) this;
        }

        public Criteria andProcstatusLessThan(String value) {
            addCriterion("PROCSTATUS <", value, "procstatus");
            return (Criteria) this;
        }

        public Criteria andProcstatusLessThanOrEqualTo(String value) {
            addCriterion("PROCSTATUS <=", value, "procstatus");
            return (Criteria) this;
        }

        public Criteria andProcstatusLike(String value) {
            addCriterion("PROCSTATUS like", value, "procstatus");
            return (Criteria) this;
        }

        public Criteria andProcstatusNotLike(String value) {
            addCriterion("PROCSTATUS not like", value, "procstatus");
            return (Criteria) this;
        }

        public Criteria andProcstatusIn(List<String> values) {
            addCriterion("PROCSTATUS in", values, "procstatus");
            return (Criteria) this;
        }

        public Criteria andProcstatusNotIn(List<String> values) {
            addCriterion("PROCSTATUS not in", values, "procstatus");
            return (Criteria) this;
        }

        public Criteria andProcstatusBetween(String value1, String value2) {
            addCriterion("PROCSTATUS between", value1, value2, "procstatus");
            return (Criteria) this;
        }

        public Criteria andProcstatusNotBetween(String value1, String value2) {
            addCriterion("PROCSTATUS not between", value1, value2, "procstatus");
            return (Criteria) this;
        }

        public Criteria andMemo1IsNull() {
            addCriterion("MEMO1 is null");
            return (Criteria) this;
        }

        public Criteria andMemo1IsNotNull() {
            addCriterion("MEMO1 is not null");
            return (Criteria) this;
        }

        public Criteria andMemo1EqualTo(String value) {
            addCriterion("MEMO1 =", value, "memo1");
            return (Criteria) this;
        }

        public Criteria andMemo1NotEqualTo(String value) {
            addCriterion("MEMO1 <>", value, "memo1");
            return (Criteria) this;
        }

        public Criteria andMemo1GreaterThan(String value) {
            addCriterion("MEMO1 >", value, "memo1");
            return (Criteria) this;
        }

        public Criteria andMemo1GreaterThanOrEqualTo(String value) {
            addCriterion("MEMO1 >=", value, "memo1");
            return (Criteria) this;
        }

        public Criteria andMemo1LessThan(String value) {
            addCriterion("MEMO1 <", value, "memo1");
            return (Criteria) this;
        }

        public Criteria andMemo1LessThanOrEqualTo(String value) {
            addCriterion("MEMO1 <=", value, "memo1");
            return (Criteria) this;
        }

        public Criteria andMemo1Like(String value) {
            addCriterion("MEMO1 like", value, "memo1");
            return (Criteria) this;
        }

        public Criteria andMemo1NotLike(String value) {
            addCriterion("MEMO1 not like", value, "memo1");
            return (Criteria) this;
        }

        public Criteria andMemo1In(List<String> values) {
            addCriterion("MEMO1 in", values, "memo1");
            return (Criteria) this;
        }

        public Criteria andMemo1NotIn(List<String> values) {
            addCriterion("MEMO1 not in", values, "memo1");
            return (Criteria) this;
        }

        public Criteria andMemo1Between(String value1, String value2) {
            addCriterion("MEMO1 between", value1, value2, "memo1");
            return (Criteria) this;
        }

        public Criteria andMemo1NotBetween(String value1, String value2) {
            addCriterion("MEMO1 not between", value1, value2, "memo1");
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