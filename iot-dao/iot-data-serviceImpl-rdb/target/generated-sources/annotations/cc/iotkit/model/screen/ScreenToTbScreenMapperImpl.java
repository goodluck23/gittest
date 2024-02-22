package cc.iotkit.model.screen;

import cc.iotkit.data.model.TbScreen;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-28T21:10:18+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.19 (Oracle Corporation)"
)
@Component
public class ScreenToTbScreenMapperImpl implements ScreenToTbScreenMapper {

    @Override
    public TbScreen convert(Screen arg0) {
        if ( arg0 == null ) {
            return null;
        }

        TbScreen tbScreen = new TbScreen();

        tbScreen.setId( arg0.getId() );
        tbScreen.setName( arg0.getName() );
        tbScreen.setResourceFile( arg0.getResourceFile() );
        tbScreen.setPort( arg0.getPort() );
        tbScreen.setState( arg0.getState() );
        tbScreen.setCreateAt( arg0.getCreateAt() );
        tbScreen.setIsDefault( arg0.getIsDefault() );

        return tbScreen;
    }

    @Override
    public TbScreen convert(Screen arg0, TbScreen arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setId( arg0.getId() );
        arg1.setName( arg0.getName() );
        arg1.setResourceFile( arg0.getResourceFile() );
        arg1.setPort( arg0.getPort() );
        arg1.setState( arg0.getState() );
        arg1.setCreateAt( arg0.getCreateAt() );
        arg1.setIsDefault( arg0.getIsDefault() );

        return arg1;
    }
}
