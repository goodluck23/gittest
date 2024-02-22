package cc.iotkit.data.model;

import cc.iotkit.model.system.SysApp;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-28T21:10:21+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.19 (Oracle Corporation)"
)
@Component
public class TbSysAppToSysAppMapperImpl implements TbSysAppToSysAppMapper {

    @Override
    public SysApp convert(TbSysApp arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysApp sysApp = new SysApp();

        sysApp.setCreateDept( arg0.getCreateDept() );
        sysApp.setCreateBy( arg0.getCreateBy() );
        sysApp.setCreateTime( arg0.getCreateTime() );
        sysApp.setUpdateBy( arg0.getUpdateBy() );
        sysApp.setUpdateTime( arg0.getUpdateTime() );
        sysApp.setTenantId( arg0.getTenantId() );
        sysApp.setId( arg0.getId() );
        sysApp.setAppName( arg0.getAppName() );
        sysApp.setAppId( arg0.getAppId() );
        sysApp.setAppSecret( arg0.getAppSecret() );
        sysApp.setAppType( arg0.getAppType() );
        sysApp.setRemark( arg0.getRemark() );

        return sysApp;
    }

    @Override
    public SysApp convert(TbSysApp arg0, SysApp arg1) {
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
        arg1.setAppName( arg0.getAppName() );
        arg1.setAppId( arg0.getAppId() );
        arg1.setAppSecret( arg0.getAppSecret() );
        arg1.setAppType( arg0.getAppType() );
        arg1.setRemark( arg0.getRemark() );

        return arg1;
    }
}
