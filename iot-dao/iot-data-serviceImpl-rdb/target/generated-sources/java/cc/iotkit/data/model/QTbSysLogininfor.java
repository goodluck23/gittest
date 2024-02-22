package cc.iotkit.data.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QTbSysLogininfor is a Querydsl query type for TbSysLogininfor
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QTbSysLogininfor extends EntityPathBase<TbSysLogininfor> {

    private static final long serialVersionUID = -463673847L;

    public static final QTbSysLogininfor tbSysLogininfor = new QTbSysLogininfor("tbSysLogininfor");

    public final QBaseEntity _super = new QBaseEntity(this);

    public final StringPath browser = createString("browser");

    //inherited
    public final NumberPath<Long> createBy = _super.createBy;

    //inherited
    public final NumberPath<Long> createDept = _super.createDept;

    //inherited
    public final DateTimePath<java.util.Date> createTime = _super.createTime;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath ipaddr = createString("ipaddr");

    public final StringPath loginLocation = createString("loginLocation");

    public final DateTimePath<java.util.Date> loginTime = createDateTime("loginTime", java.util.Date.class);

    public final StringPath msg = createString("msg");

    public final StringPath os = createString("os");

    public final StringPath status = createString("status");

    public final StringPath tenantId = createString("tenantId");

    //inherited
    public final NumberPath<Long> updateBy = _super.updateBy;

    //inherited
    public final DateTimePath<java.util.Date> updateTime = _super.updateTime;

    public final StringPath userName = createString("userName");

    public QTbSysLogininfor(String variable) {
        super(TbSysLogininfor.class, forVariable(variable));
    }

    public QTbSysLogininfor(Path<? extends TbSysLogininfor> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTbSysLogininfor(PathMetadata metadata) {
        super(TbSysLogininfor.class, metadata);
    }

}

