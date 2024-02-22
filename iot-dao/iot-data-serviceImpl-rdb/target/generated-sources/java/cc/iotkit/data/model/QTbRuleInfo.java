package cc.iotkit.data.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QTbRuleInfo is a Querydsl query type for TbRuleInfo
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QTbRuleInfo extends EntityPathBase<TbRuleInfo> {

    private static final long serialVersionUID = -282466935L;

    public static final QTbRuleInfo tbRuleInfo = new QTbRuleInfo("tbRuleInfo");

    public final StringPath actions = createString("actions");

    public final NumberPath<Long> createAt = createNumber("createAt", Long.class);

    public final StringPath desc = createString("desc");

    public final StringPath filters = createString("filters");

    public final StringPath id = createString("id");

    public final StringPath listeners = createString("listeners");

    public final StringPath name = createString("name");

    public final StringPath state = createString("state");

    public final StringPath type = createString("type");

    public final StringPath uid = createString("uid");

    public QTbRuleInfo(String variable) {
        super(TbRuleInfo.class, forVariable(variable));
    }

    public QTbRuleInfo(Path<? extends TbRuleInfo> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTbRuleInfo(PathMetadata metadata) {
        super(TbRuleInfo.class, metadata);
    }

}

