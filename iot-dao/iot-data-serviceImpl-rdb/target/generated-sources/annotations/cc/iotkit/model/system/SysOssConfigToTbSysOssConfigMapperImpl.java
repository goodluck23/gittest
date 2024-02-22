package cc.iotkit.model.system;

import cc.iotkit.data.model.TbSysOssConfig;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-28T21:10:17+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.19 (Oracle Corporation)"
)
@Component
public class SysOssConfigToTbSysOssConfigMapperImpl implements SysOssConfigToTbSysOssConfigMapper {

    @Override
    public TbSysOssConfig convert(SysOssConfig arg0) {
        if ( arg0 == null ) {
            return null;
        }

        TbSysOssConfig tbSysOssConfig = new TbSysOssConfig();

        tbSysOssConfig.setCreateDept( arg0.getCreateDept() );
        tbSysOssConfig.setCreateBy( arg0.getCreateBy() );
        tbSysOssConfig.setCreateTime( arg0.getCreateTime() );
        tbSysOssConfig.setUpdateBy( arg0.getUpdateBy() );
        tbSysOssConfig.setUpdateTime( arg0.getUpdateTime() );
        tbSysOssConfig.setId( arg0.getId() );
        tbSysOssConfig.setTenantId( arg0.getTenantId() );
        tbSysOssConfig.setConfigKey( arg0.getConfigKey() );
        tbSysOssConfig.setAccessKey( arg0.getAccessKey() );
        tbSysOssConfig.setSecretKey( arg0.getSecretKey() );
        tbSysOssConfig.setBucketName( arg0.getBucketName() );
        tbSysOssConfig.setPrefix( arg0.getPrefix() );
        tbSysOssConfig.setEndpoint( arg0.getEndpoint() );
        tbSysOssConfig.setDomain( arg0.getDomain() );
        tbSysOssConfig.setIsHttps( arg0.getIsHttps() );
        tbSysOssConfig.setRegion( arg0.getRegion() );
        tbSysOssConfig.setStatus( arg0.getStatus() );
        tbSysOssConfig.setExt1( arg0.getExt1() );
        tbSysOssConfig.setRemark( arg0.getRemark() );
        tbSysOssConfig.setAccessPolicy( arg0.getAccessPolicy() );

        return tbSysOssConfig;
    }

    @Override
    public TbSysOssConfig convert(SysOssConfig arg0, TbSysOssConfig arg1) {
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
