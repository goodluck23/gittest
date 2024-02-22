package cc.iotkit.data.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QTbSysApp is a Querydsl query type for TbSysApp
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QTbSysApp extends EntityPathBase<TbSysApp> {

    private static final long serialVersionUID = 523824019L;

    public static final QTbSysApp tbSysApp = new QTbSysApp("tbSysApp");

    public final QBaseEntity _super = new QBaseEntity(this);

    public final StringPath appId = createString("appId");

    public final StringPath appName = createString("appName");

    public final StringPath appSecret = createString("appSecret");

    public final StringPath appType = createString("appType");

    //inherited
    public final NumberPath<Long> createBy = _super.createBy;

    //inherited
    public final NumberPath<Long> createDept = _super.createDept;

    //inherited
    public final DateTimePath<java.util.Date> createTime = _super.createTime;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath remark = createString("remark");

    public final StringPath tenantId = createString("tenantId");

    //inherited
    public final NumberPath<Long> updateBy = _super.updateBy;

    //inherited
    public final DateTimePath<java.util.Date> updateTime = _super.updateTime;

    public QTbSysApp(String variable) {
        super(TbSysApp.class, forVariable(variable));
    }

    public QTbSysApp(Path<? extends TbSysApp> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTbSysApp(PathMetadata metadata) {
        super(TbSysApp.class, metadata);
    }

}

