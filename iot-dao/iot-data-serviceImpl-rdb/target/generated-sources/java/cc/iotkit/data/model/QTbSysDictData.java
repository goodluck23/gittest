package cc.iotkit.data.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QTbSysDictData is a Querydsl query type for TbSysDictData
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QTbSysDictData extends EntityPathBase<TbSysDictData> {

    private static final long serialVersionUID = 1462127182L;

    public static final QTbSysDictData tbSysDictData = new QTbSysDictData("tbSysDictData");

    public final QBaseEntity _super = new QBaseEntity(this);

    //inherited
    public final NumberPath<Long> createBy = _super.createBy;

    //inherited
    public final NumberPath<Long> createDept = _super.createDept;

    //inherited
    public final DateTimePath<java.util.Date> createTime = _super.createTime;

    public final StringPath cssClass = createString("cssClass");

    public final StringPath dictLabel = createString("dictLabel");

    public final NumberPath<Integer> dictSort = createNumber("dictSort", Integer.class);

    public final StringPath dictType = createString("dictType");

    public final StringPath dictValue = createString("dictValue");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath isDefault = createString("isDefault");

    public final StringPath listClass = createString("listClass");

    public final StringPath remark = createString("remark");

    public final StringPath status = createString("status");

    public final StringPath tenantId = createString("tenantId");

    //inherited
    public final NumberPath<Long> updateBy = _super.updateBy;

    //inherited
    public final DateTimePath<java.util.Date> updateTime = _super.updateTime;

    public QTbSysDictData(String variable) {
        super(TbSysDictData.class, forVariable(variable));
    }

    public QTbSysDictData(Path<? extends TbSysDictData> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTbSysDictData(PathMetadata metadata) {
        super(TbSysDictData.class, metadata);
    }

}

