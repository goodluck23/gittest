package cc.iotkit.data.model;

import cc.iotkit.model.screen.Screen;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-28T21:10:18+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.19 (Oracle Corporation)"
)
@Component
public class TbScreenToScreenMapperImpl implements TbScreenToScreenMapper {

    @Override
    public Screen convert(TbScreen arg0) {
        if ( arg0 == null ) {
            return null;
        }

        Screen screen = new Screen();

        screen.setId( arg0.getId() );
        screen.setName( arg0.getName() );
        screen.setResourceFile( arg0.getResourceFile() );
        screen.setPort( arg0.getPort() );
        screen.setState( arg0.getState() );
        screen.setCreateAt( arg0.getCreateAt() );
        screen.setIsDefault( arg0.getIsDefault() );

        return screen;
    }

    @Override
    public Screen convert(TbScreen arg0, Screen arg1) {
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
