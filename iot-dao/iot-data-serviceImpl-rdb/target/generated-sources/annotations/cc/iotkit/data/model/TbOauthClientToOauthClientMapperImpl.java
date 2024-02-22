package cc.iotkit.data.model;

import cc.iotkit.model.OauthClient;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-28T21:10:21+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.19 (Oracle Corporation)"
)
@Component
public class TbOauthClientToOauthClientMapperImpl implements TbOauthClientToOauthClientMapper {

    @Override
    public OauthClient convert(TbOauthClient arg0) {
        if ( arg0 == null ) {
            return null;
        }

        OauthClient oauthClient = new OauthClient();

        oauthClient.setId( arg0.getId() );
        oauthClient.setClientId( arg0.getClientId() );
        oauthClient.setName( arg0.getName() );
        oauthClient.setClientSecret( arg0.getClientSecret() );
        oauthClient.setAllowUrl( arg0.getAllowUrl() );
        oauthClient.setCreateAt( arg0.getCreateAt() );

        return oauthClient;
    }

    @Override
    public OauthClient convert(TbOauthClient arg0, OauthClient arg1) {
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
