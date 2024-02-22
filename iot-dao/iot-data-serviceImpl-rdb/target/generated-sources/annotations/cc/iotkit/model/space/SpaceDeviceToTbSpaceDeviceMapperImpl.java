package cc.iotkit.model.space;

import cc.iotkit.data.model.TbSpaceDevice;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-28T21:10:20+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.19 (Oracle Corporation)"
)
@Component
public class SpaceDeviceToTbSpaceDeviceMapperImpl implements SpaceDeviceToTbSpaceDeviceMapper {

    @Override
    public TbSpaceDevice convert(SpaceDevice arg0) {
        if ( arg0 == null ) {
            return null;
        }

        TbSpaceDevice tbSpaceDevice = new TbSpaceDevice();

        tbSpaceDevice.setCreateDept( arg0.getCreateDept() );
        tbSpaceDevice.setCreateBy( arg0.getCreateBy() );
        tbSpaceDevice.setCreateTime( arg0.getCreateTime() );
        tbSpaceDevice.setUpdateBy( arg0.getUpdateBy() );
        tbSpaceDevice.setUpdateTime( arg0.getUpdateTime() );
        tbSpaceDevice.setId( arg0.getId() );
        tbSpaceDevice.setDeviceId( arg0.getDeviceId() );
        tbSpaceDevice.setName( arg0.getName() );
        tbSpaceDevice.setHomeId( arg0.getHomeId() );
        tbSpaceDevice.setSpaceId( arg0.getSpaceId() );
        tbSpaceDevice.setCollect( arg0.getCollect() );
        tbSpaceDevice.setTenantId( arg0.getTenantId() );

        return tbSpaceDevice;
    }

    @Override
    public TbSpaceDevice convert(SpaceDevice arg0, TbSpaceDevice arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setCreateDept( arg0.getCreateDept() );
        arg1.setCreateBy( arg0.getCreateBy() );
        arg1.setCreateTime( arg0.getCreateTime() );
        arg1.setUpdateBy( arg0.getUpdateBy() );
        arg1.setUpdateTime( arg0.getUpdateTime() );
        arg1.setId( arg0.getId() );
        arg1.setDeviceId( arg0.getDeviceId() );
        arg1.setName( arg0.getName() );
        arg1.setHomeId( arg0.getHomeId() );
        arg1.setSpaceId( arg0.getSpaceId() );
        arg1.setCollect( arg0.getCollect() );
        arg1.setTenantId( arg0.getTenantId() );

        return arg1;
    }
}
