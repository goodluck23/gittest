package cc.iotkit.data.model;

import cc.iotkit.model.device.DeviceGroup;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-28T21:10:17+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.19 (Oracle Corporation)"
)
@Component
public class TbDeviceGroupToDeviceGroupMapperImpl implements TbDeviceGroupToDeviceGroupMapper {

    @Override
    public DeviceGroup convert(TbDeviceGroup arg0) {
        if ( arg0 == null ) {
            return null;
        }

        DeviceGroup deviceGroup = new DeviceGroup();

        deviceGroup.setId( arg0.getId() );
        deviceGroup.setName( arg0.getName() );
        deviceGroup.setUid( arg0.getUid() );
        deviceGroup.setRemark( arg0.getRemark() );
        deviceGroup.setDeviceQty( arg0.getDeviceQty() );
        deviceGroup.setCreateAt( arg0.getCreateAt() );

        return deviceGroup;
    }

    @Override
    public DeviceGroup convert(TbDeviceGroup arg0, DeviceGroup arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setId( arg0.getId() );
        arg1.setName( arg0.getName() );
        arg1.setUid( arg0.getUid() );
        arg1.setRemark( arg0.getRemark() );
        arg1.setDeviceQty( arg0.getDeviceQty() );
        arg1.setCreateAt( arg0.getCreateAt() );

        return arg1;
    }
}
