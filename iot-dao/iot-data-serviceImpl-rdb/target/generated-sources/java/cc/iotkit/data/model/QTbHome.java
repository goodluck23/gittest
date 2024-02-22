package cc.iotkit.data.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QTbHome is a Querydsl query type for TbHome
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QTbHome extends EntityPathBase<TbHome> {

    private static final long serialVersionUID = -1260126178L;

    public static final QTbHome tbHome = new QTbHome("tbHome");

    public final QBaseEntity _super = new QBaseEntity(this);

    public final StringPath address = createString("address");

    //inherited
    public final NumberPath<Long> createBy = _super.createBy;

    //inherited
    public final NumberPath<Long> createDept = _super.createDept;

    //inherited
    public final DateTimePath<java.util.Date> createTime = _super.createTime;

    public final BooleanPath current = createBoolean("current");

    public final NumberPath<Integer> deviceNum = createNumber("deviceNum", Integer.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public final NumberPath<Integer> spaceNum = createNumber("spaceNum", Integer.class);

    public final StringPath tenantId = createString("tenantId");

    //inherited
    public final NumberPath<Long> updateBy = _super.updateBy;

    //inherited
    public final DateTimePath<java.util.Date> updateTime = _super.updateTime;

    public final NumberPath<Long> userId = createNumber("userId", Long.class);

    public QTbHome(String variable) {
        super(TbHome.class, forVariable(variable));
    }

    public QTbHome(Path<? extends TbHome> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTbHome(PathMetadata metadata) {
        super(TbHome.class, metadata);
    }

}

