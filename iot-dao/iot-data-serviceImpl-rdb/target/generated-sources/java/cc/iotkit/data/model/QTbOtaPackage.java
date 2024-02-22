package cc.iotkit.data.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QTbOtaPackage is a Querydsl query type for TbOtaPackage
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QTbOtaPackage extends EntityPathBase<TbOtaPackage> {

    private static final long serialVersionUID = -1242462839L;

    public static final QTbOtaPackage tbOtaPackage = new QTbOtaPackage("tbOtaPackage");

    public final NumberPath<Long> createAt = createNumber("createAt", Long.class);

    public final StringPath desc = createString("desc");

    public final StringPath extData = createString("extData");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final BooleanPath isDiff = createBoolean("isDiff");

    public final StringPath md5 = createString("md5");

    public final StringPath module = createString("module");

    public final StringPath name = createString("name");

    public final StringPath productKey = createString("productKey");

    public final StringPath sign = createString("sign");

    public final StringPath signMethod = createString("signMethod");

    public final NumberPath<Long> size = createNumber("size", Long.class);

    public final StringPath url = createString("url");

    public final StringPath version = createString("version");

    public QTbOtaPackage(String variable) {
        super(TbOtaPackage.class, forVariable(variable));
    }

    public QTbOtaPackage(Path<? extends TbOtaPackage> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTbOtaPackage(PathMetadata metadata) {
        super(TbOtaPackage.class, metadata);
    }

}

