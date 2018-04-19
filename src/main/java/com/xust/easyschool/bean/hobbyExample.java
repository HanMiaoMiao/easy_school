package com.xust.easyschool.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class hobbyExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table hobby
     *
     * @mbg.generated Thu Apr 19 22:16:31 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table hobby
     *
     * @mbg.generated Thu Apr 19 22:16:31 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table hobby
     *
     * @mbg.generated Thu Apr 19 22:16:31 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hobby
     *
     * @mbg.generated Thu Apr 19 22:16:31 CST 2018
     */
    public hobbyExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hobby
     *
     * @mbg.generated Thu Apr 19 22:16:31 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hobby
     *
     * @mbg.generated Thu Apr 19 22:16:31 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hobby
     *
     * @mbg.generated Thu Apr 19 22:16:31 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hobby
     *
     * @mbg.generated Thu Apr 19 22:16:31 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hobby
     *
     * @mbg.generated Thu Apr 19 22:16:31 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hobby
     *
     * @mbg.generated Thu Apr 19 22:16:31 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hobby
     *
     * @mbg.generated Thu Apr 19 22:16:31 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hobby
     *
     * @mbg.generated Thu Apr 19 22:16:31 CST 2018
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hobby
     *
     * @mbg.generated Thu Apr 19 22:16:31 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hobby
     *
     * @mbg.generated Thu Apr 19 22:16:31 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table hobby
     *
     * @mbg.generated Thu Apr 19 22:16:31 CST 2018
     */
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

        public Criteria andHobbyIdIsNull() {
            addCriterion("hobby_id is null");
            return (Criteria) this;
        }

        public Criteria andHobbyIdIsNotNull() {
            addCriterion("hobby_id is not null");
            return (Criteria) this;
        }

        public Criteria andHobbyIdEqualTo(Integer value) {
            addCriterion("hobby_id =", value, "hobbyId");
            return (Criteria) this;
        }

        public Criteria andHobbyIdNotEqualTo(Integer value) {
            addCriterion("hobby_id <>", value, "hobbyId");
            return (Criteria) this;
        }

        public Criteria andHobbyIdGreaterThan(Integer value) {
            addCriterion("hobby_id >", value, "hobbyId");
            return (Criteria) this;
        }

        public Criteria andHobbyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("hobby_id >=", value, "hobbyId");
            return (Criteria) this;
        }

        public Criteria andHobbyIdLessThan(Integer value) {
            addCriterion("hobby_id <", value, "hobbyId");
            return (Criteria) this;
        }

        public Criteria andHobbyIdLessThanOrEqualTo(Integer value) {
            addCriterion("hobby_id <=", value, "hobbyId");
            return (Criteria) this;
        }

        public Criteria andHobbyIdIn(List<Integer> values) {
            addCriterion("hobby_id in", values, "hobbyId");
            return (Criteria) this;
        }

        public Criteria andHobbyIdNotIn(List<Integer> values) {
            addCriterion("hobby_id not in", values, "hobbyId");
            return (Criteria) this;
        }

        public Criteria andHobbyIdBetween(Integer value1, Integer value2) {
            addCriterion("hobby_id between", value1, value2, "hobbyId");
            return (Criteria) this;
        }

        public Criteria andHobbyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("hobby_id not between", value1, value2, "hobbyId");
            return (Criteria) this;
        }

        public Criteria andHobbyContentIsNull() {
            addCriterion("hobby_content is null");
            return (Criteria) this;
        }

        public Criteria andHobbyContentIsNotNull() {
            addCriterion("hobby_content is not null");
            return (Criteria) this;
        }

        public Criteria andHobbyContentEqualTo(String value) {
            addCriterion("hobby_content =", value, "hobbyContent");
            return (Criteria) this;
        }

        public Criteria andHobbyContentNotEqualTo(String value) {
            addCriterion("hobby_content <>", value, "hobbyContent");
            return (Criteria) this;
        }

        public Criteria andHobbyContentGreaterThan(String value) {
            addCriterion("hobby_content >", value, "hobbyContent");
            return (Criteria) this;
        }

        public Criteria andHobbyContentGreaterThanOrEqualTo(String value) {
            addCriterion("hobby_content >=", value, "hobbyContent");
            return (Criteria) this;
        }

        public Criteria andHobbyContentLessThan(String value) {
            addCriterion("hobby_content <", value, "hobbyContent");
            return (Criteria) this;
        }

        public Criteria andHobbyContentLessThanOrEqualTo(String value) {
            addCriterion("hobby_content <=", value, "hobbyContent");
            return (Criteria) this;
        }

        public Criteria andHobbyContentLike(String value) {
            addCriterion("hobby_content like", value, "hobbyContent");
            return (Criteria) this;
        }

        public Criteria andHobbyContentNotLike(String value) {
            addCriterion("hobby_content not like", value, "hobbyContent");
            return (Criteria) this;
        }

        public Criteria andHobbyContentIn(List<String> values) {
            addCriterion("hobby_content in", values, "hobbyContent");
            return (Criteria) this;
        }

        public Criteria andHobbyContentNotIn(List<String> values) {
            addCriterion("hobby_content not in", values, "hobbyContent");
            return (Criteria) this;
        }

        public Criteria andHobbyContentBetween(String value1, String value2) {
            addCriterion("hobby_content between", value1, value2, "hobbyContent");
            return (Criteria) this;
        }

        public Criteria andHobbyContentNotBetween(String value1, String value2) {
            addCriterion("hobby_content not between", value1, value2, "hobbyContent");
            return (Criteria) this;
        }

        public Criteria andConsumerNumberIsNull() {
            addCriterion("consumer_number is null");
            return (Criteria) this;
        }

        public Criteria andConsumerNumberIsNotNull() {
            addCriterion("consumer_number is not null");
            return (Criteria) this;
        }

        public Criteria andConsumerNumberEqualTo(Integer value) {
            addCriterion("consumer_number =", value, "consumerNumber");
            return (Criteria) this;
        }

        public Criteria andConsumerNumberNotEqualTo(Integer value) {
            addCriterion("consumer_number <>", value, "consumerNumber");
            return (Criteria) this;
        }

        public Criteria andConsumerNumberGreaterThan(Integer value) {
            addCriterion("consumer_number >", value, "consumerNumber");
            return (Criteria) this;
        }

        public Criteria andConsumerNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("consumer_number >=", value, "consumerNumber");
            return (Criteria) this;
        }

        public Criteria andConsumerNumberLessThan(Integer value) {
            addCriterion("consumer_number <", value, "consumerNumber");
            return (Criteria) this;
        }

        public Criteria andConsumerNumberLessThanOrEqualTo(Integer value) {
            addCriterion("consumer_number <=", value, "consumerNumber");
            return (Criteria) this;
        }

        public Criteria andConsumerNumberIn(List<Integer> values) {
            addCriterion("consumer_number in", values, "consumerNumber");
            return (Criteria) this;
        }

        public Criteria andConsumerNumberNotIn(List<Integer> values) {
            addCriterion("consumer_number not in", values, "consumerNumber");
            return (Criteria) this;
        }

        public Criteria andConsumerNumberBetween(Integer value1, Integer value2) {
            addCriterion("consumer_number between", value1, value2, "consumerNumber");
            return (Criteria) this;
        }

        public Criteria andConsumerNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("consumer_number not between", value1, value2, "consumerNumber");
            return (Criteria) this;
        }

        public Criteria andCreateAtIsNull() {
            addCriterion("create_at is null");
            return (Criteria) this;
        }

        public Criteria andCreateAtIsNotNull() {
            addCriterion("create_at is not null");
            return (Criteria) this;
        }

        public Criteria andCreateAtEqualTo(Date value) {
            addCriterion("create_at =", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtNotEqualTo(Date value) {
            addCriterion("create_at <>", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtGreaterThan(Date value) {
            addCriterion("create_at >", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtGreaterThanOrEqualTo(Date value) {
            addCriterion("create_at >=", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtLessThan(Date value) {
            addCriterion("create_at <", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtLessThanOrEqualTo(Date value) {
            addCriterion("create_at <=", value, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtIn(List<Date> values) {
            addCriterion("create_at in", values, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtNotIn(List<Date> values) {
            addCriterion("create_at not in", values, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtBetween(Date value1, Date value2) {
            addCriterion("create_at between", value1, value2, "createAt");
            return (Criteria) this;
        }

        public Criteria andCreateAtNotBetween(Date value1, Date value2) {
            addCriterion("create_at not between", value1, value2, "createAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtIsNull() {
            addCriterion("update_at is null");
            return (Criteria) this;
        }

        public Criteria andUpdateAtIsNotNull() {
            addCriterion("update_at is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateAtEqualTo(Date value) {
            addCriterion("update_at =", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtNotEqualTo(Date value) {
            addCriterion("update_at <>", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtGreaterThan(Date value) {
            addCriterion("update_at >", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtGreaterThanOrEqualTo(Date value) {
            addCriterion("update_at >=", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtLessThan(Date value) {
            addCriterion("update_at <", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtLessThanOrEqualTo(Date value) {
            addCriterion("update_at <=", value, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtIn(List<Date> values) {
            addCriterion("update_at in", values, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtNotIn(List<Date> values) {
            addCriterion("update_at not in", values, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtBetween(Date value1, Date value2) {
            addCriterion("update_at between", value1, value2, "updateAt");
            return (Criteria) this;
        }

        public Criteria andUpdateAtNotBetween(Date value1, Date value2) {
            addCriterion("update_at not between", value1, value2, "updateAt");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNull() {
            addCriterion("deleted is null");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNotNull() {
            addCriterion("deleted is not null");
            return (Criteria) this;
        }

        public Criteria andDeletedEqualTo(String value) {
            addCriterion("deleted =", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotEqualTo(String value) {
            addCriterion("deleted <>", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThan(String value) {
            addCriterion("deleted >", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThanOrEqualTo(String value) {
            addCriterion("deleted >=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThan(String value) {
            addCriterion("deleted <", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThanOrEqualTo(String value) {
            addCriterion("deleted <=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLike(String value) {
            addCriterion("deleted like", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotLike(String value) {
            addCriterion("deleted not like", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedIn(List<String> values) {
            addCriterion("deleted in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotIn(List<String> values) {
            addCriterion("deleted not in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedBetween(String value1, String value2) {
            addCriterion("deleted between", value1, value2, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotBetween(String value1, String value2) {
            addCriterion("deleted not between", value1, value2, "deleted");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table hobby
     *
     * @mbg.generated do_not_delete_during_merge Thu Apr 19 22:16:31 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table hobby
     *
     * @mbg.generated Thu Apr 19 22:16:31 CST 2018
     */
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