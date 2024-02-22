package cc.iotkit.model.device;

import cc.iotkit.data.model.TbDeviceConfig;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-28T21:10:20+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.19 (Oracle Corporation)"
)
@Component
public class DeviceConfigToTbDeviceConfigMapperImpl implements DeviceConfigToTbDeviceConfigMapper {

    @Override
    public TbDeviceConfig convert(DeviceConfig arg0) {
        if ( arg0 == null ) {
            return null;
        }

        TbDeviceConfig tbDeviceConfig = new TbDeviceConfig();

        tbDeviceConfig.setId( arg0.getId() );
        tbDeviceConfig.setDeviceId( arg0.getDeviceId() );
        tbDeviceConfig.setProductKey( arg0.getProductKey() );
        tbDeviceConfig.setDeviceName( arg0.getDeviceName() );
        tbDeviceConfig.setConfig( arg0.getConfig() );
        tbDeviceConfig.setCreateAt( arg0.getCreateAt() );

        return tbDeviceConfig;
    }

    @Override
    public TbDeviceConfig convert(DeviceConfig arg0, TbDeviceConfig arg1) {
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
