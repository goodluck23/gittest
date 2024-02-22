package cc.iotkit.data.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QTbSysOperLog is a Querydsl query type for TbSysOperLog
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QTbSysOperLog extends EntityPathBase<TbSysOperLog> {

    private static final long serialVersionUID = -1626070392L;

    public static final QTbSysOperLog tbSysOperLog = new QTbSysOperLog("tbSysOperLog");

    public final NumberPath<Integer> businessType = createNumber("businessType", Integer.class);

    public final NumberPath<Long> costTime = createNumber("costTime", Long.class);

    public final StringPath deptName = createString("deptName");

    public final StringPath errorMsg = createString("errorMsg");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath jsonResult = createString("jsonResult");

    public final StringPath method = createString("method");

    public final NumberPath<Integer> operatorType = createNumber("operatorType", Integer.class);

    public final StringPath operIp = createString("operIp");

    public final StringPath operLocation = createString("operLocation");

    public final StringPath operName = createString("operName");

    public final StringPath operParam = createString("operParam");

    public final DateTimePath<java.util.Date> operTime = createDateTime("operTime", java.util.Date.class);

    public final StringPath operUrl = createString("operUrl");

    public final StringPath requestMethod = createString("requestMethod");

    public final NumberPath<Integer> status = createNumber("status", Integer.class);

    public final StringPath tenantId = createString("tenantId");

    public final StringPath title = createString("title");

    public QTbSysOperLog(String variable) {
        super(TbSysOperLog.class, forVariable(variable));
    }

    public QTbSysOperLog(Path<? extends TbSysOperLog> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTbSysOperLog(PathMetadata metadata) {
        super(TbSysOperLog.class, metadata);
    }

}

