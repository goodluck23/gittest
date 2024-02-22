package cc.iotkit.data.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QTbCategory is a Querydsl query type for TbCategory
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QTbCategory extends EntityPathBase<TbCategory> {

    private static final long serialVersionUID = -995094339L;

    public static final QTbCategory tbCategory = new QTbCategory("tbCategory");

    public final NumberPath<Long> createAt = createNumber("createAt", Long.class);

    public final StringPath id = createString("id");

    public final StringPath name = createString("name");

    public QTbCategory(String variable) {
        super(TbCategory.class, forVariable(variable));
    }

    public QTbCategory(Path<? extends TbCategory> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTbCategory(PathMetadata metadata) {
        super(TbCategory.class, metadata);
    }

}

