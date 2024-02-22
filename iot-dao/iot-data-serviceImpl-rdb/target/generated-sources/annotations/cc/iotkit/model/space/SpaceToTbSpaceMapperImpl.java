package cc.iotkit.model.space;

import cc.iotkit.data.model.TbSpace;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-28T21:10:19+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.19 (Oracle Corporation)"
)
@Component
public class SpaceToTbSpaceMapperImpl implements SpaceToTbSpaceMapper {

    @Override
    public TbSpace convert(Space arg0) {
        if ( arg0 == null ) {
            return null;
        }

        TbSpace tbSpace = new TbSpace();

        tbSpace.setCreateDept( arg0.getCreateDept() );
        tbSpace.setCreateBy( arg0.getCreateBy() );
        tbSpace.setCreateTime( arg0.getCreateTime() );
        tbSpace.setUpdateBy( arg0.getUpdateBy() );
        tbSpace.setUpdateTime( arg0.getUpdateTime() );
        tbSpace.setId( arg0.getId() );
        tbSpace.setHomeId( arg0.getHomeId() );
        tbSpace.setName( arg0.getName() );
        tbSpace.setDeviceNum( arg0.getDeviceNum() );
        tbSpace.setTenantId( arg0.getTenantId() );

        return tbSpace;
    }

    @Override
    public TbSpace convert(Space arg0, TbSpace arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setCreateDept( arg0.getCreateDept() );
        arg1.setCreateBy( arg0.getCreateBy() );
        arg1.setCreateTime( arg0.getCreateTime() );
        arg1.setUpdateBy( arg0.getUpdateBy() );
        arg1.setUpdateTime( arg0.getUpdateTime() );
        arg1.setId( arg0.getId() );
        arg1.setHomeId( arg0.getHomeId() );
        arg1.setName( arg0.getName() );
        arg1.setDeviceNum( arg0.getDeviceNum() );
        arg1.setTenantId( arg0.getTenantId() );

        return arg1;
    }
}
