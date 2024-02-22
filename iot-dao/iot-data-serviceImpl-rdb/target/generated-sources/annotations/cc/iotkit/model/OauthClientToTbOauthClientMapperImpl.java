package cc.iotkit.model;

import cc.iotkit.data.model.TbOauthClient;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-28T21:10:20+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.19 (Oracle Corporation)"
)
@Component
public class OauthClientToTbOauthClientMapperImpl implements OauthClientToTbOauthClientMapper {

    @Override
    public TbOauthClient convert(OauthClient arg0) {
        if ( arg0 == null ) {
            return null;
        }

        TbOauthClient tbOauthClient = new TbOauthClient();

        tbOauthClient.setId( arg0.getId() );
        tbOauthClient.setClientId( arg0.getClientId() );
        tbOauthClient.setName( arg0.getName() );
        tbOauthClient.setClientSecret( arg0.getClientSecret() );
        tbOauthClient.setAllowUrl( arg0.getAllowUrl() );
        tbOauthClient.setCreateAt( arg0.getCreateAt() );

        return tbOauthClient;
    }

    @Override
    public TbOauthClient convert(OauthClient arg0, TbOauthClient arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setId( arg0.getId() );
        arg1.setClientId( arg0.getClientId() );
        arg1.setName( arg0.getName() );
        arg1.setClientSecret( arg0.getClientSecret() );
        arg1.setAllowUrl( arg0.getAllowUrl() );
        arg1.setCreateAt( arg0.getCreateAt() );

        return arg1;
    }
}
