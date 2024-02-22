package cc.iotkit.data.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QTbScreenApi is a Querydsl query type for TbScreenApi
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QTbScreenApi extends EntityPathBase<TbScreenApi> {

    private static final long serialVersionUID = 2071035439L;

    public static final QTbScreenApi tbScreenApi = new QTbScreenApi("tbScreenApi");

    public final StringPath apiParams = createString("apiParams");

    public final StringPath apiPath = createString("apiPath");

    public final NumberPath<Long> createAt = createNumber("createAt", Long.class);

    public final StringPath dataSource = createString("dataSource");

    public final StringPath httpMethod = createString("httpMethod");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> screenId = createNumber("screenId", Long.class);

    public final StringPath script = createString("script");

    public QTbScreenApi(String variable) {
        super(TbScreenApi.class, forVariable(variable));
    }

    public QTbScreenApi(Path<? extends TbScreenApi> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTbScreenApi(PathMetadata metadata) {
        super(TbScreenApi.class, metadata);
    }

}

