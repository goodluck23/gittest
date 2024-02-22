package cc.iotkit.data.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QTbSysUserPost is a Querydsl query type for TbSysUserPost
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QTbSysUserPost extends EntityPathBase<TbSysUserPost> {

    private static final long serialVersionUID = 1366016217L;

    public static final QTbSysUserPost tbSysUserPost = new QTbSysUserPost("tbSysUserPost");

    public final QBaseEntity _super = new QBaseEntity(this);

    //inherited
    public final NumberPath<Long> createBy = _super.createBy;

    //inherited
    public final NumberPath<Long> createDept = _super.createDept;

    //inherited
    public final DateTimePath<java.util.Date> createTime = _super.createTime;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> postId = createNumber("postId", Long.class);

    //inherited
    public final NumberPath<Long> updateBy = _super.updateBy;

    //inherited
    public final DateTimePath<java.util.Date> updateTime = _super.updateTime;

    public final NumberPath<Long> userId = createNumber("userId", Long.class);

    public QTbSysUserPost(String variable) {
        super(TbSysUserPost.class, forVariable(variable));
    }

    public QTbSysUserPost(Path<? extends TbSysUserPost> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTbSysUserPost(PathMetadata metadata) {
        super(TbSysUserPost.class, metadata);
    }

}

