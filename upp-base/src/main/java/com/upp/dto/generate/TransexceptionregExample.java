package com.upp.dto.generate;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TransexceptionregExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TransexceptionregExample() {
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

        public Criteria andExceppseqnbrIsNull() {
            addCriterion("EXCEPPSEQNBR is null");
            return (Criteria) this;
        }

        public Criteria andExceppseqnbrIsNotNull() {
            addCriterion("EXCEPPSEQNBR is not null");
            return (Criteria) this;
        }

        public Criteria andExceppseqnbrEqualTo(String value) {
            addCriterion("EXCEPPSEQNBR =", value, "exceppseqnbr");
            return (Criteria) this;
        }

        public Criteria andExceppseqnbrNotEqualTo(String value) {
            addCriterion("EXCEPPSEQNBR <>", value, "exceppseqnbr");
            return (Criteria) this;
        }

        public Criteria andExceppseqnbrGreaterThan(String value) {
            addCriterion("EXCEPPSEQNBR >", value, "exceppseqnbr");
            return (Criteria) this;
        }

        public Criteria andExceppseqnbrGreaterThanOrEqualTo(String value) {
            addCriterion("EXCEPPSEQNBR >=", value, "exceppseqnbr");
            return (Criteria) this;
        }

        public Criteria andExceppseqnbrLessThan(String value) {
            addCriterion("EXCEPPSEQNBR <", value, "exceppseqnbr");
            return (Criteria) this;
        }

        public Criteria andExceppseqnbrLessThanOrEqualTo(String value) {
            addCriterion("EXCEPPSEQNBR <=", value, "exceppseqnbr");
            return (Criteria) this;
        }

        public Criteria andExceppseqnbrLike(String value) {
            addCriterion("EXCEPPSEQNBR like", value, "exceppseqnbr");
            return (Criteria) this;
        }

        public Criteria andExceppseqnbrNotLike(String value) {
            addCriterion("EXCEPPSEQNBR not like", value, "exceppseqnbr");
            return (Criteria) this;
        }

        public Criteria andExceppseqnbrIn(List<String> values) {
            addCriterion("EXCEPPSEQNBR in", values, "exceppseqnbr");
            return (Criteria) this;
        }

        public Criteria andExceppseqnbrNotIn(List<String> values) {
            addCriterion("EXCEPPSEQNBR not in", values, "exceppseqnbr");
            return (Criteria) this;
        }

        public Criteria andExceppseqnbrBetween(String value1, String value2) {
            addCriterion("EXCEPPSEQNBR between", value1, value2, "exceppseqnbr");
            return (Criteria) this;
        }

        public Criteria andExceppseqnbrNotBetween(String value1, String value2) {
            addCriterion("EXCEPPSEQNBR not between", value1, value2, "exceppseqnbr");
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

        public Criteria andInnerfundtransnbrIsNull() {
            addCriterion("INNERFUNDTRANSNBR is null");
            return (Criteria) this;
        }

        public Criteria andInnerfundtransnbrIsNotNull() {
            addCriterion("INNERFUNDTRANSNBR is not null");
            return (Criteria) this;
        }

        public Criteria andInnerfundtransnbrEqualTo(String value) {
            addCriterion("INNERFUNDTRANSNBR =", value, "innerfundtransnbr");
            return (Criteria) this;
        }

        public Criteria andInnerfundtransnbrNotEqualTo(String value) {
            addCriterion("INNERFUNDTRANSNBR <>", value, "innerfundtransnbr");
            return (Criteria) this;
        }

        public Criteria andInnerfundtransnbrGreaterThan(String value) {
            addCriterion("INNERFUNDTRANSNBR >", value, "innerfundtransnbr");
            return (Criteria) this;
        }

        public Criteria andInnerfundtransnbrGreaterThanOrEqualTo(String value) {
            addCriterion("INNERFUNDTRANSNBR >=", value, "innerfundtransnbr");
            return (Criteria) this;
        }

        public Criteria andInnerfundtransnbrLessThan(String value) {
            addCriterion("INNERFUNDTRANSNBR <", value, "innerfundtransnbr");
            return (Criteria) this;
        }

        public Criteria andInnerfundtransnbrLessThanOrEqualTo(String value) {
            addCriterion("INNERFUNDTRANSNBR <=", value, "innerfundtransnbr");
            return (Criteria) this;
        }

        public Criteria andInnerfundtransnbrLike(String value) {
            addCriterion("INNERFUNDTRANSNBR like", value, "innerfundtransnbr");
            return (Criteria) this;
        }

        public Criteria andInnerfundtransnbrNotLike(String value) {
            addCriterion("INNERFUNDTRANSNBR not like", value, "innerfundtransnbr");
            return (Criteria) this;
        }

        public Criteria andInnerfundtransnbrIn(List<String> values) {
            addCriterion("INNERFUNDTRANSNBR in", values, "innerfundtransnbr");
            return (Criteria) this;
        }

        public Criteria andInnerfundtransnbrNotIn(List<String> values) {
            addCriterion("INNERFUNDTRANSNBR not in", values, "innerfundtransnbr");
            return (Criteria) this;
        }

        public Criteria andInnerfundtransnbrBetween(String value1, String value2) {
            addCriterion("INNERFUNDTRANSNBR between", value1, value2, "innerfundtransnbr");
            return (Criteria) this;
        }

        public Criteria andInnerfundtransnbrNotBetween(String value1, String value2) {
            addCriterion("INNERFUNDTRANSNBR not between", value1, value2, "innerfundtransnbr");
            return (Criteria) this;
        }

        public Criteria andOveralltransnbrIsNull() {
            addCriterion("OVERALLTRANSNBR is null");
            return (Criteria) this;
        }

        public Criteria andOveralltransnbrIsNotNull() {
            addCriterion("OVERALLTRANSNBR is not null");
            return (Criteria) this;
        }

        public Criteria andOveralltransnbrEqualTo(String value) {
            addCriterion("OVERALLTRANSNBR =", value, "overalltransnbr");
            return (Criteria) this;
        }

        public Criteria andOveralltransnbrNotEqualTo(String value) {
            addCriterion("OVERALLTRANSNBR <>", value, "overalltransnbr");
            return (Criteria) this;
        }

        public Criteria andOveralltransnbrGreaterThan(String value) {
            addCriterion("OVERALLTRANSNBR >", value, "overalltransnbr");
            return (Criteria) this;
        }

        public Criteria andOveralltransnbrGreaterThanOrEqualTo(String value) {
            addCriterion("OVERALLTRANSNBR >=", value, "overalltransnbr");
            return (Criteria) this;
        }

        public Criteria andOveralltransnbrLessThan(String value) {
            addCriterion("OVERALLTRANSNBR <", value, "overalltransnbr");
            return (Criteria) this;
        }

        public Criteria andOveralltransnbrLessThanOrEqualTo(String value) {
            addCriterion("OVERALLTRANSNBR <=", value, "overalltransnbr");
            return (Criteria) this;
        }

        public Criteria andOveralltransnbrLike(String value) {
            addCriterion("OVERALLTRANSNBR like", value, "overalltransnbr");
            return (Criteria) this;
        }

        public Criteria andOveralltransnbrNotLike(String value) {
            addCriterion("OVERALLTRANSNBR not like", value, "overalltransnbr");
            return (Criteria) this;
        }

        public Criteria andOveralltransnbrIn(List<String> values) {
            addCriterion("OVERALLTRANSNBR in", values, "overalltransnbr");
            return (Criteria) this;
        }

        public Criteria andOveralltransnbrNotIn(List<String> values) {
            addCriterion("OVERALLTRANSNBR not in", values, "overalltransnbr");
            return (Criteria) this;
        }

        public Criteria andOveralltransnbrBetween(String value1, String value2) {
            addCriterion("OVERALLTRANSNBR between", value1, value2, "overalltransnbr");
            return (Criteria) this;
        }

        public Criteria andOveralltransnbrNotBetween(String value1, String value2) {
            addCriterion("OVERALLTRANSNBR not between", value1, value2, "overalltransnbr");
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

        public Criteria andRetrytimesIsNull() {
            addCriterion("RETRYTIMES is null");
            return (Criteria) this;
        }

        public Criteria andRetrytimesIsNotNull() {
            addCriterion("RETRYTIMES is not null");
            return (Criteria) this;
        }

        public Criteria andRetrytimesEqualTo(Integer value) {
            addCriterion("RETRYTIMES =", value, "retrytimes");
            return (Criteria) this;
        }

        public Criteria andRetrytimesNotEqualTo(Integer value) {
            addCriterion("RETRYTIMES <>", value, "retrytimes");
            return (Criteria) this;
        }

        public Criteria andRetrytimesGreaterThan(Integer value) {
            addCriterion("RETRYTIMES >", value, "retrytimes");
            return (Criteria) this;
        }

        public Criteria andRetrytimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("RETRYTIMES >=", value, "retrytimes");
            return (Criteria) this;
        }

        public Criteria andRetrytimesLessThan(Integer value) {
            addCriterion("RETRYTIMES <", value, "retrytimes");
            return (Criteria) this;
        }

        public Criteria andRetrytimesLessThanOrEqualTo(Integer value) {
            addCriterion("RETRYTIMES <=", value, "retrytimes");
            return (Criteria) this;
        }

        public Criteria andRetrytimesIn(List<Integer> values) {
            addCriterion("RETRYTIMES in", values, "retrytimes");
            return (Criteria) this;
        }

        public Criteria andRetrytimesNotIn(List<Integer> values) {
            addCriterion("RETRYTIMES not in", values, "retrytimes");
            return (Criteria) this;
        }

        public Criteria andRetrytimesBetween(Integer value1, Integer value2) {
            addCriterion("RETRYTIMES between", value1, value2, "retrytimes");
            return (Criteria) this;
        }

        public Criteria andRetrytimesNotBetween(Integer value1, Integer value2) {
            addCriterion("RETRYTIMES not between", value1, value2, "retrytimes");
            return (Criteria) this;
        }

        public Criteria andMaxretrytimesIsNull() {
            addCriterion("MAXRETRYTIMES is null");
            return (Criteria) this;
        }

        public Criteria andMaxretrytimesIsNotNull() {
            addCriterion("MAXRETRYTIMES is not null");
            return (Criteria) this;
        }

        public Criteria andMaxretrytimesEqualTo(Integer value) {
            addCriterion("MAXRETRYTIMES =", value, "maxretrytimes");
            return (Criteria) this;
        }

        public Criteria andMaxretrytimesNotEqualTo(Integer value) {
            addCriterion("MAXRETRYTIMES <>", value, "maxretrytimes");
            return (Criteria) this;
        }

        public Criteria andMaxretrytimesGreaterThan(Integer value) {
            addCriterion("MAXRETRYTIMES >", value, "maxretrytimes");
            return (Criteria) this;
        }

        public Criteria andMaxretrytimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("MAXRETRYTIMES >=", value, "maxretrytimes");
            return (Criteria) this;
        }

        public Criteria andMaxretrytimesLessThan(Integer value) {
            addCriterion("MAXRETRYTIMES <", value, "maxretrytimes");
            return (Criteria) this;
        }

        public Criteria andMaxretrytimesLessThanOrEqualTo(Integer value) {
            addCriterion("MAXRETRYTIMES <=", value, "maxretrytimes");
            return (Criteria) this;
        }

        public Criteria andMaxretrytimesIn(List<Integer> values) {
            addCriterion("MAXRETRYTIMES in", values, "maxretrytimes");
            return (Criteria) this;
        }

        public Criteria andMaxretrytimesNotIn(List<Integer> values) {
            addCriterion("MAXRETRYTIMES not in", values, "maxretrytimes");
            return (Criteria) this;
        }

        public Criteria andMaxretrytimesBetween(Integer value1, Integer value2) {
            addCriterion("MAXRETRYTIMES between", value1, value2, "maxretrytimes");
            return (Criteria) this;
        }

        public Criteria andMaxretrytimesNotBetween(Integer value1, Integer value2) {
            addCriterion("MAXRETRYTIMES not between", value1, value2, "maxretrytimes");
            return (Criteria) this;
        }

        public Criteria andLastretrytimeIsNull() {
            addCriterion("LASTRETRYTIME is null");
            return (Criteria) this;
        }

        public Criteria andLastretrytimeIsNotNull() {
            addCriterion("LASTRETRYTIME is not null");
            return (Criteria) this;
        }

        public Criteria andLastretrytimeEqualTo(Date value) {
            addCriterion("LASTRETRYTIME =", value, "lastretrytime");
            return (Criteria) this;
        }

        public Criteria andLastretrytimeNotEqualTo(Date value) {
            addCriterion("LASTRETRYTIME <>", value, "lastretrytime");
            return (Criteria) this;
        }

        public Criteria andLastretrytimeGreaterThan(Date value) {
            addCriterion("LASTRETRYTIME >", value, "lastretrytime");
            return (Criteria) this;
        }

        public Criteria andLastretrytimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LASTRETRYTIME >=", value, "lastretrytime");
            return (Criteria) this;
        }

        public Criteria andLastretrytimeLessThan(Date value) {
            addCriterion("LASTRETRYTIME <", value, "lastretrytime");
            return (Criteria) this;
        }

        public Criteria andLastretrytimeLessThanOrEqualTo(Date value) {
            addCriterion("LASTRETRYTIME <=", value, "lastretrytime");
            return (Criteria) this;
        }

        public Criteria andLastretrytimeIn(List<Date> values) {
            addCriterion("LASTRETRYTIME in", values, "lastretrytime");
            return (Criteria) this;
        }

        public Criteria andLastretrytimeNotIn(List<Date> values) {
            addCriterion("LASTRETRYTIME not in", values, "lastretrytime");
            return (Criteria) this;
        }

        public Criteria andLastretrytimeBetween(Date value1, Date value2) {
            addCriterion("LASTRETRYTIME between", value1, value2, "lastretrytime");
            return (Criteria) this;
        }

        public Criteria andLastretrytimeNotBetween(Date value1, Date value2) {
            addCriterion("LASTRETRYTIME not between", value1, value2, "lastretrytime");
            return (Criteria) this;
        }

        public Criteria andHandlestatusIsNull() {
            addCriterion("HANDLESTATUS is null");
            return (Criteria) this;
        }

        public Criteria andHandlestatusIsNotNull() {
            addCriterion("HANDLESTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andHandlestatusEqualTo(String value) {
            addCriterion("HANDLESTATUS =", value, "handlestatus");
            return (Criteria) this;
        }

        public Criteria andHandlestatusNotEqualTo(String value) {
            addCriterion("HANDLESTATUS <>", value, "handlestatus");
            return (Criteria) this;
        }

        public Criteria andHandlestatusGreaterThan(String value) {
            addCriterion("HANDLESTATUS >", value, "handlestatus");
            return (Criteria) this;
        }

        public Criteria andHandlestatusGreaterThanOrEqualTo(String value) {
            addCriterion("HANDLESTATUS >=", value, "handlestatus");
            return (Criteria) this;
        }

        public Criteria andHandlestatusLessThan(String value) {
            addCriterion("HANDLESTATUS <", value, "handlestatus");
            return (Criteria) this;
        }

        public Criteria andHandlestatusLessThanOrEqualTo(String value) {
            addCriterion("HANDLESTATUS <=", value, "handlestatus");
            return (Criteria) this;
        }

        public Criteria andHandlestatusLike(String value) {
            addCriterion("HANDLESTATUS like", value, "handlestatus");
            return (Criteria) this;
        }

        public Criteria andHandlestatusNotLike(String value) {
            addCriterion("HANDLESTATUS not like", value, "handlestatus");
            return (Criteria) this;
        }

        public Criteria andHandlestatusIn(List<String> values) {
            addCriterion("HANDLESTATUS in", values, "handlestatus");
            return (Criteria) this;
        }

        public Criteria andHandlestatusNotIn(List<String> values) {
            addCriterion("HANDLESTATUS not in", values, "handlestatus");
            return (Criteria) this;
        }

        public Criteria andHandlestatusBetween(String value1, String value2) {
            addCriterion("HANDLESTATUS between", value1, value2, "handlestatus");
            return (Criteria) this;
        }

        public Criteria andHandlestatusNotBetween(String value1, String value2) {
            addCriterion("HANDLESTATUS not between", value1, value2, "handlestatus");
            return (Criteria) this;
        }

        public Criteria andExcepservicenameIsNull() {
            addCriterion("EXCEPSERVICENAME is null");
            return (Criteria) this;
        }

        public Criteria andExcepservicenameIsNotNull() {
            addCriterion("EXCEPSERVICENAME is not null");
            return (Criteria) this;
        }

        public Criteria andExcepservicenameEqualTo(String value) {
            addCriterion("EXCEPSERVICENAME =", value, "excepservicename");
            return (Criteria) this;
        }

        public Criteria andExcepservicenameNotEqualTo(String value) {
            addCriterion("EXCEPSERVICENAME <>", value, "excepservicename");
            return (Criteria) this;
        }

        public Criteria andExcepservicenameGreaterThan(String value) {
            addCriterion("EXCEPSERVICENAME >", value, "excepservicename");
            return (Criteria) this;
        }

        public Criteria andExcepservicenameGreaterThanOrEqualTo(String value) {
            addCriterion("EXCEPSERVICENAME >=", value, "excepservicename");
            return (Criteria) this;
        }

        public Criteria andExcepservicenameLessThan(String value) {
            addCriterion("EXCEPSERVICENAME <", value, "excepservicename");
            return (Criteria) this;
        }

        public Criteria andExcepservicenameLessThanOrEqualTo(String value) {
            addCriterion("EXCEPSERVICENAME <=", value, "excepservicename");
            return (Criteria) this;
        }

        public Criteria andExcepservicenameLike(String value) {
            addCriterion("EXCEPSERVICENAME like", value, "excepservicename");
            return (Criteria) this;
        }

        public Criteria andExcepservicenameNotLike(String value) {
            addCriterion("EXCEPSERVICENAME not like", value, "excepservicename");
            return (Criteria) this;
        }

        public Criteria andExcepservicenameIn(List<String> values) {
            addCriterion("EXCEPSERVICENAME in", values, "excepservicename");
            return (Criteria) this;
        }

        public Criteria andExcepservicenameNotIn(List<String> values) {
            addCriterion("EXCEPSERVICENAME not in", values, "excepservicename");
            return (Criteria) this;
        }

        public Criteria andExcepservicenameBetween(String value1, String value2) {
            addCriterion("EXCEPSERVICENAME between", value1, value2, "excepservicename");
            return (Criteria) this;
        }

        public Criteria andExcepservicenameNotBetween(String value1, String value2) {
            addCriterion("EXCEPSERVICENAME not between", value1, value2, "excepservicename");
            return (Criteria) this;
        }

        public Criteria andExcepmethodnameIsNull() {
            addCriterion("EXCEPMETHODNAME is null");
            return (Criteria) this;
        }

        public Criteria andExcepmethodnameIsNotNull() {
            addCriterion("EXCEPMETHODNAME is not null");
            return (Criteria) this;
        }

        public Criteria andExcepmethodnameEqualTo(String value) {
            addCriterion("EXCEPMETHODNAME =", value, "excepmethodname");
            return (Criteria) this;
        }

        public Criteria andExcepmethodnameNotEqualTo(String value) {
            addCriterion("EXCEPMETHODNAME <>", value, "excepmethodname");
            return (Criteria) this;
        }

        public Criteria andExcepmethodnameGreaterThan(String value) {
            addCriterion("EXCEPMETHODNAME >", value, "excepmethodname");
            return (Criteria) this;
        }

        public Criteria andExcepmethodnameGreaterThanOrEqualTo(String value) {
            addCriterion("EXCEPMETHODNAME >=", value, "excepmethodname");
            return (Criteria) this;
        }

        public Criteria andExcepmethodnameLessThan(String value) {
            addCriterion("EXCEPMETHODNAME <", value, "excepmethodname");
            return (Criteria) this;
        }

        public Criteria andExcepmethodnameLessThanOrEqualTo(String value) {
            addCriterion("EXCEPMETHODNAME <=", value, "excepmethodname");
            return (Criteria) this;
        }

        public Criteria andExcepmethodnameLike(String value) {
            addCriterion("EXCEPMETHODNAME like", value, "excepmethodname");
            return (Criteria) this;
        }

        public Criteria andExcepmethodnameNotLike(String value) {
            addCriterion("EXCEPMETHODNAME not like", value, "excepmethodname");
            return (Criteria) this;
        }

        public Criteria andExcepmethodnameIn(List<String> values) {
            addCriterion("EXCEPMETHODNAME in", values, "excepmethodname");
            return (Criteria) this;
        }

        public Criteria andExcepmethodnameNotIn(List<String> values) {
            addCriterion("EXCEPMETHODNAME not in", values, "excepmethodname");
            return (Criteria) this;
        }

        public Criteria andExcepmethodnameBetween(String value1, String value2) {
            addCriterion("EXCEPMETHODNAME between", value1, value2, "excepmethodname");
            return (Criteria) this;
        }

        public Criteria andExcepmethodnameNotBetween(String value1, String value2) {
            addCriterion("EXCEPMETHODNAME not between", value1, value2, "excepmethodname");
            return (Criteria) this;
        }

        public Criteria andExcepdescIsNull() {
            addCriterion("EXCEPDESC is null");
            return (Criteria) this;
        }

        public Criteria andExcepdescIsNotNull() {
            addCriterion("EXCEPDESC is not null");
            return (Criteria) this;
        }

        public Criteria andExcepdescEqualTo(String value) {
            addCriterion("EXCEPDESC =", value, "excepdesc");
            return (Criteria) this;
        }

        public Criteria andExcepdescNotEqualTo(String value) {
            addCriterion("EXCEPDESC <>", value, "excepdesc");
            return (Criteria) this;
        }

        public Criteria andExcepdescGreaterThan(String value) {
            addCriterion("EXCEPDESC >", value, "excepdesc");
            return (Criteria) this;
        }

        public Criteria andExcepdescGreaterThanOrEqualTo(String value) {
            addCriterion("EXCEPDESC >=", value, "excepdesc");
            return (Criteria) this;
        }

        public Criteria andExcepdescLessThan(String value) {
            addCriterion("EXCEPDESC <", value, "excepdesc");
            return (Criteria) this;
        }

        public Criteria andExcepdescLessThanOrEqualTo(String value) {
            addCriterion("EXCEPDESC <=", value, "excepdesc");
            return (Criteria) this;
        }

        public Criteria andExcepdescLike(String value) {
            addCriterion("EXCEPDESC like", value, "excepdesc");
            return (Criteria) this;
        }

        public Criteria andExcepdescNotLike(String value) {
            addCriterion("EXCEPDESC not like", value, "excepdesc");
            return (Criteria) this;
        }

        public Criteria andExcepdescIn(List<String> values) {
            addCriterion("EXCEPDESC in", values, "excepdesc");
            return (Criteria) this;
        }

        public Criteria andExcepdescNotIn(List<String> values) {
            addCriterion("EXCEPDESC not in", values, "excepdesc");
            return (Criteria) this;
        }

        public Criteria andExcepdescBetween(String value1, String value2) {
            addCriterion("EXCEPDESC between", value1, value2, "excepdesc");
            return (Criteria) this;
        }

        public Criteria andExcepdescNotBetween(String value1, String value2) {
            addCriterion("EXCEPDESC not between", value1, value2, "excepdesc");
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