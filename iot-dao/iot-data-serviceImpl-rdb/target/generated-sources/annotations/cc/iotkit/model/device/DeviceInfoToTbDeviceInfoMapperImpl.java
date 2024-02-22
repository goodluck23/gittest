package cc.iotkit.model.device;

import cc.iotkit.data.model.TbDeviceInfo;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-28T21:10:20+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.19 (Oracle Corporation)"
)
@Component
public class DeviceInfoToTbDeviceInfoMapperImpl implements DeviceInfoToTbDeviceInfoMapper {

    @Override
    public TbDeviceInfo convert(DeviceInfo source) {
        if ( source == null ) {
            return null;
        }

        TbDeviceInfo tbDeviceInfo = new TbDeviceInfo();

        tbDeviceInfo.setId( source.getId() );
        tbDeviceInfo.setDeviceId( source.getDeviceId() );
        tbDeviceInfo.setProductKey( source.getProductKey() );
        tbDeviceInfo.setDeviceName( source.getDeviceName() );
        tbDeviceInfo.setModel( source.getModel() );
        tbDeviceInfo.setSecret( source.getSecret() );
        tbDeviceInfo.setParentId( source.getParentId() );
        tbDeviceInfo.setUid( source.getUid() );
        tbDeviceInfo.setCreateAt( source.getCreateAt() );

        return tbDeviceInfo;
    }

    @Override
    public TbDeviceInfo convert(DeviceInfo source, TbDeviceInfo target) {
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
