package cc.iotkit.model.system;

import cc.iotkit.data.model.TbSysConfig;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-28T21:10:20+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.19 (Oracle Corporation)"
)
@Component
public class SysConfigToTbSysConfigMapperImpl implements SysConfigToTbSysConfigMapper {

    @Override
    public TbSysConfig convert(SysConfig arg0) {
        if ( arg0 == null ) {
            return null;
        }

        TbSysConfig tbSysConfig = new TbSysConfig();

        tbSysConfig.setCreateDept( arg0.getCreateDept() );
        tbSysConfig.setCreateBy( arg0.getCreateBy() );
        tbSysConfig.setCreateTime( arg0.getCreateTime() );
        tbSysConfig.setUpdateBy( arg0.getUpdateBy() );
        tbSysConfig.setUpdateTime( arg0.getUpdateTime() );
        tbSysConfig.setId( arg0.getId() );
        tbSysConfig.setTenantId( arg0.getTenantId() );
        tbSysConfig.setConfigName( arg0.getConfigName() );
        tbSysConfig.setConfigKey( arg0.getConfigKey() );
        tbSysConfig.setConfigValue( arg0.getConfigValue() );
        tbSysConfig.setConfigType( arg0.getConfigType() );
        tbSysConfig.setRemark( arg0.getRemark() );

        return tbSysConfig;
    }

    @Override
    public TbSysConfig convert(SysConfig arg0, TbSysConfig arg1) {
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
        arg1.setConfigName( arg0.getConfigName() );
        arg1.setConfigKey( arg0.getConfigKey() );
        arg1.setConfigValue( arg0.getConfigValue() );
        arg1.setConfigType( arg0.getConfigType() );
        arg1.setRemark( arg0.getRemark() );

        return arg1;
    }
}
