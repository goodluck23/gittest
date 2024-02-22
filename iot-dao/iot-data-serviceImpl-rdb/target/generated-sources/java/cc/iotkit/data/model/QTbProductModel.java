package cc.iotkit.data.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QTbProductModel is a Querydsl query type for TbProductModel
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QTbProductModel extends EntityPathBase<TbProductModel> {

    private static final long serialVersionUID = -87533639L;

    public static final QTbProductModel tbProductModel = new QTbProductModel("tbProductModel");

    public final StringPath id = createString("id");

    public final StringPath model = createString("model");

    public final NumberPath<Long> modifyAt = createNumber("modifyAt", Long.class);

    public final StringPath name = createString("name");

    public final StringPath productKey = createString("productKey");

    public final StringPath script = createString("script");

    public final StringPath state = createString("state");

    public final StringPath type = createString("type");

    public QTbProductModel(String variable) {
        super(TbProductModel.class, forVariable(variable));
    }

    public QTbProductModel(Path<? extends TbProductModel> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTbProductModel(PathMetadata metadata) {
        super(TbProductModel.class, metadata);
    }

}

