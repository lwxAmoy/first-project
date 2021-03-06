package com.xiaohe.po;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class NoticeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NoticeExample() {
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

        public Criteria andNtidIsNull() {
            addCriterion("Ntid is null");
            return (Criteria) this;
        }

        public Criteria andNtidIsNotNull() {
            addCriterion("Ntid is not null");
            return (Criteria) this;
        }

        public Criteria andNtidEqualTo(Integer value) {
            addCriterion("Ntid =", value, "ntid");
            return (Criteria) this;
        }

        public Criteria andNtidNotEqualTo(Integer value) {
            addCriterion("Ntid <>", value, "ntid");
            return (Criteria) this;
        }

        public Criteria andNtidGreaterThan(Integer value) {
            addCriterion("Ntid >", value, "ntid");
            return (Criteria) this;
        }

        public Criteria andNtidGreaterThanOrEqualTo(Integer value) {
            addCriterion("Ntid >=", value, "ntid");
            return (Criteria) this;
        }

        public Criteria andNtidLessThan(Integer value) {
            addCriterion("Ntid <", value, "ntid");
            return (Criteria) this;
        }

        public Criteria andNtidLessThanOrEqualTo(Integer value) {
            addCriterion("Ntid <=", value, "ntid");
            return (Criteria) this;
        }

        public Criteria andNtidIn(List<Integer> values) {
            addCriterion("Ntid in", values, "ntid");
            return (Criteria) this;
        }

        public Criteria andNtidNotIn(List<Integer> values) {
            addCriterion("Ntid not in", values, "ntid");
            return (Criteria) this;
        }

        public Criteria andNtidBetween(Integer value1, Integer value2) {
            addCriterion("Ntid between", value1, value2, "ntid");
            return (Criteria) this;
        }

        public Criteria andNtidNotBetween(Integer value1, Integer value2) {
            addCriterion("Ntid not between", value1, value2, "ntid");
            return (Criteria) this;
        }

        public Criteria andNidIsNull() {
            addCriterion("Nid is null");
            return (Criteria) this;
        }

        public Criteria andNidIsNotNull() {
            addCriterion("Nid is not null");
            return (Criteria) this;
        }

        public Criteria andNidEqualTo(Integer value) {
            addCriterion("Nid =", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidNotEqualTo(Integer value) {
            addCriterion("Nid <>", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidGreaterThan(Integer value) {
            addCriterion("Nid >", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidGreaterThanOrEqualTo(Integer value) {
            addCriterion("Nid >=", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidLessThan(Integer value) {
            addCriterion("Nid <", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidLessThanOrEqualTo(Integer value) {
            addCriterion("Nid <=", value, "nid");
            return (Criteria) this;
        }

        public Criteria andNidIn(List<Integer> values) {
            addCriterion("Nid in", values, "nid");
            return (Criteria) this;
        }

        public Criteria andNidNotIn(List<Integer> values) {
            addCriterion("Nid not in", values, "nid");
            return (Criteria) this;
        }

        public Criteria andNidBetween(Integer value1, Integer value2) {
            addCriterion("Nid between", value1, value2, "nid");
            return (Criteria) this;
        }

        public Criteria andNidNotBetween(Integer value1, Integer value2) {
            addCriterion("Nid not between", value1, value2, "nid");
            return (Criteria) this;
        }

        public Criteria andNtcontentIsNull() {
            addCriterion("Ntcontent is null");
            return (Criteria) this;
        }

        public Criteria andNtcontentIsNotNull() {
            addCriterion("Ntcontent is not null");
            return (Criteria) this;
        }

        public Criteria andNtcontentEqualTo(String value) {
            addCriterion("Ntcontent =", value, "ntcontent");
            return (Criteria) this;
        }

        public Criteria andNtcontentNotEqualTo(String value) {
            addCriterion("Ntcontent <>", value, "ntcontent");
            return (Criteria) this;
        }

        public Criteria andNtcontentGreaterThan(String value) {
            addCriterion("Ntcontent >", value, "ntcontent");
            return (Criteria) this;
        }

        public Criteria andNtcontentGreaterThanOrEqualTo(String value) {
            addCriterion("Ntcontent >=", value, "ntcontent");
            return (Criteria) this;
        }

        public Criteria andNtcontentLessThan(String value) {
            addCriterion("Ntcontent <", value, "ntcontent");
            return (Criteria) this;
        }

        public Criteria andNtcontentLessThanOrEqualTo(String value) {
            addCriterion("Ntcontent <=", value, "ntcontent");
            return (Criteria) this;
        }

        public Criteria andNtcontentLike(String value) {
            addCriterion("Ntcontent like", value, "ntcontent");
            return (Criteria) this;
        }

        public Criteria andNtcontentNotLike(String value) {
            addCriterion("Ntcontent not like", value, "ntcontent");
            return (Criteria) this;
        }

        public Criteria andNtcontentIn(List<String> values) {
            addCriterion("Ntcontent in", values, "ntcontent");
            return (Criteria) this;
        }

        public Criteria andNtcontentNotIn(List<String> values) {
            addCriterion("Ntcontent not in", values, "ntcontent");
            return (Criteria) this;
        }

        public Criteria andNtcontentBetween(String value1, String value2) {
            addCriterion("Ntcontent between", value1, value2, "ntcontent");
            return (Criteria) this;
        }

        public Criteria andNtcontentNotBetween(String value1, String value2) {
            addCriterion("Ntcontent not between", value1, value2, "ntcontent");
            return (Criteria) this;
        }

        public Criteria andNtimeIsNull() {
            addCriterion("Ntime is null");
            return (Criteria) this;
        }

        public Criteria andNtimeIsNotNull() {
            addCriterion("Ntime is not null");
            return (Criteria) this;
        }

        public Criteria andNtimeEqualTo(Date value) {
            addCriterionForJDBCDate("Ntime =", value, "ntime");
            return (Criteria) this;
        }

        public Criteria andNtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("Ntime <>", value, "ntime");
            return (Criteria) this;
        }

        public Criteria andNtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("Ntime >", value, "ntime");
            return (Criteria) this;
        }

        public Criteria andNtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("Ntime >=", value, "ntime");
            return (Criteria) this;
        }

        public Criteria andNtimeLessThan(Date value) {
            addCriterionForJDBCDate("Ntime <", value, "ntime");
            return (Criteria) this;
        }

        public Criteria andNtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("Ntime <=", value, "ntime");
            return (Criteria) this;
        }

        public Criteria andNtimeIn(List<Date> values) {
            addCriterionForJDBCDate("Ntime in", values, "ntime");
            return (Criteria) this;
        }

        public Criteria andNtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("Ntime not in", values, "ntime");
            return (Criteria) this;
        }

        public Criteria andNtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("Ntime between", value1, value2, "ntime");
            return (Criteria) this;
        }

        public Criteria andNtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("Ntime not between", value1, value2, "ntime");
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