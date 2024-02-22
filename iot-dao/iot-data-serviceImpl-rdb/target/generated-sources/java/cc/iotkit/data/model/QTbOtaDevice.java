package cc.iotkit.data.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QTbOtaDevice is a Querydsl query type for TbOtaDevice
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QTbOtaDevice extends EntityPathBase<TbOtaDevice> {

    private static final long serialVersionUID = 1421744307L;

    public static final QTbOtaDevice tbOtaDevice = new QTbOtaDevice("tbOtaDevice");

    public final NumberPath<Long> createAt = createNumber("createAt", Long.class);

    public final StringPath deviceId = createString("deviceId");

    public final StringPath deviceName = createString("deviceName");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Integer> status = createNumber("status", Integer.class);

    public final StringPath version = createString("version");

    public QTbOtaDevice(String variable) {
        super(TbOtaDevice.class, forVariable(variable));
    }

    public QTbOtaDevice(Path<? extends TbOtaDevice> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTbOtaDevice(PathMetadata metadata) {
        super(TbOtaDevice.class, metadata);
    }

}

