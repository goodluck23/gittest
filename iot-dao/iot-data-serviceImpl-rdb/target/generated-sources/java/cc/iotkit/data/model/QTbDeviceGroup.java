package cc.iotkit.data.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QTbDeviceGroup is a Querydsl query type for TbDeviceGroup
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QTbDeviceGroup extends EntityPathBase<TbDeviceGroup> {

    private static final long serialVersionUID = 201002410L;

    public static final QTbDeviceGroup tbDeviceGroup = new QTbDeviceGroup("tbDeviceGroup");

    public final NumberPath<Long> createAt = createNumber("createAt", Long.class);

    public final NumberPath<Integer> deviceQty = createNumber("deviceQty", Integer.class);

    public final StringPath id = createString("id");

    public final StringPath name = createString("name");

    public final StringPath remark = createString("remark");

    public final StringPath uid = createString("uid");

    public QTbDeviceGroup(String variable) {
        super(TbDeviceGroup.class, forVariable(variable));
    }

    public QTbDeviceGroup(Path<? extends TbDeviceGroup> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTbDeviceGroup(PathMetadata metadata) {
        super(TbDeviceGroup.class, metadata);
    }

}

