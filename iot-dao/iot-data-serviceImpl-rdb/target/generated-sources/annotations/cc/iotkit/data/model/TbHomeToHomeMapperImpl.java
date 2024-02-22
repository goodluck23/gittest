package cc.iotkit.data.model;

import cc.iotkit.model.space.Home;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-28T21:10:19+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.19 (Oracle Corporation)"
)
@Component
public class TbHomeToHomeMapperImpl implements TbHomeToHomeMapper {

    @Override
    public Home convert(TbHome arg0) {
        if ( arg0 == null ) {
            return null;
        }

        Home home = new Home();

        home.setCreateDept( arg0.getCreateDept() );
        home.setCreateBy( arg0.getCreateBy() );
        home.setCreateTime( arg0.getCreateTime() );
        home.setUpdateBy( arg0.getUpdateBy() );
        home.setUpdateTime( arg0.getUpdateTime() );
        home.setTenantId( arg0.getTenantId() );
        home.setId( arg0.getId() );
        home.setName( arg0.getName() );
        home.setAddress( arg0.getAddress() );
        home.setUserId( arg0.getUserId() );
        home.setSpaceNum( arg0.getSpaceNum() );
        home.setDeviceNum( arg0.getDeviceNum() );
        home.setCurrent( arg0.getCurrent() );

        return home;
    }

    @Override
    public Home convert(TbHome arg0, Home arg1) {
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
        arg1.setName( arg0.getName() );
        arg1.setAddress( arg0.getAddress() );
        arg1.setUserId( arg0.getUserId() );
        arg1.setSpaceNum( arg0.getSpaceNum() );
        arg1.setDeviceNum( arg0.getDeviceNum() );
        arg1.setCurrent( arg0.getCurrent() );

        return arg1;
    }
}
