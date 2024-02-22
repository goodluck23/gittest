package cc.iotkit.data.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QTbDeviceOtaInfo is a Querydsl query type for TbDeviceOtaInfo
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QTbDeviceOtaInfo extends EntityPathBase<TbDeviceOtaInfo> {

    private static final long serialVersionUID = -1557097899L;

    public static final QTbDeviceOtaInfo tbDeviceOtaInfo = new QTbDeviceOtaInfo("tbDeviceOtaInfo");

    public final NumberPath<Long> createAt = createNumber("createAt", Long.class);

    public final StringPath desc = createString("desc");

    public final NumberPath<Integer> fail = createNumber("fail", Integer.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath module = createString("module");

    public final NumberPath<Long> packageId = createNumber("packageId", Long.class);

    public final StringPath productKey = createString("productKey");

    public final NumberPath<Integer> success = createNumber("success", Integer.class);

    public final NumberPath<Integer> total = createNumber("total", Integer.class);

    public final StringPath version = createString("version");

    public QTbDeviceOtaInfo(String variable) {
        super(TbDeviceOtaInfo.class, forVariable(variable));
    }

    public QTbDeviceOtaInfo(Path<? extends TbDeviceOtaInfo> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTbDeviceOtaInfo(PathMetadata metadata) {
        super(TbDeviceOtaInfo.class, metadata);
    }

}

