package cc.iotkit.model.system;

import cc.iotkit.data.model.TbSysTenantPackage;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-28T21:10:20+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11.0.19 (Oracle Corporation)"
)
@Component
public class SysTenantPackageToTbSysTenantPackageMapperImpl implements SysTenantPackageToTbSysTenantPackageMapper {

    @Override
    public TbSysTenantPackage convert(SysTenantPackage arg0) {
        if ( arg0 == null ) {
            return null;
        }

        TbSysTenantPackage tbSysTenantPackage = new TbSysTenantPackage();

        tbSysTenantPackage.setCreateDept( arg0.getCreateDept() );
        tbSysTenantPackage.setCreateBy( arg0.getCreateBy() );
        tbSysTenantPackage.setCreateTime( arg0.getCreateTime() );
        tbSysTenantPackage.setUpdateBy( arg0.getUpdateBy() );
        tbSysTenantPackage.setUpdateTime( arg0.getUpdateTime() );
        tbSysTenantPackage.setId( arg0.getId() );
        tbSysTenantPackage.setPackageName( arg0.getPackageName() );
        tbSysTenantPackage.setMenuIds( arg0.getMenuIds() );
        tbSysTenantPackage.setRemark( arg0.getRemark() );
        tbSysTenantPackage.setMenuCheckStrictly( arg0.getMenuCheckStrictly() );
        tbSysTenantPackage.setStatus( arg0.getStatus() );

        return tbSysTenantPackage;
    }

    @Override
    public TbSysTenantPackage convert(SysTenantPackage arg0, TbSysTenantPackage arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setCreateDept( arg0.getCreateDept() );
        arg1.setCreateBy( arg0.getCreateBy() );
        arg1.setCreateTime( arg0.getCreateTime() );
        arg1.setUpdateBy( arg0.getUpdateBy() );
        arg1.setUpdateTime( arg0.getUpdateTime() );
        arg1.setId( arg0.getId() );
        arg1.setPackageName( arg0.getPackageName() );
        arg1.setMenuIds( arg0.getMenuIds() );
        arg1.setRemark( arg0.getRemark() );
        arg1.setMenuCheckStrictly( arg0.getMenuCheckStrictly() );
        arg1.setStatus( arg0.getStatus() );

        return arg1;
    }
}
