package cc.iotkit.data.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QTbDeviceTag is a Querydsl query type for TbDeviceTag
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QTbDeviceTag extends EntityPathBase<TbDeviceTag> {

    private static final long serialVersionUID = 1971168645L;

    public static final QTbDeviceTag tbDeviceTag = new QTbDeviceTag("tbDeviceTag");

    public final StringPath code = createString("code");

    public final StringPath deviceId = createString("deviceId");

    public final StringPath id = createString("id");

    public final StringPath name = createString("name");

    public final StringPath value = createString("value");

    public QTbDeviceTag(String variable) {
        super(TbDeviceTag.class, forVariable(variable));
    }

    public QTbDeviceTag(Path<? extends TbDeviceTag> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTbDeviceTag(PathMetadata metadata) {
        super(TbDeviceTag.class, metadata);
    }

}

