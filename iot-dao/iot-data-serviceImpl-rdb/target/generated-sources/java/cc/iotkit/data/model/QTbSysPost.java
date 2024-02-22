package cc.iotkit.data.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QTbSysPost is a Querydsl query type for TbSysPost
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QTbSysPost extends EntityPathBase<TbSysPost> {

    private static final long serialVersionUID = -940878482L;

    public static final QTbSysPost tbSysPost = new QTbSysPost("tbSysPost");

    public final QBaseEntity _super = new QBaseEntity(this);

    //inherited
    public final NumberPath<Long> createBy = _super.createBy;

    //inherited
    public final NumberPath<Long> createDept = _super.createDept;

    //inherited
    public final DateTimePath<java.util.Date> createTime = _super.createTime;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath postCode = createString("postCode");

    public final StringPath postName = createString("postName");

    public final NumberPath<Integer> postSort = createNumber("postSort", Integer.class);

    public final StringPath remark = createString("remark");

    public final StringPath status = createString("status");

    public final StringPath tenantId = createString("tenantId");

    //inherited
    public final NumberPath<Long> updateBy = _super.updateBy;

    //inherited
    public final DateTimePath<java.util.Date> updateTime = _super.updateTime;

    public QTbSysPost(String variable) {
        super(TbSysPost.class, forVariable(variable));
    }

    public QTbSysPost(Path<? extends TbSysPost> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTbSysPost(PathMetadata metadata) {
        super(TbSysPost.class, metadata);
    }

}

