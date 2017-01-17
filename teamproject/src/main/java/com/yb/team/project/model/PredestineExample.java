package com.yb.team.project.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PredestineExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PredestineExample() {
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

        public Criteria andMeetingIdIsNull() {
            addCriterion("meeting_id is null");
            return (Criteria) this;
        }

        public Criteria andMeetingIdIsNotNull() {
            addCriterion("meeting_id is not null");
            return (Criteria) this;
        }

        public Criteria andMeetingIdEqualTo(Integer value) {
            addCriterion("meeting_id =", value, "meetingId");
            return (Criteria) this;
        }

        public Criteria andMeetingIdNotEqualTo(Integer value) {
            addCriterion("meeting_id <>", value, "meetingId");
            return (Criteria) this;
        }

        public Criteria andMeetingIdGreaterThan(Integer value) {
            addCriterion("meeting_id >", value, "meetingId");
            return (Criteria) this;
        }

        public Criteria andMeetingIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("meeting_id >=", value, "meetingId");
            return (Criteria) this;
        }

        public Criteria andMeetingIdLessThan(Integer value) {
            addCriterion("meeting_id <", value, "meetingId");
            return (Criteria) this;
        }

        public Criteria andMeetingIdLessThanOrEqualTo(Integer value) {
            addCriterion("meeting_id <=", value, "meetingId");
            return (Criteria) this;
        }

        public Criteria andMeetingIdIn(List<Integer> values) {
            addCriterion("meeting_id in", values, "meetingId");
            return (Criteria) this;
        }

        public Criteria andMeetingIdNotIn(List<Integer> values) {
            addCriterion("meeting_id not in", values, "meetingId");
            return (Criteria) this;
        }

        public Criteria andMeetingIdBetween(Integer value1, Integer value2) {
            addCriterion("meeting_id between", value1, value2, "meetingId");
            return (Criteria) this;
        }

        public Criteria andMeetingIdNotBetween(Integer value1, Integer value2) {
            addCriterion("meeting_id not between", value1, value2, "meetingId");
            return (Criteria) this;
        }

        public Criteria andMeetingThemeIsNull() {
            addCriterion("meeting_theme is null");
            return (Criteria) this;
        }

        public Criteria andMeetingThemeIsNotNull() {
            addCriterion("meeting_theme is not null");
            return (Criteria) this;
        }

        public Criteria andMeetingThemeEqualTo(String value) {
            addCriterion("meeting_theme =", value, "meetingTheme");
            return (Criteria) this;
        }

        public Criteria andMeetingThemeNotEqualTo(String value) {
            addCriterion("meeting_theme <>", value, "meetingTheme");
            return (Criteria) this;
        }

        public Criteria andMeetingThemeGreaterThan(String value) {
            addCriterion("meeting_theme >", value, "meetingTheme");
            return (Criteria) this;
        }

        public Criteria andMeetingThemeGreaterThanOrEqualTo(String value) {
            addCriterion("meeting_theme >=", value, "meetingTheme");
            return (Criteria) this;
        }

        public Criteria andMeetingThemeLessThan(String value) {
            addCriterion("meeting_theme <", value, "meetingTheme");
            return (Criteria) this;
        }

        public Criteria andMeetingThemeLessThanOrEqualTo(String value) {
            addCriterion("meeting_theme <=", value, "meetingTheme");
            return (Criteria) this;
        }

        public Criteria andMeetingThemeLike(String value) {
            addCriterion("meeting_theme like", value, "meetingTheme");
            return (Criteria) this;
        }

        public Criteria andMeetingThemeNotLike(String value) {
            addCriterion("meeting_theme not like", value, "meetingTheme");
            return (Criteria) this;
        }

        public Criteria andMeetingThemeIn(List<String> values) {
            addCriterion("meeting_theme in", values, "meetingTheme");
            return (Criteria) this;
        }

        public Criteria andMeetingThemeNotIn(List<String> values) {
            addCriterion("meeting_theme not in", values, "meetingTheme");
            return (Criteria) this;
        }

        public Criteria andMeetingThemeBetween(String value1, String value2) {
            addCriterion("meeting_theme between", value1, value2, "meetingTheme");
            return (Criteria) this;
        }

        public Criteria andMeetingThemeNotBetween(String value1, String value2) {
            addCriterion("meeting_theme not between", value1, value2, "meetingTheme");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterion("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterion("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterion("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterion("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterion("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterion("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterion("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("start_time not between", value1, value2, "startTime");
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

        public Criteria andBookerIsNull() {
            addCriterion("booker is null");
            return (Criteria) this;
        }

        public Criteria andBookerIsNotNull() {
            addCriterion("booker is not null");
            return (Criteria) this;
        }

        public Criteria andBookerEqualTo(String value) {
            addCriterion("booker =", value, "booker");
            return (Criteria) this;
        }

        public Criteria andBookerNotEqualTo(String value) {
            addCriterion("booker <>", value, "booker");
            return (Criteria) this;
        }

        public Criteria andBookerGreaterThan(String value) {
            addCriterion("booker >", value, "booker");
            return (Criteria) this;
        }

        public Criteria andBookerGreaterThanOrEqualTo(String value) {
            addCriterion("booker >=", value, "booker");
            return (Criteria) this;
        }

        public Criteria andBookerLessThan(String value) {
            addCriterion("booker <", value, "booker");
            return (Criteria) this;
        }

        public Criteria andBookerLessThanOrEqualTo(String value) {
            addCriterion("booker <=", value, "booker");
            return (Criteria) this;
        }

        public Criteria andBookerLike(String value) {
            addCriterion("booker like", value, "booker");
            return (Criteria) this;
        }

        public Criteria andBookerNotLike(String value) {
            addCriterion("booker not like", value, "booker");
            return (Criteria) this;
        }

        public Criteria andBookerIn(List<String> values) {
            addCriterion("booker in", values, "booker");
            return (Criteria) this;
        }

        public Criteria andBookerNotIn(List<String> values) {
            addCriterion("booker not in", values, "booker");
            return (Criteria) this;
        }

        public Criteria andBookerBetween(String value1, String value2) {
            addCriterion("booker between", value1, value2, "booker");
            return (Criteria) this;
        }

        public Criteria andBookerNotBetween(String value1, String value2) {
            addCriterion("booker not between", value1, value2, "booker");
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