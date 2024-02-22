package cc.iotkit.data.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QTbSysUserRole is a Querydsl query type for TbSysUserRole
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QTbSysUserRole extends EntityPathBase<TbSysUserRole> {

    private static final long serialVersionUID = 1366075567L;

    public static final QTbSysUserRole tbSysUserRole = new QTbSysUserRole("tbSysUserRole");

    public final QBaseEntity _super = new QBaseEntity(this);

    //inherited
    public final NumberPath<Long> createBy = _super.createBy;

    //inherited
    public final NumberPath<Long> createDept = _super.createDept;

    //inherited
    public final DateTimePath<java.util.Date> createTime = _super.createTime;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> roleId = createNumber("roleId", Long.class);

    //inherited
    public final NumberPath<Long> updateBy = _super.updateBy;

    //inherited
    public final DateTimePath<java.util.Date> updateTime = _super.updateTime;

    public final NumberPath<Long> userId = createNumber("userId", Long.class);

    public QTbSysUserRole(String variable) {
        super(TbSysUserRole.class, forVariable(variable));
    }

    public QTbSysUserRole(Path<? extends TbSysUserRole> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTbSysUserRole(PathMetadata metadata) {
        super(TbSysUserRole.class, metadata);
    }

}

