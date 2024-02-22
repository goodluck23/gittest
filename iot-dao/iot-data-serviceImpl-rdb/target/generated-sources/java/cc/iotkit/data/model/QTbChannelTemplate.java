package cc.iotkit.data.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QTbChannelTemplate is a Querydsl query type for TbChannelTemplate
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QTbChannelTemplate extends EntityPathBase<TbChannelTemplate> {

    private static final long serialVersionUID = -1050623490L;

    public static final QTbChannelTemplate tbChannelTemplate = new QTbChannelTemplate("tbChannelTemplate");

    public final NumberPath<Long> channelConfigId = createNumber("channelConfigId", Long.class);

    public final StringPath content = createString("content");

    public final NumberPath<Long> createAt = createNumber("createAt", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath title = createString("title");

    public QTbChannelTemplate(String variable) {
        super(TbChannelTemplate.class, forVariable(variable));
    }

    public QTbChannelTemplate(Path<? extends TbChannelTemplate> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTbChannelTemplate(PathMetadata metadata) {
        super(TbChannelTemplate.class, metadata);
    }

}

