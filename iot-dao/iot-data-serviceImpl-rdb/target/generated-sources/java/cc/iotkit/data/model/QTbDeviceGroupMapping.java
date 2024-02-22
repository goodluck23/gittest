package cc.iotkit.data.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QTbDeviceGroupMapping is a Querydsl query type for TbDeviceGroupMapping
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QTbDeviceGroupMapping extends EntityPathBase<TbDeviceGroupMapping> {

    private static final long serialVersionUID = -1818701884L;

    public static final QTbDeviceGroupMapping tbDeviceGroupMapping = new QTbDeviceGroupMapping("tbDeviceGroupMapping");

    public final StringPath deviceId = createString("deviceId");

    public final StringPath groupId = createString("groupId");

    public final StringPath id = createString("id");

    public QTbDeviceGroupMapping(String variable) {
        super(TbDeviceGroupMapping.class, forVariable(variable));
    }

    public QTbDeviceGroupMapping(Path<? extends TbDeviceGroupMapping> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTbDeviceGroupMapping(PathMetadata metadata) {
        super(TbDeviceGroupMapping.class, metadata);
    }

}

