package cc.iotkit.data.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QTbSysOss is a Querydsl query type for TbSysOss
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QTbSysOss extends EntityPathBase<TbSysOss> {

    private static final long serialVersionUID = 523837569L;

    public static final QTbSysOss tbSysOss = new QTbSysOss("tbSysOss");

    public final QBaseEntity _super = new QBaseEntity(this);

    //inherited
    public final NumberPath<Long> createBy = _super.createBy;

    //inherited
    public final NumberPath<Long> createDept = _super.createDept;

    //inherited
    public final DateTimePath<java.util.Date> createTime = _super.createTime;

    public final StringPath fileName = createString("fileName");

    public final StringPath fileSuffix = createString("fileSuffix");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath originalName = createString("originalName");

    public final StringPath service = createString("service");

    public final StringPath tenantId = createString("tenantId");

    //inherited
    public final NumberPath<Long> updateBy = _super.updateBy;

    //inherited
    public final DateTimePath<java.util.Date> updateTime = _super.updateTime;

    public final StringPath url = createString("url");

    public QTbSysOss(String variable) {
        super(TbSysOss.class, forVariable(variable));
    }

    public QTbSysOss(Path<? extends TbSysOss> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTbSysOss(PathMetadata metadata) {
        super(TbSysOss.class, metadata);
    }

}

