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

        public Criteria andEightIsNull() {
            addCriterion("eight is null");
            return (Criteria) this;
        }

        public Criteria andEightIsNotNull() {
            addCriterion("eight is not null");
            return (Criteria) this;
        }

        public Criteria andEightEqualTo(Boolean value) {
            addCriterion("eight =", value, "eight");
            return (Criteria) this;
        }

        public Criteria andEightNotEqualTo(Boolean value) {
            addCriterion("eight <>", value, "eight");
            return (Criteria) this;
        }

        public Criteria andEightGreaterThan(Boolean value) {
            addCriterion("eight >", value, "eight");
            return (Criteria) this;
        }

        public Criteria andEightGreaterThanOrEqualTo(Boolean value) {
            addCriterion("eight >=", value, "eight");
            return (Criteria) this;
        }

        public Criteria andEightLessThan(Boolean value) {
            addCriterion("eight <", value, "eight");
            return (Criteria) this;
        }

        public Criteria andEightLessThanOrEqualTo(Boolean value) {
            addCriterion("eight <=", value, "eight");
            return (Criteria) this;
        }

        public Criteria andEightIn(List<Boolean> values) {
            addCriterion("eight in", values, "eight");
            return (Criteria) this;
        }

        public Criteria andEightNotIn(List<Boolean> values) {
            addCriterion("eight not in", values, "eight");
            return (Criteria) this;
        }

        public Criteria andEightBetween(Boolean value1, Boolean value2) {
            addCriterion("eight between", value1, value2, "eight");
            return (Criteria) this;
        }

        public Criteria andEightNotBetween(Boolean value1, Boolean value2) {
            addCriterion("eight not between", value1, value2, "eight");
            return (Criteria) this;
        }

        public Criteria andEightThirtyIsNull() {
            addCriterion("eight_thirty is null");
            return (Criteria) this;
        }

        public Criteria andEightThirtyIsNotNull() {
            addCriterion("eight_thirty is not null");
            return (Criteria) this;
        }

        public Criteria andEightThirtyEqualTo(Boolean value) {
            addCriterion("eight_thirty =", value, "eightThirty");
            return (Criteria) this;
        }

        public Criteria andEightThirtyNotEqualTo(Boolean value) {
            addCriterion("eight_thirty <>", value, "eightThirty");
            return (Criteria) this;
        }

        public Criteria andEightThirtyGreaterThan(Boolean value) {
            addCriterion("eight_thirty >", value, "eightThirty");
            return (Criteria) this;
        }

        public Criteria andEightThirtyGreaterThanOrEqualTo(Boolean value) {
            addCriterion("eight_thirty >=", value, "eightThirty");
            return (Criteria) this;
        }

        public Criteria andEightThirtyLessThan(Boolean value) {
            addCriterion("eight_thirty <", value, "eightThirty");
            return (Criteria) this;
        }

        public Criteria andEightThirtyLessThanOrEqualTo(Boolean value) {
            addCriterion("eight_thirty <=", value, "eightThirty");
            return (Criteria) this;
        }

        public Criteria andEightThirtyIn(List<Boolean> values) {
            addCriterion("eight_thirty in", values, "eightThirty");
            return (Criteria) this;
        }

        public Criteria andEightThirtyNotIn(List<Boolean> values) {
            addCriterion("eight_thirty not in", values, "eightThirty");
            return (Criteria) this;
        }

        public Criteria andEightThirtyBetween(Boolean value1, Boolean value2) {
            addCriterion("eight_thirty between", value1, value2, "eightThirty");
            return (Criteria) this;
        }

        public Criteria andEightThirtyNotBetween(Boolean value1, Boolean value2) {
            addCriterion("eight_thirty not between", value1, value2, "eightThirty");
            return (Criteria) this;
        }

        public Criteria andNineIsNull() {
            addCriterion("nine is null");
            return (Criteria) this;
        }

        public Criteria andNineIsNotNull() {
            addCriterion("nine is not null");
            return (Criteria) this;
        }

        public Criteria andNineEqualTo(Boolean value) {
            addCriterion("nine =", value, "nine");
            return (Criteria) this;
        }

        public Criteria andNineNotEqualTo(Boolean value) {
            addCriterion("nine <>", value, "nine");
            return (Criteria) this;
        }

        public Criteria andNineGreaterThan(Boolean value) {
            addCriterion("nine >", value, "nine");
            return (Criteria) this;
        }

        public Criteria andNineGreaterThanOrEqualTo(Boolean value) {
            addCriterion("nine >=", value, "nine");
            return (Criteria) this;
        }

        public Criteria andNineLessThan(Boolean value) {
            addCriterion("nine <", value, "nine");
            return (Criteria) this;
        }

        public Criteria andNineLessThanOrEqualTo(Boolean value) {
            addCriterion("nine <=", value, "nine");
            return (Criteria) this;
        }

        public Criteria andNineIn(List<Boolean> values) {
            addCriterion("nine in", values, "nine");
            return (Criteria) this;
        }

        public Criteria andNineNotIn(List<Boolean> values) {
            addCriterion("nine not in", values, "nine");
            return (Criteria) this;
        }

        public Criteria andNineBetween(Boolean value1, Boolean value2) {
            addCriterion("nine between", value1, value2, "nine");
            return (Criteria) this;
        }

        public Criteria andNineNotBetween(Boolean value1, Boolean value2) {
            addCriterion("nine not between", value1, value2, "nine");
            return (Criteria) this;
        }

        public Criteria andNineThirtyIsNull() {
            addCriterion("nine_thirty is null");
            return (Criteria) this;
        }

        public Criteria andNineThirtyIsNotNull() {
            addCriterion("nine_thirty is not null");
            return (Criteria) this;
        }

        public Criteria andNineThirtyEqualTo(Boolean value) {
            addCriterion("nine_thirty =", value, "nineThirty");
            return (Criteria) this;
        }

        public Criteria andNineThirtyNotEqualTo(Boolean value) {
            addCriterion("nine_thirty <>", value, "nineThirty");
            return (Criteria) this;
        }

        public Criteria andNineThirtyGreaterThan(Boolean value) {
            addCriterion("nine_thirty >", value, "nineThirty");
            return (Criteria) this;
        }

        public Criteria andNineThirtyGreaterThanOrEqualTo(Boolean value) {
            addCriterion("nine_thirty >=", value, "nineThirty");
            return (Criteria) this;
        }

        public Criteria andNineThirtyLessThan(Boolean value) {
            addCriterion("nine_thirty <", value, "nineThirty");
            return (Criteria) this;
        }

        public Criteria andNineThirtyLessThanOrEqualTo(Boolean value) {
            addCriterion("nine_thirty <=", value, "nineThirty");
            return (Criteria) this;
        }

        public Criteria andNineThirtyIn(List<Boolean> values) {
            addCriterion("nine_thirty in", values, "nineThirty");
            return (Criteria) this;
        }

        public Criteria andNineThirtyNotIn(List<Boolean> values) {
            addCriterion("nine_thirty not in", values, "nineThirty");
            return (Criteria) this;
        }

        public Criteria andNineThirtyBetween(Boolean value1, Boolean value2) {
            addCriterion("nine_thirty between", value1, value2, "nineThirty");
            return (Criteria) this;
        }

        public Criteria andNineThirtyNotBetween(Boolean value1, Boolean value2) {
            addCriterion("nine_thirty not between", value1, value2, "nineThirty");
            return (Criteria) this;
        }

        public Criteria andTenIsNull() {
            addCriterion("ten is null");
            return (Criteria) this;
        }

        public Criteria andTenIsNotNull() {
            addCriterion("ten is not null");
            return (Criteria) this;
        }

        public Criteria andTenEqualTo(Boolean value) {
            addCriterion("ten =", value, "ten");
            return (Criteria) this;
        }

        public Criteria andTenNotEqualTo(Boolean value) {
            addCriterion("ten <>", value, "ten");
            return (Criteria) this;
        }

        public Criteria andTenGreaterThan(Boolean value) {
            addCriterion("ten >", value, "ten");
            return (Criteria) this;
        }

        public Criteria andTenGreaterThanOrEqualTo(Boolean value) {
            addCriterion("ten >=", value, "ten");
            return (Criteria) this;
        }

        public Criteria andTenLessThan(Boolean value) {
            addCriterion("ten <", value, "ten");
            return (Criteria) this;
        }

        public Criteria andTenLessThanOrEqualTo(Boolean value) {
            addCriterion("ten <=", value, "ten");
            return (Criteria) this;
        }

        public Criteria andTenIn(List<Boolean> values) {
            addCriterion("ten in", values, "ten");
            return (Criteria) this;
        }

        public Criteria andTenNotIn(List<Boolean> values) {
            addCriterion("ten not in", values, "ten");
            return (Criteria) this;
        }

        public Criteria andTenBetween(Boolean value1, Boolean value2) {
            addCriterion("ten between", value1, value2, "ten");
            return (Criteria) this;
        }

        public Criteria andTenNotBetween(Boolean value1, Boolean value2) {
            addCriterion("ten not between", value1, value2, "ten");
            return (Criteria) this;
        }

        public Criteria andTenThirtyIsNull() {
            addCriterion("ten_thirty is null");
            return (Criteria) this;
        }

        public Criteria andTenThirtyIsNotNull() {
            addCriterion("ten_thirty is not null");
            return (Criteria) this;
        }

        public Criteria andTenThirtyEqualTo(Boolean value) {
            addCriterion("ten_thirty =", value, "tenThirty");
            return (Criteria) this;
        }

        public Criteria andTenThirtyNotEqualTo(Boolean value) {
            addCriterion("ten_thirty <>", value, "tenThirty");
            return (Criteria) this;
        }

        public Criteria andTenThirtyGreaterThan(Boolean value) {
            addCriterion("ten_thirty >", value, "tenThirty");
            return (Criteria) this;
        }

        public Criteria andTenThirtyGreaterThanOrEqualTo(Boolean value) {
            addCriterion("ten_thirty >=", value, "tenThirty");
            return (Criteria) this;
        }

        public Criteria andTenThirtyLessThan(Boolean value) {
            addCriterion("ten_thirty <", value, "tenThirty");
            return (Criteria) this;
        }

        public Criteria andTenThirtyLessThanOrEqualTo(Boolean value) {
            addCriterion("ten_thirty <=", value, "tenThirty");
            return (Criteria) this;
        }

        public Criteria andTenThirtyIn(List<Boolean> values) {
            addCriterion("ten_thirty in", values, "tenThirty");
            return (Criteria) this;
        }

        public Criteria andTenThirtyNotIn(List<Boolean> values) {
            addCriterion("ten_thirty not in", values, "tenThirty");
            return (Criteria) this;
        }

        public Criteria andTenThirtyBetween(Boolean value1, Boolean value2) {
            addCriterion("ten_thirty between", value1, value2, "tenThirty");
            return (Criteria) this;
        }

        public Criteria andTenThirtyNotBetween(Boolean value1, Boolean value2) {
            addCriterion("ten_thirty not between", value1, value2, "tenThirty");
            return (Criteria) this;
        }

        public Criteria andElevenIsNull() {
            addCriterion("eleven is null");
            return (Criteria) this;
        }

        public Criteria andElevenIsNotNull() {
            addCriterion("eleven is not null");
            return (Criteria) this;
        }

        public Criteria andElevenEqualTo(Boolean value) {
            addCriterion("eleven =", value, "eleven");
            return (Criteria) this;
        }

        public Criteria andElevenNotEqualTo(Boolean value) {
            addCriterion("eleven <>", value, "eleven");
            return (Criteria) this;
        }

        public Criteria andElevenGreaterThan(Boolean value) {
            addCriterion("eleven >", value, "eleven");
            return (Criteria) this;
        }

        public Criteria andElevenGreaterThanOrEqualTo(Boolean value) {
            addCriterion("eleven >=", value, "eleven");
            return (Criteria) this;
        }

        public Criteria andElevenLessThan(Boolean value) {
            addCriterion("eleven <", value, "eleven");
            return (Criteria) this;
        }

        public Criteria andElevenLessThanOrEqualTo(Boolean value) {
            addCriterion("eleven <=", value, "eleven");
            return (Criteria) this;
        }

        public Criteria andElevenIn(List<Boolean> values) {
            addCriterion("eleven in", values, "eleven");
            return (Criteria) this;
        }

        public Criteria andElevenNotIn(List<Boolean> values) {
            addCriterion("eleven not in", values, "eleven");
            return (Criteria) this;
        }

        public Criteria andElevenBetween(Boolean value1, Boolean value2) {
            addCriterion("eleven between", value1, value2, "eleven");
            return (Criteria) this;
        }

        public Criteria andElevenNotBetween(Boolean value1, Boolean value2) {
            addCriterion("eleven not between", value1, value2, "eleven");
            return (Criteria) this;
        }

        public Criteria andElevenThirtyIsNull() {
            addCriterion("eleven_thirty is null");
            return (Criteria) this;
        }

        public Criteria andElevenThirtyIsNotNull() {
            addCriterion("eleven_thirty is not null");
            return (Criteria) this;
        }

        public Criteria andElevenThirtyEqualTo(Boolean value) {
            addCriterion("eleven_thirty =", value, "elevenThirty");
            return (Criteria) this;
        }

        public Criteria andElevenThirtyNotEqualTo(Boolean value) {
            addCriterion("eleven_thirty <>", value, "elevenThirty");
            return (Criteria) this;
        }

        public Criteria andElevenThirtyGreaterThan(Boolean value) {
            addCriterion("eleven_thirty >", value, "elevenThirty");
            return (Criteria) this;
        }

        public Criteria andElevenThirtyGreaterThanOrEqualTo(Boolean value) {
            addCriterion("eleven_thirty >=", value, "elevenThirty");
            return (Criteria) this;
        }

        public Criteria andElevenThirtyLessThan(Boolean value) {
            addCriterion("eleven_thirty <", value, "elevenThirty");
            return (Criteria) this;
        }

        public Criteria andElevenThirtyLessThanOrEqualTo(Boolean value) {
            addCriterion("eleven_thirty <=", value, "elevenThirty");
            return (Criteria) this;
        }

        public Criteria andElevenThirtyIn(List<Boolean> values) {
            addCriterion("eleven_thirty in", values, "elevenThirty");
            return (Criteria) this;
        }

        public Criteria andElevenThirtyNotIn(List<Boolean> values) {
            addCriterion("eleven_thirty not in", values, "elevenThirty");
            return (Criteria) this;
        }

        public Criteria andElevenThirtyBetween(Boolean value1, Boolean value2) {
            addCriterion("eleven_thirty between", value1, value2, "elevenThirty");
            return (Criteria) this;
        }

        public Criteria andElevenThirtyNotBetween(Boolean value1, Boolean value2) {
            addCriterion("eleven_thirty not between", value1, value2, "elevenThirty");
            return (Criteria) this;
        }

        public Criteria andTwelveIsNull() {
            addCriterion("twelve is null");
            return (Criteria) this;
        }

        public Criteria andTwelveIsNotNull() {
            addCriterion("twelve is not null");
            return (Criteria) this;
        }

        public Criteria andTwelveEqualTo(Boolean value) {
            addCriterion("twelve =", value, "twelve");
            return (Criteria) this;
        }

        public Criteria andTwelveNotEqualTo(Boolean value) {
            addCriterion("twelve <>", value, "twelve");
            return (Criteria) this;
        }

        public Criteria andTwelveGreaterThan(Boolean value) {
            addCriterion("twelve >", value, "twelve");
            return (Criteria) this;
        }

        public Criteria andTwelveGreaterThanOrEqualTo(Boolean value) {
            addCriterion("twelve >=", value, "twelve");
            return (Criteria) this;
        }

        public Criteria andTwelveLessThan(Boolean value) {
            addCriterion("twelve <", value, "twelve");
            return (Criteria) this;
        }

        public Criteria andTwelveLessThanOrEqualTo(Boolean value) {
            addCriterion("twelve <=", value, "twelve");
            return (Criteria) this;
        }

        public Criteria andTwelveIn(List<Boolean> values) {
            addCriterion("twelve in", values, "twelve");
            return (Criteria) this;
        }

        public Criteria andTwelveNotIn(List<Boolean> values) {
            addCriterion("twelve not in", values, "twelve");
            return (Criteria) this;
        }

        public Criteria andTwelveBetween(Boolean value1, Boolean value2) {
            addCriterion("twelve between", value1, value2, "twelve");
            return (Criteria) this;
        }

        public Criteria andTwelveNotBetween(Boolean value1, Boolean value2) {
            addCriterion("twelve not between", value1, value2, "twelve");
            return (Criteria) this;
        }

        public Criteria andTwelveThirtyIsNull() {
            addCriterion("twelve_thirty is null");
            return (Criteria) this;
        }

        public Criteria andTwelveThirtyIsNotNull() {
            addCriterion("twelve_thirty is not null");
            return (Criteria) this;
        }

        public Criteria andTwelveThirtyEqualTo(Boolean value) {
            addCriterion("twelve_thirty =", value, "twelveThirty");
            return (Criteria) this;
        }

        public Criteria andTwelveThirtyNotEqualTo(Boolean value) {
            addCriterion("twelve_thirty <>", value, "twelveThirty");
            return (Criteria) this;
        }

        public Criteria andTwelveThirtyGreaterThan(Boolean value) {
            addCriterion("twelve_thirty >", value, "twelveThirty");
            return (Criteria) this;
        }

        public Criteria andTwelveThirtyGreaterThanOrEqualTo(Boolean value) {
            addCriterion("twelve_thirty >=", value, "twelveThirty");
            return (Criteria) this;
        }

        public Criteria andTwelveThirtyLessThan(Boolean value) {
            addCriterion("twelve_thirty <", value, "twelveThirty");
            return (Criteria) this;
        }

        public Criteria andTwelveThirtyLessThanOrEqualTo(Boolean value) {
            addCriterion("twelve_thirty <=", value, "twelveThirty");
            return (Criteria) this;
        }

        public Criteria andTwelveThirtyIn(List<Boolean> values) {
            addCriterion("twelve_thirty in", values, "twelveThirty");
            return (Criteria) this;
        }

        public Criteria andTwelveThirtyNotIn(List<Boolean> values) {
            addCriterion("twelve_thirty not in", values, "twelveThirty");
            return (Criteria) this;
        }

        public Criteria andTwelveThirtyBetween(Boolean value1, Boolean value2) {
            addCriterion("twelve_thirty between", value1, value2, "twelveThirty");
            return (Criteria) this;
        }

        public Criteria andTwelveThirtyNotBetween(Boolean value1, Boolean value2) {
            addCriterion("twelve_thirty not between", value1, value2, "twelveThirty");
            return (Criteria) this;
        }

        public Criteria andThirteenIsNull() {
            addCriterion("thirteen is null");
            return (Criteria) this;
        }

        public Criteria andThirteenIsNotNull() {
            addCriterion("thirteen is not null");
            return (Criteria) this;
        }

        public Criteria andThirteenEqualTo(Boolean value) {
            addCriterion("thirteen =", value, "thirteen");
            return (Criteria) this;
        }

        public Criteria andThirteenNotEqualTo(Boolean value) {
            addCriterion("thirteen <>", value, "thirteen");
            return (Criteria) this;
        }

        public Criteria andThirteenGreaterThan(Boolean value) {
            addCriterion("thirteen >", value, "thirteen");
            return (Criteria) this;
        }

        public Criteria andThirteenGreaterThanOrEqualTo(Boolean value) {
            addCriterion("thirteen >=", value, "thirteen");
            return (Criteria) this;
        }

        public Criteria andThirteenLessThan(Boolean value) {
            addCriterion("thirteen <", value, "thirteen");
            return (Criteria) this;
        }

        public Criteria andThirteenLessThanOrEqualTo(Boolean value) {
            addCriterion("thirteen <=", value, "thirteen");
            return (Criteria) this;
        }

        public Criteria andThirteenIn(List<Boolean> values) {
            addCriterion("thirteen in", values, "thirteen");
            return (Criteria) this;
        }

        public Criteria andThirteenNotIn(List<Boolean> values) {
            addCriterion("thirteen not in", values, "thirteen");
            return (Criteria) this;
        }

        public Criteria andThirteenBetween(Boolean value1, Boolean value2) {
            addCriterion("thirteen between", value1, value2, "thirteen");
            return (Criteria) this;
        }

        public Criteria andThirteenNotBetween(Boolean value1, Boolean value2) {
            addCriterion("thirteen not between", value1, value2, "thirteen");
            return (Criteria) this;
        }

        public Criteria andThirteenThirtyIsNull() {
            addCriterion("thirteen_thirty is null");
            return (Criteria) this;
        }

        public Criteria andThirteenThirtyIsNotNull() {
            addCriterion("thirteen_thirty is not null");
            return (Criteria) this;
        }

        public Criteria andThirteenThirtyEqualTo(Boolean value) {
            addCriterion("thirteen_thirty =", value, "thirteenThirty");
            return (Criteria) this;
        }

        public Criteria andThirteenThirtyNotEqualTo(Boolean value) {
            addCriterion("thirteen_thirty <>", value, "thirteenThirty");
            return (Criteria) this;
        }

        public Criteria andThirteenThirtyGreaterThan(Boolean value) {
            addCriterion("thirteen_thirty >", value, "thirteenThirty");
            return (Criteria) this;
        }

        public Criteria andThirteenThirtyGreaterThanOrEqualTo(Boolean value) {
            addCriterion("thirteen_thirty >=", value, "thirteenThirty");
            return (Criteria) this;
        }

        public Criteria andThirteenThirtyLessThan(Boolean value) {
            addCriterion("thirteen_thirty <", value, "thirteenThirty");
            return (Criteria) this;
        }

        public Criteria andThirteenThirtyLessThanOrEqualTo(Boolean value) {
            addCriterion("thirteen_thirty <=", value, "thirteenThirty");
            return (Criteria) this;
        }

        public Criteria andThirteenThirtyIn(List<Boolean> values) {
            addCriterion("thirteen_thirty in", values, "thirteenThirty");
            return (Criteria) this;
        }

        public Criteria andThirteenThirtyNotIn(List<Boolean> values) {
            addCriterion("thirteen_thirty not in", values, "thirteenThirty");
            return (Criteria) this;
        }

        public Criteria andThirteenThirtyBetween(Boolean value1, Boolean value2) {
            addCriterion("thirteen_thirty between", value1, value2, "thirteenThirty");
            return (Criteria) this;
        }

        public Criteria andThirteenThirtyNotBetween(Boolean value1, Boolean value2) {
            addCriterion("thirteen_thirty not between", value1, value2, "thirteenThirty");
            return (Criteria) this;
        }

        public Criteria andFourteenIsNull() {
            addCriterion("fourteen is null");
            return (Criteria) this;
        }

        public Criteria andFourteenIsNotNull() {
            addCriterion("fourteen is not null");
            return (Criteria) this;
        }

        public Criteria andFourteenEqualTo(Boolean value) {
            addCriterion("fourteen =", value, "fourteen");
            return (Criteria) this;
        }

        public Criteria andFourteenNotEqualTo(Boolean value) {
            addCriterion("fourteen <>", value, "fourteen");
            return (Criteria) this;
        }

        public Criteria andFourteenGreaterThan(Boolean value) {
            addCriterion("fourteen >", value, "fourteen");
            return (Criteria) this;
        }

        public Criteria andFourteenGreaterThanOrEqualTo(Boolean value) {
            addCriterion("fourteen >=", value, "fourteen");
            return (Criteria) this;
        }

        public Criteria andFourteenLessThan(Boolean value) {
            addCriterion("fourteen <", value, "fourteen");
            return (Criteria) this;
        }

        public Criteria andFourteenLessThanOrEqualTo(Boolean value) {
            addCriterion("fourteen <=", value, "fourteen");
            return (Criteria) this;
        }

        public Criteria andFourteenIn(List<Boolean> values) {
            addCriterion("fourteen in", values, "fourteen");
            return (Criteria) this;
        }

        public Criteria andFourteenNotIn(List<Boolean> values) {
            addCriterion("fourteen not in", values, "fourteen");
            return (Criteria) this;
        }

        public Criteria andFourteenBetween(Boolean value1, Boolean value2) {
            addCriterion("fourteen between", value1, value2, "fourteen");
            return (Criteria) this;
        }

        public Criteria andFourteenNotBetween(Boolean value1, Boolean value2) {
            addCriterion("fourteen not between", value1, value2, "fourteen");
            return (Criteria) this;
        }

        public Criteria andFourteenThirtyIsNull() {
            addCriterion("fourteen_thirty is null");
            return (Criteria) this;
        }

        public Criteria andFourteenThirtyIsNotNull() {
            addCriterion("fourteen_thirty is not null");
            return (Criteria) this;
        }

        public Criteria andFourteenThirtyEqualTo(Boolean value) {
            addCriterion("fourteen_thirty =", value, "fourteenThirty");
            return (Criteria) this;
        }

        public Criteria andFourteenThirtyNotEqualTo(Boolean value) {
            addCriterion("fourteen_thirty <>", value, "fourteenThirty");
            return (Criteria) this;
        }

        public Criteria andFourteenThirtyGreaterThan(Boolean value) {
            addCriterion("fourteen_thirty >", value, "fourteenThirty");
            return (Criteria) this;
        }

        public Criteria andFourteenThirtyGreaterThanOrEqualTo(Boolean value) {
            addCriterion("fourteen_thirty >=", value, "fourteenThirty");
            return (Criteria) this;
        }

        public Criteria andFourteenThirtyLessThan(Boolean value) {
            addCriterion("fourteen_thirty <", value, "fourteenThirty");
            return (Criteria) this;
        }

        public Criteria andFourteenThirtyLessThanOrEqualTo(Boolean value) {
            addCriterion("fourteen_thirty <=", value, "fourteenThirty");
            return (Criteria) this;
        }

        public Criteria andFourteenThirtyIn(List<Boolean> values) {
            addCriterion("fourteen_thirty in", values, "fourteenThirty");
            return (Criteria) this;
        }

        public Criteria andFourteenThirtyNotIn(List<Boolean> values) {
            addCriterion("fourteen_thirty not in", values, "fourteenThirty");
            return (Criteria) this;
        }

        public Criteria andFourteenThirtyBetween(Boolean value1, Boolean value2) {
            addCriterion("fourteen_thirty between", value1, value2, "fourteenThirty");
            return (Criteria) this;
        }

        public Criteria andFourteenThirtyNotBetween(Boolean value1, Boolean value2) {
            addCriterion("fourteen_thirty not between", value1, value2, "fourteenThirty");
            return (Criteria) this;
        }

        public Criteria andFifteenIsNull() {
            addCriterion("fifteen is null");
            return (Criteria) this;
        }

        public Criteria andFifteenIsNotNull() {
            addCriterion("fifteen is not null");
            return (Criteria) this;
        }

        public Criteria andFifteenEqualTo(Boolean value) {
            addCriterion("fifteen =", value, "fifteen");
            return (Criteria) this;
        }

        public Criteria andFifteenNotEqualTo(Boolean value) {
            addCriterion("fifteen <>", value, "fifteen");
            return (Criteria) this;
        }

        public Criteria andFifteenGreaterThan(Boolean value) {
            addCriterion("fifteen >", value, "fifteen");
            return (Criteria) this;
        }

        public Criteria andFifteenGreaterThanOrEqualTo(Boolean value) {
            addCriterion("fifteen >=", value, "fifteen");
            return (Criteria) this;
        }

        public Criteria andFifteenLessThan(Boolean value) {
            addCriterion("fifteen <", value, "fifteen");
            return (Criteria) this;
        }

        public Criteria andFifteenLessThanOrEqualTo(Boolean value) {
            addCriterion("fifteen <=", value, "fifteen");
            return (Criteria) this;
        }

        public Criteria andFifteenIn(List<Boolean> values) {
            addCriterion("fifteen in", values, "fifteen");
            return (Criteria) this;
        }

        public Criteria andFifteenNotIn(List<Boolean> values) {
            addCriterion("fifteen not in", values, "fifteen");
            return (Criteria) this;
        }

        public Criteria andFifteenBetween(Boolean value1, Boolean value2) {
            addCriterion("fifteen between", value1, value2, "fifteen");
            return (Criteria) this;
        }

        public Criteria andFifteenNotBetween(Boolean value1, Boolean value2) {
            addCriterion("fifteen not between", value1, value2, "fifteen");
            return (Criteria) this;
        }

        public Criteria andFifteenThirtyIsNull() {
            addCriterion("fifteen_thirty is null");
            return (Criteria) this;
        }

        public Criteria andFifteenThirtyIsNotNull() {
            addCriterion("fifteen_thirty is not null");
            return (Criteria) this;
        }

        public Criteria andFifteenThirtyEqualTo(Boolean value) {
            addCriterion("fifteen_thirty =", value, "fifteenThirty");
            return (Criteria) this;
        }

        public Criteria andFifteenThirtyNotEqualTo(Boolean value) {
            addCriterion("fifteen_thirty <>", value, "fifteenThirty");
            return (Criteria) this;
        }

        public Criteria andFifteenThirtyGreaterThan(Boolean value) {
            addCriterion("fifteen_thirty >", value, "fifteenThirty");
            return (Criteria) this;
        }

        public Criteria andFifteenThirtyGreaterThanOrEqualTo(Boolean value) {
            addCriterion("fifteen_thirty >=", value, "fifteenThirty");
            return (Criteria) this;
        }

        public Criteria andFifteenThirtyLessThan(Boolean value) {
            addCriterion("fifteen_thirty <", value, "fifteenThirty");
            return (Criteria) this;
        }

        public Criteria andFifteenThirtyLessThanOrEqualTo(Boolean value) {
            addCriterion("fifteen_thirty <=", value, "fifteenThirty");
            return (Criteria) this;
        }

        public Criteria andFifteenThirtyIn(List<Boolean> values) {
            addCriterion("fifteen_thirty in", values, "fifteenThirty");
            return (Criteria) this;
        }

        public Criteria andFifteenThirtyNotIn(List<Boolean> values) {
            addCriterion("fifteen_thirty not in", values, "fifteenThirty");
            return (Criteria) this;
        }

        public Criteria andFifteenThirtyBetween(Boolean value1, Boolean value2) {
            addCriterion("fifteen_thirty between", value1, value2, "fifteenThirty");
            return (Criteria) this;
        }

        public Criteria andFifteenThirtyNotBetween(Boolean value1, Boolean value2) {
            addCriterion("fifteen_thirty not between", value1, value2, "fifteenThirty");
            return (Criteria) this;
        }

        public Criteria andSixteenIsNull() {
            addCriterion("sixteen is null");
            return (Criteria) this;
        }

        public Criteria andSixteenIsNotNull() {
            addCriterion("sixteen is not null");
            return (Criteria) this;
        }

        public Criteria andSixteenEqualTo(Boolean value) {
            addCriterion("sixteen =", value, "sixteen");
            return (Criteria) this;
        }

        public Criteria andSixteenNotEqualTo(Boolean value) {
            addCriterion("sixteen <>", value, "sixteen");
            return (Criteria) this;
        }

        public Criteria andSixteenGreaterThan(Boolean value) {
            addCriterion("sixteen >", value, "sixteen");
            return (Criteria) this;
        }

        public Criteria andSixteenGreaterThanOrEqualTo(Boolean value) {
            addCriterion("sixteen >=", value, "sixteen");
            return (Criteria) this;
        }

        public Criteria andSixteenLessThan(Boolean value) {
            addCriterion("sixteen <", value, "sixteen");
            return (Criteria) this;
        }

        public Criteria andSixteenLessThanOrEqualTo(Boolean value) {
            addCriterion("sixteen <=", value, "sixteen");
            return (Criteria) this;
        }

        public Criteria andSixteenIn(List<Boolean> values) {
            addCriterion("sixteen in", values, "sixteen");
            return (Criteria) this;
        }

        public Criteria andSixteenNotIn(List<Boolean> values) {
            addCriterion("sixteen not in", values, "sixteen");
            return (Criteria) this;
        }

        public Criteria andSixteenBetween(Boolean value1, Boolean value2) {
            addCriterion("sixteen between", value1, value2, "sixteen");
            return (Criteria) this;
        }

        public Criteria andSixteenNotBetween(Boolean value1, Boolean value2) {
            addCriterion("sixteen not between", value1, value2, "sixteen");
            return (Criteria) this;
        }

        public Criteria andSixteenThirtyIsNull() {
            addCriterion("sixteen_thirty is null");
            return (Criteria) this;
        }

        public Criteria andSixteenThirtyIsNotNull() {
            addCriterion("sixteen_thirty is not null");
            return (Criteria) this;
        }

        public Criteria andSixteenThirtyEqualTo(Boolean value) {
            addCriterion("sixteen_thirty =", value, "sixteenThirty");
            return (Criteria) this;
        }

        public Criteria andSixteenThirtyNotEqualTo(Boolean value) {
            addCriterion("sixteen_thirty <>", value, "sixteenThirty");
            return (Criteria) this;
        }

        public Criteria andSixteenThirtyGreaterThan(Boolean value) {
            addCriterion("sixteen_thirty >", value, "sixteenThirty");
            return (Criteria) this;
        }

        public Criteria andSixteenThirtyGreaterThanOrEqualTo(Boolean value) {
            addCriterion("sixteen_thirty >=", value, "sixteenThirty");
            return (Criteria) this;
        }

        public Criteria andSixteenThirtyLessThan(Boolean value) {
            addCriterion("sixteen_thirty <", value, "sixteenThirty");
            return (Criteria) this;
        }

        public Criteria andSixteenThirtyLessThanOrEqualTo(Boolean value) {
            addCriterion("sixteen_thirty <=", value, "sixteenThirty");
            return (Criteria) this;
        }

        public Criteria andSixteenThirtyIn(List<Boolean> values) {
            addCriterion("sixteen_thirty in", values, "sixteenThirty");
            return (Criteria) this;
        }

        public Criteria andSixteenThirtyNotIn(List<Boolean> values) {
            addCriterion("sixteen_thirty not in", values, "sixteenThirty");
            return (Criteria) this;
        }

        public Criteria andSixteenThirtyBetween(Boolean value1, Boolean value2) {
            addCriterion("sixteen_thirty between", value1, value2, "sixteenThirty");
            return (Criteria) this;
        }

        public Criteria andSixteenThirtyNotBetween(Boolean value1, Boolean value2) {
            addCriterion("sixteen_thirty not between", value1, value2, "sixteenThirty");
            return (Criteria) this;
        }

        public Criteria andSeventeenIsNull() {
            addCriterion("seventeen is null");
            return (Criteria) this;
        }

        public Criteria andSeventeenIsNotNull() {
            addCriterion("seventeen is not null");
            return (Criteria) this;
        }

        public Criteria andSeventeenEqualTo(Boolean value) {
            addCriterion("seventeen =", value, "seventeen");
            return (Criteria) this;
        }

        public Criteria andSeventeenNotEqualTo(Boolean value) {
            addCriterion("seventeen <>", value, "seventeen");
            return (Criteria) this;
        }

        public Criteria andSeventeenGreaterThan(Boolean value) {
            addCriterion("seventeen >", value, "seventeen");
            return (Criteria) this;
        }

        public Criteria andSeventeenGreaterThanOrEqualTo(Boolean value) {
            addCriterion("seventeen >=", value, "seventeen");
            return (Criteria) this;
        }

        public Criteria andSeventeenLessThan(Boolean value) {
            addCriterion("seventeen <", value, "seventeen");
            return (Criteria) this;
        }

        public Criteria andSeventeenLessThanOrEqualTo(Boolean value) {
            addCriterion("seventeen <=", value, "seventeen");
            return (Criteria) this;
        }

        public Criteria andSeventeenIn(List<Boolean> values) {
            addCriterion("seventeen in", values, "seventeen");
            return (Criteria) this;
        }

        public Criteria andSeventeenNotIn(List<Boolean> values) {
            addCriterion("seventeen not in", values, "seventeen");
            return (Criteria) this;
        }

        public Criteria andSeventeenBetween(Boolean value1, Boolean value2) {
            addCriterion("seventeen between", value1, value2, "seventeen");
            return (Criteria) this;
        }

        public Criteria andSeventeenNotBetween(Boolean value1, Boolean value2) {
            addCriterion("seventeen not between", value1, value2, "seventeen");
            return (Criteria) this;
        }

        public Criteria andSeventeenThirtyIsNull() {
            addCriterion("seventeen_thirty is null");
            return (Criteria) this;
        }

        public Criteria andSeventeenThirtyIsNotNull() {
            addCriterion("seventeen_thirty is not null");
            return (Criteria) this;
        }

        public Criteria andSeventeenThirtyEqualTo(Boolean value) {
            addCriterion("seventeen_thirty =", value, "seventeenThirty");
            return (Criteria) this;
        }

        public Criteria andSeventeenThirtyNotEqualTo(Boolean value) {
            addCriterion("seventeen_thirty <>", value, "seventeenThirty");
            return (Criteria) this;
        }

        public Criteria andSeventeenThirtyGreaterThan(Boolean value) {
            addCriterion("seventeen_thirty >", value, "seventeenThirty");
            return (Criteria) this;
        }

        public Criteria andSeventeenThirtyGreaterThanOrEqualTo(Boolean value) {
            addCriterion("seventeen_thirty >=", value, "seventeenThirty");
            return (Criteria) this;
        }

        public Criteria andSeventeenThirtyLessThan(Boolean value) {
            addCriterion("seventeen_thirty <", value, "seventeenThirty");
            return (Criteria) this;
        }

        public Criteria andSeventeenThirtyLessThanOrEqualTo(Boolean value) {
            addCriterion("seventeen_thirty <=", value, "seventeenThirty");
            return (Criteria) this;
        }

        public Criteria andSeventeenThirtyIn(List<Boolean> values) {
            addCriterion("seventeen_thirty in", values, "seventeenThirty");
            return (Criteria) this;
        }

        public Criteria andSeventeenThirtyNotIn(List<Boolean> values) {
            addCriterion("seventeen_thirty not in", values, "seventeenThirty");
            return (Criteria) this;
        }

        public Criteria andSeventeenThirtyBetween(Boolean value1, Boolean value2) {
            addCriterion("seventeen_thirty between", value1, value2, "seventeenThirty");
            return (Criteria) this;
        }

        public Criteria andSeventeenThirtyNotBetween(Boolean value1, Boolean value2) {
            addCriterion("seventeen_thirty not between", value1, value2, "seventeenThirty");
            return (Criteria) this;
        }

        public Criteria andEighteenIsNull() {
            addCriterion("eighteen is null");
            return (Criteria) this;
        }

        public Criteria andEighteenIsNotNull() {
            addCriterion("eighteen is not null");
            return (Criteria) this;
        }

        public Criteria andEighteenEqualTo(Boolean value) {
            addCriterion("eighteen =", value, "eighteen");
            return (Criteria) this;
        }

        public Criteria andEighteenNotEqualTo(Boolean value) {
            addCriterion("eighteen <>", value, "eighteen");
            return (Criteria) this;
        }

        public Criteria andEighteenGreaterThan(Boolean value) {
            addCriterion("eighteen >", value, "eighteen");
            return (Criteria) this;
        }

        public Criteria andEighteenGreaterThanOrEqualTo(Boolean value) {
            addCriterion("eighteen >=", value, "eighteen");
            return (Criteria) this;
        }

        public Criteria andEighteenLessThan(Boolean value) {
            addCriterion("eighteen <", value, "eighteen");
            return (Criteria) this;
        }

        public Criteria andEighteenLessThanOrEqualTo(Boolean value) {
            addCriterion("eighteen <=", value, "eighteen");
            return (Criteria) this;
        }

        public Criteria andEighteenIn(List<Boolean> values) {
            addCriterion("eighteen in", values, "eighteen");
            return (Criteria) this;
        }

        public Criteria andEighteenNotIn(List<Boolean> values) {
            addCriterion("eighteen not in", values, "eighteen");
            return (Criteria) this;
        }

        public Criteria andEighteenBetween(Boolean value1, Boolean value2) {
            addCriterion("eighteen between", value1, value2, "eighteen");
            return (Criteria) this;
        }

        public Criteria andEighteenNotBetween(Boolean value1, Boolean value2) {
            addCriterion("eighteen not between", value1, value2, "eighteen");
            return (Criteria) this;
        }

        public Criteria andEighteenThirtyIsNull() {
            addCriterion("eighteen_thirty is null");
            return (Criteria) this;
        }

        public Criteria andEighteenThirtyIsNotNull() {
            addCriterion("eighteen_thirty is not null");
            return (Criteria) this;
        }

        public Criteria andEighteenThirtyEqualTo(Boolean value) {
            addCriterion("eighteen_thirty =", value, "eighteenThirty");
            return (Criteria) this;
        }

        public Criteria andEighteenThirtyNotEqualTo(Boolean value) {
            addCriterion("eighteen_thirty <>", value, "eighteenThirty");
            return (Criteria) this;
        }

        public Criteria andEighteenThirtyGreaterThan(Boolean value) {
            addCriterion("eighteen_thirty >", value, "eighteenThirty");
            return (Criteria) this;
        }

        public Criteria andEighteenThirtyGreaterThanOrEqualTo(Boolean value) {
            addCriterion("eighteen_thirty >=", value, "eighteenThirty");
            return (Criteria) this;
        }

        public Criteria andEighteenThirtyLessThan(Boolean value) {
            addCriterion("eighteen_thirty <", value, "eighteenThirty");
            return (Criteria) this;
        }

        public Criteria andEighteenThirtyLessThanOrEqualTo(Boolean value) {
            addCriterion("eighteen_thirty <=", value, "eighteenThirty");
            return (Criteria) this;
        }

        public Criteria andEighteenThirtyIn(List<Boolean> values) {
            addCriterion("eighteen_thirty in", values, "eighteenThirty");
            return (Criteria) this;
        }

        public Criteria andEighteenThirtyNotIn(List<Boolean> values) {
            addCriterion("eighteen_thirty not in", values, "eighteenThirty");
            return (Criteria) this;
        }

        public Criteria andEighteenThirtyBetween(Boolean value1, Boolean value2) {
            addCriterion("eighteen_thirty between", value1, value2, "eighteenThirty");
            return (Criteria) this;
        }

        public Criteria andEighteenThirtyNotBetween(Boolean value1, Boolean value2) {
            addCriterion("eighteen_thirty not between", value1, value2, "eighteenThirty");
            return (Criteria) this;
        }

        public Criteria andNinteenIsNull() {
            addCriterion("ninteen is null");
            return (Criteria) this;
        }

        public Criteria andNinteenIsNotNull() {
            addCriterion("ninteen is not null");
            return (Criteria) this;
        }

        public Criteria andNinteenEqualTo(Boolean value) {
            addCriterion("ninteen =", value, "ninteen");
            return (Criteria) this;
        }

        public Criteria andNinteenNotEqualTo(Boolean value) {
            addCriterion("ninteen <>", value, "ninteen");
            return (Criteria) this;
        }

        public Criteria andNinteenGreaterThan(Boolean value) {
            addCriterion("ninteen >", value, "ninteen");
            return (Criteria) this;
        }

        public Criteria andNinteenGreaterThanOrEqualTo(Boolean value) {
            addCriterion("ninteen >=", value, "ninteen");
            return (Criteria) this;
        }

        public Criteria andNinteenLessThan(Boolean value) {
            addCriterion("ninteen <", value, "ninteen");
            return (Criteria) this;
        }

        public Criteria andNinteenLessThanOrEqualTo(Boolean value) {
            addCriterion("ninteen <=", value, "ninteen");
            return (Criteria) this;
        }

        public Criteria andNinteenIn(List<Boolean> values) {
            addCriterion("ninteen in", values, "ninteen");
            return (Criteria) this;
        }

        public Criteria andNinteenNotIn(List<Boolean> values) {
            addCriterion("ninteen not in", values, "ninteen");
            return (Criteria) this;
        }

        public Criteria andNinteenBetween(Boolean value1, Boolean value2) {
            addCriterion("ninteen between", value1, value2, "ninteen");
            return (Criteria) this;
        }

        public Criteria andNinteenNotBetween(Boolean value1, Boolean value2) {
            addCriterion("ninteen not between", value1, value2, "ninteen");
            return (Criteria) this;
        }

        public Criteria andNinteenThirtyIsNull() {
            addCriterion("ninteen_thirty is null");
            return (Criteria) this;
        }

        public Criteria andNinteenThirtyIsNotNull() {
            addCriterion("ninteen_thirty is not null");
            return (Criteria) this;
        }

        public Criteria andNinteenThirtyEqualTo(Boolean value) {
            addCriterion("ninteen_thirty =", value, "ninteenThirty");
            return (Criteria) this;
        }

        public Criteria andNinteenThirtyNotEqualTo(Boolean value) {
            addCriterion("ninteen_thirty <>", value, "ninteenThirty");
            return (Criteria) this;
        }

        public Criteria andNinteenThirtyGreaterThan(Boolean value) {
            addCriterion("ninteen_thirty >", value, "ninteenThirty");
            return (Criteria) this;
        }

        public Criteria andNinteenThirtyGreaterThanOrEqualTo(Boolean value) {
            addCriterion("ninteen_thirty >=", value, "ninteenThirty");
            return (Criteria) this;
        }

        public Criteria andNinteenThirtyLessThan(Boolean value) {
            addCriterion("ninteen_thirty <", value, "ninteenThirty");
            return (Criteria) this;
        }

        public Criteria andNinteenThirtyLessThanOrEqualTo(Boolean value) {
            addCriterion("ninteen_thirty <=", value, "ninteenThirty");
            return (Criteria) this;
        }

        public Criteria andNinteenThirtyIn(List<Boolean> values) {
            addCriterion("ninteen_thirty in", values, "ninteenThirty");
            return (Criteria) this;
        }

        public Criteria andNinteenThirtyNotIn(List<Boolean> values) {
            addCriterion("ninteen_thirty not in", values, "ninteenThirty");
            return (Criteria) this;
        }

        public Criteria andNinteenThirtyBetween(Boolean value1, Boolean value2) {
            addCriterion("ninteen_thirty between", value1, value2, "ninteenThirty");
            return (Criteria) this;
        }

        public Criteria andNinteenThirtyNotBetween(Boolean value1, Boolean value2) {
            addCriterion("ninteen_thirty not between", value1, value2, "ninteenThirty");
            return (Criteria) this;
        }

        public Criteria andTwentyIsNull() {
            addCriterion("twenty is null");
            return (Criteria) this;
        }

        public Criteria andTwentyIsNotNull() {
            addCriterion("twenty is not null");
            return (Criteria) this;
        }

        public Criteria andTwentyEqualTo(Boolean value) {
            addCriterion("twenty =", value, "twenty");
            return (Criteria) this;
        }

        public Criteria andTwentyNotEqualTo(Boolean value) {
            addCriterion("twenty <>", value, "twenty");
            return (Criteria) this;
        }

        public Criteria andTwentyGreaterThan(Boolean value) {
            addCriterion("twenty >", value, "twenty");
            return (Criteria) this;
        }

        public Criteria andTwentyGreaterThanOrEqualTo(Boolean value) {
            addCriterion("twenty >=", value, "twenty");
            return (Criteria) this;
        }

        public Criteria andTwentyLessThan(Boolean value) {
            addCriterion("twenty <", value, "twenty");
            return (Criteria) this;
        }

        public Criteria andTwentyLessThanOrEqualTo(Boolean value) {
            addCriterion("twenty <=", value, "twenty");
            return (Criteria) this;
        }

        public Criteria andTwentyIn(List<Boolean> values) {
            addCriterion("twenty in", values, "twenty");
            return (Criteria) this;
        }

        public Criteria andTwentyNotIn(List<Boolean> values) {
            addCriterion("twenty not in", values, "twenty");
            return (Criteria) this;
        }

        public Criteria andTwentyBetween(Boolean value1, Boolean value2) {
            addCriterion("twenty between", value1, value2, "twenty");
            return (Criteria) this;
        }

        public Criteria andTwentyNotBetween(Boolean value1, Boolean value2) {
            addCriterion("twenty not between", value1, value2, "twenty");
            return (Criteria) this;
        }

        public Criteria andTwentyThirtyIsNull() {
            addCriterion("twenty_thirty is null");
            return (Criteria) this;
        }

        public Criteria andTwentyThirtyIsNotNull() {
            addCriterion("twenty_thirty is not null");
            return (Criteria) this;
        }

        public Criteria andTwentyThirtyEqualTo(Boolean value) {
            addCriterion("twenty_thirty =", value, "twentyThirty");
            return (Criteria) this;
        }

        public Criteria andTwentyThirtyNotEqualTo(Boolean value) {
            addCriterion("twenty_thirty <>", value, "twentyThirty");
            return (Criteria) this;
        }

        public Criteria andTwentyThirtyGreaterThan(Boolean value) {
            addCriterion("twenty_thirty >", value, "twentyThirty");
            return (Criteria) this;
        }

        public Criteria andTwentyThirtyGreaterThanOrEqualTo(Boolean value) {
            addCriterion("twenty_thirty >=", value, "twentyThirty");
            return (Criteria) this;
        }

        public Criteria andTwentyThirtyLessThan(Boolean value) {
            addCriterion("twenty_thirty <", value, "twentyThirty");
            return (Criteria) this;
        }

        public Criteria andTwentyThirtyLessThanOrEqualTo(Boolean value) {
            addCriterion("twenty_thirty <=", value, "twentyThirty");
            return (Criteria) this;
        }

        public Criteria andTwentyThirtyIn(List<Boolean> values) {
            addCriterion("twenty_thirty in", values, "twentyThirty");
            return (Criteria) this;
        }

        public Criteria andTwentyThirtyNotIn(List<Boolean> values) {
            addCriterion("twenty_thirty not in", values, "twentyThirty");
            return (Criteria) this;
        }

        public Criteria andTwentyThirtyBetween(Boolean value1, Boolean value2) {
            addCriterion("twenty_thirty between", value1, value2, "twentyThirty");
            return (Criteria) this;
        }

        public Criteria andTwentyThirtyNotBetween(Boolean value1, Boolean value2) {
            addCriterion("twenty_thirty not between", value1, value2, "twentyThirty");
            return (Criteria) this;
        }

        public Criteria andTwentyoneIsNull() {
            addCriterion("twentyone is null");
            return (Criteria) this;
        }

        public Criteria andTwentyoneIsNotNull() {
            addCriterion("twentyone is not null");
            return (Criteria) this;
        }

        public Criteria andTwentyoneEqualTo(Boolean value) {
            addCriterion("twentyone =", value, "twentyone");
            return (Criteria) this;
        }

        public Criteria andTwentyoneNotEqualTo(Boolean value) {
            addCriterion("twentyone <>", value, "twentyone");
            return (Criteria) this;
        }

        public Criteria andTwentyoneGreaterThan(Boolean value) {
            addCriterion("twentyone >", value, "twentyone");
            return (Criteria) this;
        }

        public Criteria andTwentyoneGreaterThanOrEqualTo(Boolean value) {
            addCriterion("twentyone >=", value, "twentyone");
            return (Criteria) this;
        }

        public Criteria andTwentyoneLessThan(Boolean value) {
            addCriterion("twentyone <", value, "twentyone");
            return (Criteria) this;
        }

        public Criteria andTwentyoneLessThanOrEqualTo(Boolean value) {
            addCriterion("twentyone <=", value, "twentyone");
            return (Criteria) this;
        }

        public Criteria andTwentyoneIn(List<Boolean> values) {
            addCriterion("twentyone in", values, "twentyone");
            return (Criteria) this;
        }

        public Criteria andTwentyoneNotIn(List<Boolean> values) {
            addCriterion("twentyone not in", values, "twentyone");
            return (Criteria) this;
        }

        public Criteria andTwentyoneBetween(Boolean value1, Boolean value2) {
            addCriterion("twentyone between", value1, value2, "twentyone");
            return (Criteria) this;
        }

        public Criteria andTwentyoneNotBetween(Boolean value1, Boolean value2) {
            addCriterion("twentyone not between", value1, value2, "twentyone");
            return (Criteria) this;
        }

        public Criteria andTwentyoneThirtyIsNull() {
            addCriterion("twentyone_thirty is null");
            return (Criteria) this;
        }

        public Criteria andTwentyoneThirtyIsNotNull() {
            addCriterion("twentyone_thirty is not null");
            return (Criteria) this;
        }

        public Criteria andTwentyoneThirtyEqualTo(Boolean value) {
            addCriterion("twentyone_thirty =", value, "twentyoneThirty");
            return (Criteria) this;
        }

        public Criteria andTwentyoneThirtyNotEqualTo(Boolean value) {
            addCriterion("twentyone_thirty <>", value, "twentyoneThirty");
            return (Criteria) this;
        }

        public Criteria andTwentyoneThirtyGreaterThan(Boolean value) {
            addCriterion("twentyone_thirty >", value, "twentyoneThirty");
            return (Criteria) this;
        }

        public Criteria andTwentyoneThirtyGreaterThanOrEqualTo(Boolean value) {
            addCriterion("twentyone_thirty >=", value, "twentyoneThirty");
            return (Criteria) this;
        }

        public Criteria andTwentyoneThirtyLessThan(Boolean value) {
            addCriterion("twentyone_thirty <", value, "twentyoneThirty");
            return (Criteria) this;
        }

        public Criteria andTwentyoneThirtyLessThanOrEqualTo(Boolean value) {
            addCriterion("twentyone_thirty <=", value, "twentyoneThirty");
            return (Criteria) this;
        }

        public Criteria andTwentyoneThirtyIn(List<Boolean> values) {
            addCriterion("twentyone_thirty in", values, "twentyoneThirty");
            return (Criteria) this;
        }

        public Criteria andTwentyoneThirtyNotIn(List<Boolean> values) {
            addCriterion("twentyone_thirty not in", values, "twentyoneThirty");
            return (Criteria) this;
        }

        public Criteria andTwentyoneThirtyBetween(Boolean value1, Boolean value2) {
            addCriterion("twentyone_thirty between", value1, value2, "twentyoneThirty");
            return (Criteria) this;
        }

        public Criteria andTwentyoneThirtyNotBetween(Boolean value1, Boolean value2) {
            addCriterion("twentyone_thirty not between", value1, value2, "twentyoneThirty");
            return (Criteria) this;
        }

        public Criteria andTwentytwoIsNull() {
            addCriterion("twentytwo is null");
            return (Criteria) this;
        }

        public Criteria andTwentytwoIsNotNull() {
            addCriterion("twentytwo is not null");
            return (Criteria) this;
        }

        public Criteria andTwentytwoEqualTo(Boolean value) {
            addCriterion("twentytwo =", value, "twentytwo");
            return (Criteria) this;
        }

        public Criteria andTwentytwoNotEqualTo(Boolean value) {
            addCriterion("twentytwo <>", value, "twentytwo");
            return (Criteria) this;
        }

        public Criteria andTwentytwoGreaterThan(Boolean value) {
            addCriterion("twentytwo >", value, "twentytwo");
            return (Criteria) this;
        }

        public Criteria andTwentytwoGreaterThanOrEqualTo(Boolean value) {
            addCriterion("twentytwo >=", value, "twentytwo");
            return (Criteria) this;
        }

        public Criteria andTwentytwoLessThan(Boolean value) {
            addCriterion("twentytwo <", value, "twentytwo");
            return (Criteria) this;
        }

        public Criteria andTwentytwoLessThanOrEqualTo(Boolean value) {
            addCriterion("twentytwo <=", value, "twentytwo");
            return (Criteria) this;
        }

        public Criteria andTwentytwoIn(List<Boolean> values) {
            addCriterion("twentytwo in", values, "twentytwo");
            return (Criteria) this;
        }

        public Criteria andTwentytwoNotIn(List<Boolean> values) {
            addCriterion("twentytwo not in", values, "twentytwo");
            return (Criteria) this;
        }

        public Criteria andTwentytwoBetween(Boolean value1, Boolean value2) {
            addCriterion("twentytwo between", value1, value2, "twentytwo");
            return (Criteria) this;
        }

        public Criteria andTwentytwoNotBetween(Boolean value1, Boolean value2) {
            addCriterion("twentytwo not between", value1, value2, "twentytwo");
            return (Criteria) this;
        }

        public Criteria andTwentytwoThirtyIsNull() {
            addCriterion("twentytwo_thirty is null");
            return (Criteria) this;
        }

        public Criteria andTwentytwoThirtyIsNotNull() {
            addCriterion("twentytwo_thirty is not null");
            return (Criteria) this;
        }

        public Criteria andTwentytwoThirtyEqualTo(Boolean value) {
            addCriterion("twentytwo_thirty =", value, "twentytwoThirty");
            return (Criteria) this;
        }

        public Criteria andTwentytwoThirtyNotEqualTo(Boolean value) {
            addCriterion("twentytwo_thirty <>", value, "twentytwoThirty");
            return (Criteria) this;
        }

        public Criteria andTwentytwoThirtyGreaterThan(Boolean value) {
            addCriterion("twentytwo_thirty >", value, "twentytwoThirty");
            return (Criteria) this;
        }

        public Criteria andTwentytwoThirtyGreaterThanOrEqualTo(Boolean value) {
            addCriterion("twentytwo_thirty >=", value, "twentytwoThirty");
            return (Criteria) this;
        }

        public Criteria andTwentytwoThirtyLessThan(Boolean value) {
            addCriterion("twentytwo_thirty <", value, "twentytwoThirty");
            return (Criteria) this;
        }

        public Criteria andTwentytwoThirtyLessThanOrEqualTo(Boolean value) {
            addCriterion("twentytwo_thirty <=", value, "twentytwoThirty");
            return (Criteria) this;
        }

        public Criteria andTwentytwoThirtyIn(List<Boolean> values) {
            addCriterion("twentytwo_thirty in", values, "twentytwoThirty");
            return (Criteria) this;
        }

        public Criteria andTwentytwoThirtyNotIn(List<Boolean> values) {
            addCriterion("twentytwo_thirty not in", values, "twentytwoThirty");
            return (Criteria) this;
        }

        public Criteria andTwentytwoThirtyBetween(Boolean value1, Boolean value2) {
            addCriterion("twentytwo_thirty between", value1, value2, "twentytwoThirty");
            return (Criteria) this;
        }

        public Criteria andTwentytwoThirtyNotBetween(Boolean value1, Boolean value2) {
            addCriterion("twentytwo_thirty not between", value1, value2, "twentytwoThirty");
            return (Criteria) this;
        }

        public Criteria andTwentythreeIsNull() {
            addCriterion("twentythree is null");
            return (Criteria) this;
        }

        public Criteria andTwentythreeIsNotNull() {
            addCriterion("twentythree is not null");
            return (Criteria) this;
        }

        public Criteria andTwentythreeEqualTo(Boolean value) {
            addCriterion("twentythree =", value, "twentythree");
            return (Criteria) this;
        }

        public Criteria andTwentythreeNotEqualTo(Boolean value) {
            addCriterion("twentythree <>", value, "twentythree");
            return (Criteria) this;
        }

        public Criteria andTwentythreeGreaterThan(Boolean value) {
            addCriterion("twentythree >", value, "twentythree");
            return (Criteria) this;
        }

        public Criteria andTwentythreeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("twentythree >=", value, "twentythree");
            return (Criteria) this;
        }

        public Criteria andTwentythreeLessThan(Boolean value) {
            addCriterion("twentythree <", value, "twentythree");
            return (Criteria) this;
        }

        public Criteria andTwentythreeLessThanOrEqualTo(Boolean value) {
            addCriterion("twentythree <=", value, "twentythree");
            return (Criteria) this;
        }

        public Criteria andTwentythreeIn(List<Boolean> values) {
            addCriterion("twentythree in", values, "twentythree");
            return (Criteria) this;
        }

        public Criteria andTwentythreeNotIn(List<Boolean> values) {
            addCriterion("twentythree not in", values, "twentythree");
            return (Criteria) this;
        }

        public Criteria andTwentythreeBetween(Boolean value1, Boolean value2) {
            addCriterion("twentythree between", value1, value2, "twentythree");
            return (Criteria) this;
        }

        public Criteria andTwentythreeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("twentythree not between", value1, value2, "twentythree");
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