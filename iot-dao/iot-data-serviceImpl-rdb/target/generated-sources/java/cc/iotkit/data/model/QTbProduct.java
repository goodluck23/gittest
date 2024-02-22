package cc.iotkit.data.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QTbProduct is a Querydsl query type for TbProduct
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QTbProduct extends EntityPathBase<TbProduct> {

    private static final long serialVersionUID = 488080720L;

    public static final QTbProduct tbProduct = new QTbProduct("tbProduct");

    public final StringPath category = createString("category");

    public final NumberPath<Long> createAt = createNumber("createAt", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath img = createString("img");

    public final BooleanPath isOpenLocate = createBoolean("isOpenLocate");

    public final StringPath locateUpdateType = createString("locateUpdateType");

    public final StringPath name = createString("name");

    public final NumberPath<Integer> nodeType = createNumber("nodeType", Integer.class);

    public final StringPath productKey = createString("productKey");

    public final StringPath productSecret = createString("productSecret");

    public final StringPath tenantId = createString("tenantId");

    public final BooleanPath transparent = createBoolean("transparent");

    public final StringPath uid = createString("uid");

    public QTbProduct(String variable) {
        super(TbProduct.class, forVariable(variable));
    }

    public QTbProduct(Path<? extends TbProduct> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTbProduct(PathMetadata metadata) {
        super(TbProduct.class, metadata);
    }

}

