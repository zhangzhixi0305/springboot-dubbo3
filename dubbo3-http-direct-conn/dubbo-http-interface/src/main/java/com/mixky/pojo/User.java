package com.mixky.pojo;

/**
 * @author zhangzhixi
 * @version 1.0
 * @description
 * @date 2024-03-14 15:46
 */
public class User {

    /**
     * name
     */
    private String name;

    /**
     * age
     */
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
