package cc.iotkit.data.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QTbSysRole is a Querydsl query type for TbSysRole
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QTbSysRole extends EntityPathBase<TbSysRole> {

    private static final long serialVersionUID = -940819132L;

    public static final QTbSysRole tbSysRole = new QTbSysRole("tbSysRole");

    public final QBaseEntity _super = new QBaseEntity(this);

    //inherited
    public final NumberPath<Long> createBy = _super.createBy;

    //inherited
    public final NumberPath<Long> createDept = _super.createDept;

    //inherited
    public final DateTimePath<java.util.Date> createTime = _super.createTime;

    public final StringPath dataScope = createString("dataScope");

    public final StringPath delFlag = createString("delFlag");

    public final BooleanPath deptCheckStrictly = createBoolean("deptCheckStrictly");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final BooleanPath menuCheckStrictly = createBoolean("menuCheckStrictly");

    public final StringPath remark = createString("remark");

    public final StringPath roleKey = createString("roleKey");

    public final StringPath roleName = createString("roleName");

    public final NumberPath<Integer> roleSort = createNumber("roleSort", Integer.class);

    public final StringPath status = createString("status");

    public final StringPath tenantId = createString("tenantId");

    //inherited
    public final NumberPath<Long> updateBy = _super.updateBy;

    //inherited
    public final DateTimePath<java.util.Date> updateTime = _super.updateTime;

    public QTbSysRole(String variable) {
        super(TbSysRole.class, forVariable(variable));
    }

    public QTbSysRole(Path<? extends TbSysRole> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTbSysRole(PathMetadata metadata) {
        super(TbSysRole.class, metadata);
    }

}

