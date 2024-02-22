package cc.iotkit.data.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QTbSysConfig is a Querydsl query type for TbSysConfig
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QTbSysConfig extends EntityPathBase<TbSysConfig> {

    private static final long serialVersionUID = 1681540240L;

    public static final QTbSysConfig tbSysConfig = new QTbSysConfig("tbSysConfig");

    public final QBaseEntity _super = new QBaseEntity(this);

    public final StringPath configKey = createString("configKey");

    public final StringPath configName = createString("configName");

    public final StringPath configType = createString("configType");

    public final StringPath configValue = createString("configValue");

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

    public QTbSysConfig(String variable) {
        super(TbSysConfig.class, forVariable(variable));
    }

    public QTbSysConfig(Path<? extends TbSysConfig> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTbSysConfig(PathMetadata metadata) {
        super(TbSysConfig.class, metadata);
    }

}

