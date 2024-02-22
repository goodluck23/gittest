package cc.iotkit.data.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QTbChannel is a Querydsl query type for TbChannel
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QTbChannel extends EntityPathBase<TbChannel> {

    private static final long serialVersionUID = 1536505188L;

    public static final QTbChannel tbChannel = new QTbChannel("tbChannel");

    public final StringPath code = createString("code");

    public final NumberPath<Long> createAt = createNumber("createAt", Long.class);

    public final StringPath icon = createString("icon");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath title = createString("title");

    public QTbChannel(String variable) {
        super(TbChannel.class, forVariable(variable));
    }

    public QTbChannel(Path<? extends TbChannel> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTbChannel(PathMetadata metadata) {
        super(TbChannel.class, metadata);
    }

}

