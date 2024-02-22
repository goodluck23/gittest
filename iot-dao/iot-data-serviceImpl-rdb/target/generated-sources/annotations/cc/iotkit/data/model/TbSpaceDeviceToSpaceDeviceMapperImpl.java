package cc.iotkit.data.model;

import cc.iotkit.model.space.SpaceDevice;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-28T21:10:20+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.19 (Oracle Corporation)"
)
@Component
public class TbSpaceDeviceToSpaceDeviceMapperImpl implements TbSpaceDeviceToSpaceDeviceMapper {

    @Override
    public SpaceDevice convert(TbSpaceDevice arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SpaceDevice spaceDevice = new SpaceDevice();

        spaceDevice.setCreateDept( arg0.getCreateDept() );
        spaceDevice.setCreateBy( arg0.getCreateBy() );
        spaceDevice.setCreateTime( arg0.getCreateTime() );
        spaceDevice.setUpdateBy( arg0.getUpdateBy() );
        spaceDevice.setUpdateTime( arg0.getUpdateTime() );
        spaceDevice.setTenantId( arg0.getTenantId() );
        spaceDevice.setId( arg0.getId() );
        spaceDevice.setDeviceId( arg0.getDeviceId() );
        spaceDevice.setName( arg0.getName() );
        spaceDevice.setHomeId( arg0.getHomeId() );
        spaceDevice.setSpaceId( arg0.getSpaceId() );
        spaceDevice.setCollect( arg0.getCollect() );

        return spaceDevice;
    }

    @Override
    public SpaceDevice convert(TbSpaceDevice arg0, SpaceDevice arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setCreateDept( arg0.getCreateDept() );
        arg1.setCreateBy( arg0.getCreateBy() );
        arg1.setCreateTime( arg0.getCreateTime() );
        arg1.setUpdateBy( arg0.getUpdateBy() );
        arg1.setUpdateTime( arg0.getUpdateTime() );
        arg1.setTenantId( arg0.getTenantId() );
        arg1.setId( arg0.getId() );
        arg1.setDeviceId( arg0.getDeviceId() );
        arg1.setName( arg0.getName() );
        arg1.setHomeId( arg0.getHomeId() );
        arg1.setSpaceId( arg0.getSpaceId() );
        arg1.setCollect( arg0.getCollect() );

        return arg1;
    }
}
