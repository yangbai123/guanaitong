package com.yb.team.project.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PreTimeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PreTimeExample() {
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

        public Criteria andMeetingRoomidIsNull() {
            addCriterion("meeting_roomid is null");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomidIsNotNull() {
            addCriterion("meeting_roomid is not null");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomidEqualTo(Integer value) {
            addCriterion("meeting_roomid =", value, "meetingRoomid");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomidNotEqualTo(Integer value) {
            addCriterion("meeting_roomid <>", value, "meetingRoomid");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomidGreaterThan(Integer value) {
            addCriterion("meeting_roomid >", value, "meetingRoomid");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomidGreaterThanOrEqualTo(Integer value) {
            addCriterion("meeting_roomid >=", value, "meetingRoomid");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomidLessThan(Integer value) {
            addCriterion("meeting_roomid <", value, "meetingRoomid");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomidLessThanOrEqualTo(Integer value) {
            addCriterion("meeting_roomid <=", value, "meetingRoomid");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomidIn(List<Integer> values) {
            addCriterion("meeting_roomid in", values, "meetingRoomid");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomidNotIn(List<Integer> values) {
            addCriterion("meeting_roomid not in", values, "meetingRoomid");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomidBetween(Integer value1, Integer value2) {
            addCriterion("meeting_roomid between", value1, value2, "meetingRoomid");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomidNotBetween(Integer value1, Integer value2) {
            addCriterion("meeting_roomid not between", value1, value2, "meetingRoomid");
            return (Criteria) this;
        }

        public Criteria and8.00IsNull() {
            addCriterion("8.00 is null");
            return (Criteria) this;
        }

        public Criteria and8.00IsNotNull() {
            addCriterion("8.00 is not null");
            return (Criteria) this;
        }

        public Criteria and8.00EqualTo(Boolean value) {
            addCriterion("8.00 =", value, "8.00");
            return (Criteria) this;
        }

        public Criteria and8.00NotEqualTo(Boolean value) {
            addCriterion("8.00 <>", value, "8.00");
            return (Criteria) this;
        }

        public Criteria and8.00GreaterThan(Boolean value) {
            addCriterion("8.00 >", value, "8.00");
            return (Criteria) this;
        }

        public Criteria and8.00GreaterThanOrEqualTo(Boolean value) {
            addCriterion("8.00 >=", value, "8.00");
            return (Criteria) this;
        }

        public Criteria and8.00LessThan(Boolean value) {
            addCriterion("8.00 <", value, "8.00");
            return (Criteria) this;
        }

        public Criteria and8.00LessThanOrEqualTo(Boolean value) {
            addCriterion("8.00 <=", value, "8.00");
            return (Criteria) this;
        }

        public Criteria and8.00In(List<Boolean> values) {
            addCriterion("8.00 in", values, "8.00");
            return (Criteria) this;
        }

        public Criteria and8.00NotIn(List<Boolean> values) {
            addCriterion("8.00 not in", values, "8.00");
            return (Criteria) this;
        }

        public Criteria and8.00Between(Boolean value1, Boolean value2) {
            addCriterion("8.00 between", value1, value2, "8.00");
            return (Criteria) this;
        }

        public Criteria and8.00NotBetween(Boolean value1, Boolean value2) {
            addCriterion("8.00 not between", value1, value2, "8.00");
            return (Criteria) this;
        }

        public Criteria and8.30IsNull() {
            addCriterion("8.30 is null");
            return (Criteria) this;
        }

        public Criteria and8.30IsNotNull() {
            addCriterion("8.30 is not null");
            return (Criteria) this;
        }

        public Criteria and8.30EqualTo(Boolean value) {
            addCriterion("8.30 =", value, "8.30");
            return (Criteria) this;
        }

        public Criteria and8.30NotEqualTo(Boolean value) {
            addCriterion("8.30 <>", value, "8.30");
            return (Criteria) this;
        }

        public Criteria and8.30GreaterThan(Boolean value) {
            addCriterion("8.30 >", value, "8.30");
            return (Criteria) this;
        }

        public Criteria and8.30GreaterThanOrEqualTo(Boolean value) {
            addCriterion("8.30 >=", value, "8.30");
            return (Criteria) this;
        }

        public Criteria and8.30LessThan(Boolean value) {
            addCriterion("8.30 <", value, "8.30");
            return (Criteria) this;
        }

        public Criteria and8.30LessThanOrEqualTo(Boolean value) {
            addCriterion("8.30 <=", value, "8.30");
            return (Criteria) this;
        }

        public Criteria and8.30In(List<Boolean> values) {
            addCriterion("8.30 in", values, "8.30");
            return (Criteria) this;
        }

        public Criteria and8.30NotIn(List<Boolean> values) {
            addCriterion("8.30 not in", values, "8.30");
            return (Criteria) this;
        }

        public Criteria and8.30Between(Boolean value1, Boolean value2) {
            addCriterion("8.30 between", value1, value2, "8.30");
            return (Criteria) this;
        }

        public Criteria and8.30NotBetween(Boolean value1, Boolean value2) {
            addCriterion("8.30 not between", value1, value2, "8.30");
            return (Criteria) this;
        }

        public Criteria and9.00IsNull() {
            addCriterion("9.00 is null");
            return (Criteria) this;
        }

        public Criteria and9.00IsNotNull() {
            addCriterion("9.00 is not null");
            return (Criteria) this;
        }

        public Criteria and9.00EqualTo(Boolean value) {
            addCriterion("9.00 =", value, "9.00");
            return (Criteria) this;
        }

        public Criteria and9.00NotEqualTo(Boolean value) {
            addCriterion("9.00 <>", value, "9.00");
            return (Criteria) this;
        }

        public Criteria and9.00GreaterThan(Boolean value) {
            addCriterion("9.00 >", value, "9.00");
            return (Criteria) this;
        }

        public Criteria and9.00GreaterThanOrEqualTo(Boolean value) {
            addCriterion("9.00 >=", value, "9.00");
            return (Criteria) this;
        }

        public Criteria and9.00LessThan(Boolean value) {
            addCriterion("9.00 <", value, "9.00");
            return (Criteria) this;
        }

        public Criteria and9.00LessThanOrEqualTo(Boolean value) {
            addCriterion("9.00 <=", value, "9.00");
            return (Criteria) this;
        }

        public Criteria and9.00In(List<Boolean> values) {
            addCriterion("9.00 in", values, "9.00");
            return (Criteria) this;
        }

        public Criteria and9.00NotIn(List<Boolean> values) {
            addCriterion("9.00 not in", values, "9.00");
            return (Criteria) this;
        }

        public Criteria and9.00Between(Boolean value1, Boolean value2) {
            addCriterion("9.00 between", value1, value2, "9.00");
            return (Criteria) this;
        }

        public Criteria and9.00NotBetween(Boolean value1, Boolean value2) {
            addCriterion("9.00 not between", value1, value2, "9.00");
            return (Criteria) this;
        }

        public Criteria and9.30IsNull() {
            addCriterion("9.30 is null");
            return (Criteria) this;
        }

        public Criteria and9.30IsNotNull() {
            addCriterion("9.30 is not null");
            return (Criteria) this;
        }

        public Criteria and9.30EqualTo(Boolean value) {
            addCriterion("9.30 =", value, "9.30");
            return (Criteria) this;
        }

        public Criteria and9.30NotEqualTo(Boolean value) {
            addCriterion("9.30 <>", value, "9.30");
            return (Criteria) this;
        }

        public Criteria and9.30GreaterThan(Boolean value) {
            addCriterion("9.30 >", value, "9.30");
            return (Criteria) this;
        }

        public Criteria and9.30GreaterThanOrEqualTo(Boolean value) {
            addCriterion("9.30 >=", value, "9.30");
            return (Criteria) this;
        }

        public Criteria and9.30LessThan(Boolean value) {
            addCriterion("9.30 <", value, "9.30");
            return (Criteria) this;
        }

        public Criteria and9.30LessThanOrEqualTo(Boolean value) {
            addCriterion("9.30 <=", value, "9.30");
            return (Criteria) this;
        }

        public Criteria and9.30In(List<Boolean> values) {
            addCriterion("9.30 in", values, "9.30");
            return (Criteria) this;
        }

        public Criteria and9.30NotIn(List<Boolean> values) {
            addCriterion("9.30 not in", values, "9.30");
            return (Criteria) this;
        }

        public Criteria and9.30Between(Boolean value1, Boolean value2) {
            addCriterion("9.30 between", value1, value2, "9.30");
            return (Criteria) this;
        }

        public Criteria and9.30NotBetween(Boolean value1, Boolean value2) {
            addCriterion("9.30 not between", value1, value2, "9.30");
            return (Criteria) this;
        }

        public Criteria and10.00IsNull() {
            addCriterion("10.00 is null");
            return (Criteria) this;
        }

        public Criteria and10.00IsNotNull() {
            addCriterion("10.00 is not null");
            return (Criteria) this;
        }

        public Criteria and10.00EqualTo(Boolean value) {
            addCriterion("10.00 =", value, "10.00");
            return (Criteria) this;
        }

        public Criteria and10.00NotEqualTo(Boolean value) {
            addCriterion("10.00 <>", value, "10.00");
            return (Criteria) this;
        }

        public Criteria and10.00GreaterThan(Boolean value) {
            addCriterion("10.00 >", value, "10.00");
            return (Criteria) this;
        }

        public Criteria and10.00GreaterThanOrEqualTo(Boolean value) {
            addCriterion("10.00 >=", value, "10.00");
            return (Criteria) this;
        }

        public Criteria and10.00LessThan(Boolean value) {
            addCriterion("10.00 <", value, "10.00");
            return (Criteria) this;
        }

        public Criteria and10.00LessThanOrEqualTo(Boolean value) {
            addCriterion("10.00 <=", value, "10.00");
            return (Criteria) this;
        }

        public Criteria and10.00In(List<Boolean> values) {
            addCriterion("10.00 in", values, "10.00");
            return (Criteria) this;
        }

        public Criteria and10.00NotIn(List<Boolean> values) {
            addCriterion("10.00 not in", values, "10.00");
            return (Criteria) this;
        }

        public Criteria and10.00Between(Boolean value1, Boolean value2) {
            addCriterion("10.00 between", value1, value2, "10.00");
            return (Criteria) this;
        }

        public Criteria and10.00NotBetween(Boolean value1, Boolean value2) {
            addCriterion("10.00 not between", value1, value2, "10.00");
            return (Criteria) this;
        }

        public Criteria and10.30IsNull() {
            addCriterion("10.30 is null");
            return (Criteria) this;
        }

        public Criteria and10.30IsNotNull() {
            addCriterion("10.30 is not null");
            return (Criteria) this;
        }

        public Criteria and10.30EqualTo(Boolean value) {
            addCriterion("10.30 =", value, "10.30");
            return (Criteria) this;
        }

        public Criteria and10.30NotEqualTo(Boolean value) {
            addCriterion("10.30 <>", value, "10.30");
            return (Criteria) this;
        }

        public Criteria and10.30GreaterThan(Boolean value) {
            addCriterion("10.30 >", value, "10.30");
            return (Criteria) this;
        }

        public Criteria and10.30GreaterThanOrEqualTo(Boolean value) {
            addCriterion("10.30 >=", value, "10.30");
            return (Criteria) this;
        }

        public Criteria and10.30LessThan(Boolean value) {
            addCriterion("10.30 <", value, "10.30");
            return (Criteria) this;
        }

        public Criteria and10.30LessThanOrEqualTo(Boolean value) {
            addCriterion("10.30 <=", value, "10.30");
            return (Criteria) this;
        }

        public Criteria and10.30In(List<Boolean> values) {
            addCriterion("10.30 in", values, "10.30");
            return (Criteria) this;
        }

        public Criteria and10.30NotIn(List<Boolean> values) {
            addCriterion("10.30 not in", values, "10.30");
            return (Criteria) this;
        }

        public Criteria and10.30Between(Boolean value1, Boolean value2) {
            addCriterion("10.30 between", value1, value2, "10.30");
            return (Criteria) this;
        }

        public Criteria and10.30NotBetween(Boolean value1, Boolean value2) {
            addCriterion("10.30 not between", value1, value2, "10.30");
            return (Criteria) this;
        }

        public Criteria and11.00IsNull() {
            addCriterion("11.00 is null");
            return (Criteria) this;
        }

        public Criteria and11.00IsNotNull() {
            addCriterion("11.00 is not null");
            return (Criteria) this;
        }

        public Criteria and11.00EqualTo(Boolean value) {
            addCriterion("11.00 =", value, "11.00");
            return (Criteria) this;
        }

        public Criteria and11.00NotEqualTo(Boolean value) {
            addCriterion("11.00 <>", value, "11.00");
            return (Criteria) this;
        }

        public Criteria and11.00GreaterThan(Boolean value) {
            addCriterion("11.00 >", value, "11.00");
            return (Criteria) this;
        }

        public Criteria and11.00GreaterThanOrEqualTo(Boolean value) {
            addCriterion("11.00 >=", value, "11.00");
            return (Criteria) this;
        }

        public Criteria and11.00LessThan(Boolean value) {
            addCriterion("11.00 <", value, "11.00");
            return (Criteria) this;
        }

        public Criteria and11.00LessThanOrEqualTo(Boolean value) {
            addCriterion("11.00 <=", value, "11.00");
            return (Criteria) this;
        }

        public Criteria and11.00In(List<Boolean> values) {
            addCriterion("11.00 in", values, "11.00");
            return (Criteria) this;
        }

        public Criteria and11.00NotIn(List<Boolean> values) {
            addCriterion("11.00 not in", values, "11.00");
            return (Criteria) this;
        }

        public Criteria and11.00Between(Boolean value1, Boolean value2) {
            addCriterion("11.00 between", value1, value2, "11.00");
            return (Criteria) this;
        }

        public Criteria and11.00NotBetween(Boolean value1, Boolean value2) {
            addCriterion("11.00 not between", value1, value2, "11.00");
            return (Criteria) this;
        }

        public Criteria and11.30IsNull() {
            addCriterion("11.30 is null");
            return (Criteria) this;
        }

        public Criteria and11.30IsNotNull() {
            addCriterion("11.30 is not null");
            return (Criteria) this;
        }

        public Criteria and11.30EqualTo(Boolean value) {
            addCriterion("11.30 =", value, "11.30");
            return (Criteria) this;
        }

        public Criteria and11.30NotEqualTo(Boolean value) {
            addCriterion("11.30 <>", value, "11.30");
            return (Criteria) this;
        }

        public Criteria and11.30GreaterThan(Boolean value) {
            addCriterion("11.30 >", value, "11.30");
            return (Criteria) this;
        }

        public Criteria and11.30GreaterThanOrEqualTo(Boolean value) {
            addCriterion("11.30 >=", value, "11.30");
            return (Criteria) this;
        }

        public Criteria and11.30LessThan(Boolean value) {
            addCriterion("11.30 <", value, "11.30");
            return (Criteria) this;
        }

        public Criteria and11.30LessThanOrEqualTo(Boolean value) {
            addCriterion("11.30 <=", value, "11.30");
            return (Criteria) this;
        }

        public Criteria and11.30In(List<Boolean> values) {
            addCriterion("11.30 in", values, "11.30");
            return (Criteria) this;
        }

        public Criteria and11.30NotIn(List<Boolean> values) {
            addCriterion("11.30 not in", values, "11.30");
            return (Criteria) this;
        }

        public Criteria and11.30Between(Boolean value1, Boolean value2) {
            addCriterion("11.30 between", value1, value2, "11.30");
            return (Criteria) this;
        }

        public Criteria and11.30NotBetween(Boolean value1, Boolean value2) {
            addCriterion("11.30 not between", value1, value2, "11.30");
            return (Criteria) this;
        }

        public Criteria and12.00IsNull() {
            addCriterion("12.00 is null");
            return (Criteria) this;
        }

        public Criteria and12.00IsNotNull() {
            addCriterion("12.00 is not null");
            return (Criteria) this;
        }

        public Criteria and12.00EqualTo(Boolean value) {
            addCriterion("12.00 =", value, "12.00");
            return (Criteria) this;
        }

        public Criteria and12.00NotEqualTo(Boolean value) {
            addCriterion("12.00 <>", value, "12.00");
            return (Criteria) this;
        }

        public Criteria and12.00GreaterThan(Boolean value) {
            addCriterion("12.00 >", value, "12.00");
            return (Criteria) this;
        }

        public Criteria and12.00GreaterThanOrEqualTo(Boolean value) {
            addCriterion("12.00 >=", value, "12.00");
            return (Criteria) this;
        }

        public Criteria and12.00LessThan(Boolean value) {
            addCriterion("12.00 <", value, "12.00");
            return (Criteria) this;
        }

        public Criteria and12.00LessThanOrEqualTo(Boolean value) {
            addCriterion("12.00 <=", value, "12.00");
            return (Criteria) this;
        }

        public Criteria and12.00In(List<Boolean> values) {
            addCriterion("12.00 in", values, "12.00");
            return (Criteria) this;
        }

        public Criteria and12.00NotIn(List<Boolean> values) {
            addCriterion("12.00 not in", values, "12.00");
            return (Criteria) this;
        }

        public Criteria and12.00Between(Boolean value1, Boolean value2) {
            addCriterion("12.00 between", value1, value2, "12.00");
            return (Criteria) this;
        }

        public Criteria and12.00NotBetween(Boolean value1, Boolean value2) {
            addCriterion("12.00 not between", value1, value2, "12.00");
            return (Criteria) this;
        }

        public Criteria and12.30IsNull() {
            addCriterion("12.30 is null");
            return (Criteria) this;
        }

        public Criteria and12.30IsNotNull() {
            addCriterion("12.30 is not null");
            return (Criteria) this;
        }

        public Criteria and12.30EqualTo(Boolean value) {
            addCriterion("12.30 =", value, "12.30");
            return (Criteria) this;
        }

        public Criteria and12.30NotEqualTo(Boolean value) {
            addCriterion("12.30 <>", value, "12.30");
            return (Criteria) this;
        }

        public Criteria and12.30GreaterThan(Boolean value) {
            addCriterion("12.30 >", value, "12.30");
            return (Criteria) this;
        }

        public Criteria and12.30GreaterThanOrEqualTo(Boolean value) {
            addCriterion("12.30 >=", value, "12.30");
            return (Criteria) this;
        }

        public Criteria and12.30LessThan(Boolean value) {
            addCriterion("12.30 <", value, "12.30");
            return (Criteria) this;
        }

        public Criteria and12.30LessThanOrEqualTo(Boolean value) {
            addCriterion("12.30 <=", value, "12.30");
            return (Criteria) this;
        }

        public Criteria and12.30In(List<Boolean> values) {
            addCriterion("12.30 in", values, "12.30");
            return (Criteria) this;
        }

        public Criteria and12.30NotIn(List<Boolean> values) {
            addCriterion("12.30 not in", values, "12.30");
            return (Criteria) this;
        }

        public Criteria and12.30Between(Boolean value1, Boolean value2) {
            addCriterion("12.30 between", value1, value2, "12.30");
            return (Criteria) this;
        }

        public Criteria and12.30NotBetween(Boolean value1, Boolean value2) {
            addCriterion("12.30 not between", value1, value2, "12.30");
            return (Criteria) this;
        }

        public Criteria and13.00IsNull() {
            addCriterion("13.00 is null");
            return (Criteria) this;
        }

        public Criteria and13.00IsNotNull() {
            addCriterion("13.00 is not null");
            return (Criteria) this;
        }

        public Criteria and13.00EqualTo(Boolean value) {
            addCriterion("13.00 =", value, "13.00");
            return (Criteria) this;
        }

        public Criteria and13.00NotEqualTo(Boolean value) {
            addCriterion("13.00 <>", value, "13.00");
            return (Criteria) this;
        }

        public Criteria and13.00GreaterThan(Boolean value) {
            addCriterion("13.00 >", value, "13.00");
            return (Criteria) this;
        }

        public Criteria and13.00GreaterThanOrEqualTo(Boolean value) {
            addCriterion("13.00 >=", value, "13.00");
            return (Criteria) this;
        }

        public Criteria and13.00LessThan(Boolean value) {
            addCriterion("13.00 <", value, "13.00");
            return (Criteria) this;
        }

        public Criteria and13.00LessThanOrEqualTo(Boolean value) {
            addCriterion("13.00 <=", value, "13.00");
            return (Criteria) this;
        }

        public Criteria and13.00In(List<Boolean> values) {
            addCriterion("13.00 in", values, "13.00");
            return (Criteria) this;
        }

        public Criteria and13.00NotIn(List<Boolean> values) {
            addCriterion("13.00 not in", values, "13.00");
            return (Criteria) this;
        }

        public Criteria and13.00Between(Boolean value1, Boolean value2) {
            addCriterion("13.00 between", value1, value2, "13.00");
            return (Criteria) this;
        }

        public Criteria and13.00NotBetween(Boolean value1, Boolean value2) {
            addCriterion("13.00 not between", value1, value2, "13.00");
            return (Criteria) this;
        }

        public Criteria and13.30IsNull() {
            addCriterion("13.30 is null");
            return (Criteria) this;
        }

        public Criteria and13.30IsNotNull() {
            addCriterion("13.30 is not null");
            return (Criteria) this;
        }

        public Criteria and13.30EqualTo(Boolean value) {
            addCriterion("13.30 =", value, "13.30");
            return (Criteria) this;
        }

        public Criteria and13.30NotEqualTo(Boolean value) {
            addCriterion("13.30 <>", value, "13.30");
            return (Criteria) this;
        }

        public Criteria and13.30GreaterThan(Boolean value) {
            addCriterion("13.30 >", value, "13.30");
            return (Criteria) this;
        }

        public Criteria and13.30GreaterThanOrEqualTo(Boolean value) {
            addCriterion("13.30 >=", value, "13.30");
            return (Criteria) this;
        }

        public Criteria and13.30LessThan(Boolean value) {
            addCriterion("13.30 <", value, "13.30");
            return (Criteria) this;
        }

        public Criteria and13.30LessThanOrEqualTo(Boolean value) {
            addCriterion("13.30 <=", value, "13.30");
            return (Criteria) this;
        }

        public Criteria and13.30In(List<Boolean> values) {
            addCriterion("13.30 in", values, "13.30");
            return (Criteria) this;
        }

        public Criteria and13.30NotIn(List<Boolean> values) {
            addCriterion("13.30 not in", values, "13.30");
            return (Criteria) this;
        }

        public Criteria and13.30Between(Boolean value1, Boolean value2) {
            addCriterion("13.30 between", value1, value2, "13.30");
            return (Criteria) this;
        }

        public Criteria and13.30NotBetween(Boolean value1, Boolean value2) {
            addCriterion("13.30 not between", value1, value2, "13.30");
            return (Criteria) this;
        }

        public Criteria and14.00IsNull() {
            addCriterion("14.00 is null");
            return (Criteria) this;
        }

        public Criteria and14.00IsNotNull() {
            addCriterion("14.00 is not null");
            return (Criteria) this;
        }

        public Criteria and14.00EqualTo(Boolean value) {
            addCriterion("14.00 =", value, "14.00");
            return (Criteria) this;
        }

        public Criteria and14.00NotEqualTo(Boolean value) {
            addCriterion("14.00 <>", value, "14.00");
            return (Criteria) this;
        }

        public Criteria and14.00GreaterThan(Boolean value) {
            addCriterion("14.00 >", value, "14.00");
            return (Criteria) this;
        }

        public Criteria and14.00GreaterThanOrEqualTo(Boolean value) {
            addCriterion("14.00 >=", value, "14.00");
            return (Criteria) this;
        }

        public Criteria and14.00LessThan(Boolean value) {
            addCriterion("14.00 <", value, "14.00");
            return (Criteria) this;
        }

        public Criteria and14.00LessThanOrEqualTo(Boolean value) {
            addCriterion("14.00 <=", value, "14.00");
            return (Criteria) this;
        }

        public Criteria and14.00In(List<Boolean> values) {
            addCriterion("14.00 in", values, "14.00");
            return (Criteria) this;
        }

        public Criteria and14.00NotIn(List<Boolean> values) {
            addCriterion("14.00 not in", values, "14.00");
            return (Criteria) this;
        }

        public Criteria and14.00Between(Boolean value1, Boolean value2) {
            addCriterion("14.00 between", value1, value2, "14.00");
            return (Criteria) this;
        }

        public Criteria and14.00NotBetween(Boolean value1, Boolean value2) {
            addCriterion("14.00 not between", value1, value2, "14.00");
            return (Criteria) this;
        }

        public Criteria and14.30IsNull() {
            addCriterion("14.30 is null");
            return (Criteria) this;
        }

        public Criteria and14.30IsNotNull() {
            addCriterion("14.30 is not null");
            return (Criteria) this;
        }

        public Criteria and14.30EqualTo(Boolean value) {
            addCriterion("14.30 =", value, "14.30");
            return (Criteria) this;
        }

        public Criteria and14.30NotEqualTo(Boolean value) {
            addCriterion("14.30 <>", value, "14.30");
            return (Criteria) this;
        }

        public Criteria and14.30GreaterThan(Boolean value) {
            addCriterion("14.30 >", value, "14.30");
            return (Criteria) this;
        }

        public Criteria and14.30GreaterThanOrEqualTo(Boolean value) {
            addCriterion("14.30 >=", value, "14.30");
            return (Criteria) this;
        }

        public Criteria and14.30LessThan(Boolean value) {
            addCriterion("14.30 <", value, "14.30");
            return (Criteria) this;
        }

        public Criteria and14.30LessThanOrEqualTo(Boolean value) {
            addCriterion("14.30 <=", value, "14.30");
            return (Criteria) this;
        }

        public Criteria and14.30In(List<Boolean> values) {
            addCriterion("14.30 in", values, "14.30");
            return (Criteria) this;
        }

        public Criteria and14.30NotIn(List<Boolean> values) {
            addCriterion("14.30 not in", values, "14.30");
            return (Criteria) this;
        }

        public Criteria and14.30Between(Boolean value1, Boolean value2) {
            addCriterion("14.30 between", value1, value2, "14.30");
            return (Criteria) this;
        }

        public Criteria and14.30NotBetween(Boolean value1, Boolean value2) {
            addCriterion("14.30 not between", value1, value2, "14.30");
            return (Criteria) this;
        }

        public Criteria and15.00IsNull() {
            addCriterion("15.00 is null");
            return (Criteria) this;
        }

        public Criteria and15.00IsNotNull() {
            addCriterion("15.00 is not null");
            return (Criteria) this;
        }

        public Criteria and15.00EqualTo(Boolean value) {
            addCriterion("15.00 =", value, "15.00");
            return (Criteria) this;
        }

        public Criteria and15.00NotEqualTo(Boolean value) {
            addCriterion("15.00 <>", value, "15.00");
            return (Criteria) this;
        }

        public Criteria and15.00GreaterThan(Boolean value) {
            addCriterion("15.00 >", value, "15.00");
            return (Criteria) this;
        }

        public Criteria and15.00GreaterThanOrEqualTo(Boolean value) {
            addCriterion("15.00 >=", value, "15.00");
            return (Criteria) this;
        }

        public Criteria and15.00LessThan(Boolean value) {
            addCriterion("15.00 <", value, "15.00");
            return (Criteria) this;
        }

        public Criteria and15.00LessThanOrEqualTo(Boolean value) {
            addCriterion("15.00 <=", value, "15.00");
            return (Criteria) this;
        }

        public Criteria and15.00In(List<Boolean> values) {
            addCriterion("15.00 in", values, "15.00");
            return (Criteria) this;
        }

        public Criteria and15.00NotIn(List<Boolean> values) {
            addCriterion("15.00 not in", values, "15.00");
            return (Criteria) this;
        }

        public Criteria and15.00Between(Boolean value1, Boolean value2) {
            addCriterion("15.00 between", value1, value2, "15.00");
            return (Criteria) this;
        }

        public Criteria and15.00NotBetween(Boolean value1, Boolean value2) {
            addCriterion("15.00 not between", value1, value2, "15.00");
            return (Criteria) this;
        }

        public Criteria and15.30IsNull() {
            addCriterion("15.30 is null");
            return (Criteria) this;
        }

        public Criteria and15.30IsNotNull() {
            addCriterion("15.30 is not null");
            return (Criteria) this;
        }

        public Criteria and15.30EqualTo(Boolean value) {
            addCriterion("15.30 =", value, "15.30");
            return (Criteria) this;
        }

        public Criteria and15.30NotEqualTo(Boolean value) {
            addCriterion("15.30 <>", value, "15.30");
            return (Criteria) this;
        }

        public Criteria and15.30GreaterThan(Boolean value) {
            addCriterion("15.30 >", value, "15.30");
            return (Criteria) this;
        }

        public Criteria and15.30GreaterThanOrEqualTo(Boolean value) {
            addCriterion("15.30 >=", value, "15.30");
            return (Criteria) this;
        }

        public Criteria and15.30LessThan(Boolean value) {
            addCriterion("15.30 <", value, "15.30");
            return (Criteria) this;
        }

        public Criteria and15.30LessThanOrEqualTo(Boolean value) {
            addCriterion("15.30 <=", value, "15.30");
            return (Criteria) this;
        }

        public Criteria and15.30In(List<Boolean> values) {
            addCriterion("15.30 in", values, "15.30");
            return (Criteria) this;
        }

        public Criteria and15.30NotIn(List<Boolean> values) {
            addCriterion("15.30 not in", values, "15.30");
            return (Criteria) this;
        }

        public Criteria and15.30Between(Boolean value1, Boolean value2) {
            addCriterion("15.30 between", value1, value2, "15.30");
            return (Criteria) this;
        }

        public Criteria and15.30NotBetween(Boolean value1, Boolean value2) {
            addCriterion("15.30 not between", value1, value2, "15.30");
            return (Criteria) this;
        }

        public Criteria and16.00IsNull() {
            addCriterion("16.00 is null");
            return (Criteria) this;
        }

        public Criteria and16.00IsNotNull() {
            addCriterion("16.00 is not null");
            return (Criteria) this;
        }

        public Criteria and16.00EqualTo(Boolean value) {
            addCriterion("16.00 =", value, "16.00");
            return (Criteria) this;
        }

        public Criteria and16.00NotEqualTo(Boolean value) {
            addCriterion("16.00 <>", value, "16.00");
            return (Criteria) this;
        }

        public Criteria and16.00GreaterThan(Boolean value) {
            addCriterion("16.00 >", value, "16.00");
            return (Criteria) this;
        }

        public Criteria and16.00GreaterThanOrEqualTo(Boolean value) {
            addCriterion("16.00 >=", value, "16.00");
            return (Criteria) this;
        }

        public Criteria and16.00LessThan(Boolean value) {
            addCriterion("16.00 <", value, "16.00");
            return (Criteria) this;
        }

        public Criteria and16.00LessThanOrEqualTo(Boolean value) {
            addCriterion("16.00 <=", value, "16.00");
            return (Criteria) this;
        }

        public Criteria and16.00In(List<Boolean> values) {
            addCriterion("16.00 in", values, "16.00");
            return (Criteria) this;
        }

        public Criteria and16.00NotIn(List<Boolean> values) {
            addCriterion("16.00 not in", values, "16.00");
            return (Criteria) this;
        }

        public Criteria and16.00Between(Boolean value1, Boolean value2) {
            addCriterion("16.00 between", value1, value2, "16.00");
            return (Criteria) this;
        }

        public Criteria and16.00NotBetween(Boolean value1, Boolean value2) {
            addCriterion("16.00 not between", value1, value2, "16.00");
            return (Criteria) this;
        }

        public Criteria and16.30IsNull() {
            addCriterion("16.30 is null");
            return (Criteria) this;
        }

        public Criteria and16.30IsNotNull() {
            addCriterion("16.30 is not null");
            return (Criteria) this;
        }

        public Criteria and16.30EqualTo(Boolean value) {
            addCriterion("16.30 =", value, "16.30");
            return (Criteria) this;
        }

        public Criteria and16.30NotEqualTo(Boolean value) {
            addCriterion("16.30 <>", value, "16.30");
            return (Criteria) this;
        }

        public Criteria and16.30GreaterThan(Boolean value) {
            addCriterion("16.30 >", value, "16.30");
            return (Criteria) this;
        }

        public Criteria and16.30GreaterThanOrEqualTo(Boolean value) {
            addCriterion("16.30 >=", value, "16.30");
            return (Criteria) this;
        }

        public Criteria and16.30LessThan(Boolean value) {
            addCriterion("16.30 <", value, "16.30");
            return (Criteria) this;
        }

        public Criteria and16.30LessThanOrEqualTo(Boolean value) {
            addCriterion("16.30 <=", value, "16.30");
            return (Criteria) this;
        }

        public Criteria and16.30In(List<Boolean> values) {
            addCriterion("16.30 in", values, "16.30");
            return (Criteria) this;
        }

        public Criteria and16.30NotIn(List<Boolean> values) {
            addCriterion("16.30 not in", values, "16.30");
            return (Criteria) this;
        }

        public Criteria and16.30Between(Boolean value1, Boolean value2) {
            addCriterion("16.30 between", value1, value2, "16.30");
            return (Criteria) this;
        }

        public Criteria and16.30NotBetween(Boolean value1, Boolean value2) {
            addCriterion("16.30 not between", value1, value2, "16.30");
            return (Criteria) this;
        }

        public Criteria and17.00IsNull() {
            addCriterion("17.00 is null");
            return (Criteria) this;
        }

        public Criteria and17.00IsNotNull() {
            addCriterion("17.00 is not null");
            return (Criteria) this;
        }

        public Criteria and17.00EqualTo(Boolean value) {
            addCriterion("17.00 =", value, "17.00");
            return (Criteria) this;
        }

        public Criteria and17.00NotEqualTo(Boolean value) {
            addCriterion("17.00 <>", value, "17.00");
            return (Criteria) this;
        }

        public Criteria and17.00GreaterThan(Boolean value) {
            addCriterion("17.00 >", value, "17.00");
            return (Criteria) this;
        }

        public Criteria and17.00GreaterThanOrEqualTo(Boolean value) {
            addCriterion("17.00 >=", value, "17.00");
            return (Criteria) this;
        }

        public Criteria and17.00LessThan(Boolean value) {
            addCriterion("17.00 <", value, "17.00");
            return (Criteria) this;
        }

        public Criteria and17.00LessThanOrEqualTo(Boolean value) {
            addCriterion("17.00 <=", value, "17.00");
            return (Criteria) this;
        }

        public Criteria and17.00In(List<Boolean> values) {
            addCriterion("17.00 in", values, "17.00");
            return (Criteria) this;
        }

        public Criteria and17.00NotIn(List<Boolean> values) {
            addCriterion("17.00 not in", values, "17.00");
            return (Criteria) this;
        }

        public Criteria and17.00Between(Boolean value1, Boolean value2) {
            addCriterion("17.00 between", value1, value2, "17.00");
            return (Criteria) this;
        }

        public Criteria and17.00NotBetween(Boolean value1, Boolean value2) {
            addCriterion("17.00 not between", value1, value2, "17.00");
            return (Criteria) this;
        }

        public Criteria and17.30IsNull() {
            addCriterion("17.30 is null");
            return (Criteria) this;
        }

        public Criteria and17.30IsNotNull() {
            addCriterion("17.30 is not null");
            return (Criteria) this;
        }

        public Criteria and17.30EqualTo(Boolean value) {
            addCriterion("17.30 =", value, "17.30");
            return (Criteria) this;
        }

        public Criteria and17.30NotEqualTo(Boolean value) {
            addCriterion("17.30 <>", value, "17.30");
            return (Criteria) this;
        }

        public Criteria and17.30GreaterThan(Boolean value) {
            addCriterion("17.30 >", value, "17.30");
            return (Criteria) this;
        }

        public Criteria and17.30GreaterThanOrEqualTo(Boolean value) {
            addCriterion("17.30 >=", value, "17.30");
            return (Criteria) this;
        }

        public Criteria and17.30LessThan(Boolean value) {
            addCriterion("17.30 <", value, "17.30");
            return (Criteria) this;
        }

        public Criteria and17.30LessThanOrEqualTo(Boolean value) {
            addCriterion("17.30 <=", value, "17.30");
            return (Criteria) this;
        }

        public Criteria and17.30In(List<Boolean> values) {
            addCriterion("17.30 in", values, "17.30");
            return (Criteria) this;
        }

        public Criteria and17.30NotIn(List<Boolean> values) {
            addCriterion("17.30 not in", values, "17.30");
            return (Criteria) this;
        }

        public Criteria and17.30Between(Boolean value1, Boolean value2) {
            addCriterion("17.30 between", value1, value2, "17.30");
            return (Criteria) this;
        }

        public Criteria and17.30NotBetween(Boolean value1, Boolean value2) {
            addCriterion("17.30 not between", value1, value2, "17.30");
            return (Criteria) this;
        }

        public Criteria and18.00IsNull() {
            addCriterion("18.00 is null");
            return (Criteria) this;
        }

        public Criteria and18.00IsNotNull() {
            addCriterion("18.00 is not null");
            return (Criteria) this;
        }

        public Criteria and18.00EqualTo(Boolean value) {
            addCriterion("18.00 =", value, "18.00");
            return (Criteria) this;
        }

        public Criteria and18.00NotEqualTo(Boolean value) {
            addCriterion("18.00 <>", value, "18.00");
            return (Criteria) this;
        }

        public Criteria and18.00GreaterThan(Boolean value) {
            addCriterion("18.00 >", value, "18.00");
            return (Criteria) this;
        }

        public Criteria and18.00GreaterThanOrEqualTo(Boolean value) {
            addCriterion("18.00 >=", value, "18.00");
            return (Criteria) this;
        }

        public Criteria and18.00LessThan(Boolean value) {
            addCriterion("18.00 <", value, "18.00");
            return (Criteria) this;
        }

        public Criteria and18.00LessThanOrEqualTo(Boolean value) {
            addCriterion("18.00 <=", value, "18.00");
            return (Criteria) this;
        }

        public Criteria and18.00In(List<Boolean> values) {
            addCriterion("18.00 in", values, "18.00");
            return (Criteria) this;
        }

        public Criteria and18.00NotIn(List<Boolean> values) {
            addCriterion("18.00 not in", values, "18.00");
            return (Criteria) this;
        }

        public Criteria and18.00Between(Boolean value1, Boolean value2) {
            addCriterion("18.00 between", value1, value2, "18.00");
            return (Criteria) this;
        }

        public Criteria and18.00NotBetween(Boolean value1, Boolean value2) {
            addCriterion("18.00 not between", value1, value2, "18.00");
            return (Criteria) this;
        }

        public Criteria and18.30IsNull() {
            addCriterion("18.30 is null");
            return (Criteria) this;
        }

        public Criteria and18.30IsNotNull() {
            addCriterion("18.30 is not null");
            return (Criteria) this;
        }

        public Criteria and18.30EqualTo(Boolean value) {
            addCriterion("18.30 =", value, "18.30");
            return (Criteria) this;
        }

        public Criteria and18.30NotEqualTo(Boolean value) {
            addCriterion("18.30 <>", value, "18.30");
            return (Criteria) this;
        }

        public Criteria and18.30GreaterThan(Boolean value) {
            addCriterion("18.30 >", value, "18.30");
            return (Criteria) this;
        }

        public Criteria and18.30GreaterThanOrEqualTo(Boolean value) {
            addCriterion("18.30 >=", value, "18.30");
            return (Criteria) this;
        }

        public Criteria and18.30LessThan(Boolean value) {
            addCriterion("18.30 <", value, "18.30");
            return (Criteria) this;
        }

        public Criteria and18.30LessThanOrEqualTo(Boolean value) {
            addCriterion("18.30 <=", value, "18.30");
            return (Criteria) this;
        }

        public Criteria and18.30In(List<Boolean> values) {
            addCriterion("18.30 in", values, "18.30");
            return (Criteria) this;
        }

        public Criteria and18.30NotIn(List<Boolean> values) {
            addCriterion("18.30 not in", values, "18.30");
            return (Criteria) this;
        }

        public Criteria and18.30Between(Boolean value1, Boolean value2) {
            addCriterion("18.30 between", value1, value2, "18.30");
            return (Criteria) this;
        }

        public Criteria and18.30NotBetween(Boolean value1, Boolean value2) {
            addCriterion("18.30 not between", value1, value2, "18.30");
            return (Criteria) this;
        }

        public Criteria and19.00IsNull() {
            addCriterion("19.00 is null");
            return (Criteria) this;
        }

        public Criteria and19.00IsNotNull() {
            addCriterion("19.00 is not null");
            return (Criteria) this;
        }

        public Criteria and19.00EqualTo(Boolean value) {
            addCriterion("19.00 =", value, "19.00");
            return (Criteria) this;
        }

        public Criteria and19.00NotEqualTo(Boolean value) {
            addCriterion("19.00 <>", value, "19.00");
            return (Criteria) this;
        }

        public Criteria and19.00GreaterThan(Boolean value) {
            addCriterion("19.00 >", value, "19.00");
            return (Criteria) this;
        }

        public Criteria and19.00GreaterThanOrEqualTo(Boolean value) {
            addCriterion("19.00 >=", value, "19.00");
            return (Criteria) this;
        }

        public Criteria and19.00LessThan(Boolean value) {
            addCriterion("19.00 <", value, "19.00");
            return (Criteria) this;
        }

        public Criteria and19.00LessThanOrEqualTo(Boolean value) {
            addCriterion("19.00 <=", value, "19.00");
            return (Criteria) this;
        }

        public Criteria and19.00In(List<Boolean> values) {
            addCriterion("19.00 in", values, "19.00");
            return (Criteria) this;
        }

        public Criteria and19.00NotIn(List<Boolean> values) {
            addCriterion("19.00 not in", values, "19.00");
            return (Criteria) this;
        }

        public Criteria and19.00Between(Boolean value1, Boolean value2) {
            addCriterion("19.00 between", value1, value2, "19.00");
            return (Criteria) this;
        }

        public Criteria and19.00NotBetween(Boolean value1, Boolean value2) {
            addCriterion("19.00 not between", value1, value2, "19.00");
            return (Criteria) this;
        }

        public Criteria and19.30IsNull() {
            addCriterion("19.30 is null");
            return (Criteria) this;
        }

        public Criteria and19.30IsNotNull() {
            addCriterion("19.30 is not null");
            return (Criteria) this;
        }

        public Criteria and19.30EqualTo(Boolean value) {
            addCriterion("19.30 =", value, "19.30");
            return (Criteria) this;
        }

        public Criteria and19.30NotEqualTo(Boolean value) {
            addCriterion("19.30 <>", value, "19.30");
            return (Criteria) this;
        }

        public Criteria and19.30GreaterThan(Boolean value) {
            addCriterion("19.30 >", value, "19.30");
            return (Criteria) this;
        }

        public Criteria and19.30GreaterThanOrEqualTo(Boolean value) {
            addCriterion("19.30 >=", value, "19.30");
            return (Criteria) this;
        }

        public Criteria and19.30LessThan(Boolean value) {
            addCriterion("19.30 <", value, "19.30");
            return (Criteria) this;
        }

        public Criteria and19.30LessThanOrEqualTo(Boolean value) {
            addCriterion("19.30 <=", value, "19.30");
            return (Criteria) this;
        }

        public Criteria and19.30In(List<Boolean> values) {
            addCriterion("19.30 in", values, "19.30");
            return (Criteria) this;
        }

        public Criteria and19.30NotIn(List<Boolean> values) {
            addCriterion("19.30 not in", values, "19.30");
            return (Criteria) this;
        }

        public Criteria and19.30Between(Boolean value1, Boolean value2) {
            addCriterion("19.30 between", value1, value2, "19.30");
            return (Criteria) this;
        }

        public Criteria and19.30NotBetween(Boolean value1, Boolean value2) {
            addCriterion("19.30 not between", value1, value2, "19.30");
            return (Criteria) this;
        }

        public Criteria and20.00IsNull() {
            addCriterion("20.00 is null");
            return (Criteria) this;
        }

        public Criteria and20.00IsNotNull() {
            addCriterion("20.00 is not null");
            return (Criteria) this;
        }

        public Criteria and20.00EqualTo(Boolean value) {
            addCriterion("20.00 =", value, "20.00");
            return (Criteria) this;
        }

        public Criteria and20.00NotEqualTo(Boolean value) {
            addCriterion("20.00 <>", value, "20.00");
            return (Criteria) this;
        }

        public Criteria and20.00GreaterThan(Boolean value) {
            addCriterion("20.00 >", value, "20.00");
            return (Criteria) this;
        }

        public Criteria and20.00GreaterThanOrEqualTo(Boolean value) {
            addCriterion("20.00 >=", value, "20.00");
            return (Criteria) this;
        }

        public Criteria and20.00LessThan(Boolean value) {
            addCriterion("20.00 <", value, "20.00");
            return (Criteria) this;
        }

        public Criteria and20.00LessThanOrEqualTo(Boolean value) {
            addCriterion("20.00 <=", value, "20.00");
            return (Criteria) this;
        }

        public Criteria and20.00In(List<Boolean> values) {
            addCriterion("20.00 in", values, "20.00");
            return (Criteria) this;
        }

        public Criteria and20.00NotIn(List<Boolean> values) {
            addCriterion("20.00 not in", values, "20.00");
            return (Criteria) this;
        }

        public Criteria and20.00Between(Boolean value1, Boolean value2) {
            addCriterion("20.00 between", value1, value2, "20.00");
            return (Criteria) this;
        }

        public Criteria and20.00NotBetween(Boolean value1, Boolean value2) {
            addCriterion("20.00 not between", value1, value2, "20.00");
            return (Criteria) this;
        }

        public Criteria and20.30IsNull() {
            addCriterion("20.30 is null");
            return (Criteria) this;
        }

        public Criteria and20.30IsNotNull() {
            addCriterion("20.30 is not null");
            return (Criteria) this;
        }

        public Criteria and20.30EqualTo(Boolean value) {
            addCriterion("20.30 =", value, "20.30");
            return (Criteria) this;
        }

        public Criteria and20.30NotEqualTo(Boolean value) {
            addCriterion("20.30 <>", value, "20.30");
            return (Criteria) this;
        }

        public Criteria and20.30GreaterThan(Boolean value) {
            addCriterion("20.30 >", value, "20.30");
            return (Criteria) this;
        }

        public Criteria and20.30GreaterThanOrEqualTo(Boolean value) {
            addCriterion("20.30 >=", value, "20.30");
            return (Criteria) this;
        }

        public Criteria and20.30LessThan(Boolean value) {
            addCriterion("20.30 <", value, "20.30");
            return (Criteria) this;
        }

        public Criteria and20.30LessThanOrEqualTo(Boolean value) {
            addCriterion("20.30 <=", value, "20.30");
            return (Criteria) this;
        }

        public Criteria and20.30In(List<Boolean> values) {
            addCriterion("20.30 in", values, "20.30");
            return (Criteria) this;
        }

        public Criteria and20.30NotIn(List<Boolean> values) {
            addCriterion("20.30 not in", values, "20.30");
            return (Criteria) this;
        }

        public Criteria and20.30Between(Boolean value1, Boolean value2) {
            addCriterion("20.30 between", value1, value2, "20.30");
            return (Criteria) this;
        }

        public Criteria and20.30NotBetween(Boolean value1, Boolean value2) {
            addCriterion("20.30 not between", value1, value2, "20.30");
            return (Criteria) this;
        }

        public Criteria and21.00IsNull() {
            addCriterion("21.00 is null");
            return (Criteria) this;
        }

        public Criteria and21.00IsNotNull() {
            addCriterion("21.00 is not null");
            return (Criteria) this;
        }

        public Criteria and21.00EqualTo(Boolean value) {
            addCriterion("21.00 =", value, "21.00");
            return (Criteria) this;
        }

        public Criteria and21.00NotEqualTo(Boolean value) {
            addCriterion("21.00 <>", value, "21.00");
            return (Criteria) this;
        }

        public Criteria and21.00GreaterThan(Boolean value) {
            addCriterion("21.00 >", value, "21.00");
            return (Criteria) this;
        }

        public Criteria and21.00GreaterThanOrEqualTo(Boolean value) {
            addCriterion("21.00 >=", value, "21.00");
            return (Criteria) this;
        }

        public Criteria and21.00LessThan(Boolean value) {
            addCriterion("21.00 <", value, "21.00");
            return (Criteria) this;
        }

        public Criteria and21.00LessThanOrEqualTo(Boolean value) {
            addCriterion("21.00 <=", value, "21.00");
            return (Criteria) this;
        }

        public Criteria and21.00In(List<Boolean> values) {
            addCriterion("21.00 in", values, "21.00");
            return (Criteria) this;
        }

        public Criteria and21.00NotIn(List<Boolean> values) {
            addCriterion("21.00 not in", values, "21.00");
            return (Criteria) this;
        }

        public Criteria and21.00Between(Boolean value1, Boolean value2) {
            addCriterion("21.00 between", value1, value2, "21.00");
            return (Criteria) this;
        }

        public Criteria and21.00NotBetween(Boolean value1, Boolean value2) {
            addCriterion("21.00 not between", value1, value2, "21.00");
            return (Criteria) this;
        }

        public Criteria and21.30IsNull() {
            addCriterion("21.30 is null");
            return (Criteria) this;
        }

        public Criteria and21.30IsNotNull() {
            addCriterion("21.30 is not null");
            return (Criteria) this;
        }

        public Criteria and21.30EqualTo(Boolean value) {
            addCriterion("21.30 =", value, "21.30");
            return (Criteria) this;
        }

        public Criteria and21.30NotEqualTo(Boolean value) {
            addCriterion("21.30 <>", value, "21.30");
            return (Criteria) this;
        }

        public Criteria and21.30GreaterThan(Boolean value) {
            addCriterion("21.30 >", value, "21.30");
            return (Criteria) this;
        }

        public Criteria and21.30GreaterThanOrEqualTo(Boolean value) {
            addCriterion("21.30 >=", value, "21.30");
            return (Criteria) this;
        }

        public Criteria and21.30LessThan(Boolean value) {
            addCriterion("21.30 <", value, "21.30");
            return (Criteria) this;
        }

        public Criteria and21.30LessThanOrEqualTo(Boolean value) {
            addCriterion("21.30 <=", value, "21.30");
            return (Criteria) this;
        }

        public Criteria and21.30In(List<Boolean> values) {
            addCriterion("21.30 in", values, "21.30");
            return (Criteria) this;
        }

        public Criteria and21.30NotIn(List<Boolean> values) {
            addCriterion("21.30 not in", values, "21.30");
            return (Criteria) this;
        }

        public Criteria and21.30Between(Boolean value1, Boolean value2) {
            addCriterion("21.30 between", value1, value2, "21.30");
            return (Criteria) this;
        }

        public Criteria and21.30NotBetween(Boolean value1, Boolean value2) {
            addCriterion("21.30 not between", value1, value2, "21.30");
            return (Criteria) this;
        }

        public Criteria and22.00IsNull() {
            addCriterion("22.00 is null");
            return (Criteria) this;
        }

        public Criteria and22.00IsNotNull() {
            addCriterion("22.00 is not null");
            return (Criteria) this;
        }

        public Criteria and22.00EqualTo(Boolean value) {
            addCriterion("22.00 =", value, "22.00");
            return (Criteria) this;
        }

        public Criteria and22.00NotEqualTo(Boolean value) {
            addCriterion("22.00 <>", value, "22.00");
            return (Criteria) this;
        }

        public Criteria and22.00GreaterThan(Boolean value) {
            addCriterion("22.00 >", value, "22.00");
            return (Criteria) this;
        }

        public Criteria and22.00GreaterThanOrEqualTo(Boolean value) {
            addCriterion("22.00 >=", value, "22.00");
            return (Criteria) this;
        }

        public Criteria and22.00LessThan(Boolean value) {
            addCriterion("22.00 <", value, "22.00");
            return (Criteria) this;
        }

        public Criteria and22.00LessThanOrEqualTo(Boolean value) {
            addCriterion("22.00 <=", value, "22.00");
            return (Criteria) this;
        }

        public Criteria and22.00In(List<Boolean> values) {
            addCriterion("22.00 in", values, "22.00");
            return (Criteria) this;
        }

        public Criteria and22.00NotIn(List<Boolean> values) {
            addCriterion("22.00 not in", values, "22.00");
            return (Criteria) this;
        }

        public Criteria and22.00Between(Boolean value1, Boolean value2) {
            addCriterion("22.00 between", value1, value2, "22.00");
            return (Criteria) this;
        }

        public Criteria and22.00NotBetween(Boolean value1, Boolean value2) {
            addCriterion("22.00 not between", value1, value2, "22.00");
            return (Criteria) this;
        }

        public Criteria and22.30IsNull() {
            addCriterion("22.30 is null");
            return (Criteria) this;
        }

        public Criteria and22.30IsNotNull() {
            addCriterion("22.30 is not null");
            return (Criteria) this;
        }

        public Criteria and22.30EqualTo(Boolean value) {
            addCriterion("22.30 =", value, "22.30");
            return (Criteria) this;
        }

        public Criteria and22.30NotEqualTo(Boolean value) {
            addCriterion("22.30 <>", value, "22.30");
            return (Criteria) this;
        }

        public Criteria and22.30GreaterThan(Boolean value) {
            addCriterion("22.30 >", value, "22.30");
            return (Criteria) this;
        }

        public Criteria and22.30GreaterThanOrEqualTo(Boolean value) {
            addCriterion("22.30 >=", value, "22.30");
            return (Criteria) this;
        }

        public Criteria and22.30LessThan(Boolean value) {
            addCriterion("22.30 <", value, "22.30");
            return (Criteria) this;
        }

        public Criteria and22.30LessThanOrEqualTo(Boolean value) {
            addCriterion("22.30 <=", value, "22.30");
            return (Criteria) this;
        }

        public Criteria and22.30In(List<Boolean> values) {
            addCriterion("22.30 in", values, "22.30");
            return (Criteria) this;
        }

        public Criteria and22.30NotIn(List<Boolean> values) {
            addCriterion("22.30 not in", values, "22.30");
            return (Criteria) this;
        }

        public Criteria and22.30Between(Boolean value1, Boolean value2) {
            addCriterion("22.30 between", value1, value2, "22.30");
            return (Criteria) this;
        }

        public Criteria and22.30NotBetween(Boolean value1, Boolean value2) {
            addCriterion("22.30 not between", value1, value2, "22.30");
            return (Criteria) this;
        }

        public Criteria and23.00IsNull() {
            addCriterion("23.00 is null");
            return (Criteria) this;
        }

        public Criteria and23.00IsNotNull() {
            addCriterion("23.00 is not null");
            return (Criteria) this;
        }

        public Criteria and23.00EqualTo(Boolean value) {
            addCriterion("23.00 =", value, "23.00");
            return (Criteria) this;
        }

        public Criteria and23.00NotEqualTo(Boolean value) {
            addCriterion("23.00 <>", value, "23.00");
            return (Criteria) this;
        }

        public Criteria and23.00GreaterThan(Boolean value) {
            addCriterion("23.00 >", value, "23.00");
            return (Criteria) this;
        }

        public Criteria and23.00GreaterThanOrEqualTo(Boolean value) {
            addCriterion("23.00 >=", value, "23.00");
            return (Criteria) this;
        }

        public Criteria and23.00LessThan(Boolean value) {
            addCriterion("23.00 <", value, "23.00");
            return (Criteria) this;
        }

        public Criteria and23.00LessThanOrEqualTo(Boolean value) {
            addCriterion("23.00 <=", value, "23.00");
            return (Criteria) this;
        }

        public Criteria and23.00In(List<Boolean> values) {
            addCriterion("23.00 in", values, "23.00");
            return (Criteria) this;
        }

        public Criteria and23.00NotIn(List<Boolean> values) {
            addCriterion("23.00 not in", values, "23.00");
            return (Criteria) this;
        }

        public Criteria and23.00Between(Boolean value1, Boolean value2) {
            addCriterion("23.00 between", value1, value2, "23.00");
            return (Criteria) this;
        }

        public Criteria and23.00NotBetween(Boolean value1, Boolean value2) {
            addCriterion("23.00 not between", value1, value2, "23.00");
            return (Criteria) this;
        }

        public Criteria andBookdataIsNull() {
            addCriterion("bookdata is null");
            return (Criteria) this;
        }

        public Criteria andBookdataIsNotNull() {
            addCriterion("bookdata is not null");
            return (Criteria) this;
        }

        public Criteria andBookdataEqualTo(Date value) {
            addCriterionForJDBCDate("bookdata =", value, "bookdata");
            return (Criteria) this;
        }

        public Criteria andBookdataNotEqualTo(Date value) {
            addCriterionForJDBCDate("bookdata <>", value, "bookdata");
            return (Criteria) this;
        }

        public Criteria andBookdataGreaterThan(Date value) {
            addCriterionForJDBCDate("bookdata >", value, "bookdata");
            return (Criteria) this;
        }

        public Criteria andBookdataGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("bookdata >=", value, "bookdata");
            return (Criteria) this;
        }

        public Criteria andBookdataLessThan(Date value) {
            addCriterionForJDBCDate("bookdata <", value, "bookdata");
            return (Criteria) this;
        }

        public Criteria andBookdataLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("bookdata <=", value, "bookdata");
            return (Criteria) this;
        }

        public Criteria andBookdataIn(List<Date> values) {
            addCriterionForJDBCDate("bookdata in", values, "bookdata");
            return (Criteria) this;
        }

        public Criteria andBookdataNotIn(List<Date> values) {
            addCriterionForJDBCDate("bookdata not in", values, "bookdata");
            return (Criteria) this;
        }

        public Criteria andBookdataBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("bookdata between", value1, value2, "bookdata");
            return (Criteria) this;
        }

        public Criteria andBookdataNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("bookdata not between", value1, value2, "bookdata");
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