package cc.iotkit.data.model;

import cc.iotkit.model.space.Space;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-28T21:10:21+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.19 (Oracle Corporation)"
)
@Component
public class TbSpaceToSpaceMapperImpl implements TbSpaceToSpaceMapper {

    @Override
    public Space convert(TbSpace arg0) {
        if ( arg0 == null ) {
            return null;
        }

        Space space = new Space();

        space.setCreateDept( arg0.getCreateDept() );
        space.setCreateBy( arg0.getCreateBy() );
        space.setCreateTime( arg0.getCreateTime() );
        space.setUpdateBy( arg0.getUpdateBy() );
        space.setUpdateTime( arg0.getUpdateTime() );
        space.setTenantId( arg0.getTenantId() );
        space.setId( arg0.getId() );
        space.setHomeId( arg0.getHomeId() );
        space.setName( arg0.getName() );
        space.setDeviceNum( arg0.getDeviceNum() );

        return space;
    }

    @Override
    public Space convert(TbSpace arg0, Space arg1) {
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
        arg1.setHomeId( arg0.getHomeId() );
        arg1.setName( arg0.getName() );
        arg1.setDeviceNum( arg0.getDeviceNum() );

        return arg1;
    }
}
