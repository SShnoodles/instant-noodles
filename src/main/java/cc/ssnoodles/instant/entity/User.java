package cc.ssnoodles.instant.entity;

import lombok.Data;

import java.util.Date;

/**
 * Created by shun on 17-3-11.
 */
@Data
public class User extends IdEntity{
    private String userName;
    private String password;
    private String email;
    private String nickName;
    private Date createTime;
    private Date lastTime;
}
