package cc.iotkit.data.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QTbSysOssConfig is a Querydsl query type for TbSysOssConfig
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QTbSysOssConfig extends EntityPathBase<TbSysOssConfig> {

    private static final long serialVersionUID = -125211869L;

    public static final QTbSysOssConfig tbSysOssConfig = new QTbSysOssConfig("tbSysOssConfig");

    public final QBaseEntity _super = new QBaseEntity(this);

    public final StringPath accessKey = createString("accessKey");

    public final StringPath accessPolicy = createString("accessPolicy");

    public final StringPath bucketName = createString("bucketName");

    public final StringPath configKey = createString("configKey");

    //inherited
    public final NumberPath<Long> createBy = _super.createBy;

    //inherited
    public final NumberPath<Long> createDept = _super.createDept;

    //inherited
    public final DateTimePath<java.util.Date> createTime = _super.createTime;

    public final StringPath domain = createString("domain");

    public final StringPath endpoint = createString("endpoint");

    public final StringPath ext1 = createString("ext1");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath isHttps = createString("isHttps");

    public final StringPath prefix = createString("prefix");

    public final StringPath region = createString("region");

    public final StringPath remark = createString("remark");

    public final StringPath secretKey = createString("secretKey");

    public final StringPath status = createString("status");

    public final StringPath tenantId = createString("tenantId");

    //inherited
    public final NumberPath<Long> updateBy = _super.updateBy;

    //inherited
    public final DateTimePath<java.util.Date> updateTime = _super.updateTime;

    public QTbSysOssConfig(String variable) {
        super(TbSysOssConfig.class, forVariable(variable));
    }

    public QTbSysOssConfig(Path<? extends TbSysOssConfig> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTbSysOssConfig(PathMetadata metadata) {
        super(TbSysOssConfig.class, metadata);
    }

}

