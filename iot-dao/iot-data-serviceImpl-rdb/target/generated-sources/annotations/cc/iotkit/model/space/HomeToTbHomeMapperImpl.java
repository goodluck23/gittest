package cc.iotkit.model.space;

import cc.iotkit.data.model.TbHome;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-28T21:10:19+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.19 (Oracle Corporation)"
)
@Component
public class HomeToTbHomeMapperImpl implements HomeToTbHomeMapper {

    @Override
    public TbHome convert(Home arg0) {
        if ( arg0 == null ) {
            return null;
        }

        TbHome tbHome = new TbHome();

        tbHome.setCreateDept( arg0.getCreateDept() );
        tbHome.setCreateBy( arg0.getCreateBy() );
        tbHome.setCreateTime( arg0.getCreateTime() );
        tbHome.setUpdateBy( arg0.getUpdateBy() );
        tbHome.setUpdateTime( arg0.getUpdateTime() );
        tbHome.setId( arg0.getId() );
        tbHome.setName( arg0.getName() );
        tbHome.setAddress( arg0.getAddress() );
        tbHome.setUserId( arg0.getUserId() );
        tbHome.setSpaceNum( arg0.getSpaceNum() );
        tbHome.setDeviceNum( arg0.getDeviceNum() );
        tbHome.setCurrent( arg0.getCurrent() );
        tbHome.setTenantId( arg0.getTenantId() );

        return tbHome;
    }

    @Override
    public TbHome convert(Home arg0, TbHome arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setCreateDept( arg0.getCreateDept() );
        arg1.setCreateBy( arg0.getCreateBy() );
        arg1.setCreateTime( arg0.getCreateTime() );
        arg1.setUpdateBy( arg0.getUpdateBy() );
        arg1.setUpdateTime( arg0.getUpdateTime() );
        arg1.setId( arg0.getId() );
        arg1.setName( arg0.getName() );
        arg1.setAddress( arg0.getAddress() );
        arg1.setUserId( arg0.getUserId() );
        arg1.setSpaceNum( arg0.getSpaceNum() );
        arg1.setDeviceNum( arg0.getDeviceNum() );
        arg1.setCurrent( arg0.getCurrent() );
        arg1.setTenantId( arg0.getTenantId() );

        return arg1;
    }
}
