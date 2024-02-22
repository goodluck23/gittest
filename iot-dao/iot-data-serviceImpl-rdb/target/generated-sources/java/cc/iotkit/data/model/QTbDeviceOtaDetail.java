package cc.iotkit.data.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QTbDeviceOtaDetail is a Querydsl query type for TbDeviceOtaDetail
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QTbDeviceOtaDetail extends EntityPathBase<TbDeviceOtaDetail> {

    private static final long serialVersionUID = -1873512392L;

    public static final QTbDeviceOtaDetail tbDeviceOtaDetail = new QTbDeviceOtaDetail("tbDeviceOtaDetail");

    public final StringPath desc = createString("desc");

    public final StringPath deviceId = createString("deviceId");

    public final StringPath deviceName = createString("deviceName");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath module = createString("module");

    public final NumberPath<Long> otaInfoId = createNumber("otaInfoId", Long.class);

    public final StringPath productKey = createString("productKey");

    public final NumberPath<Integer> step = createNumber("step", Integer.class);

    public final StringPath taskId = createString("taskId");

    public final StringPath version = createString("version");

    public QTbDeviceOtaDetail(String variable) {
        super(TbDeviceOtaDetail.class, forVariable(variable));
    }

    public QTbDeviceOtaDetail(Path<? extends TbDeviceOtaDetail> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTbDeviceOtaDetail(PathMetadata metadata) {
        super(TbDeviceOtaDetail.class, metadata);
    }

}

