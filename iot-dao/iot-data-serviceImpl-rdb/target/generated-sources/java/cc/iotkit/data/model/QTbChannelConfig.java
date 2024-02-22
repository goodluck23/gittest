package cc.iotkit.data.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QTbChannelConfig is a Querydsl query type for TbChannelConfig
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QTbChannelConfig extends EntityPathBase<TbChannelConfig> {

    private static final long serialVersionUID = 1689061830L;

    public static final QTbChannelConfig tbChannelConfig = new QTbChannelConfig("tbChannelConfig");

    public final NumberPath<Long> channelId = createNumber("channelId", Long.class);

    public final NumberPath<Long> createAt = createNumber("createAt", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath param = createString("param");

    public final StringPath title = createString("title");

    public QTbChannelConfig(String variable) {
        super(TbChannelConfig.class, forVariable(variable));
    }

    public QTbChannelConfig(Path<? extends TbChannelConfig> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTbChannelConfig(PathMetadata metadata) {
        super(TbChannelConfig.class, metadata);
    }

}

