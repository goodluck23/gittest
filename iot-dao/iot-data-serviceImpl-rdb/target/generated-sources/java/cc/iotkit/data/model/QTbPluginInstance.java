package cc.iotkit.data.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QTbPluginInstance is a Querydsl query type for TbPluginInstance
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QTbPluginInstance extends EntityPathBase<TbPluginInstance> {

    private static final long serialVersionUID = 300207463L;

    public static final QTbPluginInstance tbPluginInstance = new QTbPluginInstance("tbPluginInstance");

    public final QBaseEntity _super = new QBaseEntity(this);

    //inherited
    public final NumberPath<Long> createBy = _super.createBy;

    //inherited
    public final NumberPath<Long> createDept = _super.createDept;

    //inherited
    public final DateTimePath<java.util.Date> createTime = _super.createTime;

    public final NumberPath<Long> heartbeatAt = createNumber("heartbeatAt", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath ip = createString("ip");

    public final StringPath mainId = createString("mainId");

    public final NumberPath<Long> pluginId = createNumber("pluginId", Long.class);

    public final NumberPath<Integer> port = createNumber("port", Integer.class);

    //inherited
    public final NumberPath<Long> updateBy = _super.updateBy;

    //inherited
    public final DateTimePath<java.util.Date> updateTime = _super.updateTime;

    public QTbPluginInstance(String variable) {
        super(TbPluginInstance.class, forVariable(variable));
    }

    public QTbPluginInstance(Path<? extends TbPluginInstance> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTbPluginInstance(PathMetadata metadata) {
        super(TbPluginInstance.class, metadata);
    }

}

