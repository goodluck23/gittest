package cc.iotkit.data.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QTbSysRoleDept is a Querydsl query type for TbSysRoleDept
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QTbSysRoleDept extends EntityPathBase<TbSysRoleDept> {

    private static final long serialVersionUID = 1365536169L;

    public static final QTbSysRoleDept tbSysRoleDept = new QTbSysRoleDept("tbSysRoleDept");

    public final NumberPath<Long> deptId = createNumber("deptId", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> roleId = createNumber("roleId", Long.class);

    public QTbSysRoleDept(String variable) {
        super(TbSysRoleDept.class, forVariable(variable));
    }

    public QTbSysRoleDept(Path<? extends TbSysRoleDept> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTbSysRoleDept(PathMetadata metadata) {
        super(TbSysRoleDept.class, metadata);
    }

}

