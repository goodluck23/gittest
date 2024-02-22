package cc.iotkit.data.model;

import cc.iotkit.model.system.SysConfig;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-28T21:10:20+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.19 (Oracle Corporation)"
)
@Component
public class TbSysConfigToSysConfigMapperImpl implements TbSysConfigToSysConfigMapper {

    @Override
    public SysConfig convert(TbSysConfig arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysConfig sysConfig = new SysConfig();

        sysConfig.setCreateDept( arg0.getCreateDept() );
        sysConfig.setCreateBy( arg0.getCreateBy() );
        sysConfig.setUpdateBy( arg0.getUpdateBy() );
        sysConfig.setUpdateTime( arg0.getUpdateTime() );
        sysConfig.setTenantId( arg0.getTenantId() );
        sysConfig.setId( arg0.getId() );
        sysConfig.setConfigName( arg0.getConfigName() );
        sysConfig.setConfigKey( arg0.getConfigKey() );
        sysConfig.setConfigValue( arg0.getConfigValue() );
        sysConfig.setConfigType( arg0.getConfigType() );
        sysConfig.setRemark( arg0.getRemark() );
        sysConfig.setCreateTime( arg0.getCreateTime() );

        return sysConfig;
    }

    @Override
    public SysConfig convert(TbSysConfig arg0, SysConfig arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setCreateDept( arg0.getCreateDept() );
        arg1.setCreateBy( arg0.getCreateBy() );
        arg1.setUpdateBy( arg0.getUpdateBy() );
        arg1.setUpdateTime( arg0.getUpdateTime() );
        arg1.setTenantId( arg0.getTenantId() );
        arg1.setId( arg0.getId() );
        arg1.setConfigName( arg0.getConfigName() );
        arg1.setConfigKey( arg0.getConfigKey() );
        arg1.setConfigValue( arg0.getConfigValue() );
        arg1.setConfigType( arg0.getConfigType() );
        arg1.setRemark( arg0.getRemark() );
        arg1.setCreateTime( arg0.getCreateTime() );

        return arg1;
    }
}
