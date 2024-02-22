package cc.iotkit.data.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QTbSysDept is a Querydsl query type for TbSysDept
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QTbSysDept extends EntityPathBase<TbSysDept> {

    private static final long serialVersionUID = -941245677L;

    public static final QTbSysDept tbSysDept = new QTbSysDept("tbSysDept");

    public final QBaseEntity _super = new QBaseEntity(this);

    public final StringPath ancestors = createString("ancestors");

    //inherited
    public final NumberPath<Long> createBy = _super.createBy;

    //inherited
    public final NumberPath<Long> createDept = _super.createDept;

    //inherited
    public final DateTimePath<java.util.Date> createTime = _super.createTime;

    public final StringPath delFlag = createString("delFlag");

    public final StringPath deptName = createString("deptName");

    public final StringPath email = createString("email");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath leader = createString("leader");

    public final NumberPath<Integer> orderNum = createNumber("orderNum", Integer.class);

    public final NumberPath<Long> parentId = createNumber("parentId", Long.class);

    public final StringPath phone = createString("phone");

    public final StringPath status = createString("status");

    public final StringPath tenantId = createString("tenantId");

    //inherited
    public final NumberPath<Long> updateBy = _super.updateBy;

    //inherited
    public final DateTimePath<java.util.Date> updateTime = _super.updateTime;

    public QTbSysDept(String variable) {
        super(TbSysDept.class, forVariable(variable));
    }

    public QTbSysDept(Path<? extends TbSysDept> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTbSysDept(PathMetadata metadata) {
        super(TbSysDept.class, metadata);
    }

}

