package cc.iotkit.data.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QTbUserInfo is a Querydsl query type for TbUserInfo
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QTbUserInfo extends EntityPathBase<TbUserInfo> {

    private static final long serialVersionUID = -1312408872L;

    public static final QTbUserInfo tbUserInfo = new QTbUserInfo("tbUserInfo");

    public final QBaseEntity _super = new QBaseEntity(this);

    public final StringPath address = createString("address");

    public final StringPath avatarUrl = createString("avatarUrl");

    //inherited
    public final NumberPath<Long> createBy = _super.createBy;

    //inherited
    public final NumberPath<Long> createDept = _super.createDept;

    //inherited
    public final DateTimePath<java.util.Date> createTime = _super.createTime;

    public final StringPath currHomeId = createString("currHomeId");

    public final StringPath email = createString("email");

    public final NumberPath<Integer> gender = createNumber("gender", Integer.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath nickName = createString("nickName");

    public final StringPath permissions = createString("permissions");

    public final StringPath roles = createString("roles");

    public final StringPath secret = createString("secret");

    public final StringPath tenantId = createString("tenantId");

    public final NumberPath<Integer> type = createNumber("type", Integer.class);

    public final StringPath uid = createString("uid");

    //inherited
    public final NumberPath<Long> updateBy = _super.updateBy;

    //inherited
    public final DateTimePath<java.util.Date> updateTime = _super.updateTime;

    public final StringPath usePlatforms = createString("usePlatforms");

    public QTbUserInfo(String variable) {
        super(TbUserInfo.class, forVariable(variable));
    }

    public QTbUserInfo(Path<? extends TbUserInfo> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTbUserInfo(PathMetadata metadata) {
        super(TbUserInfo.class, metadata);
    }

}

