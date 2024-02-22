package cc.iotkit.data.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QTbDeviceSubUser is a Querydsl query type for TbDeviceSubUser
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QTbDeviceSubUser extends EntityPathBase<TbDeviceSubUser> {

    private static final long serialVersionUID = 2022831766L;

    public static final QTbDeviceSubUser tbDeviceSubUser = new QTbDeviceSubUser("tbDeviceSubUser");

    public final StringPath deviceId = createString("deviceId");

    public final StringPath id = createString("id");

    public final StringPath uid = createString("uid");

    public QTbDeviceSubUser(String variable) {
        super(TbDeviceSubUser.class, forVariable(variable));
    }

    public QTbDeviceSubUser(Path<? extends TbDeviceSubUser> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTbDeviceSubUser(PathMetadata metadata) {
        super(TbDeviceSubUser.class, metadata);
    }

}

