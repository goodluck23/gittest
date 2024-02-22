package cc.iotkit.data.model;

import cc.iotkit.model.system.SysOssConfig;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-28T21:10:19+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.19 (Oracle Corporation)"
)
@Component
public class TbSysOssConfigToSysOssConfigMapperImpl implements TbSysOssConfigToSysOssConfigMapper {

    @Override
    public SysOssConfig convert(TbSysOssConfig arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysOssConfig sysOssConfig = new SysOssConfig();

        sysOssConfig.setCreateDept( arg0.getCreateDept() );
        sysOssConfig.setCreateBy( arg0.getCreateBy() );
        sysOssConfig.setCreateTime( arg0.getCreateTime() );
        sysOssConfig.setUpdateBy( arg0.getUpdateBy() );
        sysOssConfig.setUpdateTime( arg0.getUpdateTime() );
        sysOssConfig.setTenantId( arg0.getTenantId() );
        sysOssConfig.setId( arg0.getId() );
        sysOssConfig.setConfigKey( arg0.getConfigKey() );
        sysOssConfig.setAccessKey( arg0.getAccessKey() );
        sysOssConfig.setSecretKey( arg0.getSecretKey() );
        sysOssConfig.setBucketName( arg0.getBucketName() );
        sysOssConfig.setPrefix( arg0.getPrefix() );
        sysOssConfig.setEndpoint( arg0.getEndpoint() );
        sysOssConfig.setDomain( arg0.getDomain() );
        sysOssConfig.setIsHttps( arg0.getIsHttps() );
        sysOssConfig.setRegion( arg0.getRegion() );
        sysOssConfig.setStatus( arg0.getStatus() );
        sysOssConfig.setExt1( arg0.getExt1() );
        sysOssConfig.setRemark( arg0.getRemark() );
        sysOssConfig.setAccessPolicy( arg0.getAccessPolicy() );

        return sysOssConfig;
    }

    @Override
    public SysOssConfig convert(TbSysOssConfig arg0, SysOssConfig arg1) {
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
        arg1.setConfigKey( arg0.getConfigKey() );
        arg1.setAccessKey( arg0.getAccessKey() );
        arg1.setSecretKey( arg0.getSecretKey() );
        arg1.setBucketName( arg0.getBucketName() );
        arg1.setPrefix( arg0.getPrefix() );
        arg1.setEndpoint( arg0.getEndpoint() );
        arg1.setDomain( arg0.getDomain() );
        arg1.setIsHttps( arg0.getIsHttps() );
        arg1.setRegion( arg0.getRegion() );
        arg1.setStatus( arg0.getStatus() );
        arg1.setExt1( arg0.getExt1() );
        arg1.setRemark( arg0.getRemark() );
        arg1.setAccessPolicy( arg0.getAccessPolicy() );

        return arg1;
    }
}
