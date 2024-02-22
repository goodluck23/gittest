package cc.iotkit.data.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QTbSysUser is a Querydsl query type for TbSysUser
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QTbSysUser extends EntityPathBase<TbSysUser> {

    private static final long serialVersionUID = -940726119L;

    public static final QTbSysUser tbSysUser = new QTbSysUser("tbSysUser");

    public final QBaseEntity _super = new QBaseEntity(this);

    public final NumberPath<Long> avatar = createNumber("avatar", Long.class);

    //inherited
    public final NumberPath<Long> createBy = _super.createBy;

    //inherited
    public final NumberPath<Long> createDept = _super.createDept;

    //inherited
    public final DateTimePath<java.util.Date> createTime = _super.createTime;

    public final StringPath delFlag = createString("delFlag");

    public final NumberPath<Long> deptId = createNumber("deptId", Long.class);

    public final StringPath email = createString("email");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final DateTimePath<java.util.Date> loginDate = createDateTime("loginDate", java.util.Date.class);

    public final StringPath loginIp = createString("loginIp");

    public final StringPath nickName = createString("nickName");

    public final StringPath password = createString("password");

    public final StringPath phonenumber = createString("phonenumber");

    public final StringPath remark = createString("remark");

    public final StringPath sex = createString("sex");

    public final StringPath status = createString("status");

    public final StringPath tenantId = createString("tenantId");

    //inherited
    public final NumberPath<Long> updateBy = _super.updateBy;

    //inherited
    public final DateTimePath<java.util.Date> updateTime = _super.updateTime;

    public final StringPath userName = createString("userName");

    public final StringPath userType = createString("userType");

    public QTbSysUser(String variable) {
        super(TbSysUser.class, forVariable(variable));
    }

    public QTbSysUser(Path<? extends TbSysUser> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTbSysUser(PathMetadata metadata) {
        super(TbSysUser.class, metadata);
    }

}

