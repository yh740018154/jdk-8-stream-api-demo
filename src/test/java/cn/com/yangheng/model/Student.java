package cn.com.yangheng.model;

import com.sun.istack.internal.NotNull;

import java.util.Date;

/**
 * @author yangheng
 * @Classname Student
 * @Description TODO
 * @Date 2019/10/11 8:46
 * @group smart video north
 */
public class Student {

    @NotNull
    private String sId;
    private int sAge;
    private Date sBirthday;
    private String sName;

    @Override
    public String toString() {
        return "Student{" +
                "sId='" + sId + '\'' +
                ", sAge=" + sAge +
                ", sBirthday=" + sBirthday +
                ", sName='" + sName + '\'' +
                '}';
    }

    public String getsId() {
        return sId;
    }

    public void setsId(String sId) {
        this.sId = sId;
    }

    public int getsAge() {
        return sAge;
    }

    public void setsAge(int sAge) {
        this.sAge = sAge;
    }

    public Date getsBirthday() {
        return sBirthday;
    }

    public void setsBirthday(Date sBirthday) {
        this.sBirthday = sBirthday;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }
}
