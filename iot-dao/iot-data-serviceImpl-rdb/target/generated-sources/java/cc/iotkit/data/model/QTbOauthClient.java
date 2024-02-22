package cc.iotkit.data.model;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QTbOauthClient is a Querydsl query type for TbOauthClient
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QTbOauthClient extends EntityPathBase<TbOauthClient> {

    private static final long serialVersionUID = 1402011939L;

    public static final QTbOauthClient tbOauthClient = new QTbOauthClient("tbOauthClient");

    public final StringPath allowUrl = createString("allowUrl");

    public final StringPath clientId = createString("clientId");

    public final StringPath clientSecret = createString("clientSecret");

    public final NumberPath<Long> createAt = createNumber("createAt", Long.class);

    public final StringPath id = createString("id");

    public final StringPath name = createString("name");

    public QTbOauthClient(String variable) {
        super(TbOauthClient.class, forVariable(variable));
    }

    public QTbOauthClient(Path<? extends TbOauthClient> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTbOauthClient(PathMetadata metadata) {
        super(TbOauthClient.class, metadata);
    }

}

