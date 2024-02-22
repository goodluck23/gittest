package cc.iotkit.data.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QTbSysTenantPackage is a Querydsl query type for TbSysTenantPackage
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QTbSysTenantPackage extends EntityPathBase<TbSysTenantPackage> {

    private static final long serialVersionUID = -1471055058L;

    public static final QTbSysTenantPackage tbSysTenantPackage = new QTbSysTenantPackage("tbSysTenantPackage");

    public final QBaseEntity _super = new QBaseEntity(this);

    //inherited
    public final NumberPath<Long> createBy = _super.createBy;

    //inherited
    public final NumberPath<Long> createDept = _super.createDept;

    //inherited
    public final DateTimePath<java.util.Date> createTime = _super.createTime;

    public final StringPath delFlag = createString("delFlag");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final BooleanPath menuCheckStrictly = createBoolean("menuCheckStrictly");

    public final StringPath menuIds = createString("menuIds");

    public final StringPath packageName = createString("packageName");

    public final StringPath remark = createString("remark");

    public final StringPath status = createString("status");

    //inherited
    public final NumberPath<Long> updateBy = _super.updateBy;

    //inherited
    public final DateTimePath<java.util.Date> updateTime = _super.updateTime;

    public QTbSysTenantPackage(String variable) {
        super(TbSysTenantPackage.class, forVariable(variable));
    }

    public QTbSysTenantPackage(Path<? extends TbSysTenantPackage> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTbSysTenantPackage(PathMetadata metadata) {
        super(TbSysTenantPackage.class, metadata);
    }

}

