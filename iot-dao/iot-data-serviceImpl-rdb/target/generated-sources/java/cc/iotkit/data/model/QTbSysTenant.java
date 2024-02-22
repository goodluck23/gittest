package cc.iotkit.data.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QTbSysTenant is a Querydsl query type for TbSysTenant
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QTbSysTenant extends EntityPathBase<TbSysTenant> {

    private static final long serialVersionUID = -2135971336L;

    public static final QTbSysTenant tbSysTenant = new QTbSysTenant("tbSysTenant");

    public final QBaseEntity _super = new QBaseEntity(this);

    public final NumberPath<Long> accountCount = createNumber("accountCount", Long.class);

    public final StringPath address = createString("address");

    public final StringPath companyName = createString("companyName");

    public final StringPath contactPhone = createString("contactPhone");

    public final StringPath contactUserName = createString("contactUserName");

    //inherited
    public final NumberPath<Long> createBy = _super.createBy;

    //inherited
    public final NumberPath<Long> createDept = _super.createDept;

    //inherited
    public final DateTimePath<java.util.Date> createTime = _super.createTime;

    public final StringPath delFlag = createString("delFlag");

    public final StringPath domain = createString("domain");

    public final DateTimePath<java.util.Date> expireTime = createDateTime("expireTime", java.util.Date.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath intro = createString("intro");

    public final StringPath licenseNumber = createString("licenseNumber");

    public final NumberPath<Long> packageId = createNumber("packageId", Long.class);

    public final StringPath remark = createString("remark");

    public final StringPath status = createString("status");

    public final StringPath tenantId = createString("tenantId");

    //inherited
    public final NumberPath<Long> updateBy = _super.updateBy;

    //inherited
    public final DateTimePath<java.util.Date> updateTime = _super.updateTime;

    public QTbSysTenant(String variable) {
        super(TbSysTenant.class, forVariable(variable));
    }

    public QTbSysTenant(Path<? extends TbSysTenant> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTbSysTenant(PathMetadata metadata) {
        super(TbSysTenant.class, metadata);
    }

}

