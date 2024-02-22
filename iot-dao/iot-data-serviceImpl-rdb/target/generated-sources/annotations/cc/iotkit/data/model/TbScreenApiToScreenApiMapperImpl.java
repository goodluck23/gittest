package cc.iotkit.data.model;

import cc.iotkit.model.screen.ScreenApi;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-28T21:10:19+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.19 (Oracle Corporation)"
)
@Component
public class TbScreenApiToScreenApiMapperImpl implements TbScreenApiToScreenApiMapper {

    @Override
    public ScreenApi convert(TbScreenApi arg0) {
        if ( arg0 == null ) {
            return null;
        }

        ScreenApi screenApi = new ScreenApi();

        screenApi.setId( arg0.getId() );
        screenApi.setScreenId( arg0.getScreenId() );
        screenApi.setApiPath( arg0.getApiPath() );
        screenApi.setApiParams( arg0.getApiParams() );
        screenApi.setHttpMethod( arg0.getHttpMethod() );
        screenApi.setDataSource( arg0.getDataSource() );
        screenApi.setCreateAt( arg0.getCreateAt() );
        screenApi.setScript( arg0.getScript() );

        return screenApi;
    }

    @Override
    public ScreenApi convert(TbScreenApi arg0, ScreenApi arg1) {
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
