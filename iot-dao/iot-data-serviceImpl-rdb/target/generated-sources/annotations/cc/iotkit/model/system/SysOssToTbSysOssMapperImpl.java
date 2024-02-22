package cc.iotkit.model.system;

import cc.iotkit.data.model.TbSysOss;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-28T21:10:18+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.19 (Oracle Corporation)"
)
@Component
public class SysOssToTbSysOssMapperImpl implements SysOssToTbSysOssMapper {

    @Override
    public TbSysOss convert(SysOss arg0) {
        if ( arg0 == null ) {
            return null;
        }

        TbSysOss tbSysOss = new TbSysOss();

        tbSysOss.setCreateDept( arg0.getCreateDept() );
        tbSysOss.setCreateBy( arg0.getCreateBy() );
        tbSysOss.setCreateTime( arg0.getCreateTime() );
        tbSysOss.setUpdateBy( arg0.getUpdateBy() );
        tbSysOss.setUpdateTime( arg0.getUpdateTime() );
        tbSysOss.setId( arg0.getId() );
        tbSysOss.setTenantId( arg0.getTenantId() );
        tbSysOss.setFileName( arg0.getFileName() );
        tbSysOss.setOriginalName( arg0.getOriginalName() );
        tbSysOss.setFileSuffix( arg0.getFileSuffix() );
        tbSysOss.setUrl( arg0.getUrl() );
        tbSysOss.setService( arg0.getService() );

        return tbSysOss;
    }

    @Override
    public TbSysOss convert(SysOss arg0, TbSysOss arg1) {
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
        arg1.setFileName( arg0.getFileName() );
        arg1.setOriginalName( arg0.getOriginalName() );
        arg1.setFileSuffix( arg0.getFileSuffix() );
        arg1.setUrl( arg0.getUrl() );
        arg1.setService( arg0.getService() );

        return arg1;
    }
}
