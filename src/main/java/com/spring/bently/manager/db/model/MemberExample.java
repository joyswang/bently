package com.spring.bently.manager.db.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MemberExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MemberExample() {
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
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andWechatidIsNull() {
            addCriterion("wechatid is null");
            return (Criteria) this;
        }

        public Criteria andWechatidIsNotNull() {
            addCriterion("wechatid is not null");
            return (Criteria) this;
        }

        public Criteria andWechatidEqualTo(String value) {
            addCriterion("wechatid =", value, "wechatid");
            return (Criteria) this;
        }

        public Criteria andWechatidNotEqualTo(String value) {
            addCriterion("wechatid <>", value, "wechatid");
            return (Criteria) this;
        }

        public Criteria andWechatidGreaterThan(String value) {
            addCriterion("wechatid >", value, "wechatid");
            return (Criteria) this;
        }

        public Criteria andWechatidGreaterThanOrEqualTo(String value) {
            addCriterion("wechatid >=", value, "wechatid");
            return (Criteria) this;
        }

        public Criteria andWechatidLessThan(String value) {
            addCriterion("wechatid <", value, "wechatid");
            return (Criteria) this;
        }

        public Criteria andWechatidLessThanOrEqualTo(String value) {
            addCriterion("wechatid <=", value, "wechatid");
            return (Criteria) this;
        }

        public Criteria andWechatidLike(String value) {
            addCriterion("wechatid like", value, "wechatid");
            return (Criteria) this;
        }

        public Criteria andWechatidNotLike(String value) {
            addCriterion("wechatid not like", value, "wechatid");
            return (Criteria) this;
        }

        public Criteria andWechatidIn(List<String> values) {
            addCriterion("wechatid in", values, "wechatid");
            return (Criteria) this;
        }

        public Criteria andWechatidNotIn(List<String> values) {
            addCriterion("wechatid not in", values, "wechatid");
            return (Criteria) this;
        }

        public Criteria andWechatidBetween(String value1, String value2) {
            addCriterion("wechatid between", value1, value2, "wechatid");
            return (Criteria) this;
        }

        public Criteria andWechatidNotBetween(String value1, String value2) {
            addCriterion("wechatid not between", value1, value2, "wechatid");
            return (Criteria) this;
        }

        public Criteria andWechatnameIsNull() {
            addCriterion("wechatname is null");
            return (Criteria) this;
        }

        public Criteria andWechatnameIsNotNull() {
            addCriterion("wechatname is not null");
            return (Criteria) this;
        }

        public Criteria andWechatnameEqualTo(String value) {
            addCriterion("wechatname =", value, "wechatname");
            return (Criteria) this;
        }

        public Criteria andWechatnameNotEqualTo(String value) {
            addCriterion("wechatname <>", value, "wechatname");
            return (Criteria) this;
        }

        public Criteria andWechatnameGreaterThan(String value) {
            addCriterion("wechatname >", value, "wechatname");
            return (Criteria) this;
        }

        public Criteria andWechatnameGreaterThanOrEqualTo(String value) {
            addCriterion("wechatname >=", value, "wechatname");
            return (Criteria) this;
        }

        public Criteria andWechatnameLessThan(String value) {
            addCriterion("wechatname <", value, "wechatname");
            return (Criteria) this;
        }

        public Criteria andWechatnameLessThanOrEqualTo(String value) {
            addCriterion("wechatname <=", value, "wechatname");
            return (Criteria) this;
        }

        public Criteria andWechatnameLike(String value) {
            addCriterion("wechatname like", value, "wechatname");
            return (Criteria) this;
        }

        public Criteria andWechatnameNotLike(String value) {
            addCriterion("wechatname not like", value, "wechatname");
            return (Criteria) this;
        }

        public Criteria andWechatnameIn(List<String> values) {
            addCriterion("wechatname in", values, "wechatname");
            return (Criteria) this;
        }

        public Criteria andWechatnameNotIn(List<String> values) {
            addCriterion("wechatname not in", values, "wechatname");
            return (Criteria) this;
        }

        public Criteria andWechatnameBetween(String value1, String value2) {
            addCriterion("wechatname between", value1, value2, "wechatname");
            return (Criteria) this;
        }

        public Criteria andWechatnameNotBetween(String value1, String value2) {
            addCriterion("wechatname not between", value1, value2, "wechatname");
            return (Criteria) this;
        }

        public Criteria andBegintimeIsNull() {
            addCriterion("begintime is null");
            return (Criteria) this;
        }

        public Criteria andBegintimeIsNotNull() {
            addCriterion("begintime is not null");
            return (Criteria) this;
        }

        public Criteria andBegintimeEqualTo(Date value) {
            addCriterion("begintime =", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeNotEqualTo(Date value) {
            addCriterion("begintime <>", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeGreaterThan(Date value) {
            addCriterion("begintime >", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeGreaterThanOrEqualTo(Date value) {
            addCriterion("begintime >=", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeLessThan(Date value) {
            addCriterion("begintime <", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeLessThanOrEqualTo(Date value) {
            addCriterion("begintime <=", value, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeIn(List<Date> values) {
            addCriterion("begintime in", values, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeNotIn(List<Date> values) {
            addCriterion("begintime not in", values, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeBetween(Date value1, Date value2) {
            addCriterion("begintime between", value1, value2, "begintime");
            return (Criteria) this;
        }

        public Criteria andBegintimeNotBetween(Date value1, Date value2) {
            addCriterion("begintime not between", value1, value2, "begintime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNull() {
            addCriterion("endtime is null");
            return (Criteria) this;
        }

        public Criteria andEndtimeIsNotNull() {
            addCriterion("endtime is not null");
            return (Criteria) this;
        }

        public Criteria andEndtimeEqualTo(Date value) {
            addCriterion("endtime =", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotEqualTo(Date value) {
            addCriterion("endtime <>", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThan(Date value) {
            addCriterion("endtime >", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("endtime >=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThan(Date value) {
            addCriterion("endtime <", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeLessThanOrEqualTo(Date value) {
            addCriterion("endtime <=", value, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeIn(List<Date> values) {
            addCriterion("endtime in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotIn(List<Date> values) {
            addCriterion("endtime not in", values, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeBetween(Date value1, Date value2) {
            addCriterion("endtime between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andEndtimeNotBetween(Date value1, Date value2) {
            addCriterion("endtime not between", value1, value2, "endtime");
            return (Criteria) this;
        }

        public Criteria andWashcarnumIsNull() {
            addCriterion("washcarnum is null");
            return (Criteria) this;
        }

        public Criteria andWashcarnumIsNotNull() {
            addCriterion("washcarnum is not null");
            return (Criteria) this;
        }

        public Criteria andWashcarnumEqualTo(Integer value) {
            addCriterion("washcarnum =", value, "washcarnum");
            return (Criteria) this;
        }

        public Criteria andWashcarnumNotEqualTo(Integer value) {
            addCriterion("washcarnum <>", value, "washcarnum");
            return (Criteria) this;
        }

        public Criteria andWashcarnumGreaterThan(Integer value) {
            addCriterion("washcarnum >", value, "washcarnum");
            return (Criteria) this;
        }

        public Criteria andWashcarnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("washcarnum >=", value, "washcarnum");
            return (Criteria) this;
        }

        public Criteria andWashcarnumLessThan(Integer value) {
            addCriterion("washcarnum <", value, "washcarnum");
            return (Criteria) this;
        }

        public Criteria andWashcarnumLessThanOrEqualTo(Integer value) {
            addCriterion("washcarnum <=", value, "washcarnum");
            return (Criteria) this;
        }

        public Criteria andWashcarnumIn(List<Integer> values) {
            addCriterion("washcarnum in", values, "washcarnum");
            return (Criteria) this;
        }

        public Criteria andWashcarnumNotIn(List<Integer> values) {
            addCriterion("washcarnum not in", values, "washcarnum");
            return (Criteria) this;
        }

        public Criteria andWashcarnumBetween(Integer value1, Integer value2) {
            addCriterion("washcarnum between", value1, value2, "washcarnum");
            return (Criteria) this;
        }

        public Criteria andWashcarnumNotBetween(Integer value1, Integer value2) {
            addCriterion("washcarnum not between", value1, value2, "washcarnum");
            return (Criteria) this;
        }

        public Criteria andWaxingnumIsNull() {
            addCriterion("waxingnum is null");
            return (Criteria) this;
        }

        public Criteria andWaxingnumIsNotNull() {
            addCriterion("waxingnum is not null");
            return (Criteria) this;
        }

        public Criteria andWaxingnumEqualTo(Integer value) {
            addCriterion("waxingnum =", value, "waxingnum");
            return (Criteria) this;
        }

        public Criteria andWaxingnumNotEqualTo(Integer value) {
            addCriterion("waxingnum <>", value, "waxingnum");
            return (Criteria) this;
        }

        public Criteria andWaxingnumGreaterThan(Integer value) {
            addCriterion("waxingnum >", value, "waxingnum");
            return (Criteria) this;
        }

        public Criteria andWaxingnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("waxingnum >=", value, "waxingnum");
            return (Criteria) this;
        }

        public Criteria andWaxingnumLessThan(Integer value) {
            addCriterion("waxingnum <", value, "waxingnum");
            return (Criteria) this;
        }

        public Criteria andWaxingnumLessThanOrEqualTo(Integer value) {
            addCriterion("waxingnum <=", value, "waxingnum");
            return (Criteria) this;
        }

        public Criteria andWaxingnumIn(List<Integer> values) {
            addCriterion("waxingnum in", values, "waxingnum");
            return (Criteria) this;
        }

        public Criteria andWaxingnumNotIn(List<Integer> values) {
            addCriterion("waxingnum not in", values, "waxingnum");
            return (Criteria) this;
        }

        public Criteria andWaxingnumBetween(Integer value1, Integer value2) {
            addCriterion("waxingnum between", value1, value2, "waxingnum");
            return (Criteria) this;
        }

        public Criteria andWaxingnumNotBetween(Integer value1, Integer value2) {
            addCriterion("waxingnum not between", value1, value2, "waxingnum");
            return (Criteria) this;
        }

        public Criteria andMaintenumIsNull() {
            addCriterion("maintenum is null");
            return (Criteria) this;
        }

        public Criteria andMaintenumIsNotNull() {
            addCriterion("maintenum is not null");
            return (Criteria) this;
        }

        public Criteria andMaintenumEqualTo(Integer value) {
            addCriterion("maintenum =", value, "maintenum");
            return (Criteria) this;
        }

        public Criteria andMaintenumNotEqualTo(Integer value) {
            addCriterion("maintenum <>", value, "maintenum");
            return (Criteria) this;
        }

        public Criteria andMaintenumGreaterThan(Integer value) {
            addCriterion("maintenum >", value, "maintenum");
            return (Criteria) this;
        }

        public Criteria andMaintenumGreaterThanOrEqualTo(Integer value) {
            addCriterion("maintenum >=", value, "maintenum");
            return (Criteria) this;
        }

        public Criteria andMaintenumLessThan(Integer value) {
            addCriterion("maintenum <", value, "maintenum");
            return (Criteria) this;
        }

        public Criteria andMaintenumLessThanOrEqualTo(Integer value) {
            addCriterion("maintenum <=", value, "maintenum");
            return (Criteria) this;
        }

        public Criteria andMaintenumIn(List<Integer> values) {
            addCriterion("maintenum in", values, "maintenum");
            return (Criteria) this;
        }

        public Criteria andMaintenumNotIn(List<Integer> values) {
            addCriterion("maintenum not in", values, "maintenum");
            return (Criteria) this;
        }

        public Criteria andMaintenumBetween(Integer value1, Integer value2) {
            addCriterion("maintenum between", value1, value2, "maintenum");
            return (Criteria) this;
        }

        public Criteria andMaintenumNotBetween(Integer value1, Integer value2) {
            addCriterion("maintenum not between", value1, value2, "maintenum");
            return (Criteria) this;
        }

        public Criteria andIndoorrenumIsNull() {
            addCriterion("indoorrenum is null");
            return (Criteria) this;
        }

        public Criteria andIndoorrenumIsNotNull() {
            addCriterion("indoorrenum is not null");
            return (Criteria) this;
        }

        public Criteria andIndoorrenumEqualTo(Integer value) {
            addCriterion("indoorrenum =", value, "indoorrenum");
            return (Criteria) this;
        }

        public Criteria andIndoorrenumNotEqualTo(Integer value) {
            addCriterion("indoorrenum <>", value, "indoorrenum");
            return (Criteria) this;
        }

        public Criteria andIndoorrenumGreaterThan(Integer value) {
            addCriterion("indoorrenum >", value, "indoorrenum");
            return (Criteria) this;
        }

        public Criteria andIndoorrenumGreaterThanOrEqualTo(Integer value) {
            addCriterion("indoorrenum >=", value, "indoorrenum");
            return (Criteria) this;
        }

        public Criteria andIndoorrenumLessThan(Integer value) {
            addCriterion("indoorrenum <", value, "indoorrenum");
            return (Criteria) this;
        }

        public Criteria andIndoorrenumLessThanOrEqualTo(Integer value) {
            addCriterion("indoorrenum <=", value, "indoorrenum");
            return (Criteria) this;
        }

        public Criteria andIndoorrenumIn(List<Integer> values) {
            addCriterion("indoorrenum in", values, "indoorrenum");
            return (Criteria) this;
        }

        public Criteria andIndoorrenumNotIn(List<Integer> values) {
            addCriterion("indoorrenum not in", values, "indoorrenum");
            return (Criteria) this;
        }

        public Criteria andIndoorrenumBetween(Integer value1, Integer value2) {
            addCriterion("indoorrenum between", value1, value2, "indoorrenum");
            return (Criteria) this;
        }

        public Criteria andIndoorrenumNotBetween(Integer value1, Integer value2) {
            addCriterion("indoorrenum not between", value1, value2, "indoorrenum");
            return (Criteria) this;
        }

        public Criteria andIsvipIsNull() {
            addCriterion("isvip is null");
            return (Criteria) this;
        }

        public Criteria andIsvipIsNotNull() {
            addCriterion("isvip is not null");
            return (Criteria) this;
        }

        public Criteria andIsvipEqualTo(Integer value) {
            addCriterion("isvip =", value, "isvip");
            return (Criteria) this;
        }

        public Criteria andIsvipNotEqualTo(Integer value) {
            addCriterion("isvip <>", value, "isvip");
            return (Criteria) this;
        }

        public Criteria andIsvipGreaterThan(Integer value) {
            addCriterion("isvip >", value, "isvip");
            return (Criteria) this;
        }

        public Criteria andIsvipGreaterThanOrEqualTo(Integer value) {
            addCriterion("isvip >=", value, "isvip");
            return (Criteria) this;
        }

        public Criteria andIsvipLessThan(Integer value) {
            addCriterion("isvip <", value, "isvip");
            return (Criteria) this;
        }

        public Criteria andIsvipLessThanOrEqualTo(Integer value) {
            addCriterion("isvip <=", value, "isvip");
            return (Criteria) this;
        }

        public Criteria andIsvipIn(List<Integer> values) {
            addCriterion("isvip in", values, "isvip");
            return (Criteria) this;
        }

        public Criteria andIsvipNotIn(List<Integer> values) {
            addCriterion("isvip not in", values, "isvip");
            return (Criteria) this;
        }

        public Criteria andIsvipBetween(Integer value1, Integer value2) {
            addCriterion("isvip between", value1, value2, "isvip");
            return (Criteria) this;
        }

        public Criteria andIsvipNotBetween(Integer value1, Integer value2) {
            addCriterion("isvip not between", value1, value2, "isvip");
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