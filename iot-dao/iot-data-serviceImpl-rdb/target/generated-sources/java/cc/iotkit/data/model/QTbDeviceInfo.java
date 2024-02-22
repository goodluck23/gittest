package cc.iotkit.data.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QTbDeviceInfo is a Querydsl query type for TbDeviceInfo
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QTbDeviceInfo extends EntityPathBase<TbDeviceInfo> {

    private static final long serialVersionUID = 976370723L;

    public static final QTbDeviceInfo tbDeviceInfo = new QTbDeviceInfo("tbDeviceInfo");

    public final NumberPath<Long> createAt = createNumber("createAt", Long.class);

    public final StringPath deviceId = createString("deviceId");

    public final StringPath deviceName = createString("deviceName");

    public final StringPath id = createString("id");

    public final StringPath latitude = createString("latitude");

    public final StringPath longitude = createString("longitude");

    public final StringPath model = createString("model");

    public final NumberPath<Long> offlineTime = createNumber("offlineTime", Long.class);

    public final NumberPath<Long> onlineTime = createNumber("onlineTime", Long.class);

    public final StringPath parentId = createString("parentId");

    public final StringPath productKey = createString("productKey");

    public final StringPath secret = createString("secret");

    public final StringPath state = createString("state");

    public final StringPath uid = createString("uid");

    public QTbDeviceInfo(String variable) {
        super(TbDeviceInfo.class, forVariable(variable));
    }

    public QTbDeviceInfo(Path<? extends TbDeviceInfo> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTbDeviceInfo(PathMetadata metadata) {
        super(TbDeviceInfo.class, metadata);
    }

}

