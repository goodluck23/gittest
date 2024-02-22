package cc.iotkit.data.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QTbSysNotice is a Querydsl query type for TbSysNotice
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QTbSysNotice extends EntityPathBase<TbSysNotice> {

    private static final long serialVersionUID = 1996642342L;

    public static final QTbSysNotice tbSysNotice = new QTbSysNotice("tbSysNotice");

    public final QBaseEntity _super = new QBaseEntity(this);

    //inherited
    public final NumberPath<Long> createBy = _super.createBy;

    //inherited
    public final NumberPath<Long> createDept = _super.createDept;

    //inherited
    public final DateTimePath<java.util.Date> createTime = _super.createTime;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath noticeContent = createString("noticeContent");

    public final StringPath noticeTitle = createString("noticeTitle");

    public final StringPath noticeType = createString("noticeType");

    public final StringPath remark = createString("remark");

    public final StringPath status = createString("status");

    public final StringPath tenantId = createString("tenantId");

    //inherited
    public final NumberPath<Long> updateBy = _super.updateBy;

    //inherited
    public final DateTimePath<java.util.Date> updateTime = _super.updateTime;

    public QTbSysNotice(String variable) {
        super(TbSysNotice.class, forVariable(variable));
    }

    public QTbSysNotice(Path<? extends TbSysNotice> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTbSysNotice(PathMetadata metadata) {
        super(TbSysNotice.class, metadata);
    }

}

