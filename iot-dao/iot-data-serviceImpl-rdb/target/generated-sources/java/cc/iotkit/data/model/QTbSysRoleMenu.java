package cc.iotkit.data.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QTbSysRoleMenu is a Querydsl query type for TbSysRoleMenu
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QTbSysRoleMenu extends EntityPathBase<TbSysRoleMenu> {

    private static final long serialVersionUID = 1365804227L;

    public static final QTbSysRoleMenu tbSysRoleMenu = new QTbSysRoleMenu("tbSysRoleMenu");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Long> menuId = createNumber("menuId", Long.class);

    public final NumberPath<Long> roleId = createNumber("roleId", Long.class);

    public QTbSysRoleMenu(String variable) {
        super(TbSysRoleMenu.class, forVariable(variable));
    }

    public QTbSysRoleMenu(Path<? extends TbSysRoleMenu> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTbSysRoleMenu(PathMetadata metadata) {
        super(TbSysRoleMenu.class, metadata);
    }

}

