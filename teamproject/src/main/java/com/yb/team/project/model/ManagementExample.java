package com.yb.team.project.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ManagementExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ManagementExample() {
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

        public Criteria andMeetingRoomIsNull() {
            addCriterion("meeting_room is null");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomIsNotNull() {
            addCriterion("meeting_room is not null");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomEqualTo(String value) {
            addCriterion("meeting_room =", value, "meetingRoom");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomNotEqualTo(String value) {
            addCriterion("meeting_room <>", value, "meetingRoom");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomGreaterThan(String value) {
            addCriterion("meeting_room >", value, "meetingRoom");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomGreaterThanOrEqualTo(String value) {
            addCriterion("meeting_room >=", value, "meetingRoom");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomLessThan(String value) {
            addCriterion("meeting_room <", value, "meetingRoom");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomLessThanOrEqualTo(String value) {
            addCriterion("meeting_room <=", value, "meetingRoom");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomLike(String value) {
            addCriterion("meeting_room like", value, "meetingRoom");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomNotLike(String value) {
            addCriterion("meeting_room not like", value, "meetingRoom");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomIn(List<String> values) {
            addCriterion("meeting_room in", values, "meetingRoom");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomNotIn(List<String> values) {
            addCriterion("meeting_room not in", values, "meetingRoom");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomBetween(String value1, String value2) {
            addCriterion("meeting_room between", value1, value2, "meetingRoom");
            return (Criteria) this;
        }

        public Criteria andMeetingRoomNotBetween(String value1, String value2) {
            addCriterion("meeting_room not between", value1, value2, "meetingRoom");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andNumsMaxIsNull() {
            addCriterion("nums_max is null");
            return (Criteria) this;
        }

        public Criteria andNumsMaxIsNotNull() {
            addCriterion("nums_max is not null");
            return (Criteria) this;
        }

        public Criteria andNumsMaxEqualTo(Integer value) {
            addCriterion("nums_max =", value, "numsMax");
            return (Criteria) this;
        }

        public Criteria andNumsMaxNotEqualTo(Integer value) {
            addCriterion("nums_max <>", value, "numsMax");
            return (Criteria) this;
        }

        public Criteria andNumsMaxGreaterThan(Integer value) {
            addCriterion("nums_max >", value, "numsMax");
            return (Criteria) this;
        }

        public Criteria andNumsMaxGreaterThanOrEqualTo(Integer value) {
            addCriterion("nums_max >=", value, "numsMax");
            return (Criteria) this;
        }

        public Criteria andNumsMaxLessThan(Integer value) {
            addCriterion("nums_max <", value, "numsMax");
            return (Criteria) this;
        }

        public Criteria andNumsMaxLessThanOrEqualTo(Integer value) {
            addCriterion("nums_max <=", value, "numsMax");
            return (Criteria) this;
        }

        public Criteria andNumsMaxIn(List<Integer> values) {
            addCriterion("nums_max in", values, "numsMax");
            return (Criteria) this;
        }

        public Criteria andNumsMaxNotIn(List<Integer> values) {
            addCriterion("nums_max not in", values, "numsMax");
            return (Criteria) this;
        }

        public Criteria andNumsMaxBetween(Integer value1, Integer value2) {
            addCriterion("nums_max between", value1, value2, "numsMax");
            return (Criteria) this;
        }

        public Criteria andNumsMaxNotBetween(Integer value1, Integer value2) {
            addCriterion("nums_max not between", value1, value2, "numsMax");
            return (Criteria) this;
        }

        public Criteria andNumsMinIsNull() {
            addCriterion("nums_min is null");
            return (Criteria) this;
        }

        public Criteria andNumsMinIsNotNull() {
            addCriterion("nums_min is not null");
            return (Criteria) this;
        }

        public Criteria andNumsMinEqualTo(Integer value) {
            addCriterion("nums_min =", value, "numsMin");
            return (Criteria) this;
        }

        public Criteria andNumsMinNotEqualTo(Integer value) {
            addCriterion("nums_min <>", value, "numsMin");
            return (Criteria) this;
        }

        public Criteria andNumsMinGreaterThan(Integer value) {
            addCriterion("nums_min >", value, "numsMin");
            return (Criteria) this;
        }

        public Criteria andNumsMinGreaterThanOrEqualTo(Integer value) {
            addCriterion("nums_min >=", value, "numsMin");
            return (Criteria) this;
        }

        public Criteria andNumsMinLessThan(Integer value) {
            addCriterion("nums_min <", value, "numsMin");
            return (Criteria) this;
        }

        public Criteria andNumsMinLessThanOrEqualTo(Integer value) {
            addCriterion("nums_min <=", value, "numsMin");
            return (Criteria) this;
        }

        public Criteria andNumsMinIn(List<Integer> values) {
            addCriterion("nums_min in", values, "numsMin");
            return (Criteria) this;
        }

        public Criteria andNumsMinNotIn(List<Integer> values) {
            addCriterion("nums_min not in", values, "numsMin");
            return (Criteria) this;
        }

        public Criteria andNumsMinBetween(Integer value1, Integer value2) {
            addCriterion("nums_min between", value1, value2, "numsMin");
            return (Criteria) this;
        }

        public Criteria andNumsMinNotBetween(Integer value1, Integer value2) {
            addCriterion("nums_min not between", value1, value2, "numsMin");
            return (Criteria) this;
        }

        public Criteria andProjectorIsNull() {
            addCriterion("projector is null");
            return (Criteria) this;
        }

        public Criteria andProjectorIsNotNull() {
            addCriterion("projector is not null");
            return (Criteria) this;
        }

        public Criteria andProjectorEqualTo(String value) {
            addCriterion("projector =", value, "projector");
            return (Criteria) this;
        }

        public Criteria andProjectorNotEqualTo(String value) {
            addCriterion("projector <>", value, "projector");
            return (Criteria) this;
        }

        public Criteria andProjectorGreaterThan(String value) {
            addCriterion("projector >", value, "projector");
            return (Criteria) this;
        }

        public Criteria andProjectorGreaterThanOrEqualTo(String value) {
            addCriterion("projector >=", value, "projector");
            return (Criteria) this;
        }

        public Criteria andProjectorLessThan(String value) {
            addCriterion("projector <", value, "projector");
            return (Criteria) this;
        }

        public Criteria andProjectorLessThanOrEqualTo(String value) {
            addCriterion("projector <=", value, "projector");
            return (Criteria) this;
        }

        public Criteria andProjectorLike(String value) {
            addCriterion("projector like", value, "projector");
            return (Criteria) this;
        }

        public Criteria andProjectorNotLike(String value) {
            addCriterion("projector not like", value, "projector");
            return (Criteria) this;
        }

        public Criteria andProjectorIn(List<String> values) {
            addCriterion("projector in", values, "projector");
            return (Criteria) this;
        }

        public Criteria andProjectorNotIn(List<String> values) {
            addCriterion("projector not in", values, "projector");
            return (Criteria) this;
        }

        public Criteria andProjectorBetween(String value1, String value2) {
            addCriterion("projector between", value1, value2, "projector");
            return (Criteria) this;
        }

        public Criteria andProjectorNotBetween(String value1, String value2) {
            addCriterion("projector not between", value1, value2, "projector");
            return (Criteria) this;
        }

        public Criteria andVisibleIsNull() {
            addCriterion("visible is null");
            return (Criteria) this;
        }

        public Criteria andVisibleIsNotNull() {
            addCriterion("visible is not null");
            return (Criteria) this;
        }

        public Criteria andVisibleEqualTo(Boolean value) {
            addCriterion("visible =", value, "visible");
            return (Criteria) this;
        }

        public Criteria andVisibleNotEqualTo(Boolean value) {
            addCriterion("visible <>", value, "visible");
            return (Criteria) this;
        }

        public Criteria andVisibleGreaterThan(Boolean value) {
            addCriterion("visible >", value, "visible");
            return (Criteria) this;
        }

        public Criteria andVisibleGreaterThanOrEqualTo(Boolean value) {
            addCriterion("visible >=", value, "visible");
            return (Criteria) this;
        }

        public Criteria andVisibleLessThan(Boolean value) {
            addCriterion("visible <", value, "visible");
            return (Criteria) this;
        }

        public Criteria andVisibleLessThanOrEqualTo(Boolean value) {
            addCriterion("visible <=", value, "visible");
            return (Criteria) this;
        }

        public Criteria andVisibleIn(List<Boolean> values) {
            addCriterion("visible in", values, "visible");
            return (Criteria) this;
        }

        public Criteria andVisibleNotIn(List<Boolean> values) {
            addCriterion("visible not in", values, "visible");
            return (Criteria) this;
        }

        public Criteria andVisibleBetween(Boolean value1, Boolean value2) {
            addCriterion("visible between", value1, value2, "visible");
            return (Criteria) this;
        }

        public Criteria andVisibleNotBetween(Boolean value1, Boolean value2) {
            addCriterion("visible not between", value1, value2, "visible");
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