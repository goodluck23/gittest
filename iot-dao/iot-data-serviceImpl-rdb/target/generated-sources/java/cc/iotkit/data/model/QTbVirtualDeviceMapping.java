package cc.iotkit.data.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QTbVirtualDeviceMapping is a Querydsl query type for TbVirtualDeviceMapping
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QTbVirtualDeviceMapping extends EntityPathBase<TbVirtualDeviceMapping> {

    private static final long serialVersionUID = -692867700L;

    public static final QTbVirtualDeviceMapping tbVirtualDeviceMapping = new QTbVirtualDeviceMapping("tbVirtualDeviceMapping");

    public final StringPath deviceId = createString("deviceId");

    public final StringPath id = createString("id");

    public final StringPath virtualId = createString("virtualId");

    public QTbVirtualDeviceMapping(String variable) {
        super(TbVirtualDeviceMapping.class, forVariable(variable));
    }

    public QTbVirtualDeviceMapping(Path<? extends TbVirtualDeviceMapping> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTbVirtualDeviceMapping(PathMetadata metadata) {
        super(TbVirtualDeviceMapping.class, metadata);
    }

}

