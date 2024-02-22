package cc.iotkit.data.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QTbDeviceConfig is a Querydsl query type for TbDeviceConfig
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QTbDeviceConfig extends EntityPathBase<TbDeviceConfig> {

    private static final long serialVersionUID = 1818775927L;

    public static final QTbDeviceConfig tbDeviceConfig = new QTbDeviceConfig("tbDeviceConfig");

    public final StringPath config = createString("config");

    public final NumberPath<Long> createAt = createNumber("createAt", Long.class);

    public final StringPath deviceId = createString("deviceId");

    public final StringPath deviceName = createString("deviceName");

    public final StringPath id = createString("id");

    public final StringPath productKey = createString("productKey");

    public QTbDeviceConfig(String variable) {
        super(TbDeviceConfig.class, forVariable(variable));
    }

    public QTbDeviceConfig(Path<? extends TbDeviceConfig> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTbDeviceConfig(PathMetadata metadata) {
        super(TbDeviceConfig.class, metadata);
    }

}

