package cc.iotkit.data.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QTbVirtualDevice is a Querydsl query type for TbVirtualDevice
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QTbVirtualDevice extends EntityPathBase<TbVirtualDevice> {

    private static final long serialVersionUID = 747020514L;

    public static final QTbVirtualDevice tbVirtualDevice = new QTbVirtualDevice("tbVirtualDevice");

    public final NumberPath<Long> createAt = createNumber("createAt", Long.class);

    public final StringPath id = createString("id");

    public final StringPath name = createString("name");

    public final StringPath productKey = createString("productKey");

    public final StringPath script = createString("script");

    public final StringPath state = createString("state");

    public final StringPath trigger = createString("trigger");

    public final StringPath triggerExpression = createString("triggerExpression");

    public final StringPath type = createString("type");

    public final StringPath uid = createString("uid");

    public QTbVirtualDevice(String variable) {
        super(TbVirtualDevice.class, forVariable(variable));
    }

    public QTbVirtualDevice(Path<? extends TbVirtualDevice> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTbVirtualDevice(PathMetadata metadata) {
        super(TbVirtualDevice.class, metadata);
    }

}

