package cc.iotkit.model.device.message;

import cc.iotkit.temporal.es.document.DocDeviceProperty;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-28T21:55:33+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.19 (Oracle Corporation)"
)
@Component
public class DevicePropertyToDocDevicePropertyMapperImpl implements DevicePropertyToDocDevicePropertyMapper {

    @Override
    public DocDeviceProperty convert(DeviceProperty arg0) {
        if ( arg0 == null ) {
            return null;
        }

        DocDeviceProperty docDeviceProperty = new DocDeviceProperty();

        docDeviceProperty.setId( arg0.getId() );
        docDeviceProperty.setDeviceId( arg0.getDeviceId() );
        docDeviceProperty.setName( arg0.getName() );
        docDeviceProperty.setValue( arg0.getValue() );
        docDeviceProperty.setTime( arg0.getTime() );

        return docDeviceProperty;
    }

    @Override
    public DocDeviceProperty convert(DeviceProperty arg0, DocDeviceProperty arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setId( arg0.getId() );
        arg1.setDeviceId( arg0.getDeviceId() );
        arg1.setName( arg0.getName() );
        arg1.setValue( arg0.getValue() );
        arg1.setTime( arg0.getTime() );

        return arg1;
    }
}
