package cc.iotkit.model.device;

import cc.iotkit.data.model.TbDeviceGroup;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-28T21:10:20+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.19 (Oracle Corporation)"
)
@Component
public class DeviceGroupToTbDeviceGroupMapperImpl implements DeviceGroupToTbDeviceGroupMapper {

    @Override
    public TbDeviceGroup convert(DeviceGroup arg0) {
        if ( arg0 == null ) {
            return null;
        }

        TbDeviceGroup tbDeviceGroup = new TbDeviceGroup();

        tbDeviceGroup.setId( arg0.getId() );
        tbDeviceGroup.setName( arg0.getName() );
        tbDeviceGroup.setUid( arg0.getUid() );
        tbDeviceGroup.setRemark( arg0.getRemark() );
        tbDeviceGroup.setDeviceQty( arg0.getDeviceQty() );
        tbDeviceGroup.setCreateAt( arg0.getCreateAt() );

        return tbDeviceGroup;
    }

    @Override
    public TbDeviceGroup convert(DeviceGroup arg0, TbDeviceGroup arg1) {
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
