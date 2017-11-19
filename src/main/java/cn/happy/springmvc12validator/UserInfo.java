package cn.happy.springmvc12validator;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.*;

/**
 * Created by linlin on 2017/8/30.
 */
public class UserInfo {
    @Min(value=0,message="成绩最小值为{value}")
    @Max(value=100,message="成绩最大值为{value}")
    private Integer score;

    //手机号码必须不能为空,必须是以1 开头 第二位3,4,5,6,7,8,9   最后9位随意
    @NotEmpty(message="手机号码不允许为空")
    @Pattern(regexp="^1[3,4,5,6,7,8,9]\\d{9}$",message="手机号码不正确")  //7
    private String phone;

    //不能为空
    //必须是6个字符以上
    @NotEmpty(message="用户名不能为空")
    @Size(min=6,message="名称至少6个字符") //5
    private String name;

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
