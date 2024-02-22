package cc.iotkit.data.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QTbPluginInfo is a Querydsl query type for TbPluginInfo
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QTbPluginInfo extends EntityPathBase<TbPluginInfo> {

    private static final long serialVersionUID = -191834496L;

    public static final QTbPluginInfo tbPluginInfo = new QTbPluginInfo("tbPluginInfo");

    public final QBaseEntity _super = new QBaseEntity(this);

    public final StringPath config = createString("config");

    public final StringPath configSchema = createString("configSchema");

    //inherited
    public final NumberPath<Long> createBy = _super.createBy;

    //inherited
    public final NumberPath<Long> createDept = _super.createDept;

    //inherited
    public final DateTimePath<java.util.Date> createTime = _super.createTime;

    public final StringPath deployType = createString("deployType");

    public final StringPath description = createString("description");

    public final StringPath file = createString("file");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public final StringPath pluginId = createString("pluginId");

    public final StringPath protocol = createString("protocol");

    public final StringPath script = createString("script");

    public final StringPath state = createString("state");

    public final StringPath tenantId = createString("tenantId");

    public final StringPath type = createString("type");

    //inherited
    public final NumberPath<Long> updateBy = _super.updateBy;

    //inherited
    public final DateTimePath<java.util.Date> updateTime = _super.updateTime;

    public final StringPath version = createString("version");

    public QTbPluginInfo(String variable) {
        super(TbPluginInfo.class, forVariable(variable));
    }

    public QTbPluginInfo(Path<? extends TbPluginInfo> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTbPluginInfo(PathMetadata metadata) {
        super(TbPluginInfo.class, metadata);
    }

}

