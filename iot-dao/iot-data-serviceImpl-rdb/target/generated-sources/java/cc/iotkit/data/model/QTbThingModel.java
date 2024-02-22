package cc.iotkit.data.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QTbThingModel is a Querydsl query type for TbThingModel
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QTbThingModel extends EntityPathBase<TbThingModel> {

    private static final long serialVersionUID = 54053594L;

    public static final QTbThingModel tbThingModel = new QTbThingModel("tbThingModel");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath model = createString("model");

    public final StringPath productKey = createString("productKey");

    public QTbThingModel(String variable) {
        super(TbThingModel.class, forVariable(variable));
    }

    public QTbThingModel(Path<? extends TbThingModel> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTbThingModel(PathMetadata metadata) {
        super(TbThingModel.class, metadata);
    }

}

