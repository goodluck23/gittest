package cc.iotkit.data.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QTbTaskInfo is a Querydsl query type for TbTaskInfo
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QTbTaskInfo extends EntityPathBase<TbTaskInfo> {

    private static final long serialVersionUID = -1456072814L;

    public static final QTbTaskInfo tbTaskInfo = new QTbTaskInfo("tbTaskInfo");

    public final StringPath actions = createString("actions");

    public final NumberPath<Long> createAt = createNumber("createAt", Long.class);

    public final StringPath desc = createString("desc");

    public final StringPath expression = createString("expression");

    public final StringPath id = createString("id");

    public final StringPath name = createString("name");

    public final StringPath reason = createString("reason");

    public final StringPath state = createString("state");

    public final StringPath type = createString("type");

    public final StringPath uid = createString("uid");

    public QTbTaskInfo(String variable) {
        super(TbTaskInfo.class, forVariable(variable));
    }

    public QTbTaskInfo(Path<? extends TbTaskInfo> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTbTaskInfo(PathMetadata metadata) {
        super(TbTaskInfo.class, metadata);
    }

}

