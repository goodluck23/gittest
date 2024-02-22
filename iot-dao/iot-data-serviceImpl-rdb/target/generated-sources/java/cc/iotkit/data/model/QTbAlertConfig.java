package cc.iotkit.data.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QTbAlertConfig is a Querydsl query type for TbAlertConfig
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QTbAlertConfig extends EntityPathBase<TbAlertConfig> {

    private static final long serialVersionUID = 354755487L;

    public static final QTbAlertConfig tbAlertConfig = new QTbAlertConfig("tbAlertConfig");

    public final NumberPath<Long> createAt = createNumber("createAt", Long.class);

    public final StringPath description = createString("description");

    public final BooleanPath enable = createBoolean("enable");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath level = createString("level");

    public final StringPath messageTemplateId = createString("messageTemplateId");

    public final StringPath name = createString("name");

    public final StringPath ruleInfoId = createString("ruleInfoId");

    public final StringPath uid = createString("uid");

    public QTbAlertConfig(String variable) {
        super(TbAlertConfig.class, forVariable(variable));
    }

    public QTbAlertConfig(Path<? extends TbAlertConfig> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTbAlertConfig(PathMetadata metadata) {
        super(TbAlertConfig.class, metadata);
    }

}

