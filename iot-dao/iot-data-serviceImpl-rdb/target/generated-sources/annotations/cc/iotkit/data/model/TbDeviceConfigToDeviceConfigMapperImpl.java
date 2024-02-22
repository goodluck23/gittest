package cc.iotkit.data.model;

import cc.iotkit.model.device.DeviceConfig;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-28T21:10:20+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.19 (Oracle Corporation)"
)
@Component
public class TbDeviceConfigToDeviceConfigMapperImpl implements TbDeviceConfigToDeviceConfigMapper {

    @Override
    public DeviceConfig convert(TbDeviceConfig arg0) {
        if ( arg0 == null ) {
            return null;
        }

        DeviceConfig deviceConfig = new DeviceConfig();

        deviceConfig.setId( arg0.getId() );
        deviceConfig.setDeviceId( arg0.getDeviceId() );
        deviceConfig.setProductKey( arg0.getProductKey() );
        deviceConfig.setDeviceName( arg0.getDeviceName() );
        deviceConfig.setConfig( arg0.getConfig() );
        deviceConfig.setCreateAt( arg0.getCreateAt() );

        return deviceConfig;
    }

    @Override
    public DeviceConfig convert(TbDeviceConfig arg0, DeviceConfig arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setId( arg0.getId() );
        arg1.setDeviceId( arg0.getDeviceId() );
        arg1.setProductKey( arg0.getProductKey() );
        arg1.setDeviceName( arg0.getDeviceName() );
        arg1.setConfig( arg0.getConfig() );
        arg1.setCreateAt( arg0.getCreateAt() );

        return arg1;
    }
}
