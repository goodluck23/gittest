package cc.iotkit.data.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QTbSpace is a Querydsl query type for TbSpace
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QTbSpace extends EntityPathBase<TbSpace> {

    private static final long serialVersionUID = -399028825L;

    public static final QTbSpace tbSpace = new QTbSpace("tbSpace");

    public final QBaseEntity _super = new QBaseEntity(this);

    //inherited
    public final NumberPath<Long> createBy = _super.createBy;

    //inherited
    public final NumberPath<Long> createDept = _super.createDept;

    //inherited
    public final DateTimePath<java.util.Date> createTime = _super.createTime;

    public final NumberPath<Integer> deviceNum = createNumber("deviceNum", Integer.class);

    public final NumberPath<Long> homeId = createNumber("homeId", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public final StringPath tenantId = createString("tenantId");

    //inherited
    public final NumberPath<Long> updateBy = _super.updateBy;

    //inherited
    public final DateTimePath<java.util.Date> updateTime = _super.updateTime;

    public QTbSpace(String variable) {
        super(TbSpace.class, forVariable(variable));
    }

    public QTbSpace(Path<? extends TbSpace> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTbSpace(PathMetadata metadata) {
        super(TbSpace.class, metadata);
    }

}

