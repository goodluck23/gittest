package cc.iotkit.model.screen;

import cc.iotkit.data.model.TbScreenApi;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-28T21:10:20+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.19 (Oracle Corporation)"
)
@Component
public class ScreenApiToTbScreenApiMapperImpl implements ScreenApiToTbScreenApiMapper {

    @Override
    public TbScreenApi convert(ScreenApi arg0) {
        if ( arg0 == null ) {
            return null;
        }

        TbScreenApi tbScreenApi = new TbScreenApi();

        tbScreenApi.setId( arg0.getId() );
        tbScreenApi.setScreenId( arg0.getScreenId() );
        tbScreenApi.setApiPath( arg0.getApiPath() );
        tbScreenApi.setApiParams( arg0.getApiParams() );
        tbScreenApi.setHttpMethod( arg0.getHttpMethod() );
        tbScreenApi.setDataSource( arg0.getDataSource() );
        tbScreenApi.setCreateAt( arg0.getCreateAt() );
        tbScreenApi.setScript( arg0.getScript() );

        return tbScreenApi;
    }

    @Override
    public TbScreenApi convert(ScreenApi arg0, TbScreenApi arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setId( arg0.getId() );
        arg1.setScreenId( arg0.getScreenId() );
        arg1.setApiPath( arg0.getApiPath() );
        arg1.setApiParams( arg0.getApiParams() );
        arg1.setHttpMethod( arg0.getHttpMethod() );
        arg1.setDataSource( arg0.getDataSource() );
        arg1.setCreateAt( arg0.getCreateAt() );
        arg1.setScript( arg0.getScript() );

        return arg1;
    }
}
