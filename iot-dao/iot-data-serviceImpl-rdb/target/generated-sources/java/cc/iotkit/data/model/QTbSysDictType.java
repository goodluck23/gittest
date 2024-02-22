package cc.iotkit.data.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QTbSysDictType is a Querydsl query type for TbSysDictType
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QTbSysDictType extends EntityPathBase<TbSysDictType> {

    private static final long serialVersionUID = 1462626782L;

    public static final QTbSysDictType tbSysDictType = new QTbSysDictType("tbSysDictType");

    public final QBaseEntity _super = new QBaseEntity(this);

    //inherited
    public final NumberPath<Long> createBy = _super.createBy;

    //inherited
    public final NumberPath<Long> createDept = _super.createDept;

    //inherited
    public final DateTimePath<java.util.Date> createTime = _super.createTime;

    public final StringPath dictName = createString("dictName");

    public final StringPath dictType = createString("dictType");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath remark = createString("remark");

    public final StringPath status = createString("status");

    public final StringPath tenantId = createString("tenantId");

    //inherited
    public final NumberPath<Long> updateBy = _super.updateBy;

    //inherited
    public final DateTimePath<java.util.Date> updateTime = _super.updateTime;

    public QTbSysDictType(String variable) {
        super(TbSysDictType.class, forVariable(variable));
    }

    public QTbSysDictType(Path<? extends TbSysDictType> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTbSysDictType(PathMetadata metadata) {
        super(TbSysDictType.class, metadata);
    }

}

