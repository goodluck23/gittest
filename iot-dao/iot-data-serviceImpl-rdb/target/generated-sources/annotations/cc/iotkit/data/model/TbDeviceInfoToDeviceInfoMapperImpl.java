package cc.iotkit.data.model;

import cc.iotkit.model.device.DeviceInfo;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-28T21:10:20+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.19 (Oracle Corporation)"
)
@Component
public class TbDeviceInfoToDeviceInfoMapperImpl implements TbDeviceInfoToDeviceInfoMapper {

    @Override
    public DeviceInfo convert(TbDeviceInfo source) {
        if ( source == null ) {
            return null;
        }

        DeviceInfo deviceInfo = new DeviceInfo();

        deviceInfo.setId( source.getId() );
        deviceInfo.setDeviceId( source.getDeviceId() );
        deviceInfo.setProductKey( source.getProductKey() );
        deviceInfo.setDeviceName( source.getDeviceName() );
        deviceInfo.setModel( source.getModel() );
        deviceInfo.setSecret( source.getSecret() );
        deviceInfo.setParentId( source.getParentId() );
        deviceInfo.setUid( source.getUid() );
        deviceInfo.setCreateAt( source.getCreateAt() );

        return deviceInfo;
    }

    @Override
    public DeviceInfo convert(TbDeviceInfo source, DeviceInfo target) {
        if ( source == null ) {
            return target;
        }

        target.setId( source.getId() );
        target.setDeviceId( source.getDeviceId() );
        target.setProductKey( source.getProductKey() );
        target.setDeviceName( source.getDeviceName() );
        target.setModel( source.getModel() );
        target.setSecret( source.getSecret() );
        target.setParentId( source.getParentId() );
        target.setUid( source.getUid() );
        target.setCreateAt( source.getCreateAt() );

        return target;
    }
}
