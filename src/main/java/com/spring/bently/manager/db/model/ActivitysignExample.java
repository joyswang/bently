package com.spring.bently.manager.db.model;

import java.util.ArrayList;
import java.util.List;

public class ActivitysignExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ActivitysignExample() {
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

        public Criteria andActivityidIsNull() {
            addCriterion("activityid is null");
            return (Criteria) this;
        }

        public Criteria andActivityidIsNotNull() {
            addCriterion("activityid is not null");
            return (Criteria) this;
        }

        public Criteria andActivityidEqualTo(Integer value) {
            addCriterion("activityid =", value, "activityid");
            return (Criteria) this;
        }

        public Criteria andActivityidNotEqualTo(Integer value) {
            addCriterion("activityid <>", value, "activityid");
            return (Criteria) this;
        }

        public Criteria andActivityidGreaterThan(Integer value) {
            addCriterion("activityid >", value, "activityid");
            return (Criteria) this;
        }

        public Criteria andActivityidGreaterThanOrEqualTo(Integer value) {
            addCriterion("activityid >=", value, "activityid");
            return (Criteria) this;
        }

        public Criteria andActivityidLessThan(Integer value) {
            addCriterion("activityid <", value, "activityid");
            return (Criteria) this;
        }

        public Criteria andActivityidLessThanOrEqualTo(Integer value) {
            addCriterion("activityid <=", value, "activityid");
            return (Criteria) this;
        }

        public Criteria andActivityidIn(List<Integer> values) {
            addCriterion("activityid in", values, "activityid");
            return (Criteria) this;
        }

        public Criteria andActivityidNotIn(List<Integer> values) {
            addCriterion("activityid not in", values, "activityid");
            return (Criteria) this;
        }

        public Criteria andActivityidBetween(Integer value1, Integer value2) {
            addCriterion("activityid between", value1, value2, "activityid");
            return (Criteria) this;
        }

        public Criteria andActivityidNotBetween(Integer value1, Integer value2) {
            addCriterion("activityid not between", value1, value2, "activityid");
            return (Criteria) this;
        }

        public Criteria andActivitytitleIsNull() {
            addCriterion("activitytitle is null");
            return (Criteria) this;
        }

        public Criteria andActivitytitleIsNotNull() {
            addCriterion("activitytitle is not null");
            return (Criteria) this;
        }

        public Criteria andActivitytitleEqualTo(String value) {
            addCriterion("activitytitle =", value, "activitytitle");
            return (Criteria) this;
        }

        public Criteria andActivitytitleNotEqualTo(String value) {
            addCriterion("activitytitle <>", value, "activitytitle");
            return (Criteria) this;
        }

        public Criteria andActivitytitleGreaterThan(String value) {
            addCriterion("activitytitle >", value, "activitytitle");
            return (Criteria) this;
        }

        public Criteria andActivitytitleGreaterThanOrEqualTo(String value) {
            addCriterion("activitytitle >=", value, "activitytitle");
            return (Criteria) this;
        }

        public Criteria andActivitytitleLessThan(String value) {
            addCriterion("activitytitle <", value, "activitytitle");
            return (Criteria) this;
        }

        public Criteria andActivitytitleLessThanOrEqualTo(String value) {
            addCriterion("activitytitle <=", value, "activitytitle");
            return (Criteria) this;
        }

        public Criteria andActivitytitleLike(String value) {
            addCriterion("activitytitle like", value, "activitytitle");
            return (Criteria) this;
        }

        public Criteria andActivitytitleNotLike(String value) {
            addCriterion("activitytitle not like", value, "activitytitle");
            return (Criteria) this;
        }

        public Criteria andActivitytitleIn(List<String> values) {
            addCriterion("activitytitle in", values, "activitytitle");
            return (Criteria) this;
        }

        public Criteria andActivitytitleNotIn(List<String> values) {
            addCriterion("activitytitle not in", values, "activitytitle");
            return (Criteria) this;
        }

        public Criteria andActivitytitleBetween(String value1, String value2) {
            addCriterion("activitytitle between", value1, value2, "activitytitle");
            return (Criteria) this;
        }

        public Criteria andActivitytitleNotBetween(String value1, String value2) {
            addCriterion("activitytitle not between", value1, value2, "activitytitle");
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