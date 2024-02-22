package cc.iotkit.data.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QTbSysMenu is a Querydsl query type for TbSysMenu
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QTbSysMenu extends EntityPathBase<TbSysMenu> {

    private static final long serialVersionUID = -940977619L;

    public static final QTbSysMenu tbSysMenu = new QTbSysMenu("tbSysMenu");

    public final QBaseEntity _super = new QBaseEntity(this);

    public final StringPath component = createString("component");

    //inherited
    public final NumberPath<Long> createBy = _super.createBy;

    //inherited
    public final NumberPath<Long> createDept = _super.createDept;

    //inherited
    public final DateTimePath<java.util.Date> createTime = _super.createTime;

    public final StringPath icon = createString("icon");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath isCache = createString("isCache");

    public final StringPath isFrame = createString("isFrame");

    public final StringPath menuName = createString("menuName");

    public final StringPath menuType = createString("menuType");

    public final NumberPath<Integer> orderNum = createNumber("orderNum", Integer.class);

    public final NumberPath<Long> parentId = createNumber("parentId", Long.class);

    public final StringPath path = createString("path");

    public final StringPath perms = createString("perms");

    public final StringPath queryParam = createString("queryParam");

    public final StringPath remark = createString("remark");

    public final StringPath status = createString("status");

    //inherited
    public final NumberPath<Long> updateBy = _super.updateBy;

    //inherited
    public final DateTimePath<java.util.Date> updateTime = _super.updateTime;

    public final StringPath visible = createString("visible");

    public QTbSysMenu(String variable) {
        super(TbSysMenu.class, forVariable(variable));
    }

    public QTbSysMenu(Path<? extends TbSysMenu> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTbSysMenu(PathMetadata metadata) {
        super(TbSysMenu.class, metadata);
    }

}

