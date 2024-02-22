package cc.iotkit.data.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QTbScreen is a Querydsl query type for TbScreen
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QTbScreen extends EntityPathBase<TbScreen> {

    private static final long serialVersionUID = 503511019L;

    public static final QTbScreen tbScreen = new QTbScreen("tbScreen");

    public final NumberPath<Long> createAt = createNumber("createAt", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final BooleanPath isDefault = createBoolean("isDefault");

    public final StringPath name = createString("name");

    public final NumberPath<Integer> port = createNumber("port", Integer.class);

    public final StringPath resourceFile = createString("resourceFile");

    public final StringPath state = createString("state");

    public QTbScreen(String variable) {
        super(TbScreen.class, forVariable(variable));
    }

    public QTbScreen(Path<? extends TbScreen> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTbScreen(PathMetadata metadata) {
        super(TbScreen.class, metadata);
    }

}

