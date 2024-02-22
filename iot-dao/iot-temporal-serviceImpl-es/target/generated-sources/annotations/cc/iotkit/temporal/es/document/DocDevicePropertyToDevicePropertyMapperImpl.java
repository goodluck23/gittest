package cc.iotkit.temporal.es.document;

import cc.iotkit.model.device.message.DeviceProperty;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-28T21:55:33+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.19 (Oracle Corporation)"
)
@Component
public class DocDevicePropertyToDevicePropertyMapperImpl implements DocDevicePropertyToDevicePropertyMapper {

    @Override
    public DeviceProperty convert(DocDeviceProperty arg0) {
        if ( arg0 == null ) {
            return null;
        }

        DeviceProperty deviceProperty = new DeviceProperty();

        deviceProperty.setId( arg0.getId() );
        deviceProperty.setDeviceId( arg0.getDeviceId() );
        deviceProperty.setName( arg0.getName() );
        deviceProperty.setValue( arg0.getValue() );
        deviceProperty.setTime( arg0.getTime() );

        return deviceProperty;
    }

    @Override
    public DeviceProperty convert(DocDeviceProperty arg0, DeviceProperty arg1) {
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
