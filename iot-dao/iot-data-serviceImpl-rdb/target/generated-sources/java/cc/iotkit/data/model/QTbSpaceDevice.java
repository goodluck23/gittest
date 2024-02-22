package cc.iotkit.data.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QTbSpaceDevice is a Querydsl query type for TbSpaceDevice
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QTbSpaceDevice extends EntityPathBase<TbSpaceDevice> {

    private static final long serialVersionUID = -557170979L;

    public static final QTbSpaceDevice tbSpaceDevice = new QTbSpaceDevice("tbSpaceDevice");

    public final QBaseEntity _super = new QBaseEntity(this);

    public final BooleanPath collect = createBoolean("collect");

    //inherited
    public final NumberPath<Long> createBy = _super.createBy;

    //inherited
    public final NumberPath<Long> createDept = _super.createDept;

    //inherited
    public final DateTimePath<java.util.Date> createTime = _super.createTime;

    public final StringPath deviceId = createString("deviceId");

    public final NumberPath<Long> homeId = createNumber("homeId", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public final NumberPath<Long> spaceId = createNumber("spaceId", Long.class);

    public final StringPath tenantId = createString("tenantId");

    //inherited
    public final NumberPath<Long> updateBy = _super.updateBy;

    //inherited
    public final DateTimePath<java.util.Date> updateTime = _super.updateTime;

    public QTbSpaceDevice(String variable) {
        super(TbSpaceDevice.class, forVariable(variable));
    }

    public QTbSpaceDevice(Path<? extends TbSpaceDevice> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTbSpaceDevice(PathMetadata metadata) {
        super(TbSpaceDevice.class, metadata);
    }

}

