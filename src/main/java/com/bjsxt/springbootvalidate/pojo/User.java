package com.bjsxt.springbootvalidate.pojo;

import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * @NotNull:对基本数据类型的对象类型做非空校验
 * @NotBlank：对字符串类型做非空校验
 * @NotEmpty：对集合类型做非空校验
 */
public class User {
    @NotBlank
    private String userid;
    @NotBlank
    @Length(min = 3,max = 8,message = "最小3，最大8")
    private String realname;
    @NotBlank
    private String password;
    @NotNull
    private Integer age;
    @NotBlank
    private String hobby;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date enterdate;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby == null ? null : hobby.trim();
    }

    public Date getEnterdate() {
        return enterdate;
    }

    public void setEnterdate(Date enterdate) {
        this.enterdate = enterdate;
    }

    @Override
    public String toString()
    {
        return "User{" +
                "userid='" + userid + '\'' +
                ", realname='" + realname + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", hobby='" + hobby + '\'' +
                ", enterdate=" + enterdate +
                '}';
    }
}