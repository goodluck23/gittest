package cc.iotkit.data.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QTbAlertRecord is a Querydsl query type for TbAlertRecord
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QTbAlertRecord extends EntityPathBase<TbAlertRecord> {

    private static final long serialVersionUID = 774638766L;

    public static final QTbAlertRecord tbAlertRecord = new QTbAlertRecord("tbAlertRecord");

    public final NumberPath<Long> alertTime = createNumber("alertTime", Long.class);

    public final StringPath details = createString("details");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath level = createString("level");

    public final StringPath name = createString("name");

    public final BooleanPath readFlg = createBoolean("readFlg");

    public final StringPath uid = createString("uid");

    public QTbAlertRecord(String variable) {
        super(TbAlertRecord.class, forVariable(variable));
    }

    public QTbAlertRecord(Path<? extends TbAlertRecord> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTbAlertRecord(PathMetadata metadata) {
        super(TbAlertRecord.class, metadata);
    }

}

