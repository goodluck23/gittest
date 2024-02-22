package cc.iotkit.data.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QTbNotifyMessage is a Querydsl query type for TbNotifyMessage
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QTbNotifyMessage extends EntityPathBase<TbNotifyMessage> {

    private static final long serialVersionUID = 1871058975L;

    public static final QTbNotifyMessage tbNotifyMessage = new QTbNotifyMessage("tbNotifyMessage");

    public final StringPath content = createString("content");

    public final NumberPath<Long> createAt = createNumber("createAt", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath messageType = createString("messageType");

    public final BooleanPath status = createBoolean("status");

    public final NumberPath<Long> updateAt = createNumber("updateAt", Long.class);

    public QTbNotifyMessage(String variable) {
        super(TbNotifyMessage.class, forVariable(variable));
    }

    public QTbNotifyMessage(Path<? extends TbNotifyMessage> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTbNotifyMessage(PathMetadata metadata) {
        super(TbNotifyMessage.class, metadata);
    }

}

