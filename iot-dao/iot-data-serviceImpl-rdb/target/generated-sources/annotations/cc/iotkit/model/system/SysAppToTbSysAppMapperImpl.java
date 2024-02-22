package cc.iotkit.model.system;

import cc.iotkit.data.model.TbSysApp;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-28T21:10:19+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.19 (Oracle Corporation)"
)
@Component
public class SysAppToTbSysAppMapperImpl implements SysAppToTbSysAppMapper {

    @Override
    public TbSysApp convert(SysApp arg0) {
        if ( arg0 == null ) {
            return null;
        }

        TbSysApp tbSysApp = new TbSysApp();

        tbSysApp.setCreateDept( arg0.getCreateDept() );
        tbSysApp.setCreateBy( arg0.getCreateBy() );
        tbSysApp.setCreateTime( arg0.getCreateTime() );
        tbSysApp.setUpdateBy( arg0.getUpdateBy() );
        tbSysApp.setUpdateTime( arg0.getUpdateTime() );
        tbSysApp.setId( arg0.getId() );
        tbSysApp.setTenantId( arg0.getTenantId() );
        tbSysApp.setAppName( arg0.getAppName() );
        tbSysApp.setAppId( arg0.getAppId() );
        tbSysApp.setAppSecret( arg0.getAppSecret() );
        tbSysApp.setAppType( arg0.getAppType() );
        tbSysApp.setRemark( arg0.getRemark() );

        return tbSysApp;
    }

    @Override
    public TbSysApp convert(SysApp arg0, TbSysApp arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setCreateDept( arg0.getCreateDept() );
        arg1.setCreateBy( arg0.getCreateBy() );
        arg1.setCreateTime( arg0.getCreateTime() );
        arg1.setUpdateBy( arg0.getUpdateBy() );
        arg1.setUpdateTime( arg0.getUpdateTime() );
        arg1.setId( arg0.getId() );
        arg1.setTenantId( arg0.getTenantId() );
        arg1.setAppName( arg0.getAppName() );
        arg1.setAppId( arg0.getAppId() );
        arg1.setAppSecret( arg0.getAppSecret() );
        arg1.setAppType( arg0.getAppType() );
        arg1.setRemark( arg0.getRemark() );

        return arg1;
    }
}
